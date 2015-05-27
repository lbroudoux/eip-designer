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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.github.lbroudoux.dsl.eip.EIPModel;
import com.github.lbroudoux.dsl.eip.EipPackage;
/**
 * A tree content provider that manages 3 nesting levels : Workspace project, EIP Model resource
 * and Route within EIP Model.
 * @author laurent
 */
public class RouteTreeContentProvider implements ITreeContentProvider {

   /** ResourceSet used for loading and retrieving routes. */
   private ResourceSet resourceSet;
   
   /** Build a new RouteTreeContentProvider. */
   public RouteTreeContentProvider() {
      // Initialize a ResourceSet to load model and get Routes.
      resourceSet = new ResourceSetImpl();
      
      // Register the appropriate resource factory to handle all file extensions.
      resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, 
            new XMIResourceFactoryImpl());

      // Register the package to ensure it is available during loading.
      resourceSet.getPackageRegistry().put(EipPackage.eNS_URI, EipPackage.eINSTANCE);
   }
   
   @Override
   public void dispose() {
      // Nothing to do here.
   }

   @Override
   public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
      // Nothing to do here.
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
      // If EIP model level, load and find Route definitions.
      if (parentElement instanceof IResource) {
         IResource resource = (IResource) parentElement;
         Resource emfResource = resourceSet.getResource(URI.createURI(resource.getLocationURI().toString()), true);
         
         for (EObject object : emfResource.getContents()){
            if (object instanceof EIPModel) {
               EIPModel eipModel = (EIPModel) object;
               return eipModel.getOwnedRoutes().toArray();
            }
         }
      }
      return null;
   }

   @Override
   public Object getParent(Object element) {
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
         return true;
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
         e.printStackTrace();
      }
   }
}
