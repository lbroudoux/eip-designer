/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.components;

// Start of user code for imports
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
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import com.github.lbroudoux.dsl.eip.Channel;
import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.Gateway;
import com.github.lbroudoux.dsl.eip.parts.EipViewsRepository;
import com.github.lbroudoux.dsl.eip.parts.GatewayPropertiesEditionPart;


// End of user code

/**
 * @author yanngv29
 * 
 */
public class GatewayPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for toChannels ReferencesTable
	 */
	private ReferencesTableSettings toChannelsSettings;
	
	/**
	 * Settings for fromChannels ReferencesTable
	 */
	private ReferencesTableSettings fromChannelsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public GatewayPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject gateway, String editing_mode) {
		super(editingContext, gateway, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EipViewsRepository.class;
		partKey = EipViewsRepository.Gateway.class;
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
			
			final Gateway gateway = (Gateway)elt;
			final GatewayPropertiesEditionPart basePart = (GatewayPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(EipViewsRepository.Gateway.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, gateway.getName()));
			
			if (isAccessible(EipViewsRepository.Gateway.Properties.toChannels)) {
				toChannelsSettings = new ReferencesTableSettings(gateway, EipPackage.eINSTANCE.getEndpoint_ToChannels());
				basePart.initToChannels(toChannelsSettings);
			}
			if (isAccessible(EipViewsRepository.Gateway.Properties.fromChannels)) {
				fromChannelsSettings = new ReferencesTableSettings(gateway, EipPackage.eINSTANCE.getEndpoint_FromChannels());
				basePart.initFromChannels(fromChannelsSettings);
			}
			// init filters
			
			if (isAccessible(EipViewsRepository.Gateway.Properties.toChannels)) {
				basePart.addFilterToToChannels(new EObjectFilter(EipPackage.Literals.CHANNEL));
				// Start of user code for additional businessfilters for toChannels
				// End of user code
			}
			if (isAccessible(EipViewsRepository.Gateway.Properties.fromChannels)) {
				basePart.addFilterToFromChannels(new EObjectFilter(EipPackage.Literals.CHANNEL));
				// Start of user code for additional businessfilters for fromChannels
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
		if (editorKey == EipViewsRepository.Gateway.Properties.name) {
			return EipPackage.eINSTANCE.getEndpoint_Name();
		}
		if (editorKey == EipViewsRepository.Gateway.Properties.toChannels) {
			return EipPackage.eINSTANCE.getEndpoint_ToChannels();
		}
		if (editorKey == EipViewsRepository.Gateway.Properties.fromChannels) {
			return EipPackage.eINSTANCE.getEndpoint_FromChannels();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Gateway gateway = (Gateway)semanticObject;
		if (EipViewsRepository.Gateway.Properties.name == event.getAffectedEditor()) {
			gateway.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (EipViewsRepository.Gateway.Properties.toChannels == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Channel) {
					toChannelsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				toChannelsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				toChannelsSettings.move(event.getNewIndex(), (Channel) event.getNewValue());
			}
		}
		if (EipViewsRepository.Gateway.Properties.fromChannels == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Channel) {
					fromChannelsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				fromChannelsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				fromChannelsSettings.move(event.getNewIndex(), (Channel) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			GatewayPropertiesEditionPart basePart = (GatewayPropertiesEditionPart)editingPart;
			if (EipPackage.eINSTANCE.getEndpoint_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EipViewsRepository.Gateway.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (EipPackage.eINSTANCE.getEndpoint_ToChannels().equals(msg.getFeature())  && isAccessible(EipViewsRepository.Gateway.Properties.toChannels))
				basePart.updateToChannels();
			if (EipPackage.eINSTANCE.getEndpoint_FromChannels().equals(msg.getFeature())  && isAccessible(EipViewsRepository.Gateway.Properties.fromChannels))
				basePart.updateFromChannels();
			
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
			EipPackage.eINSTANCE.getEndpoint_Name(),
			EipPackage.eINSTANCE.getEndpoint_ToChannels(),
			EipPackage.eINSTANCE.getEndpoint_FromChannels()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EipViewsRepository.Gateway.Properties.name;
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
				if (EipViewsRepository.Gateway.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EipPackage.eINSTANCE.getEndpoint_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EipPackage.eINSTANCE.getEndpoint_Name().getEAttributeType(), newValue);
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
