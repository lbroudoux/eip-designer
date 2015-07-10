/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.components;

// Start of user code for imports
import com.github.lbroudoux.dsl.eip.EipFactory;
import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.ServiceInvocation;
import com.github.lbroudoux.dsl.eip.ServiceRef;

import com.github.lbroudoux.dsl.eip.parts.EipViewsRepository;
import com.github.lbroudoux.dsl.eip.parts.ServiceInvocationPropertiesEditionPart;

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

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.sirius.eef.components.SiriusAwarePropertiesEditingComponent;


// End of user code

/**
 * @author yanngv29
 * 
 */
public class ServiceInvocationPropertiesEditionComponent extends SiriusAwarePropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for serviceRef EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings serviceRefSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ServiceInvocationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject serviceInvocation, String editing_mode) {
		super(editingContext, serviceInvocation, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EipViewsRepository.class;
		partKey = EipViewsRepository.ServiceInvocation.class;
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
			
			final ServiceInvocation serviceInvocation = (ServiceInvocation)elt;
			final ServiceInvocationPropertiesEditionPart basePart = (ServiceInvocationPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(EipViewsRepository.ServiceInvocation.Properties.context))
				basePart.setContext(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, serviceInvocation.getContext()));
			
			if (isAccessible(EipViewsRepository.ServiceInvocation.Properties.operationName))
				basePart.setOperationName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, serviceInvocation.getOperationName()));
			
			if (isAccessible(EipViewsRepository.ServiceInvocation.Properties.serviceRef)) {
				// init part
				serviceRefSettings = new EObjectFlatComboSettings(serviceInvocation, EipPackage.eINSTANCE.getServiceInvocation_ServiceRef());
				basePart.initServiceRef(serviceRefSettings);
				// set the button mode
				basePart.setServiceRefButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			
			if (isAccessible(EipViewsRepository.ServiceInvocation.Properties.serviceRef)) {
				basePart.addFilterToServiceRef(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof ServiceRef);
					}
					
				});
				// Start of user code for additional businessfilters for serviceRef
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
		if (editorKey == EipViewsRepository.ServiceInvocation.Properties.context) {
			return EipPackage.eINSTANCE.getServiceInvocation_Context();
		}
		if (editorKey == EipViewsRepository.ServiceInvocation.Properties.operationName) {
			return EipPackage.eINSTANCE.getServiceInvocation_OperationName();
		}
		if (editorKey == EipViewsRepository.ServiceInvocation.Properties.serviceRef) {
			return EipPackage.eINSTANCE.getServiceInvocation_ServiceRef();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ServiceInvocation serviceInvocation = (ServiceInvocation)semanticObject;
		if (EipViewsRepository.ServiceInvocation.Properties.context == event.getAffectedEditor()) {
			serviceInvocation.setContext((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (EipViewsRepository.ServiceInvocation.Properties.operationName == event.getAffectedEditor()) {
			serviceInvocation.setOperationName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (EipViewsRepository.ServiceInvocation.Properties.serviceRef == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				serviceRefSettings.setToReference((ServiceRef)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ServiceRef eObject = EipFactory.eINSTANCE.createServiceRef();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				serviceRefSettings.setToReference(eObject);
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
			ServiceInvocationPropertiesEditionPart basePart = (ServiceInvocationPropertiesEditionPart)editingPart;
			if (EipPackage.eINSTANCE.getServiceInvocation_Context().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EipViewsRepository.ServiceInvocation.Properties.context)) {
				if (msg.getNewValue() != null) {
					basePart.setContext(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setContext("");
				}
			}
			if (EipPackage.eINSTANCE.getServiceInvocation_OperationName().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EipViewsRepository.ServiceInvocation.Properties.operationName)) {
				if (msg.getNewValue() != null) {
					basePart.setOperationName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setOperationName("");
				}
			}
			if (EipPackage.eINSTANCE.getServiceInvocation_ServiceRef().equals(msg.getFeature()) && basePart != null && isAccessible(EipViewsRepository.ServiceInvocation.Properties.serviceRef))
				basePart.setServiceRef((EObject)msg.getNewValue());
			
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
			EipPackage.eINSTANCE.getServiceInvocation_Context(),
			EipPackage.eINSTANCE.getServiceInvocation_OperationName(),
			EipPackage.eINSTANCE.getServiceInvocation_ServiceRef()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EipViewsRepository.ServiceInvocation.Properties.serviceRef;
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
				if (EipViewsRepository.ServiceInvocation.Properties.context == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EipPackage.eINSTANCE.getServiceInvocation_Context().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EipPackage.eINSTANCE.getServiceInvocation_Context().getEAttributeType(), newValue);
				}
				if (EipViewsRepository.ServiceInvocation.Properties.operationName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EipPackage.eINSTANCE.getServiceInvocation_OperationName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EipPackage.eINSTANCE.getServiceInvocation_OperationName().getEAttributeType(), newValue);
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
