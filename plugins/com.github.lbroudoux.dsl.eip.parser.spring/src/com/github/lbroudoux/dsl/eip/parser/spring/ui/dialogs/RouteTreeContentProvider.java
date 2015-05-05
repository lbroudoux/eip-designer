package com.github.lbroudoux.dsl.eip.parser.spring.ui.dialogs;

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
 * 
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
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
}
