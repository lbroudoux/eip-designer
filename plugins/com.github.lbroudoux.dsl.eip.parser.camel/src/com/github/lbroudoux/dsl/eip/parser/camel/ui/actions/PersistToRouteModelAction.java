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
package com.github.lbroudoux.dsl.eip.parser.camel.ui.actions;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.ISources;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.services.IServiceLocator;

import com.github.lbroudoux.dsl.eip.parser.camel.ui.actions.ActionCommands;
import com.github.lbroudoux.dsl.eip.parser.camel.ui.actions.PersistToRouteModelActionHandler;
import com.github.lbroudoux.dsl.eip.parser.camel.Activator;

/**
 * Delegate for building "Add to EIP Model..." menu contribution.
 * @author laurent
 */
public class PersistToRouteModelAction implements IObjectActionDelegate {

   private PersistToRouteModelActionHandler handler;
   
   private ISelection mySelection;
   
   /** The part as set in {@link #setActivePart(IAction, IWorkbenchPart)} */
   protected IServiceLocator serviceLocator;
   
   /** The constructor. */
   public PersistToRouteModelAction() {
      handler = new PersistToRouteModelActionHandler();
   }
   
   @Override
   public void run(IAction action) {
      if (serviceLocator == null) {
         serviceLocator = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
      } 
      
      // Create an ExecutionEvent using Eclipse machinery.
      ICommandService srv = (ICommandService) serviceLocator.getService(ICommandService.class);
      IHandlerService hsrv = (IHandlerService) serviceLocator.getService(IHandlerService.class);
      ExecutionEvent event = hsrv.createExecutionEvent(srv.getCommand(ActionCommands.PERSIST_TO_ROUTE_MODEL_ACTION), null);
      // Fill it my current active selection.
      if (event.getApplicationContext() instanceof IEvaluationContext) {
         ((IEvaluationContext) event.getApplicationContext()).addVariable(ISources.ACTIVE_CURRENT_SELECTION_NAME, mySelection);
      }
      
      try {
         handler.execute(event);
      } catch (ExecutionException e) {
         Activator.handleError(e.getMessage(), e, true);
      }
   }
   
   @Override
   public void selectionChanged(IAction action, ISelection selection) {
      mySelection = selection;
   }

   @Override
   public void setActivePart(IAction action, IWorkbenchPart targetPart) {
      serviceLocator = targetPart.getSite();
   }
}
