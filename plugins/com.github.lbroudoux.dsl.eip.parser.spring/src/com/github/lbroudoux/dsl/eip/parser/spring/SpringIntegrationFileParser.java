package com.github.lbroudoux.dsl.eip.parser.spring;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.github.lbroudoux.dsl.eip.Channel;
import com.github.lbroudoux.dsl.eip.EIPModel;
import com.github.lbroudoux.dsl.eip.EipFactory;
import com.github.lbroudoux.dsl.eip.Endpoint;
import com.github.lbroudoux.dsl.eip.Route;
/**
 * Parser for Spring integration context file. Just build a new instance and call
 * <code>parseAndFillModel()</code> with already initialized model and it should go !
 * @author laurent
 */
public class SpringIntegrationFileParser {

   private static final String SPRING_BEANS_NS = "http://www.springframework.org/schema/beans";
   private static final String SPRING_INT_NS = "http://www.springframework.org/schema/integration";
   
   private final File routeFile;
   
   private Map<String, Channel> channelsMap = new HashMap<String, Channel>();
   private Map<String, Endpoint> endpointsMap = new HashMap<String, Endpoint>();

   public SpringIntegrationFileParser(File routeFile) {
      this.routeFile = routeFile;
   }
   
   /**
    * Parse the routeFile given while building the instance and fill the model.
    * @param model The EIP Model to fill with parsed elements from routeFile.
    * @throws InvalidArgumentException if given file is not a valid Spring integration file
    */
   public void parseAndFillModel(EIPModel model) throws Exception {
      // Parse and get root element.
      Document document = parseRouteFile();
      Element root = document.getDocumentElement();
      
      // Check that it's really a Spring context file.
      if (!"beans".equals(root.getLocalName()) ||
            !SPRING_BEANS_NS.equals(root.getNamespaceURI())) {
         throw new IllegalArgumentException("Given routeFile seems not to be a valid Spring context file");
      }
      
      // Pre-requisite : we should have a Route object added to model.
      // TODO: Find a way to store and retrieve Route name for branch comparison.
      Route route = EipFactory.eINSTANCE.createRoute();
      model.getOwnedRoutes().add(route);    
      
      // First, extract and add channels to model.
      NodeList channels = root.getElementsByTagNameNS(SPRING_INT_NS, "channel");
      for (int i=0; i<channels.getLength(); i++) {
         Node channelNode = channels.item(i);
         route.getOwnedChannels().add(createChannel(channelNode));
      }
      
      // Then, extract and add endpoints to model.
      NodeList children = root.getChildNodes();
      for (int i=0; i<children.getLength(); i++) {
         Node childNode = children.item(i);
         if (childNode.getNodeType() == Node.ELEMENT_NODE 
               && !"channel".equals(childNode.getLocalName())){
            route.getOwnedEndpoints().add(createEndpoint(childNode));
         }
      }
   }
   
   /** Create Channel model element from node and its attributes. */
   private Channel createChannel(Node channelNode) {
      Element channelElement = (Element) channelNode;
      Channel channel = EipFactory.eINSTANCE.createChannel();
      channel.setName(channelElement.getAttribute("id"));
      channelsMap.put(channel.getName(), channel);
      return channel;
   }
   
   /** Create Endpoint model element from node, its attributes and perhaps children. */
   private Endpoint createEndpoint(Node endpointNode) {
      Element endpointElement = (Element) endpointNode;
      Endpoint endpoint = null;
      // Determine the correct implementation of Endpoint.
      if ("filter".equals(endpointElement.getLocalName())) {
         endpoint = EipFactory.eINSTANCE.createFilter();
      } else if ("transformer".equals(endpointElement.getLocalName())) {
         endpoint = EipFactory.eINSTANCE.createTransformer();
      }
      // Complete Endpoint with common attributes if any.
      if (endpoint != null) {
         endpoint.setName(endpointElement.getAttribute("id"));
         String inputChannelName = endpointElement.getAttribute("input-channel");
         if (inputChannelName != null) {
            endpoint.getFromChannels().add(channelsMap.get(inputChannelName));
         }
         String outputChannelName = endpointElement.getAttribute("output-channel");
         if (outputChannelName != null) {
            endpoint.setToChannel(channelsMap.get(outputChannelName));
         }
         endpointsMap.put(endpoint.getName(), endpoint);
      }
      return endpoint;
   }
   
   /** Parse the Spring integration route file and return DOM Document. */
   private Document parseRouteFile() throws Exception {
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      factory.setNamespaceAware(true);
      DocumentBuilder builder = factory.newDocumentBuilder();
      return builder.parse(routeFile);
   }
   
   /** Get a mandatory unique child from an element using its tag name. */
   private static Node getUniqueChild(Element element, String tagName){
      NodeList list = element.getElementsByTagName(tagName);
      assert list.getLength() == 1;
      return list.item(0);
   }
   /** Get an optional unique child from an element using its tag name. */
   private static Node getOptionalChild(Element element, String tagName){
      NodeList list = element.getElementsByTagName(tagName);
      if (list.getLength() > 0){
         assert list.getLength() == 1;
         return list.item(0);
      }
      return null;
   }
}
