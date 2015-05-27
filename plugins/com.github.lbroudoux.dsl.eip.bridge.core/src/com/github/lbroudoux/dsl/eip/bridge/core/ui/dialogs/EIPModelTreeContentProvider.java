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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * A tree content provider with 2 levels : Workspace project and EIP Model resource.
 * @author laurent
 */
public class EIPModelTreeContentProvider implements ITreeContentProvider {

   @Override
   public void dispose() {
      // TODO Auto-generated method stub
   }

   @Override
   public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
      // TODO Auto-generated method stub
   }

   @Override
   public Object[] getElements(Object inputElement) {
      // First level : get workspace projects.
      return ResourcesPlugin.getWorkspace().getRoot().getProjects();
   }
   
   @Override
   public Object[] getChildren(Object parentElement) {
      // If project level, get EIP model files.
      if (parentElement instanceof IProject) {
         IProject project = (IProject) parentElement;
         List<IResource> models = new ArrayList<IResource>();
         findEIPModels(models, project.getLocation(), ResourcesPlugin.getWorkspace().getRoot());
         return models.toArray();
      }
      return null;
   }
   
   @Override
   public Object getParent(Object element) {
      // TODO Auto-generated method stub
      return null;
   }
   
   @Override
   public boolean hasChildren(Object element) {
      if (element instanceof IProject) {
         IProject project = (IProject) element;
         List<IResource> models = new ArrayList<IResource>();
         findEIPModels(models, project.getLocation(), ResourcesPlugin.getWorkspace().getRoot());
         return !models.isEmpty();
      }
      if (element instanceof IResource) {
         return false;
      }
      return false;
   }

   /** */
   private static void findEIPModels(List<IResource> models, IPath path, IWorkspaceRoot workspaceRoot){
      IContainer container =  workspaceRoot.getContainerForLocation(path);

      try {
         IResource[] iResources = container.members();
         for (IResource iResource : iResources) {
            if ("eip".equalsIgnoreCase(iResource.getFileExtension())) {
               models.add(iResource);
            }
            if (iResource.getType() == IResource.FOLDER) {
               IPath tempPath = iResource.getLocation();
               findEIPModels(models, tempPath, workspaceRoot);
            }
         }
      } catch (CoreException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
}
