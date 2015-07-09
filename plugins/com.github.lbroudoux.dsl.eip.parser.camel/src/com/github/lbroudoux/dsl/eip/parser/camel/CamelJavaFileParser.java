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

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Comment;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.LineComment;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;

import com.github.lbroudoux.dsl.eip.Channel;
import com.github.lbroudoux.dsl.eip.CompositeProcessor;
import com.github.lbroudoux.dsl.eip.ConditionalRoute;
import com.github.lbroudoux.dsl.eip.EIPModel;
import com.github.lbroudoux.dsl.eip.EipFactory;
import com.github.lbroudoux.dsl.eip.Endpoint;
import com.github.lbroudoux.dsl.eip.Route;
import com.github.lbroudoux.dsl.eip.Router;
import com.github.lbroudoux.dsl.eip.Splitter;

/**
 * Parser for Apache Camel Java RouteBuilder class file. Just build a new instance and call
 * <code>parseAndFillModel()</code> with already initialized model and it should go !
 * @author laurent
 */
public class CamelJavaFileParser extends ASTVisitor {

   private final File routeFile;
   
   private boolean inConfigure = false;
   
   private String routeSource = null;
   
   private CompilationUnit routeCU = null;
   
   // Because fluent APIs expression are parsed reversed (last invocation first), we
   // need a kind of Stack in order to easily recompose invocation order and corresponding
   // endpoints chain.
   private Deque<MethodInvocation> expressionStack = new ArrayDeque<>();
   
   // Because comments are not globally accessibles, we need to recreate a map ordering
   // them bu line within source.
   private Map<Integer, String> commentMap = new HashMap<>();
   
   /** The Route being parser and completed with endpoints and channels. */
   private Route route = null;
   
   /**
    * Constructor.
    * @param routeFile The Java file representing Camel route configuration.
    */
   public CamelJavaFileParser(File routeFile) {
      this.routeFile = routeFile;
   }
   
   /**
    * Parse the routeFile given while building the instance and fill the model.
    * @param model The EIP Model to fill with parsed elements from routeFile.
    * @throws InvalidArgumentException if given file is not a valid Spring integration file
    */
   public void parseAndFillModel(EIPModel model) throws Exception {
      // Read source content.
      routeSource = parseRouteClass();
      
      // Parse and get the compilation unit.
      ASTParser parser = ASTParser.newParser(AST.JLS8);
      parser.setKind(ASTParser.K_COMPILATION_UNIT);
      parser.setSource(routeSource.toCharArray());
      parser.setResolveBindings(false);
      routeCU = (CompilationUnit) parser.createAST(null);
      
      // Visit and build a comment map before parsing.
      for (Object comment : routeCU.getCommentList()) {
         ((Comment) comment).accept(this);
      }
      
      // Initialize and build a route.
      route = EipFactory.eINSTANCE.createRoute();
      model.getOwnedRoutes().add(route);
      
      // 
      routeCU.accept(this);
   }
   
   // Override of ASTVisitor ---------------------------------------------------
   
   @Override
   public boolean visit(MethodDeclaration node) {
      if ("configure".equals(node.getName().toString())) {
         inConfigure = true;
      }
      return super.visit(node);
   }
   
   @Override
   public void endVisit(MethodDeclaration node) {
      if ("configure".equals(node.getName().toString())) {
         inConfigure = false;
      }
      super.endVisit(node);
   }

   @Override
   public boolean visit(MethodInvocation node) {
      if (inConfigure) {
         // We're in a fluent API usage...
         if (node.getExpression() != null) {
            expressionStack.addLast(node);
         } else {
            computeExpressionStack(node);
            // Reset stack for next expression.
            expressionStack.clear();
         }
        
      }
      return super.visit(node);
   }

   @Override
   public boolean visit(LineComment node) {
      commentMap.put(routeCU.getLineNumber(node.getStartPosition()), getCommentContent(node));
      return true;
   }

   
   // Private ------------------------------------------------------------------

   /** */
   private void computeExpressionStack(MethodInvocation first) {
      parseAndFillEndpoint(first, null, route.getOwnedEndpoints());
   }
   
   /** */
   private void parseAndFillEndpoint(MethodInvocation invocation, Channel incomingChannel, List<Endpoint> endpoints) {
      //System.err.println("Parsing " + invocation.getName());
      Endpoint endpoint = null;
      
      if ("from".equals(invocation.getName().toString())) {
         endpoint = EipFactory.eINSTANCE.createGateway();
      } else if ("choice".equals(invocation.getName().toString())) { 
         endpoint = EipFactory.eINSTANCE.createRouter();
      } else if ("filter".equals(invocation.getName().toString())) {
         endpoint = EipFactory.eINSTANCE.createFilter();
      } else if ("split".equals(invocation.getName().toString())) {
         // CompositeProcessor is implicit and should be created when split() appears.
         endpoint = EipFactory.eINSTANCE.createCompositeProcessor();
         endpoints.add(endpoint);
         // Intermediate channel should be connected and then reset cause first
         // contained endpoint does not have incming channel.
         incomingChannel.setToEndpoint(endpoint);
         incomingChannel = null;
         // We should "go down" and consider composite endpoints until end() appear.
         endpoints = ((CompositeProcessor) endpoint).getOwnedEndpoints();
         endpoint  = EipFactory.eINSTANCE.createSplitter();
      } else if ("when".equals(invocation.getName().toString())) {
         // Parent should be a Router.
         Endpoint lastEndpoint = endpoints.get(endpoints.size() - 1);
         if (lastEndpoint instanceof Router) {
            ConditionalRoute cRoute = EipFactory.eINSTANCE.createConditionalRoute();
            ((Router) lastEndpoint).getOwnedRoutes().add(cRoute);
            // Inspect comment to get outgoing channel name.
            int invocationLine = routeCU.getLineNumber(invocation.getStartPosition() + invocation.getLength());
            String outgoingChannelName = commentMap.get(invocationLine);
            // Outgoing channel will became net endpoint incoming.
            incomingChannel = EipFactory.eINSTANCE.createChannel();
            incomingChannel.setName(outgoingChannelName);
            cRoute.setChannel(incomingChannel);
         }
      } else if ("otherwise".equals(invocation.getName().toString())) {
         // Everything should have been done at Router level...
      } else if ("end".equals(invocation.getName().toString())) {
         // We ended here a composite and should now "go up".
         Endpoint lastEndpoint = endpoints.get(endpoints.size() - 1);
         if (lastEndpoint.eContainer() instanceof CompositeProcessor) {
            endpoints = route.getOwnedEndpoints();
         }
      } else if ("to".equals(invocation.getName().toString())) {
         // We may have a lot of stuffs here ! Check uri in order to guess...
         String uri = invocation.arguments().get(0).toString();
         if (uri.startsWith("\"xslt:")) {
            endpoint = EipFactory.eINSTANCE.createTransformer();
         } else if (uri.startsWith("\"switchyard:")) {
            endpoint = EipFactory.eINSTANCE.createServiceActivator();
         }
      }
      
      if (endpoint != null) {
         // Complete Endpoint with common attributes if any and store it.
         int invocationLine = routeCU.getLineNumber(invocation.getStartPosition() + invocation.getLength());
         String comment = commentMap.get(invocationLine);
         
         String endpointName = invocation.getName().toString() + "_" + endpoints.size();
         String outgoingChannelName = null;
         
         // Comment may have "<endpoint_name>|<outgoing_channel_name>" format.
         if (comment != null && comment.contains("|")) {
            endpointName = comment.substring(0, comment.indexOf('|'));
            outgoingChannelName = comment.substring(comment.indexOf('|') + 1);
         }
         endpoint.setName(endpointName);
         endpoints.add(endpoint);
         
         // Associate with incoming channel if any.
         if (incomingChannel != null) {
            incomingChannel.setToEndpoint(endpoint);
         }
         
         // We have created an endpoint so we need an outgoingChannel that
         // will become incoming one for next endpoint to create !
         incomingChannel = EipFactory.eINSTANCE.createChannel();
         if (outgoingChannelName != null) {
            incomingChannel.setName(outgoingChannelName);
         }
         incomingChannel.setFromEndpoint(endpoint);
         route.getOwnedChannels().add(incomingChannel);
      }
      
      if (!expressionStack.isEmpty()) {
         parseAndFillEndpoint(expressionStack.pollLast(), incomingChannel, endpoints);
      }
   }
   
   /** Parse the Apache Camel route file and return content as String. */
   private String parseRouteClass() throws Exception {
      return new String(Files.readAllBytes(Paths.get(routeFile.toURI())));
   }
   
   /** Extract comment content from source. */
   private String getCommentContent(Comment comment) {
      int start = comment.getStartPosition();
      int end = start + comment.getLength();
      String content = routeSource.substring(start, end);
      if (content.startsWith("//")) {
         content = content.substring(2).trim();
      }
      return content;
   }
}
