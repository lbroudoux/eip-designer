/**
 */
package com.github.lbroudoux.dsl.eip.impl;

import com.github.lbroudoux.dsl.eip.Adapter;
import com.github.lbroudoux.dsl.eip.Aggregator;
import com.github.lbroudoux.dsl.eip.Channel;
import com.github.lbroudoux.dsl.eip.CompositeProcessor;
import com.github.lbroudoux.dsl.eip.ConditionalRoute;
import com.github.lbroudoux.dsl.eip.ContentFilter;
import com.github.lbroudoux.dsl.eip.EIPModel;
import com.github.lbroudoux.dsl.eip.EipFactory;
import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.Endpoint;

import com.github.lbroudoux.dsl.eip.Enricher;
import com.github.lbroudoux.dsl.eip.ExchangeType;
import com.github.lbroudoux.dsl.eip.Filter;
import com.github.lbroudoux.dsl.eip.Gateway;
import com.github.lbroudoux.dsl.eip.InvocableEndpoint;
import com.github.lbroudoux.dsl.eip.MessagePart;
import com.github.lbroudoux.dsl.eip.Metadata;
import com.github.lbroudoux.dsl.eip.Metadatable;
import com.github.lbroudoux.dsl.eip.RecipientListRouter;
import com.github.lbroudoux.dsl.eip.Resequencer;
import com.github.lbroudoux.dsl.eip.Route;
import com.github.lbroudoux.dsl.eip.Router;
import com.github.lbroudoux.dsl.eip.RoutingType;
import com.github.lbroudoux.dsl.eip.ServiceActivator;
import com.github.lbroudoux.dsl.eip.ServiceInvocation;
import com.github.lbroudoux.dsl.eip.ServiceRef;
import com.github.lbroudoux.dsl.eip.Splitter;
import com.github.lbroudoux.dsl.eip.Transformer;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EipPackageImpl extends EPackageImpl implements EipPackage {
	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private EClass endpointEClass = null;

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private EClass channelEClass = null;
	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private EClass adapterEClass = null;
	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private EClass routerEClass = null;
	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private EClass filterEClass = null;
	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private EClass transformerEClass = null;
	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private EClass gatewayEClass = null;

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private EClass conditionalRouteEClass = null;

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private EClass splitterEClass = null;

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private EClass aggregatorEClass = null;

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private EClass routeEClass = null;

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private EClass serviceActivatorEClass = null;

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private EClass eipModelEClass = null;

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private EClass enricherEClass = null;

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private EClass compositeProcessorEClass = null;

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private EClass recipientListRouterEClass = null;

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private EClass serviceRefEClass = null;

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private EClass serviceInvocationEClass = null;

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private EClass invocableEndpointEClass = null;

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private EClass contentFilterEClass = null;

	/**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass resequencerEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass metadataEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass metadatableEClass = null;

   /**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private EEnum messagePartEEnum = null;

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private EEnum routingTypeEEnum = null;

	/**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EEnum exchangeTypeEEnum = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with
    * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
    * package URI value.
    * <p>Note: the correct way to create the package is via the static
    * factory method {@link #init init()}, which also performs
    * initialization of the package, or returns the registered package,
    * if one already exists.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see com.github.lbroudoux.dsl.eip.EipPackage#eNS_URI
    * @see #init()
    * @generated
    */
	private EipPackageImpl() {
      super(eNS_URI, EipFactory.eINSTANCE);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private static boolean isInited = false;

	/**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>This method is used to initialize {@link EipPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
	public static EipPackage init() {
      if (isInited) return (EipPackage)EPackage.Registry.INSTANCE.getEPackage(EipPackage.eNS_URI);

      // Obtain or create and register package
      EipPackageImpl theEipPackage = (EipPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EipPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EipPackageImpl());

      isInited = true;

      // Create package meta-data objects
      theEipPackage.createPackageContents();

      // Initialize created meta-data
      theEipPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theEipPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(EipPackage.eNS_URI, theEipPackage);
      return theEipPackage;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EClass getEndpoint() {
      return endpointEClass;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EAttribute getEndpoint_Name() {
      return (EAttribute)endpointEClass.getEStructuralFeatures().get(0);
   }

	/**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEndpoint_ToChannels() {
      return (EReference)endpointEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EReference getEndpoint_FromChannels() {
      return (EReference)endpointEClass.getEStructuralFeatures().get(2);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EClass getChannel() {
      return channelEClass;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EReference getChannel_ToEndpoint() {
      return (EReference)channelEClass.getEStructuralFeatures().get(0);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EReference getChannel_FromEndpoint() {
      return (EReference)channelEClass.getEStructuralFeatures().get(1);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EAttribute getChannel_Name() {
      return (EAttribute)channelEClass.getEStructuralFeatures().get(2);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EAttribute getChannel_Guaranteed() {
      return (EAttribute)channelEClass.getEStructuralFeatures().get(3);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EClass getAdapter() {
      return adapterEClass;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EClass getRouter() {
      return routerEClass;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EReference getRouter_OwnedRoutes() {
      return (EReference)routerEClass.getEStructuralFeatures().get(0);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EAttribute getRouter_Type() {
      return (EAttribute)routerEClass.getEStructuralFeatures().get(1);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EClass getFilter() {
      return filterEClass;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EAttribute getFilter_Expression() {
      return (EAttribute)filterEClass.getEStructuralFeatures().get(0);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EClass getTransformer() {
      return transformerEClass;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EClass getGateway() {
      return gatewayEClass;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EClass getConditionalRoute() {
      return conditionalRouteEClass;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EAttribute getConditionalRoute_Condition() {
      return (EAttribute)conditionalRouteEClass.getEStructuralFeatures().get(0);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EReference getConditionalRoute_Channel() {
      return (EReference)conditionalRouteEClass.getEStructuralFeatures().get(1);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EClass getSplitter() {
      return splitterEClass;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EClass getAggregator() {
      return aggregatorEClass;
   }

	/**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAggregator_Part() {
      return (EAttribute)aggregatorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EAttribute getAggregator_Strategy() {
      return (EAttribute)aggregatorEClass.getEStructuralFeatures().get(1);
   }

	/**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAggregator_Expression() {
      return (EAttribute)aggregatorEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EClass getRoute() {
      return routeEClass;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EReference getRoute_OwnedEndpoints() {
      return (EReference)routeEClass.getEStructuralFeatures().get(0);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EReference getRoute_OwnedChannels() {
      return (EReference)routeEClass.getEStructuralFeatures().get(1);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EAttribute getRoute_Name() {
      return (EAttribute)routeEClass.getEStructuralFeatures().get(2);
   }

	/**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getRoute_ExchangeType() {
      return (EAttribute)routeEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EClass getServiceActivator() {
      return serviceActivatorEClass;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EClass getEIPModel() {
      return eipModelEClass;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EReference getEIPModel_OwnedRoutes() {
      return (EReference)eipModelEClass.getEStructuralFeatures().get(0);
   }

	/**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEIPModel_OwnedServiceRefs() {
      return (EReference)eipModelEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EClass getEnricher() {
      return enricherEClass;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EAttribute getEnricher_Part() {
      return (EAttribute)enricherEClass.getEStructuralFeatures().get(0);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EClass getCompositeProcessor() {
      return compositeProcessorEClass;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EReference getCompositeProcessor_OwnedEndpoints() {
      return (EReference)compositeProcessorEClass.getEStructuralFeatures().get(0);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EClass getRecipientListRouter() {
      return recipientListRouterEClass;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EClass getServiceRef() {
      return serviceRefEClass;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EAttribute getServiceRef_Name() {
      return (EAttribute)serviceRefEClass.getEStructuralFeatures().get(0);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EAttribute getServiceRef_Reference() {
      return (EAttribute)serviceRefEClass.getEStructuralFeatures().get(1);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EAttribute getServiceRef_Operations() {
      return (EAttribute)serviceRefEClass.getEStructuralFeatures().get(2);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EClass getServiceInvocation() {
      return serviceInvocationEClass;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EAttribute getServiceInvocation_Context() {
      return (EAttribute)serviceInvocationEClass.getEStructuralFeatures().get(0);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EAttribute getServiceInvocation_OperationName() {
      return (EAttribute)serviceInvocationEClass.getEStructuralFeatures().get(1);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EReference getServiceInvocation_ServiceRef() {
      return (EReference)serviceInvocationEClass.getEStructuralFeatures().get(2);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EClass getInvocableEndpoint() {
      return invocableEndpointEClass;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EReference getInvocableEndpoint_OwnedServiceInvocations() {
      return (EReference)invocableEndpointEClass.getEStructuralFeatures().get(0);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EClass getContentFilter() {
      return contentFilterEClass;
   }

	/**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getResequencer() {
      return resequencerEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getResequencer_StreamSequences() {
      return (EAttribute)resequencerEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getMetadata() {
      return metadataEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getMetadata_Key() {
      return (EAttribute)metadataEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getMetadata_Values() {
      return (EAttribute)metadataEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getMetadatable() {
      return metadatableEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getMetadatable_OwnedMetadatas() {
      return (EReference)metadatableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EEnum getMessagePart() {
      return messagePartEEnum;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EEnum getRoutingType() {
      return routingTypeEEnum;
   }

	/**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EEnum getExchangeType() {
      return exchangeTypeEEnum;
   }

   /**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EipFactory getEipFactory() {
      return (EipFactory)getEFactoryInstance();
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private boolean isCreated = false;

	/**
    * Creates the meta-model objects for the package.  This method is
    * guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public void createPackageContents() {
      if (isCreated) return;
      isCreated = true;

      // Create classes and their features
      endpointEClass = createEClass(ENDPOINT);
      createEAttribute(endpointEClass, ENDPOINT__NAME);
      createEReference(endpointEClass, ENDPOINT__TO_CHANNELS);
      createEReference(endpointEClass, ENDPOINT__FROM_CHANNELS);

      channelEClass = createEClass(CHANNEL);
      createEReference(channelEClass, CHANNEL__TO_ENDPOINT);
      createEReference(channelEClass, CHANNEL__FROM_ENDPOINT);
      createEAttribute(channelEClass, CHANNEL__NAME);
      createEAttribute(channelEClass, CHANNEL__GUARANTEED);

      adapterEClass = createEClass(ADAPTER);

      routerEClass = createEClass(ROUTER);
      createEReference(routerEClass, ROUTER__OWNED_ROUTES);
      createEAttribute(routerEClass, ROUTER__TYPE);

      filterEClass = createEClass(FILTER);
      createEAttribute(filterEClass, FILTER__EXPRESSION);

      transformerEClass = createEClass(TRANSFORMER);

      gatewayEClass = createEClass(GATEWAY);

      conditionalRouteEClass = createEClass(CONDITIONAL_ROUTE);
      createEAttribute(conditionalRouteEClass, CONDITIONAL_ROUTE__CONDITION);
      createEReference(conditionalRouteEClass, CONDITIONAL_ROUTE__CHANNEL);

      splitterEClass = createEClass(SPLITTER);

      aggregatorEClass = createEClass(AGGREGATOR);
      createEAttribute(aggregatorEClass, AGGREGATOR__PART);
      createEAttribute(aggregatorEClass, AGGREGATOR__STRATEGY);
      createEAttribute(aggregatorEClass, AGGREGATOR__EXPRESSION);

      routeEClass = createEClass(ROUTE);
      createEReference(routeEClass, ROUTE__OWNED_ENDPOINTS);
      createEReference(routeEClass, ROUTE__OWNED_CHANNELS);
      createEAttribute(routeEClass, ROUTE__NAME);
      createEAttribute(routeEClass, ROUTE__EXCHANGE_TYPE);

      serviceActivatorEClass = createEClass(SERVICE_ACTIVATOR);

      eipModelEClass = createEClass(EIP_MODEL);
      createEReference(eipModelEClass, EIP_MODEL__OWNED_ROUTES);
      createEReference(eipModelEClass, EIP_MODEL__OWNED_SERVICE_REFS);

      enricherEClass = createEClass(ENRICHER);
      createEAttribute(enricherEClass, ENRICHER__PART);

      compositeProcessorEClass = createEClass(COMPOSITE_PROCESSOR);
      createEReference(compositeProcessorEClass, COMPOSITE_PROCESSOR__OWNED_ENDPOINTS);

      recipientListRouterEClass = createEClass(RECIPIENT_LIST_ROUTER);

      serviceRefEClass = createEClass(SERVICE_REF);
      createEAttribute(serviceRefEClass, SERVICE_REF__NAME);
      createEAttribute(serviceRefEClass, SERVICE_REF__REFERENCE);
      createEAttribute(serviceRefEClass, SERVICE_REF__OPERATIONS);

      serviceInvocationEClass = createEClass(SERVICE_INVOCATION);
      createEAttribute(serviceInvocationEClass, SERVICE_INVOCATION__CONTEXT);
      createEAttribute(serviceInvocationEClass, SERVICE_INVOCATION__OPERATION_NAME);
      createEReference(serviceInvocationEClass, SERVICE_INVOCATION__SERVICE_REF);

      invocableEndpointEClass = createEClass(INVOCABLE_ENDPOINT);
      createEReference(invocableEndpointEClass, INVOCABLE_ENDPOINT__OWNED_SERVICE_INVOCATIONS);

      contentFilterEClass = createEClass(CONTENT_FILTER);

      resequencerEClass = createEClass(RESEQUENCER);
      createEAttribute(resequencerEClass, RESEQUENCER__STREAM_SEQUENCES);

      metadataEClass = createEClass(METADATA);
      createEAttribute(metadataEClass, METADATA__KEY);
      createEAttribute(metadataEClass, METADATA__VALUES);

      metadatableEClass = createEClass(METADATABLE);
      createEReference(metadatableEClass, METADATABLE__OWNED_METADATAS);

      // Create enums
      messagePartEEnum = createEEnum(MESSAGE_PART);
      routingTypeEEnum = createEEnum(ROUTING_TYPE);
      exchangeTypeEEnum = createEEnum(EXCHANGE_TYPE);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private boolean isInitialized = false;

	/**
    * Complete the initialization of the package and its meta-model.  This
    * method is guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public void initializePackageContents() {
      if (isInitialized) return;
      isInitialized = true;

      // Initialize package
      setName(eNAME);
      setNsPrefix(eNS_PREFIX);
      setNsURI(eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      endpointEClass.getESuperTypes().add(this.getMetadatable());
      channelEClass.getESuperTypes().add(this.getMetadatable());
      routerEClass.getESuperTypes().add(this.getEndpoint());
      filterEClass.getESuperTypes().add(this.getEndpoint());
      transformerEClass.getESuperTypes().add(this.getEndpoint());
      gatewayEClass.getESuperTypes().add(this.getEndpoint());
      splitterEClass.getESuperTypes().add(this.getEndpoint());
      aggregatorEClass.getESuperTypes().add(this.getEndpoint());
      routeEClass.getESuperTypes().add(this.getMetadatable());
      serviceActivatorEClass.getESuperTypes().add(this.getInvocableEndpoint());
      enricherEClass.getESuperTypes().add(this.getInvocableEndpoint());
      compositeProcessorEClass.getESuperTypes().add(this.getEndpoint());
      recipientListRouterEClass.getESuperTypes().add(this.getRouter());
      invocableEndpointEClass.getESuperTypes().add(this.getEndpoint());
      contentFilterEClass.getESuperTypes().add(this.getFilter());
      resequencerEClass.getESuperTypes().add(this.getAggregator());

      // Initialize classes, features, and operations; add parameters
      initEClass(endpointEClass, Endpoint.class, "Endpoint", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getEndpoint_Name(), ecorePackage.getEString(), "name", null, 1, 1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getEndpoint_ToChannels(), this.getChannel(), this.getChannel_FromEndpoint(), "toChannels", null, 0, -1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getEndpoint_FromChannels(), this.getChannel(), this.getChannel_ToEndpoint(), "fromChannels", null, 0, -1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(channelEClass, Channel.class, "Channel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getChannel_ToEndpoint(), this.getEndpoint(), this.getEndpoint_FromChannels(), "toEndpoint", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getChannel_FromEndpoint(), this.getEndpoint(), this.getEndpoint_ToChannels(), "fromEndpoint", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getChannel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getChannel_Guaranteed(), ecorePackage.getEBoolean(), "guaranteed", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(adapterEClass, Adapter.class, "Adapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(routerEClass, Router.class, "Router", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getRouter_OwnedRoutes(), this.getConditionalRoute(), null, "ownedRoutes", null, 0, -1, Router.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getRouter_Type(), this.getRoutingType(), "type", null, 0, 1, Router.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getFilter_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(transformerEClass, Transformer.class, "Transformer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(gatewayEClass, Gateway.class, "Gateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(conditionalRouteEClass, ConditionalRoute.class, "ConditionalRoute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getConditionalRoute_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, ConditionalRoute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getConditionalRoute_Channel(), this.getChannel(), null, "channel", null, 1, 1, ConditionalRoute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(splitterEClass, Splitter.class, "Splitter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(aggregatorEClass, Aggregator.class, "Aggregator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getAggregator_Part(), this.getMessagePart(), "part", "HEADER", 0, 1, Aggregator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getAggregator_Strategy(), ecorePackage.getEString(), "strategy", null, 0, 1, Aggregator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getAggregator_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, Aggregator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(routeEClass, Route.class, "Route", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getRoute_OwnedEndpoints(), this.getEndpoint(), null, "ownedEndpoints", null, 0, -1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getRoute_OwnedChannels(), this.getChannel(), null, "ownedChannels", null, 0, -1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getRoute_Name(), ecorePackage.getEString(), "name", null, 1, 1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getRoute_ExchangeType(), this.getExchangeType(), "exchangeType", null, 0, 1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(serviceActivatorEClass, ServiceActivator.class, "ServiceActivator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(eipModelEClass, EIPModel.class, "EIPModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getEIPModel_OwnedRoutes(), this.getRoute(), null, "ownedRoutes", null, 0, -1, EIPModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getEIPModel_OwnedServiceRefs(), this.getServiceRef(), null, "ownedServiceRefs", null, 0, -1, EIPModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(enricherEClass, Enricher.class, "Enricher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getEnricher_Part(), this.getMessagePart(), "part", "PAYLOAD", 0, 1, Enricher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(compositeProcessorEClass, CompositeProcessor.class, "CompositeProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCompositeProcessor_OwnedEndpoints(), this.getEndpoint(), null, "ownedEndpoints", null, 0, -1, CompositeProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(recipientListRouterEClass, RecipientListRouter.class, "RecipientListRouter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(serviceRefEClass, ServiceRef.class, "ServiceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getServiceRef_Name(), ecorePackage.getEString(), "name", null, 1, 1, ServiceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getServiceRef_Reference(), ecorePackage.getEJavaObject(), "reference", null, 0, 1, ServiceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getServiceRef_Operations(), ecorePackage.getEString(), "operations", null, 0, -1, ServiceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(serviceInvocationEClass, ServiceInvocation.class, "ServiceInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getServiceInvocation_Context(), ecorePackage.getEString(), "context", null, 0, 1, ServiceInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getServiceInvocation_OperationName(), ecorePackage.getEString(), "operationName", null, 0, 1, ServiceInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getServiceInvocation_ServiceRef(), this.getServiceRef(), null, "serviceRef", null, 1, 1, ServiceInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(invocableEndpointEClass, InvocableEndpoint.class, "InvocableEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getInvocableEndpoint_OwnedServiceInvocations(), this.getServiceInvocation(), null, "ownedServiceInvocations", null, 0, -1, InvocableEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(contentFilterEClass, ContentFilter.class, "ContentFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(resequencerEClass, Resequencer.class, "Resequencer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getResequencer_StreamSequences(), ecorePackage.getEBoolean(), "streamSequences", "false", 0, 1, Resequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(metadataEClass, Metadata.class, "Metadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getMetadata_Key(), ecorePackage.getEString(), "key", null, 1, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getMetadata_Values(), ecorePackage.getEString(), "values", null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(metadatableEClass, Metadatable.class, "Metadatable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getMetadatable_OwnedMetadatas(), this.getMetadata(), null, "ownedMetadatas", null, 0, -1, Metadatable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      // Initialize enums and add enum literals
      initEEnum(messagePartEEnum, MessagePart.class, "MessagePart");
      addEEnumLiteral(messagePartEEnum, MessagePart.HEADER);
      addEEnumLiteral(messagePartEEnum, MessagePart.PAYLOAD);

      initEEnum(routingTypeEEnum, RoutingType.class, "RoutingType");
      addEEnumLiteral(routingTypeEEnum, RoutingType.HEADER_VALUE);
      addEEnumLiteral(routingTypeEEnum, RoutingType.PAYLOAD_VALUE);
      addEEnumLiteral(routingTypeEEnum, RoutingType.PAYLOAD_TYPE);

      initEEnum(exchangeTypeEEnum, ExchangeType.class, "ExchangeType");
      addEEnumLiteral(exchangeTypeEEnum, ExchangeType.IN_ONLY);
      addEEnumLiteral(exchangeTypeEEnum, ExchangeType.IN_OUT);

      // Create resource
      createResource(eNS_URI);
   }

} //EipPackageImpl
