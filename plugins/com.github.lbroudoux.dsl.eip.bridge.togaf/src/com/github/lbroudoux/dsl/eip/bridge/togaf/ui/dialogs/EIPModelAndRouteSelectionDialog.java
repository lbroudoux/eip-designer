package com.github.lbroudoux.dsl.eip.bridge.togaf.ui.dialogs;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;

/**
 * 
 * @author laurent
 */
public class EIPModelAndRouteSelectionDialog extends TitleAreaDialog {

   /** The tree. */
   protected TreeViewer projectTree;
   
   /** The target routeName. */
   private String routeName;
   /** The selected EIP Model selected via Dialog. */
   private IResource eipModel;
   
   /** Constructor. */
   public EIPModelAndRouteSelectionDialog(Shell parentShell, String routeName) {
      super(parentShell);
      this.routeName = routeName;
   }

   /** @return The target route name. */
   public String getRouteName() {
      return routeName;
   }
   
   /** @return The selected EIP Model if any. */
   public IResource getSelectedEIPModel() {
      return eipModel;
   }
   
   @Override
   protected Control createDialogArea(Composite base) {
      Composite parent = (Composite) super.createDialogArea(base);
      Composite composite = new Composite(parent, SWT.NONE);
      
      GridLayout layout = new GridLayout();
      layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
      layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
      layout.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);
      layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
      composite.setLayout(layout);
      composite.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
      
      // Manage dialog tree content.
      FilteredTree tree = new FilteredTree(composite, SWT.SINGLE | SWT.BORDER,
            new PatternFilter(), true);

      projectTree = tree.getViewer();
      projectTree.setLabelProvider(new EIPModelTreeLabelProvider());
      projectTree.setContentProvider(new EIPModelTreeContentProvider());
      projectTree.setInput(ResourcesPlugin.getWorkspace().getRoot());
      
      GridDataFactory.fillDefaults().grab(true, true).hint(500, 300).applyTo(tree);
      
      // Manage dialog tree events.
      projectTree.addSelectionChangedListener(new ISelectionChangedListener() {
         @Override
         public void selectionChanged(SelectionChangedEvent event) {
            if (event.getSelection() instanceof TreeSelection) {
               TreeSelection tSelection = (TreeSelection)event.getSelection();
               if (tSelection.getFirstElement() instanceof IResource) {
                  eipModel = (IResource) tSelection.getFirstElement();
               }
            }
         }
      });
      
      setTitle("Choose a target EIP model");
      setMessage("Select the EIP model for designing a new Route from Service");
      applyDialogFont(composite);
      
      return composite;
   }
}
