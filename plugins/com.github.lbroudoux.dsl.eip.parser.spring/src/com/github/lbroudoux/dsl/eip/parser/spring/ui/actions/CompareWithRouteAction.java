package com.github.lbroudoux.dsl.eip.parser.spring.ui.actions;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.services.IServiceLocator;

import com.github.lbroudoux.dsl.eip.parser.spring.Activator;

/**
 * 
 * @author laurent
 */
public class CompareWithRouteAction implements IObjectActionDelegate {

   private CompareWithRouteActionHandler handler;
   
   private ISelection mySelection;
   
   /** The part as set in {@link #setActivePart(IAction, IWorkbenchPart)} */
   protected IServiceLocator serviceLocator;
   
   /** The constructor. */
   public CompareWithRouteAction() {
      handler =  new CompareWithRouteActionHandler();
   }
   
   @Override
   public void run(IAction action) {
      System.err.println("In run(IACtion)");
      if (serviceLocator == null) {
         serviceLocator = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
      } 
      
      ICommandService srv = (ICommandService) serviceLocator.getService(ICommandService.class);
      IHandlerService hsrv = (IHandlerService) serviceLocator.getService(IHandlerService.class);
      ExecutionEvent event = hsrv.createExecutionEvent(srv.getCommand(ActionCommands.COMPARE_WITH_ROUTE_ACTION), null);
      
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
