package com.github.lbroudoux.dsl.eip.parser.core.ui.dialogs;

import java.net.URL;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import com.github.lbroudoux.dsl.eip.Route;

/**
 * 
 * @author laurent
 */
public class RouteTreeLabelProvider implements ILabelProvider {

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
      if (element instanceof Route) {
         Bundle bundle = FrameworkUtil.getBundle(RouteTreeLabelProvider.class);
         URL url = FileLocator.find(bundle, new Path("icons/obj16/Route.gif"), null);
         ImageDescriptor imageDcr = ImageDescriptor.createFromURL(url);
         return imageDcr.createImage();
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
      if (element instanceof Route) {
         return ((Route) element).getName();
      }
      return null;
   }
}
