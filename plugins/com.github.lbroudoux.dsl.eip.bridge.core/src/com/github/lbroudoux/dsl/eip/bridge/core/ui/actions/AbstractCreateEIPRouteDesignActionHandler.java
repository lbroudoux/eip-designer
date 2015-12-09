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
package com.github.lbroudoux.dsl.eip.bridge.core.ui.actions;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.CreateRepresentationCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.handlers.HandlerUtil;

import com.github.lbroudoux.dsl.eip.Channel;
import com.github.lbroudoux.dsl.eip.EIPModel;
import com.github.lbroudoux.dsl.eip.EipFactory;
import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.Gateway;
import com.github.lbroudoux.dsl.eip.Route;
import com.github.lbroudoux.dsl.eip.ServiceActivator;
import com.github.lbroudoux.dsl.eip.ServiceInvocation;
import com.github.lbroudoux.dsl.eip.ServiceRef;
import com.github.lbroudoux.dsl.eip.bridge.core.ui.dialogs.EIPModelAndRouteSelectionDialog;

/**
 * Base Handler for Designer Bridges plugins. It defines the base process of bridging designers together
 * and initializing the target EIP model as a consequence. It provides 2 hook methods that should be implemented
 * by concrete subclasses : <ul>
 * <li><code>checkEventCurrentSelection(ISelection)</code> should check if event is correct and return
 * a Route name in this case,</li>
 * <li><code>extractServiceRefs()</code> should extract from the semantic elements targeted by event,
 * the service references to add into target EIP Route.</li>
 * </ul> 
 * @author laurent
 */
public abstract class AbstractCreateEIPRouteDesignActionHandler extends AbstractHandler {

   /**
    * The command has been executed, so extract the needed information
    * from the application context.
    */
   @Override
   public Object execute(ExecutionEvent event) throws ExecutionException {
      ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
      
      // Ask concrete subclass to check if event is eligible and extract default 
      // route name in this case.
      String defaultRouteName = checkEventCurrentSelection(currentSelection);
      
      if (defaultRouteName != null && defaultRouteName.length() > 0) {
         // Open target selection dialog.
         EIPModelAndRouteSelectionDialog dialog = new EIPModelAndRouteSelectionDialog(
               HandlerUtil.getActiveShellChecked(event),
               defaultRouteName);
         
         if (dialog.open() != Window.OK) {
            return null;
         }
         
         // Load and find EIPModel definition.
         IResource eipModelResource = dialog.getSelectedEIPModel();
         ResourceSet resourceSet = initializeResourceSet();
         final Resource emfResource = resourceSet.getResource(URI.createURI(eipModelResource.getLocationURI().toString()), true);
         
         // Ask concrete subclass to produce a list of wrapped ServiceRef.
         List<ServiceRefWrapper> serviceRefW = extractServiceRefs();
         
         // Create route with correct service references.
         Route route = null;
         for (EObject object : emfResource.getContents()){
            if (object instanceof EIPModel) {
               EIPModel eipModel = (EIPModel) object;
               route = createRouteAndServiceRefs(eipModel, dialog.getRouteName(), serviceRefW);
               break;
            }
         }
         
         // Finally, save modified EMF resource.
         WorkspaceModifyOperation modifyOp = new WorkspaceModifyOperation() {
            @Override
            protected void execute(IProgressMonitor monitor) throws CoreException,
                  InvocationTargetException, InterruptedException {
               try {
                  emfResource.save(null);
               } catch (IOException e) {
                  System.err.println("IOException while saving modified EIP model");
                  e.printStackTrace();
               }
            }
         }; 
         try {
            modifyOp.run(new NullProgressMonitor());
         } catch (InvocationTargetException ite) {
            ite.printStackTrace();
         } catch (InterruptedException ie) {
            ie.printStackTrace();
         }
         
         try {
            eipModelResource.getProject().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
         } catch (CoreException e) {
            System.err.println("Exception while refreshing project containing target model");
            e.printStackTrace();
         }
         
         // Now, retrieve Sirius session to create default diagram for Route.
         IFile airdFile = eipModelResource.getProject().getFile("representations.aird");
         if (!airdFile.exists()) {
            System.err.println("Could not found file:" + airdFile.getLocationURI());
            return null;
         }
         URI airdFileURI = URI.createPlatformResourceURI(airdFile.getFullPath().toOSString(), true);
         Session session = SessionManager.INSTANCE.getSession(airdFileURI, new NullProgressMonitor());
         
         // Reload route so that we're sure it's the one associated to Sirius session.
         Route sessionRoute = null; 
         EIPModel sessionModel = (EIPModel) session.getSemanticResources().iterator().next().getContents().get(0);
         for (Route r : sessionModel.getOwnedRoutes()) {
            if (r.getName().equals(route.getName())) {
               sessionRoute = r;
               break;
            }
         }
         
         // Create route details representation.
         Collection<RepresentationDescription> descriptions = DialectManager.INSTANCE.getAvailableRepresentationDescriptions(
               session.getSelectedViewpoints(false), sessionRoute);
         if (descriptions.isEmpty()) {
            System.err.println("Could not found representation description for object: " + sessionRoute);
            return null;
         }
         
         RepresentationDescription description = descriptions.iterator().next();
         Command createViewCommand = new CreateRepresentationCommand(session,
                 description, sessionRoute, sessionRoute.getName() + " Details", new NullProgressMonitor());
         session.getTransactionalEditingDomain().getCommandStack().execute(createViewCommand);

         SessionManager.INSTANCE.notifyRepresentationCreated(session);
         
         // Open-up newly created representation.
         Collection<DRepresentation> representations = DialectManager.INSTANCE.getRepresentations(description, session);
         DRepresentation myDiagramRepresentation = representations.iterator().next();

         DialectUIManager.INSTANCE.openEditor(session, myDiagramRepresentation, new NullProgressMonitor());
         
         // Save session and refresh workspace
         session.save(new NullProgressMonitor());
         try {
            eipModelResource.getProject().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
         } catch (CoreException e) {
            e.printStackTrace();
         }
      }
      
      return null;
   }
   
   /**
    * Hook for concrete subclass. Called by this base handler once ExecutionEvent is received. Current selection
    * is passed in order to check if event is eligible to the creation of an EIP Route. If so, subsclass should
    * return a name for the target EIP Route to create. If current selection is not valid, subclass should just
    * return null and current handling will stop.
    * @param currentSelection The event current selection.
    * @return The name of EIP Route to create if correct, null otherwise.
    */
   protected abstract String checkEventCurrentSelection(ISelection currentSelection);
   
   /**
    * Hook for concrete subclass. Only called once event is valid and valid EIP Model to host target EIP Route
    * has been found and loaded. Subclass should implement this method in order to specify how to retrieve the Service
    * references that need to be injected into the target EIP Route to create. These references are specific to the
    * semantic of designer subclass is working on and thus should be specified.
    * @return A list of ServiceRefWrapper or null if no service references found for the target EIP Route.
    */
   protected abstract List<ServiceRefWrapper> extractServiceRefs();
   
   /** Simple wrapper for EIP ServiceWrapper for sub-classes not worrying about EMF initialization stuffs... */
   protected class ServiceRefWrapper {
      private final String name;
      private final String[] operations;
      private final Object reference;
      
      public ServiceRefWrapper(String name) {
         this(name, null, null);
      }
      public ServiceRefWrapper(String name, String[] operations) {
         this(name, operations, null);
      }
      public ServiceRefWrapper(String name, String[] operations, Object reference) {
         this.name = name;
         this.operations = operations;
         this.reference = reference;
      }
      public String getName() {
         return name;
      }
      public String[] getOperations() {
         return operations;
      }
      public Object getReference() {
         return reference;
      }
   }
   
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
   
   /** Factorize here the EMF resource creation plumbing stuffs. */
   private Route createRouteAndServiceRefs(EIPModel eipModel, String routeName, List<ServiceRefWrapper> serviceRefs) {
      Route route = EipFactory.eINSTANCE.createRoute();
      route.setName(routeName);
      
      // Create default GatewayIn and GatewayOut endpoints.
      Gateway in = EipFactory.eINSTANCE.createGateway();
      Gateway out = EipFactory.eINSTANCE.createGateway();
      in.setName("GatewayIn");
      out.setName("GatewayOut");
      Channel inToFirst = EipFactory.eINSTANCE.createChannel();
      Channel lastToOut = EipFactory.eINSTANCE.createChannel();
      inToFirst.setName("GatewayIn_First");
      lastToOut.setName("Last_GatewayOut");
      in.getToChannels().add(inToFirst);
      out.getFromChannels().add(lastToOut);
      route.getOwnedEndpoints().add(in);
      route.getOwnedEndpoints().add(out);
      route.getOwnedChannels().add(inToFirst);
      route.getOwnedChannels().add(lastToOut);
      
      Channel incomingChannel = inToFirst;
      for (int i=0; i<serviceRefs.size(); i++) {
         ServiceRefWrapper serviceRefW = serviceRefs.get(i);
         ServiceRef serviceRef = EipFactory.eINSTANCE.createServiceRef();
         serviceRef.setName(serviceRefW.getName());
         // Add operation if any.
         if (serviceRefW.getOperations() != null) {
            for (String operation : serviceRefW.getOperations()) {
               serviceRef.getOperations().add(operation);
            }
         }
         // Add object reference if any.
         if (serviceRefW.getReference() != null) {
            serviceRef.setReference(serviceRefW.getReference());
         }
         if (!isServiceRefAlreadyInModel(serviceRef, eipModel)) {   
            eipModel.getOwnedServiceRefs().add(serviceRef);
         }
         
         // Create a sample ServiceActivator and invocation for each reference.
         ServiceActivator activator = EipFactory.eINSTANCE.createServiceActivator();
         ServiceInvocation invocation = EipFactory.eINSTANCE.createServiceInvocation();
         activator.setName(serviceRef.getName()+ " Activator");
         invocation.setServiceRef(serviceRef);
         activator.getOwnedServiceInvocations().add(invocation);
         
         // Complete activator with channels.
         activator.getFromChannels().add(incomingChannel);
         if (i < serviceRefs.size() - 1) {
            incomingChannel = EipFactory.eINSTANCE.createChannel();
            incomingChannel.setName(serviceRefW.getName() + "_" + serviceRefs.get(i + 1).getName());
            activator.getToChannels().add(incomingChannel);
            route.getOwnedChannels().add(incomingChannel);
         } else {
            activator.getToChannels().add(lastToOut);
         }
         
         route.getOwnedEndpoints().add(activator);
      }
      eipModel.getOwnedRoutes().add(route);
      return route;
   }
   
   /** Check if service reference is already present into model. */
   private boolean isServiceRefAlreadyInModel(ServiceRef reference, EIPModel model) {
      for (ServiceRef modelRef : model.getOwnedServiceRefs()) {
         if (modelRef.getName().equals(reference.getName())) {
            return true;
         }
      }
      return false;
   }
}
