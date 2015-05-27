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
package com.github.lbroudoux.dsl.eip.bridge.core.ui.dialogs;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

/**
 * A label provider for 2 levels : Workspace project and EIP Model resource.
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
