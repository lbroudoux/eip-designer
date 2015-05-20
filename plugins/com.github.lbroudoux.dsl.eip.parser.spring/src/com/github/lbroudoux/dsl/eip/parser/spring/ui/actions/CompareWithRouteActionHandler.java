package com.github.lbroudoux.dsl.eip.parser.spring.ui.actions;

import org.eclipse.core.resources.IFile;

import com.github.lbroudoux.dsl.eip.EIPModel;
import com.github.lbroudoux.dsl.eip.EipFactory;
import com.github.lbroudoux.dsl.eip.Route;
import com.github.lbroudoux.dsl.eip.parser.core.ui.actions.AbstractCompareWithRouteActionHandler;
import com.github.lbroudoux.dsl.eip.parser.spring.SpringIntegrationFileParser;

/**
 * 
 * @author laurent
 */
public class CompareWithRouteActionHandler extends AbstractCompareWithRouteActionHandler {

   /** The constructor. */
   public CompareWithRouteActionHandler() {
   }

   @Override
   protected Route extractRouteFromFile(IFile selectionFile) {
      SpringIntegrationFileParser parser = new SpringIntegrationFileParser(selectionFile.getLocation().toFile());
       EIPModel model = EipFactory.eINSTANCE.createEIPModel();
       try {
          parser.parseAndFillModel(model);
       } catch (Exception e) {
          // TODO Manage parsing exception
          e.printStackTrace();
          return null;
       }
       if (model.getOwnedRoutes() == null || model.getOwnedRoutes().isEmpty()) {
          // TODO Manage empty parsing result.
          System.err.println("No Route was found during Spring Integration file parsing !");
          return null;
       }
       return model.getOwnedRoutes().get(0);
   }
}
