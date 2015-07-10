/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.components;

// Start of user code for imports
import com.github.lbroudoux.dsl.eip.Channel;
import com.github.lbroudoux.dsl.eip.EipFactory;
import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.MessagePart;
import com.github.lbroudoux.dsl.eip.Resequencer;
import com.github.lbroudoux.dsl.eip.parts.EipViewsRepository;
import com.github.lbroudoux.dsl.eip.parts.ResequencerPropertiesEditionPart;

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
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
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
public class ResequencerPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for toChannel EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings toChannelSettings;
	
	/**
	 * Settings for fromChannels ReferencesTable
	 */
	private ReferencesTableSettings fromChannelsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ResequencerPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject resequencer, String editing_mode) {
		super(editingContext, resequencer, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EipViewsRepository.class;
		partKey = EipViewsRepository.Resequencer.class;
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
			
			final Resequencer resequencer = (Resequencer)elt;
			final ResequencerPropertiesEditionPart basePart = (ResequencerPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(EipViewsRepository.Resequencer.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, resequencer.getName()));
			
			if (isAccessible(EipViewsRepository.Resequencer.Properties.toChannel)) {
				// init part
				toChannelSettings = new EObjectFlatComboSettings(resequencer, EipPackage.eINSTANCE.getEndpoint_ToChannel());
				basePart.initToChannel(toChannelSettings);
				// set the button mode
				basePart.setToChannelButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(EipViewsRepository.Resequencer.Properties.fromChannels)) {
				fromChannelsSettings = new ReferencesTableSettings(resequencer, EipPackage.eINSTANCE.getEndpoint_FromChannels());
				basePart.initFromChannels(fromChannelsSettings);
			}
			if (isAccessible(EipViewsRepository.Resequencer.Properties.part)) {
				basePart.initPart(EEFUtils.choiceOfValues(resequencer, EipPackage.eINSTANCE.getAggregator_Part()), resequencer.getPart());
			}
			if (isAccessible(EipViewsRepository.Resequencer.Properties.strategy))
				basePart.setStrategy(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, resequencer.getStrategy()));
			
			if (isAccessible(EipViewsRepository.Resequencer.Properties.expression))
				basePart.setExpression(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, resequencer.getExpression()));
			
			if (isAccessible(EipViewsRepository.Resequencer.Properties.streamSequences)) {
				basePart.setStreamSequences(resequencer.isStreamSequences());
			}
			// init filters
			
			if (isAccessible(EipViewsRepository.Resequencer.Properties.toChannel)) {
				basePart.addFilterToToChannel(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Channel); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for toChannel
				// End of user code
			}
			if (isAccessible(EipViewsRepository.Resequencer.Properties.fromChannels)) {
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
		if (editorKey == EipViewsRepository.Resequencer.Properties.name) {
			return EipPackage.eINSTANCE.getEndpoint_Name();
		}
		if (editorKey == EipViewsRepository.Resequencer.Properties.toChannel) {
			return EipPackage.eINSTANCE.getEndpoint_ToChannel();
		}
		if (editorKey == EipViewsRepository.Resequencer.Properties.fromChannels) {
			return EipPackage.eINSTANCE.getEndpoint_FromChannels();
		}
		if (editorKey == EipViewsRepository.Resequencer.Properties.part) {
			return EipPackage.eINSTANCE.getAggregator_Part();
		}
		if (editorKey == EipViewsRepository.Resequencer.Properties.strategy) {
			return EipPackage.eINSTANCE.getAggregator_Strategy();
		}
		if (editorKey == EipViewsRepository.Resequencer.Properties.expression) {
			return EipPackage.eINSTANCE.getAggregator_Expression();
		}
		if (editorKey == EipViewsRepository.Resequencer.Properties.streamSequences) {
			return EipPackage.eINSTANCE.getResequencer_StreamSequences();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Resequencer resequencer = (Resequencer)semanticObject;
		if (EipViewsRepository.Resequencer.Properties.name == event.getAffectedEditor()) {
			resequencer.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (EipViewsRepository.Resequencer.Properties.toChannel == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				toChannelSettings.setToReference((Channel)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Channel eObject = EipFactory.eINSTANCE.createChannel();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				toChannelSettings.setToReference(eObject);
			}
		}
		if (EipViewsRepository.Resequencer.Properties.fromChannels == event.getAffectedEditor()) {
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
		if (EipViewsRepository.Resequencer.Properties.part == event.getAffectedEditor()) {
			resequencer.setPart((MessagePart)event.getNewValue());
		}
		if (EipViewsRepository.Resequencer.Properties.strategy == event.getAffectedEditor()) {
			resequencer.setStrategy((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (EipViewsRepository.Resequencer.Properties.expression == event.getAffectedEditor()) {
			resequencer.setExpression((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (EipViewsRepository.Resequencer.Properties.streamSequences == event.getAffectedEditor()) {
			resequencer.setStreamSequences((Boolean)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ResequencerPropertiesEditionPart basePart = (ResequencerPropertiesEditionPart)editingPart;
			if (EipPackage.eINSTANCE.getEndpoint_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EipViewsRepository.Resequencer.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (EipPackage.eINSTANCE.getEndpoint_ToChannel().equals(msg.getFeature()) && basePart != null && isAccessible(EipViewsRepository.Resequencer.Properties.toChannel))
				basePart.setToChannel((EObject)msg.getNewValue());
			if (EipPackage.eINSTANCE.getEndpoint_FromChannels().equals(msg.getFeature())  && isAccessible(EipViewsRepository.Resequencer.Properties.fromChannels))
				basePart.updateFromChannels();
			if (EipPackage.eINSTANCE.getAggregator_Part().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(EipViewsRepository.Resequencer.Properties.part))
				basePart.setPart((MessagePart)msg.getNewValue());
			
			if (EipPackage.eINSTANCE.getAggregator_Strategy().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EipViewsRepository.Resequencer.Properties.strategy)) {
				if (msg.getNewValue() != null) {
					basePart.setStrategy(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setStrategy("");
				}
			}
			if (EipPackage.eINSTANCE.getAggregator_Expression().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EipViewsRepository.Resequencer.Properties.expression)) {
				if (msg.getNewValue() != null) {
					basePart.setExpression(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setExpression("");
				}
			}
			if (EipPackage.eINSTANCE.getResequencer_StreamSequences().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EipViewsRepository.Resequencer.Properties.streamSequences))
				basePart.setStreamSequences((Boolean)msg.getNewValue());
			
			
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
			EipPackage.eINSTANCE.getEndpoint_ToChannel(),
			EipPackage.eINSTANCE.getEndpoint_FromChannels(),
			EipPackage.eINSTANCE.getAggregator_Part(),
			EipPackage.eINSTANCE.getAggregator_Strategy(),
			EipPackage.eINSTANCE.getAggregator_Expression(),
			EipPackage.eINSTANCE.getResequencer_StreamSequences()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EipViewsRepository.Resequencer.Properties.name;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == EipViewsRepository.Resequencer.Properties.streamSequences)
			return ""; //$NON-NLS-1$
		return super.getHelpContent(key, kind);
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
				if (EipViewsRepository.Resequencer.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EipPackage.eINSTANCE.getEndpoint_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EipPackage.eINSTANCE.getEndpoint_Name().getEAttributeType(), newValue);
				}
				if (EipViewsRepository.Resequencer.Properties.part == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EipPackage.eINSTANCE.getAggregator_Part().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EipPackage.eINSTANCE.getAggregator_Part().getEAttributeType(), newValue);
				}
				if (EipViewsRepository.Resequencer.Properties.strategy == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EipPackage.eINSTANCE.getAggregator_Strategy().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EipPackage.eINSTANCE.getAggregator_Strategy().getEAttributeType(), newValue);
				}
				if (EipViewsRepository.Resequencer.Properties.expression == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EipPackage.eINSTANCE.getAggregator_Expression().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EipPackage.eINSTANCE.getAggregator_Expression().getEAttributeType(), newValue);
				}
				if (EipViewsRepository.Resequencer.Properties.streamSequences == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EipPackage.eINSTANCE.getResequencer_StreamSequences().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EipPackage.eINSTANCE.getResequencer_StreamSequences().getEAttributeType(), newValue);
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
