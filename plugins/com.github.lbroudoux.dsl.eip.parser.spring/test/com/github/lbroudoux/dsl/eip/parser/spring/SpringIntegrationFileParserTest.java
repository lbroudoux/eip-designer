package com.github.lbroudoux.dsl.eip.parser.spring;

import static org.junit.Assert.*;

import java.io.File;

import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.junit.Test;

import com.github.lbroudoux.dsl.eip.Channel;
import com.github.lbroudoux.dsl.eip.EIPModel;
import com.github.lbroudoux.dsl.eip.EipFactory;
import com.github.lbroudoux.dsl.eip.Endpoint;
import com.github.lbroudoux.dsl.eip.Route;
/**
 * 
 * @author laurent
 */
public class SpringIntegrationFileParserTest {

   @Test
   public void testBasics() throws Exception {
      SpringIntegrationFileParser parser = new SpringIntegrationFileParser(
            new File("test/com/github/lbroudoux/dsl/eip/parser/spring/MyRoute.xml"));
      EIPModel model = EipFactory.eINSTANCE.createEIPModel();
      parser.parseAndFillModel(model);
      
      // Assert on model.
      assertEquals(1, model.getOwnedRoutes().size());
      Route route = model.getOwnedRoutes().get(0);
      assertEquals(7, route.getOwnedChannels().size());
      assertEquals(2, route.getOwnedEndpoints().size());
   }
   
   @Test
   public void testComparison() throws Exception {
      SpringIntegrationFileParser parser = new SpringIntegrationFileParser(
            new File("test/com/github/lbroudoux/dsl/eip/parser/spring/MyRoute.xml"));
      EIPModel model = EipFactory.eINSTANCE.createEIPModel();
      parser.parseAndFillModel(model);
      
      // Build an in memory model representing reference for comparison.
      EIPModel reference = EipFactory.eINSTANCE.createEIPModel();
      Route refRoute = EipFactory.eINSTANCE.createRoute();
      reference.getOwnedRoutes().add(refRoute);
      
      // First, provision every channels.
      Channel input = EipFactory.eINSTANCE.createChannel();
      input.setName("InputChannel");
      refRoute.getOwnedChannels().add(input);
      Channel targetContent = EipFactory.eINSTANCE.createChannel();
      targetContent.setName("TargetContent");
      refRoute.getOwnedChannels().add(targetContent);
      Channel activateFiltered = EipFactory.eINSTANCE.createChannel();
      activateFiltered.setName("ActivateFiltered");
      refRoute.getOwnedChannels().add(activateFiltered);
      Channel channel = EipFactory.eINSTANCE.createChannel();
      channel.setName("Compose");
      refRoute.getOwnedChannels().add(channel);
      channel = EipFactory.eINSTANCE.createChannel();
      channel.setName("OutputChannel");
      refRoute.getOwnedChannels().add(channel);
      channel = EipFactory.eINSTANCE.createChannel();
      channel.setName("ToRouter");
      refRoute.getOwnedChannels().add(channel);
      channel = EipFactory.eINSTANCE.createChannel();
      channel.setName("FromRouter");
      refRoute.getOwnedChannels().add(channel);
      
      // Then, create endpoint and associate channels.
      Endpoint endpoint = EipFactory.eINSTANCE.createFilter();
      endpoint.setName("Filter");
      endpoint.setToChannel(activateFiltered);
      endpoint.getFromChannels().add(targetContent);
      refRoute.getOwnedEndpoints().add(endpoint);
      endpoint = EipFactory.eINSTANCE.createTransformer();
      endpoint.setName("Normalize Data");
      endpoint.setToChannel(targetContent);
      endpoint.getFromChannels().add(input);
      refRoute.getOwnedEndpoints().add(endpoint);
      
      // EMF Compare should see no diff.
      Comparison comparison = EMFCompare.builder().build().compare(EMFCompare.createDefaultScope(reference, model));
      assertEquals(0, comparison.getDifferences().size());
   }

}
