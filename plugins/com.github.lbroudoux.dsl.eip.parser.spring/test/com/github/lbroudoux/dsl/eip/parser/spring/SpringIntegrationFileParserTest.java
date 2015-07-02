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
package com.github.lbroudoux.dsl.eip.parser.spring;

import static org.junit.Assert.*;

import java.io.File;



//import org.eclipse.emf.compare.Comparison;
//import org.eclipse.emf.compare.EMFCompare;
import org.junit.Test;

import com.github.lbroudoux.dsl.eip.Channel;
import com.github.lbroudoux.dsl.eip.CompositeProcessor;
import com.github.lbroudoux.dsl.eip.EIPModel;
import com.github.lbroudoux.dsl.eip.EipFactory;
import com.github.lbroudoux.dsl.eip.Endpoint;
import com.github.lbroudoux.dsl.eip.Resequencer;
import com.github.lbroudoux.dsl.eip.Route;
import com.github.lbroudoux.dsl.eip.Router;
/**
 * Unit tests for SpringIntegrationFileParser.
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
   public void testAdvanced() throws Exception {
      SpringIntegrationFileParser parser = new SpringIntegrationFileParser(
            new File("test/com/github/lbroudoux/dsl/eip/parser/spring/MyRoute2.xml"));
      EIPModel model = EipFactory.eINSTANCE.createEIPModel();
      parser.parseAndFillModel(model);
      
      // Assert on model.
      assertEquals(1, model.getOwnedRoutes().size());
      Route route = model.getOwnedRoutes().get(0);
      assertEquals(10, route.getOwnedChannels().size());
      assertEquals(6, route.getOwnedEndpoints().size());
      
      // Assert on composed endpoints.
      CompositeProcessor composite = null;
      for (Endpoint endpoint : route.getOwnedEndpoints()) {
         if (endpoint instanceof CompositeProcessor) {
            composite = (CompositeProcessor) endpoint;
            break;
         }
      }
      assertNotNull(composite);
      assertEquals(5, composite.getOwnedEndpoints().size());
      
      // Assert on router properties.
      boolean foundRouter = false;
      for (Endpoint endpoint : composite.getOwnedEndpoints()) {
         if (endpoint instanceof Router) {
            foundRouter = true;
            Router router = (Router) endpoint;
            assertNotNull(router.getToChannel());
            assertEquals(1, router.getOwnedRoutes().size());
            assertEquals("client.isGold()", router.getOwnedRoutes().get(0).getCondition());
            assertEquals("Channel_", router.getOwnedRoutes().get(0).getChannel().getName());
         }
      }
      assertTrue(foundRouter);
   }
   
   @Test
   public void testResequencer() throws Exception {
      SpringIntegrationFileParser parser = new SpringIntegrationFileParser(
            new File("test/com/github/lbroudoux/dsl/eip/parser/spring/MyRouteReseq.xml"));
      EIPModel model = EipFactory.eINSTANCE.createEIPModel();
      parser.parseAndFillModel(model);
      
      // Assert on model.
      assertEquals(1, model.getOwnedRoutes().size());
      Route route = model.getOwnedRoutes().get(0);
      assertEquals(2, route.getOwnedChannels().size());
      assertEquals(3, route.getOwnedEndpoints().size());
      
      // Assert on resequencer endpoints.
      Resequencer resequencer = null;
      for (Endpoint endpoint : route.getOwnedEndpoints()) {
         if (endpoint instanceof Resequencer) {
            resequencer = (Resequencer) endpoint;
            break;
         }
      }
      assertNotNull(resequencer);
      assertNull(resequencer.getStrategy());
      assertTrue(resequencer.isStreamSequences());
      assertEquals("headers['foo']", resequencer.getExpression());
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
      //Comparison comparison = EMFCompare.builder().build().compare(EMFCompare.createDefaultScope(reference, model));
      //assertEquals(0, comparison.getDifferences().size());
   }

}
