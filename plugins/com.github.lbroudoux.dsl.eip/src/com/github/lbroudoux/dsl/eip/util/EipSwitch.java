/**
 */
package com.github.lbroudoux.dsl.eip.util;

import com.github.lbroudoux.dsl.eip.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.github.lbroudoux.dsl.eip.EipPackage
 * @generated
 */
public class EipSwitch<T> extends Switch<T> {
	/**
    * The cached model package
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	protected static EipPackage modelPackage;

	/**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EipSwitch() {
      if (modelPackage == null) {
         modelPackage = EipPackage.eINSTANCE;
      }
   }

	/**
    * Checks whether this is a switch for the given package.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @parameter ePackage the package in question.
    * @return whether this is a switch for the given package.
    * @generated
    */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
      return ePackage == modelPackage;
   }

	/**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
      switch (classifierID) {
         case EipPackage.ENDPOINT: {
            Endpoint endpoint = (Endpoint)theEObject;
            T result = caseEndpoint(endpoint);
            if (result == null) result = caseMetadatable(endpoint);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EipPackage.CHANNEL: {
            Channel channel = (Channel)theEObject;
            T result = caseChannel(channel);
            if (result == null) result = caseMetadatable(channel);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EipPackage.ADAPTER: {
            Adapter adapter = (Adapter)theEObject;
            T result = caseAdapter(adapter);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EipPackage.ROUTER: {
            Router router = (Router)theEObject;
            T result = caseRouter(router);
            if (result == null) result = caseEndpoint(router);
            if (result == null) result = caseMetadatable(router);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EipPackage.FILTER: {
            Filter filter = (Filter)theEObject;
            T result = caseFilter(filter);
            if (result == null) result = caseEndpoint(filter);
            if (result == null) result = caseMetadatable(filter);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EipPackage.TRANSFORMER: {
            Transformer transformer = (Transformer)theEObject;
            T result = caseTransformer(transformer);
            if (result == null) result = caseEndpoint(transformer);
            if (result == null) result = caseMetadatable(transformer);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EipPackage.GATEWAY: {
            Gateway gateway = (Gateway)theEObject;
            T result = caseGateway(gateway);
            if (result == null) result = caseEndpoint(gateway);
            if (result == null) result = caseMetadatable(gateway);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EipPackage.CONDITIONAL_ROUTE: {
            ConditionalRoute conditionalRoute = (ConditionalRoute)theEObject;
            T result = caseConditionalRoute(conditionalRoute);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EipPackage.SPLITTER: {
            Splitter splitter = (Splitter)theEObject;
            T result = caseSplitter(splitter);
            if (result == null) result = caseEndpoint(splitter);
            if (result == null) result = caseMetadatable(splitter);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EipPackage.AGGREGATOR: {
            Aggregator aggregator = (Aggregator)theEObject;
            T result = caseAggregator(aggregator);
            if (result == null) result = caseEndpoint(aggregator);
            if (result == null) result = caseMetadatable(aggregator);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EipPackage.ROUTE: {
            Route route = (Route)theEObject;
            T result = caseRoute(route);
            if (result == null) result = caseMetadatable(route);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EipPackage.SERVICE_ACTIVATOR: {
            ServiceActivator serviceActivator = (ServiceActivator)theEObject;
            T result = caseServiceActivator(serviceActivator);
            if (result == null) result = caseInvocableEndpoint(serviceActivator);
            if (result == null) result = caseEndpoint(serviceActivator);
            if (result == null) result = caseMetadatable(serviceActivator);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EipPackage.EIP_MODEL: {
            EIPModel eipModel = (EIPModel)theEObject;
            T result = caseEIPModel(eipModel);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EipPackage.ENRICHER: {
            Enricher enricher = (Enricher)theEObject;
            T result = caseEnricher(enricher);
            if (result == null) result = caseInvocableEndpoint(enricher);
            if (result == null) result = caseEndpoint(enricher);
            if (result == null) result = caseMetadatable(enricher);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EipPackage.COMPOSITE_PROCESSOR: {
            CompositeProcessor compositeProcessor = (CompositeProcessor)theEObject;
            T result = caseCompositeProcessor(compositeProcessor);
            if (result == null) result = caseEndpoint(compositeProcessor);
            if (result == null) result = caseMetadatable(compositeProcessor);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EipPackage.RECIPIENT_LIST_ROUTER: {
            RecipientListRouter recipientListRouter = (RecipientListRouter)theEObject;
            T result = caseRecipientListRouter(recipientListRouter);
            if (result == null) result = caseRouter(recipientListRouter);
            if (result == null) result = caseEndpoint(recipientListRouter);
            if (result == null) result = caseMetadatable(recipientListRouter);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EipPackage.SERVICE_REF: {
            ServiceRef serviceRef = (ServiceRef)theEObject;
            T result = caseServiceRef(serviceRef);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EipPackage.SERVICE_INVOCATION: {
            ServiceInvocation serviceInvocation = (ServiceInvocation)theEObject;
            T result = caseServiceInvocation(serviceInvocation);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EipPackage.INVOCABLE_ENDPOINT: {
            InvocableEndpoint invocableEndpoint = (InvocableEndpoint)theEObject;
            T result = caseInvocableEndpoint(invocableEndpoint);
            if (result == null) result = caseEndpoint(invocableEndpoint);
            if (result == null) result = caseMetadatable(invocableEndpoint);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EipPackage.CONTENT_FILTER: {
            ContentFilter contentFilter = (ContentFilter)theEObject;
            T result = caseContentFilter(contentFilter);
            if (result == null) result = caseFilter(contentFilter);
            if (result == null) result = caseEndpoint(contentFilter);
            if (result == null) result = caseMetadatable(contentFilter);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EipPackage.RESEQUENCER: {
            Resequencer resequencer = (Resequencer)theEObject;
            T result = caseResequencer(resequencer);
            if (result == null) result = caseAggregator(resequencer);
            if (result == null) result = caseEndpoint(resequencer);
            if (result == null) result = caseMetadatable(resequencer);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EipPackage.METADATA: {
            Metadata metadata = (Metadata)theEObject;
            T result = caseMetadata(metadata);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EipPackage.METADATABLE: {
            Metadatable metadatable = (Metadatable)theEObject;
            T result = caseMetadatable(metadatable);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         default: return defaultCase(theEObject);
      }
   }

	/**
    * Returns the result of interpreting the object as an instance of '<em>Endpoint</em>'.
    * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Endpoint</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
	public T caseEndpoint(Endpoint object) {
      return null;
   }

	/**
    * Returns the result of interpreting the object as an instance of '<em>Channel</em>'.
    * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Channel</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
	public T caseChannel(Channel object) {
      return null;
   }

	/**
    * Returns the result of interpreting the object as an instance of '<em>Adapter</em>'.
    * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Adapter</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
	public T caseAdapter(Adapter object) {
      return null;
   }

	/**
    * Returns the result of interpreting the object as an instance of '<em>Router</em>'.
    * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Router</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
	public T caseRouter(Router object) {
      return null;
   }

	/**
    * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
    * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
	public T caseFilter(Filter object) {
      return null;
   }

	/**
    * Returns the result of interpreting the object as an instance of '<em>Transformer</em>'.
    * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Transformer</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
	public T caseTransformer(Transformer object) {
      return null;
   }

	/**
    * Returns the result of interpreting the object as an instance of '<em>Gateway</em>'.
    * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Gateway</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
	public T caseGateway(Gateway object) {
      return null;
   }

	/**
    * Returns the result of interpreting the object as an instance of '<em>Conditional Route</em>'.
    * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Conditional Route</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
	public T caseConditionalRoute(ConditionalRoute object) {
      return null;
   }

	/**
    * Returns the result of interpreting the object as an instance of '<em>Splitter</em>'.
    * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Splitter</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
	public T caseSplitter(Splitter object) {
      return null;
   }

	/**
    * Returns the result of interpreting the object as an instance of '<em>Aggregator</em>'.
    * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Aggregator</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
	public T caseAggregator(Aggregator object) {
      return null;
   }

	/**
    * Returns the result of interpreting the object as an instance of '<em>Route</em>'.
    * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Route</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
	public T caseRoute(Route object) {
      return null;
   }

	/**
    * Returns the result of interpreting the object as an instance of '<em>Service Activator</em>'.
    * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Service Activator</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
	public T caseServiceActivator(ServiceActivator object) {
      return null;
   }

	/**
    * Returns the result of interpreting the object as an instance of '<em>EIP Model</em>'.
    * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EIP Model</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
	public T caseEIPModel(EIPModel object) {
      return null;
   }

	/**
    * Returns the result of interpreting the object as an instance of '<em>Enricher</em>'.
    * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Enricher</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
	public T caseEnricher(Enricher object) {
      return null;
   }

	/**
    * Returns the result of interpreting the object as an instance of '<em>Composite Processor</em>'.
    * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Composite Processor</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
	public T caseCompositeProcessor(CompositeProcessor object) {
      return null;
   }

	/**
    * Returns the result of interpreting the object as an instance of '<em>Recipient List Router</em>'.
    * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Recipient List Router</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
	public T caseRecipientListRouter(RecipientListRouter object) {
      return null;
   }

	/**
    * Returns the result of interpreting the object as an instance of '<em>Service Ref</em>'.
    * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Service Ref</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
	public T caseServiceRef(ServiceRef object) {
      return null;
   }

	/**
    * Returns the result of interpreting the object as an instance of '<em>Service Invocation</em>'.
    * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Service Invocation</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
	public T caseServiceInvocation(ServiceInvocation object) {
      return null;
   }

	/**
    * Returns the result of interpreting the object as an instance of '<em>Invocable Endpoint</em>'.
    * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Invocable Endpoint</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
	public T caseInvocableEndpoint(InvocableEndpoint object) {
      return null;
   }

	/**
    * Returns the result of interpreting the object as an instance of '<em>Content Filter</em>'.
    * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Content Filter</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
	public T caseContentFilter(ContentFilter object) {
      return null;
   }

	/**
    * Returns the result of interpreting the object as an instance of '<em>Resequencer</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Resequencer</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseResequencer(Resequencer object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Metadata</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Metadata</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseMetadata(Metadata object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Metadatable</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Metadatable</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseMetadatable(Metadatable object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
	@Override
	public T defaultCase(EObject object) {
      return null;
   }

} //EipSwitch
