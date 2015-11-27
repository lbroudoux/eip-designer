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
package com.github.lbroudoux.dsl.eip.parser.core.ui.actions;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.handlers.HandlerUtil;

import com.github.lbroudoux.dsl.eip.EIPModel;
import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.Route;
import com.github.lbroudoux.dsl.eip.ServiceRef;
import com.github.lbroudoux.dsl.eip.parser.core.ui.dialogs.PersistTargetSelectionDialog;

/**
 * Base abstract handler for parsing resources to EIP and persisting them as EIP Model route.
 * It drives generic parsing, merging and persistence process and provides a sole method <code>extractEIPModelFromFile(IFile)</code>
 * that subclass should implement in order to specify how to parse the selected file.
 * @author laurent
 */
public abstract class AbstractPersistToRouteModelActionHandler extends AbstractHandler {

   /**
    * The command has been executed, so extract the needed information
    * from the application context.
    */
   @Override
   public Object execute(ExecutionEvent event) throws ExecutionException{
      ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
      
      if (currentSelection != null && currentSelection instanceof IStructuredSelection) {
         // Retrieve file corresponding to current selection.
         IStructuredSelection selection = (IStructuredSelection)currentSelection;
         IFile selectionFile = (IFile)selection.getFirstElement();
         
         // Open persit target selection dialog.
         PersistTargetSelectionDialog dialog = new PersistTargetSelectionDialog(
               HandlerUtil.getActiveShellChecked(event), 
               selectionFile.getName());
         
         if (dialog.open() != Window.OK) {
            return null;
         }
         
         // Ask concrete subclass to parse source file and extract EIPModel for persisting.
         EIPModel extracted = extractEIPModelFromFile(selectionFile);
         
         // Load and find EIPModel definition.
         IResource eipModelResource = dialog.getSelectedEIPModel();
         ResourceSet resourceSet = initializeResourceSet();
         Resource emfResource = resourceSet.getResource(URI.createURI(eipModelResource.getLocationURI().toString()), true);
         
         EIPModel target = null;
         for (EObject object : emfResource.getContents()){
            if (object instanceof EIPModel) {
               target = (EIPModel) object;
               break;
            }
         }
         
         // Merge extracted model into target one.
         for (Route route : extracted.getOwnedRoutes()) {
            Route existing = findRouteByName(target, route.getName());
            if (existing != null) {
               // New route totally overrides existing one. Simply replace existing pointer ?
               existing = route;
            } else {
               // Add a new route to target model.
               target.getOwnedRoutes().add(route);
            }
         }
         for (ServiceRef serviceRef : extracted.getOwnedServiceRefs()) {
            ServiceRef existing = findServiceRefByName(target, serviceRef.getName());
            if (existing != null) {
               // New service ref cannot replace existing one, cause route have only a partial
               // view on reference. Complete existing one.
               for (String operation : serviceRef.getOperations()) {
                  if (!isOperationPresent(existing, operation)) {
                     existing.getOperations().add(operation);
                  }
               }
            } else {
               // Add a new service reference to target model.
               target.getOwnedServiceRefs().add(serviceRef);
            }
         }
         
         // Finally, save modified EMF resource.
         try {
            emfResource.save(null);
         } catch (IOException ioe) {
            System.err.println("IOException while saving modified EIP model");
            ioe.printStackTrace();
         }
      }
      
      return null;
   }
   
   /**
    * 
    * @param selectionFile
    * @return
    */
   protected abstract EIPModel extractEIPModelFromFile(IFile selectionFile);
   
   /** Factorize here the EMF loading model plumbing stuffs. */
   private ResourceSet initializeResourceSet() {
      // Initialize a ResourceSet to later load model and add Route.
      ResourceSet resourceSet = new ResourceSetImpl();
      
      // Register the appropriate resource factory to handle all file extensions.
      resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, 
            new XMIResourceFactoryImpl());

      // Register the package to ensure it is available during loading.
      resourceSet.getPackageRegistry().put(EipPackage.eNS_URI, EipPackage.eINSTANCE);
      
      return resourceSet;
   }
   
   /** */
   private Route findRouteByName(EIPModel model, String routeName) {
      for (Route route : model.getOwnedRoutes()) {
         if (route.getName().equals(routeName)) {
            return route;
         }
      }
      return null;
   }
   
   /** */
   private ServiceRef findServiceRefByName(EIPModel model, String refName) {
      for (ServiceRef ref : model.getOwnedServiceRefs()) {
         if (ref.getName().equals(refName)) {
            return ref;
         }
      }
      return null;
   }
   
   /** */
   private boolean isOperationPresent(ServiceRef reference, String opName) {
      for (String operation : reference.getOperations()) {
         if (operation.equals(opName)) {
            return true;
         }
      }
      return false;
   }
}
