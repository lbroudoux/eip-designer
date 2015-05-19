package com.github.lbroudoux.dsl.eip.bridge.togaf.ui.actions;

import java.io.IOException;
import java.util.ArrayList;
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
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.ui.handlers.HandlerUtil;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.InformationSystemService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;

import com.github.lbroudoux.dsl.eip.EIPModel;
import com.github.lbroudoux.dsl.eip.EipFactory;
import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.Route;
import com.github.lbroudoux.dsl.eip.ServiceRef;
import com.github.lbroudoux.dsl.eip.bridge.togaf.ui.dialogs.EIPModelAndRouteSelectionDialog;

/**
 * 
 * @author laurent
 */
public class CreateEIPRouteDesignActionHandler extends AbstractHandler {

   /** ResourceSet used for loading and adding route. */
   private ResourceSet resourceSet;
   
   /** The constructor. */
   public CreateEIPRouteDesignActionHandler() {
      // Initialize a ResourceSet to later load model and add Route.
      resourceSet = new ResourceSetImpl();
      
      // Register the appropriate resource factory to handle all file extensions.
      resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, 
            new XMIResourceFactoryImpl());

      // Register the package to ensure it is available during loading.
      resourceSet.getPackageRegistry().put(EipPackage.eNS_URI, EipPackage.eINSTANCE);
   }
   
   /**
    * The command has been executed, so extract the needed information
    * from the application context.
    */
   @Override
   public Object execute(ExecutionEvent event) throws ExecutionException {
      ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
      
      if (currentSelection != null && currentSelection instanceof IStructuredSelection) {
         // Retrieve semantic element (ie. a togaf service) corresponding to current selection.
         IStructuredSelection selection = (IStructuredSelection)currentSelection;
         
         Object receiver = selection.getFirstElement();
         if (receiver instanceof IGraphicalEditPart) {
            final IGraphicalEditPart part = (IGraphicalEditPart) receiver;
            final EObject model = part.resolveSemanticElement();
            System.err.println("model element in handler: " + model);
            
            // We have retrieved here a DNodeSpec element or something that subclasses DDiagramElement...
            if (model instanceof DDiagramElement) {
               DDiagramElement dde = (DDiagramElement) model;
               System.err.println("model element target in handler: " + dde.getTarget());
               
               if (dde.getTarget() instanceof InformationSystemService) {
                  final InformationSystemService service = (InformationSystemService) dde.getTarget();
                  List<Service> serviceRefs = service.getConsumesServices();
                  
                  // Open target selection dialog.
                  EIPModelAndRouteSelectionDialog dialog = new EIPModelAndRouteSelectionDialog(
                        HandlerUtil.getActiveShellChecked(event),
                        service.getName() + "Route");
                  
                  if (dialog.open() != Window.OK) {
                     return null;
                  }
                  
                  // Load and find EIPModel definition.
                  IResource eipModelResource = dialog.getSelectedEIPModel();
                  Resource emfResource = resourceSet.getResource(URI.createURI(eipModelResource.getLocationURI().toString()), true);
                  
                  // Produce a list of wrapped ServiceRef.
                  List<ServiceRefWrapper> serviceRefW = new ArrayList<ServiceRefWrapper>();
                  for (Service serviceRef : serviceRefs) {
                     if (serviceRef instanceof InformationSystemService) {
                        serviceRefW.add(new ServiceRefWrapper(
                              ((InformationSystemService) serviceRef).getName()));
                     }
                  }
                  
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
            }
         }
      }
      
      return null;
   }

   /** This is a hook intended to be used by subclasses that implement specific bridge handler. */
   protected Route createRouteAndServiceRefs(String routeName, List<ServiceRefWrapper> serviceRefs) {
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
}
