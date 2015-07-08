/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.parts.forms;

// Start of user code for imports
import com.github.lbroudoux.dsl.eip.parts.ChannelPropertiesEditionPart;
import com.github.lbroudoux.dsl.eip.parts.EipViewsRepository;

import com.github.lbroudoux.dsl.eip.providers.EipMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

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
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * @author yanngv29
 * 
 */
public class ChannelPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ChannelPropertiesEditionPart {

	protected EObjectFlatComboViewer toEndpoint;
	protected EObjectFlatComboViewer fromEndpoint;
	protected Text name;
	protected Button guaranteed;



	/**
	 * For {@link ISection} use only.
	 */
	public ChannelPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ChannelPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
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
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EipViewsRepository.Channel.Properties.toEndpoint) {
					return createToEndpointFlatComboViewer(parent, widgetFactory);
				}
				if (key == EipViewsRepository.Channel.Properties.fromEndpoint) {
					return createFromEndpointFlatComboViewer(parent, widgetFactory);
				}
				if (key == EipViewsRepository.Channel.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == EipViewsRepository.Channel.Properties.guaranteed) {
					return createGuaranteedCheckbox(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(EipMessages.ChannelPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createToEndpointFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, EipViewsRepository.Channel.Properties.toEndpoint, EipMessages.ChannelPropertiesEditionPart_ToEndpointLabel);
		toEndpoint = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EipViewsRepository.Channel.Properties.toEndpoint, EipViewsRepository.FORM_KIND));
		widgetFactory.adapt(toEndpoint);
		toEndpoint.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData toEndpointData = new GridData(GridData.FILL_HORIZONTAL);
		toEndpoint.setLayoutData(toEndpointData);
		toEndpoint.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChannelPropertiesEditionPartForm.this, EipViewsRepository.Channel.Properties.toEndpoint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getToEndpoint()));
			}

		});
		toEndpoint.setID(EipViewsRepository.Channel.Properties.toEndpoint);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.Channel.Properties.toEndpoint, EipViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createToEndpointFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createFromEndpointFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, EipViewsRepository.Channel.Properties.fromEndpoint, EipMessages.ChannelPropertiesEditionPart_FromEndpointLabel);
		fromEndpoint = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EipViewsRepository.Channel.Properties.fromEndpoint, EipViewsRepository.FORM_KIND));
		widgetFactory.adapt(fromEndpoint);
		fromEndpoint.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData fromEndpointData = new GridData(GridData.FILL_HORIZONTAL);
		fromEndpoint.setLayoutData(fromEndpointData);
		fromEndpoint.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChannelPropertiesEditionPartForm.this, EipViewsRepository.Channel.Properties.fromEndpoint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getFromEndpoint()));
			}

		});
		fromEndpoint.setID(EipViewsRepository.Channel.Properties.fromEndpoint);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.Channel.Properties.fromEndpoint, EipViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createFromEndpointFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EipViewsRepository.Channel.Properties.name, EipMessages.ChannelPropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ChannelPropertiesEditionPartForm.this,
							EipViewsRepository.Channel.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ChannelPropertiesEditionPartForm.this,
									EipViewsRepository.Channel.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ChannelPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChannelPropertiesEditionPartForm.this, EipViewsRepository.Channel.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, EipViewsRepository.Channel.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.Channel.Properties.name, EipViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createGuaranteedCheckbox(FormToolkit widgetFactory, Composite parent) {
		guaranteed = widgetFactory.createButton(parent, getDescription(EipViewsRepository.Channel.Properties.guaranteed, EipMessages.ChannelPropertiesEditionPart_GuaranteedLabel), SWT.CHECK);
		guaranteed.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChannelPropertiesEditionPartForm.this, EipViewsRepository.Channel.Properties.guaranteed, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(guaranteed.getSelection())));
			}

		});
		GridData guaranteedData = new GridData(GridData.FILL_HORIZONTAL);
		guaranteedData.horizontalSpan = 2;
		guaranteed.setLayoutData(guaranteedData);
		EditingUtils.setID(guaranteed, EipViewsRepository.Channel.Properties.guaranteed);
		EditingUtils.setEEFtype(guaranteed, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.Channel.Properties.guaranteed, EipViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
