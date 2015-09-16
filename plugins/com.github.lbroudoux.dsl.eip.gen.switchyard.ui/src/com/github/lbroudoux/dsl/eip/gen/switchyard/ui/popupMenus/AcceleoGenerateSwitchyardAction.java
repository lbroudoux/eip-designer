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
package com.github.lbroudoux.dsl.eip.gen.switchyard.ui.popupMenus;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

import com.github.lbroudoux.dsl.eip.gen.switchyard.ui.Activator;
import com.github.lbroudoux.dsl.eip.gen.switchyard.ui.common.GenerateAll;

import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;

/**
 * Switchyard code generation.
 */
public class AcceleoGenerateSwitchyardAction extends ActionDelegate implements IActionDelegate {
	
	/**
	 * Selected model files.
	 */
	protected List<IFile> files;

	/**{@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			files = ((IStructuredSelection) selection).toList();
		}
	}

	/**{@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#run(org.eclipse.jface.action.IAction)
	 * @generated NOT
	 */
	public void run(IAction action) {
		if (files != null) {

		   Iterator<IFile> filesIt = files.iterator();
         while (filesIt.hasNext()) {
            final IFile model = (IFile)filesIt.next();
            
            // Run dialog asynchronously into UI Thread.
            PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
               public void run() {
                  Shell activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
                  DirectoryDialog dialog = new DirectoryDialog(activeShell);
                  dialog.setText("Switchyard generation target");
                  dialog.setMessage("Select a target directory for project generation on " + model.getName());
                  final String directory = dialog.open();
                  if (directory == null) {
                     return;
                  }
                  
                  // Create a new runnable for this.
                  IRunnableWithProgress operation = new IRunnableWithProgress() {
                     public void run(final IProgressMonitor monitor) {
                        URI modelURI = URI.createPlatformResourceURI(model.getFullPath().toString(), true);
                        IContainer target = model.getProject().getWorkspace().getRoot().getContainerForLocation(new Path(directory));
                        
                        try {
                           try {
                              GenerateAll generator = new GenerateAll(modelURI, target, getArguments());
                              generator.doGenerate(monitor);
                           } catch (IOException e) {
                              IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
                              Activator.getDefault().getLog().log(status);
                           } finally {
                              model.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
                           }
                        } catch (CoreException e) {
                           IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
                           Activator.getDefault().getLog().log(status);
                        }
                     }
                  };
                  
                  // Execute runnable operation with progression.
                  try {
                     PlatformUI.getWorkbench().getProgressService().run(true, true, operation);
                  } catch (InvocationTargetException e) {
                     IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
                     Activator.getDefault().getLog().log(status);
                  } catch (InterruptedException e) {
                     IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
                     Activator.getDefault().getLog().log(status);
                  }
               }
            });
         }
		}
	}

	/**
	 * Computes the arguments of the generator.
	 * 
	 * @return the arguments
	 * @generated
	 */
	protected List<? extends Object> getArguments() {
		return new ArrayList<String>();
	}

}