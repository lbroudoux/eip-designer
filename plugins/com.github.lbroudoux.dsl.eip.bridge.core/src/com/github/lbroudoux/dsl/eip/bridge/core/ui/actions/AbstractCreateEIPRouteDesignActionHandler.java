package com.github.lbroudoux.dsl.eip.bridge.core.ui.actions;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.handlers.HandlerUtil;

import com.github.lbroudoux.dsl.eip.EIPModel;
import com.github.lbroudoux.dsl.eip.EipFactory;
import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.Route;
import com.github.lbroudoux.dsl.eip.ServiceRef;
import com.github.lbroudoux.dsl.eip.bridge.core.ui.dialogs.EIPModelAndRouteSelectionDialog;

/**
 * Base Handler for Designer Bridges plugins. It defines the base process of bridging designers together
 * and initializing the target EIP model as a consequence. It provides 2 hook methods that shouls be implemented
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
         Resource emfResource = resourceSet.getResource(URI.createURI(eipModelResource.getLocationURI().toString()), true);
         
         // Ask concrete subclass to produce a list of wrapped ServiceRef.
         List<ServiceRefWrapper> serviceRefW = extractServiceRefs();
         
         // Create route with correct service references.
         for (EObject object : emfResource.getContents()){
            if (object instanceof EIPModel) {
               EIPModel eipModel = (EIPModel) object;
               eipModel.getOwnedRoutes().add(createRouteAndServiceRefs(dialog.getRouteName(), serviceRefW));
            }
         }
         
         // Finally, save modified EMF resource.
         try {
            emfResource.save(null);
         } catch (IOException ioe) {
            System.err.println("IOException whil saving modified EIP model");
            ioe.printStackTrace();
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
   
   /** Factorire here the EMF loading model plumbing stuffs. */
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
   private Route createRouteAndServiceRefs(String routeName, List<ServiceRefWrapper> serviceRefs) {
      Route route = EipFactory.eINSTANCE.createRoute();
      route.setName(routeName);
      
      for (ServiceRefWrapper serviceRefW : serviceRefs) {
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
         route.getOwnedServiceRefs().add(serviceRef);
      }
      return route;
   }
}
