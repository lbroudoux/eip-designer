/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.components;

// Start of user code for imports
import com.github.lbroudoux.dsl.eip.Channel;
import com.github.lbroudoux.dsl.eip.EipFactory;
import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.Splitter;
import com.github.lbroudoux.dsl.eip.parts.EipViewsRepository;
import com.github.lbroudoux.dsl.eip.parts.SplitterPropertiesEditionPart;

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
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * @author yanngv29
 * 
 */
public class SplitterPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	public SplitterPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject splitter, String editing_mode) {
		super(editingContext, splitter, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EipViewsRepository.class;
		partKey = EipViewsRepository.Splitter.class;
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
			
			final Splitter splitter = (Splitter)elt;
			final SplitterPropertiesEditionPart basePart = (SplitterPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(EipViewsRepository.Splitter.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, splitter.getName()));
			
			if (isAccessible(EipViewsRepository.Splitter.Properties.toChannels)) {
				toChannelsSettings = new ReferencesTableSettings(splitter, EipPackage.eINSTANCE.getEndpoint_ToChannels());
				basePart.initToChannels(toChannelsSettings);
			}
			if (isAccessible(EipViewsRepository.Splitter.Properties.fromChannels)) {
				fromChannelsSettings = new ReferencesTableSettings(splitter, EipPackage.eINSTANCE.getEndpoint_FromChannels());
				basePart.initFromChannels(fromChannelsSettings);
			}
			// init filters
			
			if (isAccessible(EipViewsRepository.Splitter.Properties.toChannels)) {
				basePart.addFilterToToChannels(new EObjectFilter(EipPackage.Literals.CHANNEL));
				// Start of user code for additional businessfilters for toChannels
				// End of user code
			}
			if (isAccessible(EipViewsRepository.Splitter.Properties.fromChannels)) {
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
		if (editorKey == EipViewsRepository.Splitter.Properties.name) {
			return EipPackage.eINSTANCE.getEndpoint_Name();
		}
		if (editorKey == EipViewsRepository.Splitter.Properties.toChannels) {
			return EipPackage.eINSTANCE.getEndpoint_ToChannels();
		}
		if (editorKey == EipViewsRepository.Splitter.Properties.fromChannels) {
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
		Splitter splitter = (Splitter)semanticObject;
		if (EipViewsRepository.Splitter.Properties.name == event.getAffectedEditor()) {
			splitter.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (EipViewsRepository.Splitter.Properties.toChannels == event.getAffectedEditor()) {
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
		if (EipViewsRepository.Splitter.Properties.fromChannels == event.getAffectedEditor()) {
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
			SplitterPropertiesEditionPart basePart = (SplitterPropertiesEditionPart)editingPart;
			if (EipPackage.eINSTANCE.getEndpoint_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EipViewsRepository.Splitter.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (EipPackage.eINSTANCE.getEndpoint_ToChannels().equals(msg.getFeature())  && isAccessible(EipViewsRepository.Splitter.Properties.toChannels))
				basePart.updateToChannels();
			if (EipPackage.eINSTANCE.getEndpoint_FromChannels().equals(msg.getFeature())  && isAccessible(EipViewsRepository.Splitter.Properties.fromChannels))
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
		return key == EipViewsRepository.Splitter.Properties.name;
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
				if (EipViewsRepository.Splitter.Properties.name == event.getAffectedEditor()) {
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
