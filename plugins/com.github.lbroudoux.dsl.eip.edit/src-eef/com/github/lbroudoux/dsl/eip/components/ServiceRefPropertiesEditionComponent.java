/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.components;

// Start of user code for imports
import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.ServiceRef;

import com.github.lbroudoux.dsl.eip.parts.EipViewsRepository;
import com.github.lbroudoux.dsl.eip.parts.ServiceRefPropertiesEditionPart;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
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

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.sirius.eef.components.SiriusAwarePropertiesEditingComponent;


// End of user code

/**
 * @author yanngv29
 * 
 */
public class ServiceRefPropertiesEditionComponent extends SiriusAwarePropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ServiceRefPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject serviceRef, String editing_mode) {
		super(editingContext, serviceRef, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EipViewsRepository.class;
		partKey = EipViewsRepository.ServiceRef.class;
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
			
			final ServiceRef serviceRef = (ServiceRef)elt;
			final ServiceRefPropertiesEditionPart basePart = (ServiceRefPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(EipViewsRepository.ServiceRef.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, serviceRef.getName()));
			
			if (isAccessible(EipViewsRepository.ServiceRef.Properties.reference))
				basePart.setReference(EEFConverterUtil.convertToString(EcorePackage.Literals.EJAVA_OBJECT, serviceRef.getReference()));
			
			if (isAccessible(EipViewsRepository.ServiceRef.Properties.operations))
				basePart.setOperations(serviceRef.getOperations());
			
			// init filters
			
			
			
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
		if (editorKey == EipViewsRepository.ServiceRef.Properties.name) {
			return EipPackage.eINSTANCE.getServiceRef_Name();
		}
		if (editorKey == EipViewsRepository.ServiceRef.Properties.reference) {
			return EipPackage.eINSTANCE.getServiceRef_Reference();
		}
		if (editorKey == EipViewsRepository.ServiceRef.Properties.operations) {
			return EipPackage.eINSTANCE.getServiceRef_Operations();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ServiceRef serviceRef = (ServiceRef)semanticObject;
		if (EipViewsRepository.ServiceRef.Properties.name == event.getAffectedEditor()) {
			serviceRef.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (EipViewsRepository.ServiceRef.Properties.reference == event.getAffectedEditor()) {
			serviceRef.setReference((java.lang.Object)EEFConverterUtil.createFromString(EcorePackage.Literals.EJAVA_OBJECT, (String)event.getNewValue()));
		}
		if (EipViewsRepository.ServiceRef.Properties.operations == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				serviceRef.getOperations().clear();
				serviceRef.getOperations().addAll(((EList) event.getNewValue()));
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
			ServiceRefPropertiesEditionPart basePart = (ServiceRefPropertiesEditionPart)editingPart;
			if (EipPackage.eINSTANCE.getServiceRef_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EipViewsRepository.ServiceRef.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (EipPackage.eINSTANCE.getServiceRef_Reference().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EipViewsRepository.ServiceRef.Properties.reference)) {
				if (msg.getNewValue() != null) {
					basePart.setReference(EcoreUtil.convertToString(EcorePackage.Literals.EJAVA_OBJECT, msg.getNewValue()));
				} else {
					basePart.setReference("");
				}
			}
			if (EipPackage.eINSTANCE.getServiceRef_Operations().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EipViewsRepository.ServiceRef.Properties.operations)) {
				if (msg.getNewValue() instanceof EList<?>) {
					basePart.setOperations((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					basePart.setOperations(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					basePart.setOperations(newValueAsList);
				}
			}
			
			
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
			EipPackage.eINSTANCE.getServiceRef_Name(),
			EipPackage.eINSTANCE.getServiceRef_Reference(),
			EipPackage.eINSTANCE.getServiceRef_Operations()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EipViewsRepository.ServiceRef.Properties.name;
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
				if (EipViewsRepository.ServiceRef.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EipPackage.eINSTANCE.getServiceRef_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EipPackage.eINSTANCE.getServiceRef_Name().getEAttributeType(), newValue);
				}
				if (EipViewsRepository.ServiceRef.Properties.reference == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EipPackage.eINSTANCE.getServiceRef_Reference().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EipPackage.eINSTANCE.getServiceRef_Reference().getEAttributeType(), newValue);
				}
				if (EipViewsRepository.ServiceRef.Properties.operations == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(EipPackage.eINSTANCE.getServiceRef_Operations().getEAttributeType(), iterator.next()));
					}
					ret = chain;
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
