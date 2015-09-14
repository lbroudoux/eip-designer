/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.parts.impl;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import com.github.lbroudoux.dsl.eip.parts.ConditionalRoutePropertiesEditionPart;
import com.github.lbroudoux.dsl.eip.parts.EipViewsRepository;
import com.github.lbroudoux.dsl.eip.providers.EipMessages;

// End of user code

/**
 * @author yanngv29
 * 
 */
public class ConditionalRoutePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ConditionalRoutePropertiesEditionPart {

	protected Text condition;
	protected EObjectFlatComboViewer channel;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ConditionalRoutePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence conditionalRouteStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = conditionalRouteStep.addStep(EipViewsRepository.ConditionalRoute.Properties.class);
		propertiesStep.addStep(EipViewsRepository.ConditionalRoute.Properties.condition);
		propertiesStep.addStep(EipViewsRepository.ConditionalRoute.Properties.channel);
		
		
		composer = new PartComposer(conditionalRouteStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EipViewsRepository.ConditionalRoute.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EipViewsRepository.ConditionalRoute.Properties.condition) {
					return createConditionText(parent);
				}
				if (key == EipViewsRepository.ConditionalRoute.Properties.channel) {
					return createChannelFlatComboViewer(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(EipMessages.ConditionalRoutePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createConditionText(Composite parent) {
		createDescription(parent, EipViewsRepository.ConditionalRoute.Properties.condition, EipMessages.ConditionalRoutePropertiesEditionPart_ConditionLabel);
		condition = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData conditionData = new GridData(GridData.FILL_HORIZONTAL);
		condition.setLayoutData(conditionData);
		condition.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConditionalRoutePropertiesEditionPartImpl.this, EipViewsRepository.ConditionalRoute.Properties.condition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, condition.getText()));
			}

		});
		condition.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConditionalRoutePropertiesEditionPartImpl.this, EipViewsRepository.ConditionalRoute.Properties.condition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, condition.getText()));
				}
			}

		});
		EditingUtils.setID(condition, EipViewsRepository.ConditionalRoute.Properties.condition);
		EditingUtils.setEEFtype(condition, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.ConditionalRoute.Properties.condition, EipViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createConditionText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createChannelFlatComboViewer(Composite parent) {
		createDescription(parent, EipViewsRepository.ConditionalRoute.Properties.channel, EipMessages.ConditionalRoutePropertiesEditionPart_ChannelLabel);
		channel = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EipViewsRepository.ConditionalRoute.Properties.channel, EipViewsRepository.SWT_KIND));
		channel.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		channel.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConditionalRoutePropertiesEditionPartImpl.this, EipViewsRepository.ConditionalRoute.Properties.channel, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getChannel()));
			}

		});
		GridData channelData = new GridData(GridData.FILL_HORIZONTAL);
		channel.setLayoutData(channelData);
		channel.setID(EipViewsRepository.ConditionalRoute.Properties.channel);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.ConditionalRoute.Properties.channel, EipViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createChannelFlatComboViewer

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ConditionalRoutePropertiesEditionPart#getCondition()
	 * 
	 */
	public String getCondition() {
		return condition.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ConditionalRoutePropertiesEditionPart#setCondition(String newValue)
	 * 
	 */
	public void setCondition(String newValue) {
		if (newValue != null) {
			condition.setText(newValue);
		} else {
			condition.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.ConditionalRoute.Properties.condition);
		if (eefElementEditorReadOnlyState && condition.isEnabled()) {
			condition.setEnabled(false);
			condition.setToolTipText(EipMessages.ConditionalRoute_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !condition.isEnabled()) {
			condition.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ConditionalRoutePropertiesEditionPart#getChannel()
	 * 
	 */
	public EObject getChannel() {
		if (channel.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) channel.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ConditionalRoutePropertiesEditionPart#initChannel(EObjectFlatComboSettings)
	 */
	public void initChannel(EObjectFlatComboSettings settings) {
		channel.setInput(settings);
		if (current != null) {
			channel.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.ConditionalRoute.Properties.channel);
		if (eefElementEditorReadOnlyState && channel.isEnabled()) {
			channel.setEnabled(false);
			channel.setToolTipText(EipMessages.ConditionalRoute_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !channel.isEnabled()) {
			channel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ConditionalRoutePropertiesEditionPart#setChannel(EObject newValue)
	 * 
	 */
	public void setChannel(EObject newValue) {
		if (newValue != null) {
			channel.setSelection(new StructuredSelection(newValue));
		} else {
			channel.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.ConditionalRoute.Properties.channel);
		if (eefElementEditorReadOnlyState && channel.isEnabled()) {
			channel.setEnabled(false);
			channel.setToolTipText(EipMessages.ConditionalRoute_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !channel.isEnabled()) {
			channel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ConditionalRoutePropertiesEditionPart#setChannelButtonMode(ButtonsModeEnum newValue)
	 */
	public void setChannelButtonMode(ButtonsModeEnum newValue) {
		channel.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ConditionalRoutePropertiesEditionPart#addFilterChannel(ViewerFilter filter)
	 * 
	 */
	public void addFilterToChannel(ViewerFilter filter) {
		channel.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ConditionalRoutePropertiesEditionPart#addBusinessFilterChannel(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToChannel(ViewerFilter filter) {
		channel.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EipMessages.ConditionalRoute_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
