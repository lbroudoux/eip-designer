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
package com.github.lbroudoux.dsl.eip.parser.camel;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import com.github.lbroudoux.dsl.eip.CompositeProcessor;
import com.github.lbroudoux.dsl.eip.EIPModel;
import com.github.lbroudoux.dsl.eip.EipFactory;
import com.github.lbroudoux.dsl.eip.Endpoint;
import com.github.lbroudoux.dsl.eip.Resequencer;
import com.github.lbroudoux.dsl.eip.Route;
/**
 * Unit tests for CamelXmlFileParser.
 * @author laurent
 */
public class CamelXmlFileParserTest {

   @Test
   public void testSpringBasics() throws Exception {
      CamelXmlFileParser parser = new CamelXmlFileParser(
            new File("test/com/github/lbroudoux/dsl/eip/parser/camel/MyRoute-spring.xml"));
      EIPModel model = EipFactory.eINSTANCE.createEIPModel();
      parser.parseAndFillModel(model);
      
      // Assert on model.
      assertEquals(1, model.getOwnedRoutes().size());
      Route route = model.getOwnedRoutes().get(0);
      assertEquals(6, route.getOwnedEndpoints().size());
      
      boolean foundAComposite = false;
      for (Endpoint endpoint : route.getOwnedEndpoints()) {
         if (endpoint instanceof CompositeProcessor) {
            CompositeProcessor composite = (CompositeProcessor)endpoint;
            foundAComposite = true;
            // Should be 5 but Aggregator parsing not yet ready...
            assertEquals(4, composite.getOwnedEndpoints().size());
         }
      }
      if (!foundAComposite) {
         fail("We should have parsed and found a CompositeProcessor...");
      }
      
      //assertEquals(8, route.getOwnedChannels().size());
   }
   
   @Test
   public void testBlueprintBasics() throws Exception {
      CamelXmlFileParser parser = new CamelXmlFileParser(
            new File("test/com/github/lbroudoux/dsl/eip/parser/camel/MyRoute-bp.xml"));
      EIPModel model = EipFactory.eINSTANCE.createEIPModel();
      parser.parseAndFillModel(model);
      
      // Assert on model.
      assertEquals(1, model.getOwnedRoutes().size());
      Route route = model.getOwnedRoutes().get(0);
      assertEquals(6, route.getOwnedEndpoints().size());
      
      boolean foundAComposite = false;
      for (Endpoint endpoint : route.getOwnedEndpoints()) {
         if (endpoint instanceof CompositeProcessor) {
            CompositeProcessor composite = (CompositeProcessor)endpoint;
            foundAComposite = true;
            // Should be 5 but Aggregator parsing not yet ready...
            assertEquals(4, composite.getOwnedEndpoints().size());
         }
      }
      if (!foundAComposite) {
         fail("We should have parsed and found a CompositeProcessor...");
      }
      
      //assertEquals(8, route.getOwnedChannels().size());
   }
   
   @Test
   public void testSwitchyardBasics() throws Exception {
      CamelXmlFileParser parser = new CamelXmlFileParser(
            new File("test/com/github/lbroudoux/dsl/eip/parser/camel/MyRoute.xml"));
      EIPModel model = EipFactory.eINSTANCE.createEIPModel();
      parser.parseAndFillModel(model);
      
      // Assert on model.
      assertEquals(1, model.getOwnedRoutes().size());
      Route route = model.getOwnedRoutes().get(0);
      assertEquals(6, route.getOwnedEndpoints().size());
      
      boolean foundAComposite = false;
      for (Endpoint endpoint : route.getOwnedEndpoints()) {
         if (endpoint instanceof CompositeProcessor) {
            CompositeProcessor composite = (CompositeProcessor)endpoint;
            foundAComposite = true;
            // Should be 5 but Aggregator parsing not yet ready...
            assertEquals(4, composite.getOwnedEndpoints().size());
         }
      }
      if (!foundAComposite) {
         fail("We should have parsed and found a CompositeProcessor...");
      }
      
      //assertEquals(8, route.getOwnedChannels().size());
   }

   @Test
   public void testResequencer() throws Exception {
      CamelXmlFileParser parser = new CamelXmlFileParser(
            new File("test/com/github/lbroudoux/dsl/eip/parser/camel/MyRoute_2.xml"));
      EIPModel model = EipFactory.eINSTANCE.createEIPModel();
      parser.parseAndFillModel(model);
      
      // Assert on model.
      assertEquals(1, model.getOwnedRoutes().size());
      Route route = model.getOwnedRoutes().get(0);
      assertEquals(3, route.getOwnedEndpoints().size());
      
      // Find Resequencer.
      Resequencer resequencer = null;
      for (Endpoint endpoint : route.getOwnedEndpoints()) {
         if (endpoint instanceof Resequencer) {
            resequencer = (Resequencer) endpoint;
         }
      }
      if (resequencer == null) {
         fail("We should have a Resequencer among endpoints");
      }
      
      // Check properties.
      assertEquals("Resequencer_GatewayOut", resequencer.getToChannels().get(0).getName());
      assertEquals("GatewayOut", resequencer.getToChannels().get(0).getToEndpoint().getName());
      assertTrue(resequencer.isStreamSequences());
   }
}
