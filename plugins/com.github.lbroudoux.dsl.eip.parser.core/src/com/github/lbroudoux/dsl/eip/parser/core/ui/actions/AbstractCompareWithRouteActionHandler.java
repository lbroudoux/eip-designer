package com.github.lbroudoux.dsl.eip.parser.core.ui.actions;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareEditorInput;
import org.eclipse.compare.CompareUI;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
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

import com.github.lbroudoux.dsl.eip.Route;
import com.github.lbroudoux.dsl.eip.parser.core.ui.dialogs.CompareTargetSelectionDialog;

/**
 * 
 * @author laurent
 */
public abstract class AbstractCompareWithRouteActionHandler extends AbstractHandler {

   /**
    * The command has been executed, so extract the needed information
    * from the application context.
    */
   @Override
   public Object execute(ExecutionEvent event) throws ExecutionException {
      ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
      
      if (currentSelection != null && currentSelection instanceof IStructuredSelection) {
         // Retrieve file corresponding to current selection.
         IStructuredSelection selection = (IStructuredSelection)currentSelection;
         IFile selectionFile = (IFile)selection.getFirstElement();
         
         // Open compare target selection dialog.
         CompareTargetSelectionDialog dialog = new CompareTargetSelectionDialog(
               HandlerUtil.getActiveShellChecked(event), 
               selectionFile.getName());
         
         if (dialog.open() != Window.OK) {
            return null;
         }
         
         // Ask concrete subclass to parse source file and extract Route for comparison.
         Route left = extractRouteFromFile(selectionFile);
         
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
   
   protected abstract Route extractRouteFromFile(IFile selectionFile);
}
