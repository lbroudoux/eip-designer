package com.github.lbroudoux.dsl.eip.bridge.togaf.ui.dialogs;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

/**
 * 
 * @author laurent
 */
public class EIPModelTreeLabelProvider implements ILabelProvider {

   @Override
   public void addListener(ILabelProviderListener listener) {
      // TODO Auto-generated method stub
      
   }

   @Override
   public void dispose() {
      // TODO Auto-generated method stub
      
   }

   @Override
   public boolean isLabelProperty(Object element, String property) {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public void removeListener(ILabelProviderListener listener) {
      // TODO Auto-generated method stub
      
   }

   @Override
   public Image getImage(Object element) {
      if (element instanceof IProject) {
         return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_PROJECT);
      }
      if (element instanceof IResource) {
         return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FILE);
      }
      return null;
   }
   
   @Override
   public String getText(Object element) {
      if (element instanceof IProject) {
         return ((IProject) element).getName();
      }
      if (element instanceof IResource) {
         return ((IResource) element).getName();
      }
      return null;
   }
}
