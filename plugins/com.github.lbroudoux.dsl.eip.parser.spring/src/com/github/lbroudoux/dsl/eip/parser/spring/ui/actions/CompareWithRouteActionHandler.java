package com.github.lbroudoux.dsl.eip.parser.spring.ui.actions;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareEditorInput;
import org.eclipse.compare.CompareUI;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.domain.ICompareEditingDomain;
import org.eclipse.emf.compare.domain.impl.EMFCompareEditingDomain;
import org.eclipse.emf.compare.ide.ui.internal.configuration.EMFCompareConfiguration;
import org.eclipse.emf.compare.ide.ui.internal.editor.ComparisonScopeEditorInput;
import org.eclipse.emf.compare.rcp.EMFCompareRCPPlugin;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.handlers.HandlerUtil;

import com.github.lbroudoux.dsl.eip.EIPModel;
import com.github.lbroudoux.dsl.eip.EipFactory;
import com.github.lbroudoux.dsl.eip.Route;
import com.github.lbroudoux.dsl.eip.parser.spring.SpringIntegrationFileParser;
import com.github.lbroudoux.dsl.eip.parser.spring.ui.dialogs.CompareTargetSelectionDialog;

/**
 * 
 * @author laurent
 */
public class CompareWithRouteActionHandler extends AbstractHandler {

   /** The constructor. */
   public CompareWithRouteActionHandler() {
   }
   
   /**
    * The command has been executed, so extract extract the needed information
    * from the application context.
    */
   @Override
   public Object execute(ExecutionEvent event) throws ExecutionException {
      ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
      
      if (currentSelection != null && currentSelection instanceof IStructuredSelection) {
         // Retrieve file corresponding to current selection.
         IStructuredSelection selection = (IStructuredSelection)currentSelection;
         org.eclipse.core.internal.resources.File selectionFile = (org.eclipse.core.internal.resources.File)selection.getFirstElement();
         
         // Open compare target selection dialog.
         CompareTargetSelectionDialog dialog = new CompareTargetSelectionDialog(
               HandlerUtil.getActiveShellChecked(event), 
               selectionFile.getName());
         
         if (dialog.open() != Window.OK) {
            return null;
         }
         
         // Parse source file for comparison.
         SpringIntegrationFileParser parser = new SpringIntegrationFileParser(selectionFile.getLocation().toFile());
         EIPModel model = EipFactory.eINSTANCE.createEIPModel();
         try {
            parser.parseAndFillModel(model);
         } catch (Exception e) {
            // TODO Manage parsing exception
            e.printStackTrace();
            return null;
         }
         if (model.getOwnedRoutes() == null || model.getOwnedRoutes().isEmpty()) {
            // TODO Manage empty parsing result.
            System.err.println("No Route was found during Spring Integration file parsing !");
            return null;
         }
         // There should be only one route defined into Spring integration file.
         Route left = model.getOwnedRoutes().get(0);
         
         // Retrieve EMF Object corresponding to selected reference Route.
         Route right = dialog.getSelectedRoute();
         
         // Cause Spring parser cannot retrieve route name, force it using those of the model.
         // TODO Find a fix later for that in the generator/parser couple
         left.setName(right.getName());
         
         // Launch EMFCompare UI with input.
         EMFCompareConfiguration configuration = new EMFCompareConfiguration(new CompareConfiguration());
         ICompareEditingDomain editingDomain = EMFCompareEditingDomain.create(left, right, null);
         AdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
         EMFCompare comparator = EMFCompare.builder().setPostProcessorRegistry(EMFCompareRCPPlugin.getDefault().getPostProcessorRegistry()).build();
         IComparisonScope scope = new DefaultComparisonScope(left, right, null);
         
         CompareEditorInput input = new ComparisonScopeEditorInput(configuration, editingDomain, adapterFactory, comparator, scope);
         CompareUI.openCompareDialog(input);
      }
      
      return null;
   }
}
