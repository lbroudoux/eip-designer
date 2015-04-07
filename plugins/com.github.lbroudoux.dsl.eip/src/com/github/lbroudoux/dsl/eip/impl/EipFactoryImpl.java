/**
 */
package com.github.lbroudoux.dsl.eip.impl;

import com.github.lbroudoux.dsl.eip.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EipFactoryImpl extends EFactoryImpl implements EipFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EipFactory init() {
		try {
			EipFactory theEipFactory = (EipFactory)EPackage.Registry.INSTANCE.getEFactory(EipPackage.eNS_URI);
			if (theEipFactory != null) {
				return theEipFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EipFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EipFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EipPackage.CHANNEL: return createChannel();
			case EipPackage.ADAPTER: return createAdapter();
			case EipPackage.ROUTER: return createRouter();
			case EipPackage.FILTER: return createFilter();
			case EipPackage.TRANSFORMER: return createTransformer();
			case EipPackage.GATEWAY: return createGateway();
			case EipPackage.CONDITIONAL_ROUTE: return createConditionalRoute();
			case EipPackage.SPLITTER: return createSplitter();
			case EipPackage.AGGREGATOR: return createAggregator();
			case EipPackage.ROUTE: return createRoute();
			case EipPackage.SERVICE_ACTIVATOR: return createServiceActivator();
			case EipPackage.EIP_MODEL: return createEIPModel();
			case EipPackage.ENRICHER: return createEnricher();
			case EipPackage.COMPOSITE_PROCESSOR: return createCompositeProcessor();
			case EipPackage.RECIPIENT_LIST_ROUTER: return createRecipientListRouter();
			case EipPackage.SERVICE_REF: return createServiceRef();
			case EipPackage.SERVICE_INVOCATION: return createServiceInvocation();
			case EipPackage.INVOCABLE_ENDPOINT: return createInvocableEndpoint();
			case EipPackage.CONTENT_FILTER: return createContentFilter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EipPackage.MESSAGE_PART:
				return createMessagePartFromString(eDataType, initialValue);
			case EipPackage.ROUTING_TYPE:
				return createRoutingTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EipPackage.MESSAGE_PART:
				return convertMessagePartToString(eDataType, instanceValue);
			case EipPackage.ROUTING_TYPE:
				return convertRoutingTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel createChannel() {
		ChannelImpl channel = new ChannelImpl();
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createAdapter() {
		AdapterImpl adapter = new AdapterImpl();
		return adapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Router createRouter() {
		RouterImpl router = new RouterImpl();
		return router;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filter createFilter() {
		FilterImpl filter = new FilterImpl();
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformer createTransformer() {
		TransformerImpl transformer = new TransformerImpl();
		return transformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gateway createGateway() {
		GatewayImpl gateway = new GatewayImpl();
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalRoute createConditionalRoute() {
		ConditionalRouteImpl conditionalRoute = new ConditionalRouteImpl();
		return conditionalRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Splitter createSplitter() {
		SplitterImpl splitter = new SplitterImpl();
		return splitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aggregator createAggregator() {
		AggregatorImpl aggregator = new AggregatorImpl();
		return aggregator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route createRoute() {
		RouteImpl route = new RouteImpl();
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceActivator createServiceActivator() {
		ServiceActivatorImpl serviceActivator = new ServiceActivatorImpl();
		return serviceActivator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EIPModel createEIPModel() {
		EIPModelImpl eipModel = new EIPModelImpl();
		return eipModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enricher createEnricher() {
		EnricherImpl enricher = new EnricherImpl();
		return enricher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeProcessor createCompositeProcessor() {
		CompositeProcessorImpl compositeProcessor = new CompositeProcessorImpl();
		return compositeProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipientListRouter createRecipientListRouter() {
		RecipientListRouterImpl recipientListRouter = new RecipientListRouterImpl();
		return recipientListRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRef createServiceRef() {
		ServiceRefImpl serviceRef = new ServiceRefImpl();
		return serviceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInvocation createServiceInvocation() {
		ServiceInvocationImpl serviceInvocation = new ServiceInvocationImpl();
		return serviceInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocableEndpoint createInvocableEndpoint() {
		InvocableEndpointImpl invocableEndpoint = new InvocableEndpointImpl();
		return invocableEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFilter createContentFilter() {
		ContentFilterImpl contentFilter = new ContentFilterImpl();
		return contentFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagePart createMessagePartFromString(EDataType eDataType, String initialValue) {
		MessagePart result = MessagePart.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessagePartToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutingType createRoutingTypeFromString(EDataType eDataType, String initialValue) {
		RoutingType result = RoutingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoutingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EipPackage getEipPackage() {
		return (EipPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EipPackage getPackage() {
		return EipPackage.eINSTANCE;
	}

} //EipFactoryImpl
