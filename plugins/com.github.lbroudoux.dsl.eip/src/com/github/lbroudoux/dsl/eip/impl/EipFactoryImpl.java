/**
 */
package com.github.lbroudoux.dsl.eip.impl;

import com.github.lbroudoux.dsl.eip.*;

import org.eclipse.emf.ecore.EClass;
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
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
