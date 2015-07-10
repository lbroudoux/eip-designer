/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.components;

// Start of user code for imports
import com.github.lbroudoux.dsl.eip.Channel;
import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.Endpoint;
import com.github.lbroudoux.dsl.eip.parts.ChannelPropertiesEditionPart;
import com.github.lbroudoux.dsl.eip.parts.EipViewsRepository;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * @author yanngv29
 * 
 */
public class ChannelPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for toEndpoint EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings toEndpointSettings;
	
	/**
	 * Settings for fromEndpoint EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings fromEndpointSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ChannelPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject channel, String editing_mode) {
		super(editingContext, channel, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EipViewsRepository.class;
		partKey = EipViewsRepository.Channel.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final Channel channel = (Channel)elt;
			final ChannelPropertiesEditionPart basePart = (ChannelPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(EipViewsRepository.Channel.Properties.toEndpoint)) {
				// init part
				toEndpointSettings = new EObjectFlatComboSettings(channel, EipPackage.eINSTANCE.getChannel_ToEndpoint());
				basePart.initToEndpoint(toEndpointSettings);
				// set the button mode
				basePart.setToEndpointButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(EipViewsRepository.Channel.Properties.fromEndpoint)) {
				// init part
				fromEndpointSettings = new EObjectFlatComboSettings(channel, EipPackage.eINSTANCE.getChannel_FromEndpoint());
				basePart.initFromEndpoint(fromEndpointSettings);
				// set the button mode
				basePart.setFromEndpointButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(EipViewsRepository.Channel.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, channel.getName()));
			
			if (isAccessible(EipViewsRepository.Channel.Properties.guaranteed)) {
				basePart.setGuaranteed(channel.isGuaranteed());
			}
			// init filters
			if (isAccessible(EipViewsRepository.Channel.Properties.toEndpoint)) {
				basePart.addFilterToToEndpoint(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Endpoint); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for toEndpoint
				// End of user code
			}
			if (isAccessible(EipViewsRepository.Channel.Properties.fromEndpoint)) {
				basePart.addFilterToFromEndpoint(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Endpoint); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for fromEndpoint
				// End of user code
			}
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}







	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == EipViewsRepository.Channel.Properties.toEndpoint) {
			return EipPackage.eINSTANCE.getChannel_ToEndpoint();
		}
		if (editorKey == EipViewsRepository.Channel.Properties.fromEndpoint) {
			return EipPackage.eINSTANCE.getChannel_FromEndpoint();
		}
		if (editorKey == EipViewsRepository.Channel.Properties.name) {
			return EipPackage.eINSTANCE.getChannel_Name();
		}
		if (editorKey == EipViewsRepository.Channel.Properties.guaranteed) {
			return EipPackage.eINSTANCE.getChannel_Guaranteed();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Channel channel = (Channel)semanticObject;
		if (EipViewsRepository.Channel.Properties.toEndpoint == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				toEndpointSettings.setToReference((Endpoint)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, toEndpointSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (EipViewsRepository.Channel.Properties.fromEndpoint == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				fromEndpointSettings.setToReference((Endpoint)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, fromEndpointSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (EipViewsRepository.Channel.Properties.name == event.getAffectedEditor()) {
			channel.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (EipViewsRepository.Channel.Properties.guaranteed == event.getAffectedEditor()) {
			channel.setGuaranteed((Boolean)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ChannelPropertiesEditionPart basePart = (ChannelPropertiesEditionPart)editingPart;
			if (EipPackage.eINSTANCE.getChannel_ToEndpoint().equals(msg.getFeature()) && basePart != null && isAccessible(EipViewsRepository.Channel.Properties.toEndpoint))
				basePart.setToEndpoint((EObject)msg.getNewValue());
			if (EipPackage.eINSTANCE.getChannel_FromEndpoint().equals(msg.getFeature()) && basePart != null && isAccessible(EipViewsRepository.Channel.Properties.fromEndpoint))
				basePart.setFromEndpoint((EObject)msg.getNewValue());
			if (EipPackage.eINSTANCE.getChannel_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EipViewsRepository.Channel.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (EipPackage.eINSTANCE.getChannel_Guaranteed().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EipViewsRepository.Channel.Properties.guaranteed))
				basePart.setGuaranteed((Boolean)msg.getNewValue());
			
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			EipPackage.eINSTANCE.getChannel_ToEndpoint(),
			EipPackage.eINSTANCE.getChannel_FromEndpoint(),
			EipPackage.eINSTANCE.getChannel_Name(),
			EipPackage.eINSTANCE.getChannel_Guaranteed()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (EipViewsRepository.Channel.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EipPackage.eINSTANCE.getChannel_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EipPackage.eINSTANCE.getChannel_Name().getEAttributeType(), newValue);
				}
				if (EipViewsRepository.Channel.Properties.guaranteed == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EipPackage.eINSTANCE.getChannel_Guaranteed().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EipPackage.eINSTANCE.getChannel_Guaranteed().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
