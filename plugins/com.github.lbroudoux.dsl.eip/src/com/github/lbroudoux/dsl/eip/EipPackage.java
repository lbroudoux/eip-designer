/**
 */
package com.github.lbroudoux.dsl.eip;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.github.lbroudoux.dsl.eip.EipFactory
 * @model kind="package"
 * @generated
 */
public interface EipPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eip";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.github.com/lbroudoux/dsl/eip/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eip";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EipPackage eINSTANCE = com.github.lbroudoux.dsl.eip.impl.EipPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.github.lbroudoux.dsl.eip.Endpoint <em>Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.lbroudoux.dsl.eip.Endpoint
	 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getEndpoint()
	 * @generated
	 */
	int ENDPOINT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>To Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__TO_CHANNEL = 1;

	/**
	 * The feature id for the '<em><b>From Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__FROM_CHANNEL = 2;

	/**
	 * The number of structural features of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link com.github.lbroudoux.dsl.eip.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.lbroudoux.dsl.eip.impl.ChannelImpl
	 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 1;

	/**
	 * The feature id for the '<em><b>To Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__TO_ENDPOINT = 0;

	/**
	 * The feature id for the '<em><b>From Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__FROM_ENDPOINT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__NAME = 2;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.github.lbroudoux.dsl.eip.impl.AdapterImpl <em>Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.lbroudoux.dsl.eip.impl.AdapterImpl
	 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getAdapter()
	 * @generated
	 */
	int ADAPTER = 2;

	/**
	 * The number of structural features of the '<em>Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.github.lbroudoux.dsl.eip.impl.RouterImpl <em>Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.lbroudoux.dsl.eip.impl.RouterImpl
	 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getRouter()
	 * @generated
	 */
	int ROUTER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__NAME = ENDPOINT__NAME;

	/**
	 * The feature id for the '<em><b>To Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__TO_CHANNEL = ENDPOINT__TO_CHANNEL;

	/**
	 * The feature id for the '<em><b>From Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__FROM_CHANNEL = ENDPOINT__FROM_CHANNEL;

	/**
	 * The feature id for the '<em><b>Owned Routes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__OWNED_ROUTES = ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_FEATURE_COUNT = ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_OPERATION_COUNT = ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.lbroudoux.dsl.eip.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.lbroudoux.dsl.eip.impl.FilterImpl
	 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__NAME = ENDPOINT__NAME;

	/**
	 * The feature id for the '<em><b>To Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__TO_CHANNEL = ENDPOINT__TO_CHANNEL;

	/**
	 * The feature id for the '<em><b>From Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__FROM_CHANNEL = ENDPOINT__FROM_CHANNEL;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_COUNT = ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.lbroudoux.dsl.eip.impl.TransformerImpl <em>Transformer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.lbroudoux.dsl.eip.impl.TransformerImpl
	 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getTransformer()
	 * @generated
	 */
	int TRANSFORMER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER__NAME = ENDPOINT__NAME;

	/**
	 * The feature id for the '<em><b>To Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER__TO_CHANNEL = ENDPOINT__TO_CHANNEL;

	/**
	 * The feature id for the '<em><b>From Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER__FROM_CHANNEL = ENDPOINT__FROM_CHANNEL;

	/**
	 * The number of structural features of the '<em>Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_FEATURE_COUNT = ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OPERATION_COUNT = ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.lbroudoux.dsl.eip.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.lbroudoux.dsl.eip.impl.GatewayImpl
	 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getGateway()
	 * @generated
	 */
	int GATEWAY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NAME = ENDPOINT__NAME;

	/**
	 * The feature id for the '<em><b>To Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__TO_CHANNEL = ENDPOINT__TO_CHANNEL;

	/**
	 * The feature id for the '<em><b>From Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__FROM_CHANNEL = ENDPOINT__FROM_CHANNEL;

	/**
	 * The number of structural features of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_FEATURE_COUNT = ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_OPERATION_COUNT = ENDPOINT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.github.lbroudoux.dsl.eip.impl.ConditionalRouteImpl <em>Conditional Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.lbroudoux.dsl.eip.impl.ConditionalRouteImpl
	 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getConditionalRoute()
	 * @generated
	 */
	int CONDITIONAL_ROUTE = 7;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ROUTE__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ROUTE__CHANNEL = 1;

	/**
	 * The number of structural features of the '<em>Conditional Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ROUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Conditional Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ROUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.github.lbroudoux.dsl.eip.impl.SplitterImpl <em>Splitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.lbroudoux.dsl.eip.impl.SplitterImpl
	 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getSplitter()
	 * @generated
	 */
	int SPLITTER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER__NAME = ENDPOINT__NAME;

	/**
	 * The feature id for the '<em><b>To Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER__TO_CHANNEL = ENDPOINT__TO_CHANNEL;

	/**
	 * The feature id for the '<em><b>From Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER__FROM_CHANNEL = ENDPOINT__FROM_CHANNEL;

	/**
	 * The number of structural features of the '<em>Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER_FEATURE_COUNT = ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER_OPERATION_COUNT = ENDPOINT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.github.lbroudoux.dsl.eip.impl.AggregatorImpl <em>Aggregator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.lbroudoux.dsl.eip.impl.AggregatorImpl
	 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getAggregator()
	 * @generated
	 */
	int AGGREGATOR = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATOR__NAME = ENDPOINT__NAME;

	/**
	 * The feature id for the '<em><b>To Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATOR__TO_CHANNEL = ENDPOINT__TO_CHANNEL;

	/**
	 * The feature id for the '<em><b>From Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATOR__FROM_CHANNEL = ENDPOINT__FROM_CHANNEL;

	/**
	 * The number of structural features of the '<em>Aggregator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATOR_FEATURE_COUNT = ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Aggregator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATOR_OPERATION_COUNT = ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.lbroudoux.dsl.eip.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.lbroudoux.dsl.eip.impl.RouteImpl
	 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 10;

	/**
	 * The feature id for the '<em><b>Owned Endpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__OWNED_ENDPOINTS = 0;

	/**
	 * The feature id for the '<em><b>Owned Channels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__OWNED_CHANNELS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.github.lbroudoux.dsl.eip.impl.ServiceActivatorImpl <em>Service Activator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.lbroudoux.dsl.eip.impl.ServiceActivatorImpl
	 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getServiceActivator()
	 * @generated
	 */
	int SERVICE_ACTIVATOR = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACTIVATOR__NAME = ENDPOINT__NAME;

	/**
	 * The feature id for the '<em><b>To Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACTIVATOR__TO_CHANNEL = ENDPOINT__TO_CHANNEL;

	/**
	 * The feature id for the '<em><b>From Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACTIVATOR__FROM_CHANNEL = ENDPOINT__FROM_CHANNEL;

	/**
	 * The number of structural features of the '<em>Service Activator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACTIVATOR_FEATURE_COUNT = ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Activator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACTIVATOR_OPERATION_COUNT = ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.lbroudoux.dsl.eip.impl.EIPModelImpl <em>EIP Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.lbroudoux.dsl.eip.impl.EIPModelImpl
	 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getEIPModel()
	 * @generated
	 */
	int EIP_MODEL = 12;

	/**
	 * The feature id for the '<em><b>Owned Routes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIP_MODEL__OWNED_ROUTES = 0;

	/**
	 * The number of structural features of the '<em>EIP Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIP_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EIP Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIP_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.github.lbroudoux.dsl.eip.Endpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint</em>'.
	 * @see com.github.lbroudoux.dsl.eip.Endpoint
	 * @generated
	 */
	EClass getEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link com.github.lbroudoux.dsl.eip.Endpoint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.lbroudoux.dsl.eip.Endpoint#getName()
	 * @see #getEndpoint()
	 * @generated
	 */
	EAttribute getEndpoint_Name();

	/**
	 * Returns the meta object for the reference '{@link com.github.lbroudoux.dsl.eip.Endpoint#getToChannel <em>To Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Channel</em>'.
	 * @see com.github.lbroudoux.dsl.eip.Endpoint#getToChannel()
	 * @see #getEndpoint()
	 * @generated
	 */
	EReference getEndpoint_ToChannel();

	/**
	 * Returns the meta object for the reference '{@link com.github.lbroudoux.dsl.eip.Endpoint#getFromChannel <em>From Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Channel</em>'.
	 * @see com.github.lbroudoux.dsl.eip.Endpoint#getFromChannel()
	 * @see #getEndpoint()
	 * @generated
	 */
	EReference getEndpoint_FromChannel();

	/**
	 * Returns the meta object for class '{@link com.github.lbroudoux.dsl.eip.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see com.github.lbroudoux.dsl.eip.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for the reference '{@link com.github.lbroudoux.dsl.eip.Channel#getToEndpoint <em>To Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Endpoint</em>'.
	 * @see com.github.lbroudoux.dsl.eip.Channel#getToEndpoint()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_ToEndpoint();

	/**
	 * Returns the meta object for the reference '{@link com.github.lbroudoux.dsl.eip.Channel#getFromEndpoint <em>From Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Endpoint</em>'.
	 * @see com.github.lbroudoux.dsl.eip.Channel#getFromEndpoint()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_FromEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link com.github.lbroudoux.dsl.eip.Channel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.lbroudoux.dsl.eip.Channel#getName()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_Name();

	/**
	 * Returns the meta object for class '{@link com.github.lbroudoux.dsl.eip.Adapter <em>Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adapter</em>'.
	 * @see com.github.lbroudoux.dsl.eip.Adapter
	 * @generated
	 */
	EClass getAdapter();

	/**
	 * Returns the meta object for class '{@link com.github.lbroudoux.dsl.eip.Router <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router</em>'.
	 * @see com.github.lbroudoux.dsl.eip.Router
	 * @generated
	 */
	EClass getRouter();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.lbroudoux.dsl.eip.Router#getOwnedRoutes <em>Owned Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Routes</em>'.
	 * @see com.github.lbroudoux.dsl.eip.Router#getOwnedRoutes()
	 * @see #getRouter()
	 * @generated
	 */
	EReference getRouter_OwnedRoutes();

	/**
	 * Returns the meta object for class '{@link com.github.lbroudoux.dsl.eip.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see com.github.lbroudoux.dsl.eip.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for class '{@link com.github.lbroudoux.dsl.eip.Transformer <em>Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer</em>'.
	 * @see com.github.lbroudoux.dsl.eip.Transformer
	 * @generated
	 */
	EClass getTransformer();

	/**
	 * Returns the meta object for class '{@link com.github.lbroudoux.dsl.eip.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway</em>'.
	 * @see com.github.lbroudoux.dsl.eip.Gateway
	 * @generated
	 */
	EClass getGateway();

	/**
	 * Returns the meta object for class '{@link com.github.lbroudoux.dsl.eip.ConditionalRoute <em>Conditional Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Route</em>'.
	 * @see com.github.lbroudoux.dsl.eip.ConditionalRoute
	 * @generated
	 */
	EClass getConditionalRoute();

	/**
	 * Returns the meta object for the attribute '{@link com.github.lbroudoux.dsl.eip.ConditionalRoute#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see com.github.lbroudoux.dsl.eip.ConditionalRoute#getCondition()
	 * @see #getConditionalRoute()
	 * @generated
	 */
	EAttribute getConditionalRoute_Condition();

	/**
	 * Returns the meta object for the reference '{@link com.github.lbroudoux.dsl.eip.ConditionalRoute#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Channel</em>'.
	 * @see com.github.lbroudoux.dsl.eip.ConditionalRoute#getChannel()
	 * @see #getConditionalRoute()
	 * @generated
	 */
	EReference getConditionalRoute_Channel();

	/**
	 * Returns the meta object for class '{@link com.github.lbroudoux.dsl.eip.Splitter <em>Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Splitter</em>'.
	 * @see com.github.lbroudoux.dsl.eip.Splitter
	 * @generated
	 */
	EClass getSplitter();

	/**
	 * Returns the meta object for class '{@link com.github.lbroudoux.dsl.eip.Aggregator <em>Aggregator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregator</em>'.
	 * @see com.github.lbroudoux.dsl.eip.Aggregator
	 * @generated
	 */
	EClass getAggregator();

	/**
	 * Returns the meta object for class '{@link com.github.lbroudoux.dsl.eip.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see com.github.lbroudoux.dsl.eip.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.lbroudoux.dsl.eip.Route#getOwnedEndpoints <em>Owned Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Endpoints</em>'.
	 * @see com.github.lbroudoux.dsl.eip.Route#getOwnedEndpoints()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_OwnedEndpoints();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.lbroudoux.dsl.eip.Route#getOwnedChannels <em>Owned Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Channels</em>'.
	 * @see com.github.lbroudoux.dsl.eip.Route#getOwnedChannels()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_OwnedChannels();

	/**
	 * Returns the meta object for the attribute '{@link com.github.lbroudoux.dsl.eip.Route#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.lbroudoux.dsl.eip.Route#getName()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Name();

	/**
	 * Returns the meta object for class '{@link com.github.lbroudoux.dsl.eip.ServiceActivator <em>Service Activator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Activator</em>'.
	 * @see com.github.lbroudoux.dsl.eip.ServiceActivator
	 * @generated
	 */
	EClass getServiceActivator();

	/**
	 * Returns the meta object for class '{@link com.github.lbroudoux.dsl.eip.EIPModel <em>EIP Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EIP Model</em>'.
	 * @see com.github.lbroudoux.dsl.eip.EIPModel
	 * @generated
	 */
	EClass getEIPModel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.lbroudoux.dsl.eip.EIPModel#getOwnedRoutes <em>Owned Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Routes</em>'.
	 * @see com.github.lbroudoux.dsl.eip.EIPModel#getOwnedRoutes()
	 * @see #getEIPModel()
	 * @generated
	 */
	EReference getEIPModel_OwnedRoutes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EipFactory getEipFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.github.lbroudoux.dsl.eip.Endpoint <em>Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.lbroudoux.dsl.eip.Endpoint
		 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getEndpoint()
		 * @generated
		 */
		EClass ENDPOINT = eINSTANCE.getEndpoint();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT__NAME = eINSTANCE.getEndpoint_Name();
		/**
		 * The meta object literal for the '<em><b>To Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT__TO_CHANNEL = eINSTANCE.getEndpoint_ToChannel();
		/**
		 * The meta object literal for the '<em><b>From Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT__FROM_CHANNEL = eINSTANCE.getEndpoint_FromChannel();
		/**
		 * The meta object literal for the '{@link com.github.lbroudoux.dsl.eip.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.lbroudoux.dsl.eip.impl.ChannelImpl
		 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();
		/**
		 * The meta object literal for the '<em><b>To Endpoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__TO_ENDPOINT = eINSTANCE.getChannel_ToEndpoint();
		/**
		 * The meta object literal for the '<em><b>From Endpoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__FROM_ENDPOINT = eINSTANCE.getChannel_FromEndpoint();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__NAME = eINSTANCE.getChannel_Name();
		/**
		 * The meta object literal for the '{@link com.github.lbroudoux.dsl.eip.impl.AdapterImpl <em>Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.lbroudoux.dsl.eip.impl.AdapterImpl
		 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getAdapter()
		 * @generated
		 */
		EClass ADAPTER = eINSTANCE.getAdapter();
		/**
		 * The meta object literal for the '{@link com.github.lbroudoux.dsl.eip.impl.RouterImpl <em>Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.lbroudoux.dsl.eip.impl.RouterImpl
		 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getRouter()
		 * @generated
		 */
		EClass ROUTER = eINSTANCE.getRouter();
		/**
		 * The meta object literal for the '<em><b>Owned Routes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTER__OWNED_ROUTES = eINSTANCE.getRouter_OwnedRoutes();
		/**
		 * The meta object literal for the '{@link com.github.lbroudoux.dsl.eip.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.lbroudoux.dsl.eip.impl.FilterImpl
		 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();
		/**
		 * The meta object literal for the '{@link com.github.lbroudoux.dsl.eip.impl.TransformerImpl <em>Transformer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.lbroudoux.dsl.eip.impl.TransformerImpl
		 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getTransformer()
		 * @generated
		 */
		EClass TRANSFORMER = eINSTANCE.getTransformer();
		/**
		 * The meta object literal for the '{@link com.github.lbroudoux.dsl.eip.impl.GatewayImpl <em>Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.lbroudoux.dsl.eip.impl.GatewayImpl
		 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getGateway()
		 * @generated
		 */
		EClass GATEWAY = eINSTANCE.getGateway();
		/**
		 * The meta object literal for the '{@link com.github.lbroudoux.dsl.eip.impl.ConditionalRouteImpl <em>Conditional Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.lbroudoux.dsl.eip.impl.ConditionalRouteImpl
		 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getConditionalRoute()
		 * @generated
		 */
		EClass CONDITIONAL_ROUTE = eINSTANCE.getConditionalRoute();
		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_ROUTE__CONDITION = eINSTANCE.getConditionalRoute_Condition();
		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_ROUTE__CHANNEL = eINSTANCE.getConditionalRoute_Channel();
		/**
		 * The meta object literal for the '{@link com.github.lbroudoux.dsl.eip.impl.SplitterImpl <em>Splitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.lbroudoux.dsl.eip.impl.SplitterImpl
		 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getSplitter()
		 * @generated
		 */
		EClass SPLITTER = eINSTANCE.getSplitter();
		/**
		 * The meta object literal for the '{@link com.github.lbroudoux.dsl.eip.impl.AggregatorImpl <em>Aggregator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.lbroudoux.dsl.eip.impl.AggregatorImpl
		 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getAggregator()
		 * @generated
		 */
		EClass AGGREGATOR = eINSTANCE.getAggregator();
		/**
		 * The meta object literal for the '{@link com.github.lbroudoux.dsl.eip.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.lbroudoux.dsl.eip.impl.RouteImpl
		 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();
		/**
		 * The meta object literal for the '<em><b>Owned Endpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__OWNED_ENDPOINTS = eINSTANCE.getRoute_OwnedEndpoints();
		/**
		 * The meta object literal for the '<em><b>Owned Channels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__OWNED_CHANNELS = eINSTANCE.getRoute_OwnedChannels();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__NAME = eINSTANCE.getRoute_Name();
		/**
		 * The meta object literal for the '{@link com.github.lbroudoux.dsl.eip.impl.ServiceActivatorImpl <em>Service Activator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.lbroudoux.dsl.eip.impl.ServiceActivatorImpl
		 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getServiceActivator()
		 * @generated
		 */
		EClass SERVICE_ACTIVATOR = eINSTANCE.getServiceActivator();
		/**
		 * The meta object literal for the '{@link com.github.lbroudoux.dsl.eip.impl.EIPModelImpl <em>EIP Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.lbroudoux.dsl.eip.impl.EIPModelImpl
		 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getEIPModel()
		 * @generated
		 */
		EClass EIP_MODEL = eINSTANCE.getEIPModel();
		/**
		 * The meta object literal for the '<em><b>Owned Routes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EIP_MODEL__OWNED_ROUTES = eINSTANCE.getEIPModel_OwnedRoutes();

	}

} //EipPackage
