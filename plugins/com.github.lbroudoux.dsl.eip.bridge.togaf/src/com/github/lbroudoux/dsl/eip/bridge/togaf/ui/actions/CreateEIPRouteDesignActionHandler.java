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
package com.github.lbroudoux.dsl.eip.bridge.togaf.ui.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.InformationSystemService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;

import com.github.lbroudoux.dsl.eip.bridge.core.ui.actions.AbstractCreateEIPRouteDesignActionHandler;

/**
 * A concrete Designer bridge handler for Obeo Togaf models.
 * @author laurent
 */
public class CreateEIPRouteDesignActionHandler extends AbstractCreateEIPRouteDesignActionHandler {

   /** The target semantic element for which to create Route. */
   private InformationSystemService service = null;
   
   /** The constructor. */
   public CreateEIPRouteDesignActionHandler() {
   }

   @Override
   protected String checkEventCurrentSelection(ISelection currentSelection) {
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
                  service = (InformationSystemService) dde.getTarget();
                  return service.getName() + "Route";
               }
            }
         }
      }
      return null;
   }

   @Override
   protected List<ServiceRefWrapper> extractServiceRefs() {
      if (service != null) {
         List<Service> serviceRefs = service.getConsumesServices();
         
         // Produce a list of wrapped ServiceRef.
         List<ServiceRefWrapper> serviceRefW = new ArrayList<ServiceRefWrapper>();
         for (Service serviceRef : serviceRefs) {
            if (serviceRef instanceof InformationSystemService) {
               serviceRefW.add(new ServiceRefWrapper(
                     ((InformationSystemService) serviceRef).getName()));
            }
         }
         return serviceRefW;
      }
      return null;
   }
}
