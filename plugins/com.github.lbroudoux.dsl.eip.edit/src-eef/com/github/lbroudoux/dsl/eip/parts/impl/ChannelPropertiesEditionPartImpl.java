/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.parts.impl;

// Start of user code for imports
import com.github.lbroudoux.dsl.eip.parts.ChannelPropertiesEditionPart;
import com.github.lbroudoux.dsl.eip.parts.EipViewsRepository;

import com.github.lbroudoux.dsl.eip.providers.EipMessages;

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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * @author yanngv29
 * 
 */
public class ChannelPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ChannelPropertiesEditionPart {

	protected EObjectFlatComboViewer toEndpoint;
	protected EObjectFlatComboViewer fromEndpoint;
	protected Text name;
	protected Button guaranteed;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ChannelPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence channelStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = channelStep.addStep(EipViewsRepository.Channel.Properties.class);
		propertiesStep.addStep(EipViewsRepository.Channel.Properties.toEndpoint);
		propertiesStep.addStep(EipViewsRepository.Channel.Properties.fromEndpoint);
		propertiesStep.addStep(EipViewsRepository.Channel.Properties.name);
		propertiesStep.addStep(EipViewsRepository.Channel.Properties.guaranteed);
		
		
		composer = new PartComposer(channelStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EipViewsRepository.Channel.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EipViewsRepository.Channel.Properties.toEndpoint) {
					return createToEndpointFlatComboViewer(parent);
				}
				if (key == EipViewsRepository.Channel.Properties.fromEndpoint) {
					return createFromEndpointFlatComboViewer(parent);
				}
				if (key == EipViewsRepository.Channel.Properties.name) {
					return createNameText(parent);
				}
				if (key == EipViewsRepository.Channel.Properties.guaranteed) {
					return createGuaranteedCheckbox(parent);
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
		propertiesGroup.setText(EipMessages.ChannelPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createToEndpointFlatComboViewer(Composite parent) {
		createDescription(parent, EipViewsRepository.Channel.Properties.toEndpoint, EipMessages.ChannelPropertiesEditionPart_ToEndpointLabel);
		toEndpoint = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EipViewsRepository.Channel.Properties.toEndpoint, EipViewsRepository.SWT_KIND));
		toEndpoint.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		toEndpoint.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChannelPropertiesEditionPartImpl.this, EipViewsRepository.Channel.Properties.toEndpoint, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getToEndpoint()));
			}

		});
		GridData toEndpointData = new GridData(GridData.FILL_HORIZONTAL);
		toEndpoint.setLayoutData(toEndpointData);
		toEndpoint.setID(EipViewsRepository.Channel.Properties.toEndpoint);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.Channel.Properties.toEndpoint, EipViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createToEndpointFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createFromEndpointFlatComboViewer(Composite parent) {
		createDescription(parent, EipViewsRepository.Channel.Properties.fromEndpoint, EipMessages.ChannelPropertiesEditionPart_FromEndpointLabel);
		fromEndpoint = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EipViewsRepository.Channel.Properties.fromEndpoint, EipViewsRepository.SWT_KIND));
		fromEndpoint.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		fromEndpoint.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChannelPropertiesEditionPartImpl.this, EipViewsRepository.Channel.Properties.fromEndpoint, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getFromEndpoint()));
			}

		});
		GridData fromEndpointData = new GridData(GridData.FILL_HORIZONTAL);
		fromEndpoint.setLayoutData(fromEndpointData);
		fromEndpoint.setID(EipViewsRepository.Channel.Properties.fromEndpoint);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.Channel.Properties.fromEndpoint, EipViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createFromEndpointFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, EipViewsRepository.Channel.Properties.name, EipMessages.ChannelPropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChannelPropertiesEditionPartImpl.this, EipViewsRepository.Channel.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChannelPropertiesEditionPartImpl.this, EipViewsRepository.Channel.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, EipViewsRepository.Channel.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.Channel.Properties.name, EipViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createGuaranteedCheckbox(Composite parent) {
		guaranteed = new Button(parent, SWT.CHECK);
		guaranteed.setText(getDescription(EipViewsRepository.Channel.Properties.guaranteed, EipMessages.ChannelPropertiesEditionPart_GuaranteedLabel));
		guaranteed.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChannelPropertiesEditionPartImpl.this, EipViewsRepository.Channel.Properties.guaranteed, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(guaranteed.getSelection())));
			}

		});
		GridData guaranteedData = new GridData(GridData.FILL_HORIZONTAL);
		guaranteedData.horizontalSpan = 2;
		guaranteed.setLayoutData(guaranteedData);
		EditingUtils.setID(guaranteed, EipViewsRepository.Channel.Properties.guaranteed);
		EditingUtils.setEEFtype(guaranteed, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.Channel.Properties.guaranteed, EipViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createGuaranteedCheckbox

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
	 * @see com.github.lbroudoux.dsl.eip.parts.ChannelPropertiesEditionPart#getToEndpoint()
	 * 
	 */
	public EObject getToEndpoint() {
		if (toEndpoint.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) toEndpoint.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ChannelPropertiesEditionPart#initToEndpoint(EObjectFlatComboSettings)
	 */
	public void initToEndpoint(EObjectFlatComboSettings settings) {
		toEndpoint.setInput(settings);
		if (current != null) {
			toEndpoint.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Channel.Properties.toEndpoint);
		if (eefElementEditorReadOnlyState && toEndpoint.isEnabled()) {
			toEndpoint.setEnabled(false);
			toEndpoint.setToolTipText(EipMessages.Channel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !toEndpoint.isEnabled()) {
			toEndpoint.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ChannelPropertiesEditionPart#setToEndpoint(EObject newValue)
	 * 
	 */
	public void setToEndpoint(EObject newValue) {
		if (newValue != null) {
			toEndpoint.setSelection(new StructuredSelection(newValue));
		} else {
			toEndpoint.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Channel.Properties.toEndpoint);
		if (eefElementEditorReadOnlyState && toEndpoint.isEnabled()) {
			toEndpoint.setEnabled(false);
			toEndpoint.setToolTipText(EipMessages.Channel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !toEndpoint.isEnabled()) {
			toEndpoint.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ChannelPropertiesEditionPart#setToEndpointButtonMode(ButtonsModeEnum newValue)
	 */
	public void setToEndpointButtonMode(ButtonsModeEnum newValue) {
		toEndpoint.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ChannelPropertiesEditionPart#addFilterToEndpoint(ViewerFilter filter)
	 * 
	 */
	public void addFilterToToEndpoint(ViewerFilter filter) {
		toEndpoint.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ChannelPropertiesEditionPart#addBusinessFilterToEndpoint(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToToEndpoint(ViewerFilter filter) {
		toEndpoint.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ChannelPropertiesEditionPart#getFromEndpoint()
	 * 
	 */
	public EObject getFromEndpoint() {
		if (fromEndpoint.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) fromEndpoint.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ChannelPropertiesEditionPart#initFromEndpoint(EObjectFlatComboSettings)
	 */
	public void initFromEndpoint(EObjectFlatComboSettings settings) {
		fromEndpoint.setInput(settings);
		if (current != null) {
			fromEndpoint.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Channel.Properties.fromEndpoint);
		if (eefElementEditorReadOnlyState && fromEndpoint.isEnabled()) {
			fromEndpoint.setEnabled(false);
			fromEndpoint.setToolTipText(EipMessages.Channel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fromEndpoint.isEnabled()) {
			fromEndpoint.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ChannelPropertiesEditionPart#setFromEndpoint(EObject newValue)
	 * 
	 */
	public void setFromEndpoint(EObject newValue) {
		if (newValue != null) {
			fromEndpoint.setSelection(new StructuredSelection(newValue));
		} else {
			fromEndpoint.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Channel.Properties.fromEndpoint);
		if (eefElementEditorReadOnlyState && fromEndpoint.isEnabled()) {
			fromEndpoint.setEnabled(false);
			fromEndpoint.setToolTipText(EipMessages.Channel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fromEndpoint.isEnabled()) {
			fromEndpoint.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ChannelPropertiesEditionPart#setFromEndpointButtonMode(ButtonsModeEnum newValue)
	 */
	public void setFromEndpointButtonMode(ButtonsModeEnum newValue) {
		fromEndpoint.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ChannelPropertiesEditionPart#addFilterFromEndpoint(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFromEndpoint(ViewerFilter filter) {
		fromEndpoint.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ChannelPropertiesEditionPart#addBusinessFilterFromEndpoint(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFromEndpoint(ViewerFilter filter) {
		fromEndpoint.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ChannelPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ChannelPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Channel.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(EipMessages.Channel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ChannelPropertiesEditionPart#getGuaranteed()
	 * 
	 */
	public Boolean getGuaranteed() {
		return Boolean.valueOf(guaranteed.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ChannelPropertiesEditionPart#setGuaranteed(Boolean newValue)
	 * 
	 */
	public void setGuaranteed(Boolean newValue) {
		if (newValue != null) {
			guaranteed.setSelection(newValue.booleanValue());
		} else {
			guaranteed.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Channel.Properties.guaranteed);
		if (eefElementEditorReadOnlyState && guaranteed.isEnabled()) {
			guaranteed.setEnabled(false);
			guaranteed.setToolTipText(EipMessages.Channel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !guaranteed.isEnabled()) {
			guaranteed.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EipMessages.Channel_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
