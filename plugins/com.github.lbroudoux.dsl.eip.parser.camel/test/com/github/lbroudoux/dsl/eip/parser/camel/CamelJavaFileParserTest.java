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
 * Unit tests for CamelJavaFileParser.
 * @author s026210
 */
public class CamelJavaFileParserTest {

   @Test
   public void testBasics() throws Exception {
      CamelJavaFileParser parser = new CamelJavaFileParser(
            new File("test/com/github/lbroudoux/dsl/eip/parser/camel/MyRoute.java.txt"));
      EIPModel model = EipFactory.eINSTANCE.createEIPModel();
      parser.parseAndFillModel(model);
      
      // Assert on model.
      assertEquals(1, model.getOwnedRoutes().size());
      Route route = model.getOwnedRoutes().get(0);

      for (Endpoint endpoint : route.getOwnedEndpoints()) {
//         System.err.println("Endpoint " + endpoint.getName());
//         System.err.println(" to -> " + (endpoint.getToChannel()!=null ? endpoint.getToChannel().getName() : "null"));
         if (endpoint instanceof CompositeProcessor) {
            CompositeProcessor composite = (CompositeProcessor)endpoint;
//            for (Endpoint endpoint2 : composite.getOwnedEndpoints()) {
//               System.err.println("  Endpoint " + endpoint2.getName());
//               System.err.println("   to -> " + (endpoint2.getToChannel()!=null ? endpoint2.getToChannel().getName() : "null"));
//            }
         }
      }
      
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
   }
   
   @Test
   public void testResequencer() throws Exception {
      CamelJavaFileParser parser = new CamelJavaFileParser(
            new File("test/com/github/lbroudoux/dsl/eip/parser/camel/MyRoute_2.java.txt"));
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
   
   @Test
   public void testMulticast() throws Exception {
      CamelJavaFileParser parser = new CamelJavaFileParser(
            new File("test/com/github/lbroudoux/dsl/eip/parser/camel/MyRoute_multicast.java.txt"));
      EIPModel model = EipFactory.eINSTANCE.createEIPModel();
      parser.parseAndFillModel(model);
      
      // Assert on model.
      assertEquals(1, model.getOwnedRoutes().size());
      Route route = model.getOwnedRoutes().get(0);
      assertEquals(7, route.getOwnedEndpoints().size());
      assertEquals(9, route.getOwnedChannels().size());
      
      for (Endpoint endpoint : route.getOwnedEndpoints()) {
         if ("GatewayIn".equals(endpoint.getName())) {
            assertEquals(3, endpoint.getToChannels().size());
         }
         if ("ServiceActivator_1".equals(endpoint.getName())) {
            assertEquals(1, endpoint.getFromChannels().size());
         }
      }
      
      // Once Aggregator support will be ok... 
      // assertEquals(9, route.getOwnedEndpoints().size());
      // assertEquals(10, route.getOwnedEndpoints().size());
   }
}
