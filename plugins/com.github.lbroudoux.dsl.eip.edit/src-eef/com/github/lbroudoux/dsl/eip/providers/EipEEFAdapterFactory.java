/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.providers;

import org.eclipse.emf.common.notify.Adapter;

import com.github.lbroudoux.dsl.eip.util.EipAdapterFactory;

/**
 * @author yanngv29
 * 
 */
public class EipEEFAdapterFactory extends EipAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see com.github.lbroudoux.dsl.eip.util.EipAdapterFactory#createChannelAdapter()
	 * 
	 */
	public Adapter createChannelAdapter() {
		return new ChannelPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.github.lbroudoux.dsl.eip.util.EipAdapterFactory#createRouterAdapter()
	 * 
	 */
	public Adapter createRouterAdapter() {
		return new RouterPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.github.lbroudoux.dsl.eip.util.EipAdapterFactory#createFilterAdapter()
	 * 
	 */
	public Adapter createFilterAdapter() {
		return new FilterPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.github.lbroudoux.dsl.eip.util.EipAdapterFactory#createTransformerAdapter()
	 * 
	 */
	public Adapter createTransformerAdapter() {
		return new TransformerPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.github.lbroudoux.dsl.eip.util.EipAdapterFactory#createGatewayAdapter()
	 * 
	 */
	public Adapter createGatewayAdapter() {
		return new GatewayPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.github.lbroudoux.dsl.eip.util.EipAdapterFactory#createConditionalRouteAdapter()
	 * 
	 */
	public Adapter createConditionalRouteAdapter() {
		return new ConditionalRoutePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.github.lbroudoux.dsl.eip.util.EipAdapterFactory#createSplitterAdapter()
	 * 
	 */
	public Adapter createSplitterAdapter() {
		return new SplitterPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.github.lbroudoux.dsl.eip.util.EipAdapterFactory#createAggregatorAdapter()
	 * 
	 */
	public Adapter createAggregatorAdapter() {
		return new AggregatorPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.github.lbroudoux.dsl.eip.util.EipAdapterFactory#createRouteAdapter()
	 * 
	 */
	public Adapter createRouteAdapter() {
		return new RoutePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.github.lbroudoux.dsl.eip.util.EipAdapterFactory#createInvocableEndpointAdapter()
	 * 
	 */
	public Adapter createInvocableEndpointAdapter() {
		return new InvocableEndpointPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.github.lbroudoux.dsl.eip.util.EipAdapterFactory#createServiceActivatorAdapter()
	 * 
	 */
	public Adapter createServiceActivatorAdapter() {
		return new ServiceActivatorPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.github.lbroudoux.dsl.eip.util.EipAdapterFactory#createEIPModelAdapter()
	 * 
	 */
	public Adapter createEIPModelAdapter() {
		return new EIPModelPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.github.lbroudoux.dsl.eip.util.EipAdapterFactory#createEnricherAdapter()
	 * 
	 */
	public Adapter createEnricherAdapter() {
		return new EnricherPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.github.lbroudoux.dsl.eip.util.EipAdapterFactory#createCompositeProcessorAdapter()
	 * 
	 */
	public Adapter createCompositeProcessorAdapter() {
		return new CompositeProcessorPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.github.lbroudoux.dsl.eip.util.EipAdapterFactory#createRecipientListRouterAdapter()
	 * 
	 */
	public Adapter createRecipientListRouterAdapter() {
		return new RecipientListRouterPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.github.lbroudoux.dsl.eip.util.EipAdapterFactory#createServiceRefAdapter()
	 * 
	 */
	public Adapter createServiceRefAdapter() {
		return new ServiceRefPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.github.lbroudoux.dsl.eip.util.EipAdapterFactory#createServiceInvocationAdapter()
	 * 
	 */
	public Adapter createServiceInvocationAdapter() {
		return new ServiceInvocationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.github.lbroudoux.dsl.eip.util.EipAdapterFactory#createContentFilterAdapter()
	 * 
	 */
	public Adapter createContentFilterAdapter() {
		return new ContentFilterPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.github.lbroudoux.dsl.eip.util.EipAdapterFactory#createResequencerAdapter()
	 * 
	 */
	public Adapter createResequencerAdapter() {
		return new ResequencerPropertiesEditionProvider();
	}

}
