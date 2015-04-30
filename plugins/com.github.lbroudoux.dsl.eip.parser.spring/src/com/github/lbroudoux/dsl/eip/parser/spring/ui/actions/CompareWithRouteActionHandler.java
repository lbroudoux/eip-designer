package com.github.lbroudoux.dsl.eip.parser.spring.ui.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.handlers.HandlerUtil;

import com.github.lbroudoux.dsl.eip.parser.spring.ui.dialogs.CompareTargetSelectionDialog;

/**
 * 
 * @author laurent
 */
public class CompareWithRouteActionHandler extends AbstractHandler {

   /** The constructor. */
   public CompareWithRouteActionHandler() {
   }
   
   /**
    * The command has been executed, so extract extract the needed information
    * from the application context.
    */
   @Override
   public Object execute(ExecutionEvent event) throws ExecutionException {
      System.err.print("In execute(ExecutionEvent)");
      CompareTargetSelectionDialog dialog = new CompareTargetSelectionDialog(HandlerUtil.getActiveShellChecked(event));
      
      if (dialog.open() != Window.OK) {
         return null;
      }
      
      return null;
   }
}
