/*
 * Licensed to Laurent Broudoux (the "Author") under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Author licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
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
 * A tree content provider that manages 3 nesting levels : Workspace project, EIP Model resource
 * and Route within EIP Model.
 * @author laurent
 */
public class RouteTreeLabelProvider implements ILabelProvider {

   @Override
   public void addListener(ILabelProviderListener listener) {
      // Nothing to do here.
      
   }

   @Override
   public void dispose() {
      // NOthing to do here.
      
   }

   @Override
   public boolean isLabelProperty(Object element, String property) {
      return false;
   }

   @Override
   public void removeListener(ILabelProviderListener listener) {
      // Nothing to do here.
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
