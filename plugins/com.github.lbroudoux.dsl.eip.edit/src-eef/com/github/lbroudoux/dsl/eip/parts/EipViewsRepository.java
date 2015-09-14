/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.parts;

/**
 * @author yanngv29
 * 
 */
public class EipViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * Channel view descriptor
	 * 
	 */
	public static class Channel {
		public static class Properties {
	
			
			public static String toEndpoint = "eip::Channel::properties::toEndpoint";
			
			
			public static String fromEndpoint = "eip::Channel::properties::fromEndpoint";
			
			
			public static String name = "eip::Channel::properties::name";
			
			
			public static String guaranteed = "eip::Channel::properties::guaranteed";
			
	
		}
	
	}

	/**
	 * Adapter view descriptor
	 * 
	 */
	public static class Adapter {
	}

	/**
	 * Router view descriptor
	 * 
	 */
	public static class Router {
		public static class Properties {
	
			
			public static String name = "eip::Router::properties::name";
			
			
			public static String toChannels = "eip::Router::properties::toChannels";
			
			
			public static String fromChannels = "eip::Router::properties::fromChannels";
			
			
			public static String ownedRoutes = "eip::Router::properties::ownedRoutes";
			
			
			public static String type = "eip::Router::properties::type";
			
	
		}
	
	}

	/**
	 * Filter view descriptor
	 * 
	 */
	public static class Filter {
		public static class Properties {
	
			
			public static String name = "eip::Filter::properties::name";
			
			
			public static String toChannels = "eip::Filter::properties::toChannels";
			
			
			public static String fromChannels = "eip::Filter::properties::fromChannels";
			
			
			public static String expression = "eip::Filter::properties::expression";
			
	
		}
	
	}

	/**
	 * Transformer view descriptor
	 * 
	 */
	public static class Transformer {
		public static class Properties {
	
			
			public static String name = "eip::Transformer::properties::name";
			
			
			public static String toChannels = "eip::Transformer::properties::toChannels";
			
			
			public static String fromChannels = "eip::Transformer::properties::fromChannels";
			
	
		}
	
	}

	/**
	 * Gateway view descriptor
	 * 
	 */
	public static class Gateway {
		public static class Properties {
	
			
			public static String name = "eip::Gateway::properties::name";
			
			
			public static String toChannels = "eip::Gateway::properties::toChannels";
			
			
			public static String fromChannels = "eip::Gateway::properties::fromChannels";
			
	
		}
	
	}

	/**
	 * ConditionalRoute view descriptor
	 * 
	 */
	public static class ConditionalRoute {
		public static class Properties {
	
			
			public static String condition = "eip::ConditionalRoute::properties::condition";
			
			
			public static String channel = "eip::ConditionalRoute::properties::channel";
			
	
		}
	
	}

	/**
	 * Splitter view descriptor
	 * 
	 */
	public static class Splitter {
		public static class Properties {
	
			
			public static String name = "eip::Splitter::properties::name";
			
			
			public static String toChannels = "eip::Splitter::properties::toChannels";
			
			
			public static String fromChannels = "eip::Splitter::properties::fromChannels";
			
	
		}
	
	}

	/**
	 * Aggregator view descriptor
	 * 
	 */
	public static class Aggregator {
		public static class Properties {
	
			
			public static String name = "eip::Aggregator::properties::name";
			
			
			public static String toChannels = "eip::Aggregator::properties::toChannels";
			
			
			public static String fromChannels = "eip::Aggregator::properties::fromChannels";
			
			
			public static String part = "eip::Aggregator::properties::part";
			
			
			public static String strategy = "eip::Aggregator::properties::strategy";
			
			
			public static String expression = "eip::Aggregator::properties::expression";
			
	
		}
	
	}

	/**
	 * Route view descriptor
	 * 
	 */
	public static class Route {
		public static class Properties {
	
			
			public static String name = "eip::Route::properties::name";
			
			
			public static String exchangeType = "eip::Route::properties::exchangeType";
			
	
		}
	
	}

	/**
	 * ServiceActivator view descriptor
	 * 
	 */
	public static class ServiceActivator {
		public static class Properties {
	
			
			public static String name = "eip::ServiceActivator::properties::name";
			
			
			public static String toChannels = "eip::ServiceActivator::properties::toChannels";
			
			
			public static String fromChannels = "eip::ServiceActivator::properties::fromChannels";
			
			
			public static String ownedServiceInvocations = "eip::ServiceActivator::properties::ownedServiceInvocations";
			
	
		}
	
	}

	/**
	 * EIPModel view descriptor
	 * 
	 */
	public static class EIPModel {
		public static class Properties {
	
			
			public static String ownedRoutes = "eip::EIPModel::properties::ownedRoutes";
			
			
			public static String ownedServiceRefs = "eip::EIPModel::properties::ownedServiceRefs";
			
	
		}
	
	}

	/**
	 * Enricher view descriptor
	 * 
	 */
	public static class Enricher {
		public static class Properties {
	
			
			public static String name = "eip::Enricher::properties::name";
			
			
			public static String toChannels = "eip::Enricher::properties::toChannels";
			
			
			public static String fromChannels = "eip::Enricher::properties::fromChannels";
			
			
			public static String ownedServiceInvocations = "eip::Enricher::properties::ownedServiceInvocations";
			
			
			public static String part = "eip::Enricher::properties::part";
			
	
		}
	
	}

	/**
	 * CompositeProcessor view descriptor
	 * 
	 */
	public static class CompositeProcessor {
		public static class Properties {
	
			
			public static String name = "eip::CompositeProcessor::properties::name";
			
			
			public static String toChannels = "eip::CompositeProcessor::properties::toChannels";
			
			
			public static String fromChannels = "eip::CompositeProcessor::properties::fromChannels";
			
	
		}
	
	}

	/**
	 * RecipientListRouter view descriptor
	 * 
	 */
	public static class RecipientListRouter {
		public static class Properties {
	
			
			public static String name = "eip::RecipientListRouter::properties::name";
			
			
			public static String toChannels = "eip::RecipientListRouter::properties::toChannels";
			
			
			public static String fromChannels = "eip::RecipientListRouter::properties::fromChannels";
			
			
			public static String ownedRoutes = "eip::RecipientListRouter::properties::ownedRoutes";
			
			
			public static String type = "eip::RecipientListRouter::properties::type";
			
	
		}
	
	}

	/**
	 * ServiceRef view descriptor
	 * 
	 */
	public static class ServiceRef {
		public static class Properties {
	
			
			public static String name = "eip::ServiceRef::properties::name";
			
			
			public static String reference = "eip::ServiceRef::properties::reference";
			
			
			public static String operations = "eip::ServiceRef::properties::operations";
			
	
		}
	
	}

	/**
	 * ServiceInvocation view descriptor
	 * 
	 */
	public static class ServiceInvocation {
		public static class Properties {
	
			
			public static String context = "eip::ServiceInvocation::properties::context";
			
			
			public static String operationName = "eip::ServiceInvocation::properties::operationName";
			
			
			public static String serviceRef = "eip::ServiceInvocation::properties::serviceRef";
			
	
		}
	
	}

	/**
	 * InvocableEndpoint view descriptor
	 * 
	 */
	public static class InvocableEndpoint {
		public static class Properties {
	
			
			public static String name = "eip::InvocableEndpoint::properties::name";
			
			
			public static String toChannels = "eip::InvocableEndpoint::properties::toChannels";
			
			
			public static String fromChannels = "eip::InvocableEndpoint::properties::fromChannels";
			
			
			public static String ownedServiceInvocations = "eip::InvocableEndpoint::properties::ownedServiceInvocations";
			
	
		}
	
	}

	/**
	 * ContentFilter view descriptor
	 * 
	 */
	public static class ContentFilter {
		public static class Properties {
	
			
			public static String name = "eip::ContentFilter::properties::name";
			
			
			public static String toChannels = "eip::ContentFilter::properties::toChannels";
			
			
			public static String fromChannels = "eip::ContentFilter::properties::fromChannels";
			
			
			public static String expression = "eip::ContentFilter::properties::expression";
			
	
		}
	
	}

	/**
	 * Resequencer view descriptor
	 * 
	 */
	public static class Resequencer {
		public static class Properties {
	
			
			public static String name = "eip::Resequencer::properties::name";
			
			
			public static String toChannels = "eip::Resequencer::properties::toChannels";
			
			
			public static String fromChannels = "eip::Resequencer::properties::fromChannels";
			
			
			public static String part = "eip::Resequencer::properties::part";
			
			
			public static String strategy = "eip::Resequencer::properties::strategy";
			
			
			public static String expression = "eip::Resequencer::properties::expression";
			
			
			public static String streamSequences = "eip::Resequencer::properties::streamSequences";
			
	
		}
	
	}

}
