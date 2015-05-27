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
package com.github.lbroudoux.dsl.eip.bridge.togaf.ui.testers;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.InformationSystemService;

/**
 * Property tester that checks if a selected GMF element is an Obeo Togaf Designer
 * Service semantic element.
 * @author laurent
 */
public class IsATogafServiceTester extends PropertyTester {

   @Override
   public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
      if (receiver instanceof IGraphicalEditPart) {
         final IGraphicalEditPart part = (IGraphicalEditPart) receiver;
         
         if ("isATogafService".equals(property)) {
            final EObject model = part.resolveSemanticElement();
            // We have retrieved here a DNodeSpec element or something that subclasses DDiagramElement...
            if (model instanceof DDiagramElement) {
               DDiagramElement dde = (DDiagramElement) model;
               // Here's is the real semantic target...
               System.err.println("model element target: " + dde.getTarget());
               return (dde.getTarget() instanceof InformationSystemService);
            }
         }
      }
      
      return false;
   }
}
