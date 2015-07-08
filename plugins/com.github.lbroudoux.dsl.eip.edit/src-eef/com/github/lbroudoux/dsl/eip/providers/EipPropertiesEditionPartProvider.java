/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.providers;

import com.github.lbroudoux.dsl.eip.parts.EipViewsRepository;

import com.github.lbroudoux.dsl.eip.parts.forms.AggregatorPropertiesEditionPartForm;
import com.github.lbroudoux.dsl.eip.parts.forms.ChannelPropertiesEditionPartForm;
import com.github.lbroudoux.dsl.eip.parts.forms.CompositeProcessorPropertiesEditionPartForm;
import com.github.lbroudoux.dsl.eip.parts.forms.ConditionalRoutePropertiesEditionPartForm;
import com.github.lbroudoux.dsl.eip.parts.forms.ContentFilterPropertiesEditionPartForm;
import com.github.lbroudoux.dsl.eip.parts.forms.EIPModelPropertiesEditionPartForm;
import com.github.lbroudoux.dsl.eip.parts.forms.EnricherPropertiesEditionPartForm;
import com.github.lbroudoux.dsl.eip.parts.forms.FilterPropertiesEditionPartForm;
import com.github.lbroudoux.dsl.eip.parts.forms.GatewayPropertiesEditionPartForm;
import com.github.lbroudoux.dsl.eip.parts.forms.InvocableEndpointPropertiesEditionPartForm;
import com.github.lbroudoux.dsl.eip.parts.forms.RecipientListRouterPropertiesEditionPartForm;
import com.github.lbroudoux.dsl.eip.parts.forms.ResequencerPropertiesEditionPartForm;
import com.github.lbroudoux.dsl.eip.parts.forms.RoutePropertiesEditionPartForm;
import com.github.lbroudoux.dsl.eip.parts.forms.RouterPropertiesEditionPartForm;
import com.github.lbroudoux.dsl.eip.parts.forms.ServiceActivatorPropertiesEditionPartForm;
import com.github.lbroudoux.dsl.eip.parts.forms.ServiceInvocationPropertiesEditionPartForm;
import com.github.lbroudoux.dsl.eip.parts.forms.ServiceRefPropertiesEditionPartForm;
import com.github.lbroudoux.dsl.eip.parts.forms.SplitterPropertiesEditionPartForm;
import com.github.lbroudoux.dsl.eip.parts.forms.TransformerPropertiesEditionPartForm;

import com.github.lbroudoux.dsl.eip.parts.impl.AggregatorPropertiesEditionPartImpl;
import com.github.lbroudoux.dsl.eip.parts.impl.ChannelPropertiesEditionPartImpl;
import com.github.lbroudoux.dsl.eip.parts.impl.CompositeProcessorPropertiesEditionPartImpl;
import com.github.lbroudoux.dsl.eip.parts.impl.ConditionalRoutePropertiesEditionPartImpl;
import com.github.lbroudoux.dsl.eip.parts.impl.ContentFilterPropertiesEditionPartImpl;
import com.github.lbroudoux.dsl.eip.parts.impl.EIPModelPropertiesEditionPartImpl;
import com.github.lbroudoux.dsl.eip.parts.impl.EnricherPropertiesEditionPartImpl;
import com.github.lbroudoux.dsl.eip.parts.impl.FilterPropertiesEditionPartImpl;
import com.github.lbroudoux.dsl.eip.parts.impl.GatewayPropertiesEditionPartImpl;
import com.github.lbroudoux.dsl.eip.parts.impl.InvocableEndpointPropertiesEditionPartImpl;
import com.github.lbroudoux.dsl.eip.parts.impl.RecipientListRouterPropertiesEditionPartImpl;
import com.github.lbroudoux.dsl.eip.parts.impl.ResequencerPropertiesEditionPartImpl;
import com.github.lbroudoux.dsl.eip.parts.impl.RoutePropertiesEditionPartImpl;
import com.github.lbroudoux.dsl.eip.parts.impl.RouterPropertiesEditionPartImpl;
import com.github.lbroudoux.dsl.eip.parts.impl.ServiceActivatorPropertiesEditionPartImpl;
import com.github.lbroudoux.dsl.eip.parts.impl.ServiceInvocationPropertiesEditionPartImpl;
import com.github.lbroudoux.dsl.eip.parts.impl.ServiceRefPropertiesEditionPartImpl;
import com.github.lbroudoux.dsl.eip.parts.impl.SplitterPropertiesEditionPartImpl;
import com.github.lbroudoux.dsl.eip.parts.impl.TransformerPropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * @author yanngv29
 * 
 */
public class EipPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == EipViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == EipViewsRepository.Channel.class) {
			if (kind == EipViewsRepository.SWT_KIND)
				return new ChannelPropertiesEditionPartImpl(component);
			if (kind == EipViewsRepository.FORM_KIND)
				return new ChannelPropertiesEditionPartForm(component);
		}
		if (key == EipViewsRepository.Router.class) {
			if (kind == EipViewsRepository.SWT_KIND)
				return new RouterPropertiesEditionPartImpl(component);
			if (kind == EipViewsRepository.FORM_KIND)
				return new RouterPropertiesEditionPartForm(component);
		}
		if (key == EipViewsRepository.Filter.class) {
			if (kind == EipViewsRepository.SWT_KIND)
				return new FilterPropertiesEditionPartImpl(component);
			if (kind == EipViewsRepository.FORM_KIND)
				return new FilterPropertiesEditionPartForm(component);
		}
		if (key == EipViewsRepository.Transformer.class) {
			if (kind == EipViewsRepository.SWT_KIND)
				return new TransformerPropertiesEditionPartImpl(component);
			if (kind == EipViewsRepository.FORM_KIND)
				return new TransformerPropertiesEditionPartForm(component);
		}
		if (key == EipViewsRepository.Gateway.class) {
			if (kind == EipViewsRepository.SWT_KIND)
				return new GatewayPropertiesEditionPartImpl(component);
			if (kind == EipViewsRepository.FORM_KIND)
				return new GatewayPropertiesEditionPartForm(component);
		}
		if (key == EipViewsRepository.ConditionalRoute.class) {
			if (kind == EipViewsRepository.SWT_KIND)
				return new ConditionalRoutePropertiesEditionPartImpl(component);
			if (kind == EipViewsRepository.FORM_KIND)
				return new ConditionalRoutePropertiesEditionPartForm(component);
		}
		if (key == EipViewsRepository.Splitter.class) {
			if (kind == EipViewsRepository.SWT_KIND)
				return new SplitterPropertiesEditionPartImpl(component);
			if (kind == EipViewsRepository.FORM_KIND)
				return new SplitterPropertiesEditionPartForm(component);
		}
		if (key == EipViewsRepository.Aggregator.class) {
			if (kind == EipViewsRepository.SWT_KIND)
				return new AggregatorPropertiesEditionPartImpl(component);
			if (kind == EipViewsRepository.FORM_KIND)
				return new AggregatorPropertiesEditionPartForm(component);
		}
		if (key == EipViewsRepository.Route.class) {
			if (kind == EipViewsRepository.SWT_KIND)
				return new RoutePropertiesEditionPartImpl(component);
			if (kind == EipViewsRepository.FORM_KIND)
				return new RoutePropertiesEditionPartForm(component);
		}
		if (key == EipViewsRepository.ServiceActivator.class) {
			if (kind == EipViewsRepository.SWT_KIND)
				return new ServiceActivatorPropertiesEditionPartImpl(component);
			if (kind == EipViewsRepository.FORM_KIND)
				return new ServiceActivatorPropertiesEditionPartForm(component);
		}
		if (key == EipViewsRepository.EIPModel.class) {
			if (kind == EipViewsRepository.SWT_KIND)
				return new EIPModelPropertiesEditionPartImpl(component);
			if (kind == EipViewsRepository.FORM_KIND)
				return new EIPModelPropertiesEditionPartForm(component);
		}
		if (key == EipViewsRepository.Enricher.class) {
			if (kind == EipViewsRepository.SWT_KIND)
				return new EnricherPropertiesEditionPartImpl(component);
			if (kind == EipViewsRepository.FORM_KIND)
				return new EnricherPropertiesEditionPartForm(component);
		}
		if (key == EipViewsRepository.CompositeProcessor.class) {
			if (kind == EipViewsRepository.SWT_KIND)
				return new CompositeProcessorPropertiesEditionPartImpl(component);
			if (kind == EipViewsRepository.FORM_KIND)
				return new CompositeProcessorPropertiesEditionPartForm(component);
		}
		if (key == EipViewsRepository.RecipientListRouter.class) {
			if (kind == EipViewsRepository.SWT_KIND)
				return new RecipientListRouterPropertiesEditionPartImpl(component);
			if (kind == EipViewsRepository.FORM_KIND)
				return new RecipientListRouterPropertiesEditionPartForm(component);
		}
		if (key == EipViewsRepository.ServiceRef.class) {
			if (kind == EipViewsRepository.SWT_KIND)
				return new ServiceRefPropertiesEditionPartImpl(component);
			if (kind == EipViewsRepository.FORM_KIND)
				return new ServiceRefPropertiesEditionPartForm(component);
		}
		if (key == EipViewsRepository.ServiceInvocation.class) {
			if (kind == EipViewsRepository.SWT_KIND)
				return new ServiceInvocationPropertiesEditionPartImpl(component);
			if (kind == EipViewsRepository.FORM_KIND)
				return new ServiceInvocationPropertiesEditionPartForm(component);
		}
		if (key == EipViewsRepository.InvocableEndpoint.class) {
			if (kind == EipViewsRepository.SWT_KIND)
				return new InvocableEndpointPropertiesEditionPartImpl(component);
			if (kind == EipViewsRepository.FORM_KIND)
				return new InvocableEndpointPropertiesEditionPartForm(component);
		}
		if (key == EipViewsRepository.ContentFilter.class) {
			if (kind == EipViewsRepository.SWT_KIND)
				return new ContentFilterPropertiesEditionPartImpl(component);
			if (kind == EipViewsRepository.FORM_KIND)
				return new ContentFilterPropertiesEditionPartForm(component);
		}
		if (key == EipViewsRepository.Resequencer.class) {
			if (kind == EipViewsRepository.SWT_KIND)
				return new ResequencerPropertiesEditionPartImpl(component);
			if (kind == EipViewsRepository.FORM_KIND)
				return new ResequencerPropertiesEditionPartForm(component);
		}
		return null;
	}

}
