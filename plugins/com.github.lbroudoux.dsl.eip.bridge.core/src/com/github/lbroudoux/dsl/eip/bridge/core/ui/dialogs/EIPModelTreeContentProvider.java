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
 * 
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
