/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.parts.forms;

// Start of user code for imports
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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;

import com.github.lbroudoux.dsl.eip.parts.EipViewsRepository;
import com.github.lbroudoux.dsl.eip.parts.ServiceInvocationPropertiesEditionPart;
import com.github.lbroudoux.dsl.eip.providers.EipMessages;

// End of user code

/**
 * @author yanngv29
 * 
 */
public class ServiceInvocationPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ServiceInvocationPropertiesEditionPart {

	protected Text context;
	protected Text operationName;
	protected EObjectFlatComboViewer serviceRef;



	/**
	 * For {@link ISection} use only.
	 */
	public ServiceInvocationPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ServiceInvocationPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence serviceInvocationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = serviceInvocationStep.addStep(EipViewsRepository.ServiceInvocation.Properties.class);
		propertiesStep.addStep(EipViewsRepository.ServiceInvocation.Properties.context);
		propertiesStep.addStep(EipViewsRepository.ServiceInvocation.Properties.operationName);
		propertiesStep.addStep(EipViewsRepository.ServiceInvocation.Properties.serviceRef);
		
		
		composer = new PartComposer(serviceInvocationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EipViewsRepository.ServiceInvocation.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EipViewsRepository.ServiceInvocation.Properties.context) {
					return createContextText(widgetFactory, parent);
				}
				if (key == EipViewsRepository.ServiceInvocation.Properties.operationName) {
					return createOperationNameText(widgetFactory, parent);
				}
				if (key == EipViewsRepository.ServiceInvocation.Properties.serviceRef) {
					return createServiceRefFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(EipMessages.ServiceInvocationPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createContextText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EipViewsRepository.ServiceInvocation.Properties.context, EipMessages.ServiceInvocationPropertiesEditionPart_ContextLabel);
		context = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		context.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData contextData = new GridData(GridData.FILL_HORIZONTAL);
		context.setLayoutData(contextData);
		context.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ServiceInvocationPropertiesEditionPartForm.this,
							EipViewsRepository.ServiceInvocation.Properties.context,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, context.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ServiceInvocationPropertiesEditionPartForm.this,
									EipViewsRepository.ServiceInvocation.Properties.context,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, context.getText()));
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
									ServiceInvocationPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		context.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServiceInvocationPropertiesEditionPartForm.this, EipViewsRepository.ServiceInvocation.Properties.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, context.getText()));
				}
			}
		});
		EditingUtils.setID(context, EipViewsRepository.ServiceInvocation.Properties.context);
		EditingUtils.setEEFtype(context, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.ServiceInvocation.Properties.context, EipViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createContextText

		// End of user code
		return parent;
	}

	
	protected Composite createOperationNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EipViewsRepository.ServiceInvocation.Properties.operationName, EipMessages.ServiceInvocationPropertiesEditionPart_OperationNameLabel);
		operationName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		operationName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData operationNameData = new GridData(GridData.FILL_HORIZONTAL);
		operationName.setLayoutData(operationNameData);
		operationName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ServiceInvocationPropertiesEditionPartForm.this,
							EipViewsRepository.ServiceInvocation.Properties.operationName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, operationName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ServiceInvocationPropertiesEditionPartForm.this,
									EipViewsRepository.ServiceInvocation.Properties.operationName,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, operationName.getText()));
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
									ServiceInvocationPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		operationName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServiceInvocationPropertiesEditionPartForm.this, EipViewsRepository.ServiceInvocation.Properties.operationName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, operationName.getText()));
				}
			}
		});
		EditingUtils.setID(operationName, EipViewsRepository.ServiceInvocation.Properties.operationName);
		EditingUtils.setEEFtype(operationName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.ServiceInvocation.Properties.operationName, EipViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createOperationNameText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createServiceRefFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, EipViewsRepository.ServiceInvocation.Properties.serviceRef, EipMessages.ServiceInvocationPropertiesEditionPart_ServiceRefLabel);
		serviceRef = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EipViewsRepository.ServiceInvocation.Properties.serviceRef, EipViewsRepository.FORM_KIND));
		widgetFactory.adapt(serviceRef);
		serviceRef.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData serviceRefData = new GridData(GridData.FILL_HORIZONTAL);
		serviceRef.setLayoutData(serviceRefData);
		serviceRef.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServiceInvocationPropertiesEditionPartForm.this, EipViewsRepository.ServiceInvocation.Properties.serviceRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getServiceRef()));
			}

		});
		serviceRef.setID(EipViewsRepository.ServiceInvocation.Properties.serviceRef);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.ServiceInvocation.Properties.serviceRef, EipViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createServiceRefFlatComboViewer

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
	 * @see com.github.lbroudoux.dsl.eip.parts.ServiceInvocationPropertiesEditionPart#getContext()
	 * 
	 */
	public String getContext() {
		return context.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ServiceInvocationPropertiesEditionPart#setContext(String newValue)
	 * 
	 */
	public void setContext(String newValue) {
		if (newValue != null) {
			context.setText(newValue);
		} else {
			context.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.ServiceInvocation.Properties.context);
		if (eefElementEditorReadOnlyState && context.isEnabled()) {
			context.setEnabled(false);
			context.setToolTipText(EipMessages.ServiceInvocation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !context.isEnabled()) {
			context.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ServiceInvocationPropertiesEditionPart#getOperationName()
	 * 
	 */
	public String getOperationName() {
		return operationName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ServiceInvocationPropertiesEditionPart#setOperationName(String newValue)
	 * 
	 */
	public void setOperationName(String newValue) {
		if (newValue != null) {
			operationName.setText(newValue);
		} else {
			operationName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.ServiceInvocation.Properties.operationName);
		if (eefElementEditorReadOnlyState && operationName.isEnabled()) {
			operationName.setEnabled(false);
			operationName.setToolTipText(EipMessages.ServiceInvocation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !operationName.isEnabled()) {
			operationName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ServiceInvocationPropertiesEditionPart#getServiceRef()
	 * 
	 */
	public EObject getServiceRef() {
		if (serviceRef.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) serviceRef.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ServiceInvocationPropertiesEditionPart#initServiceRef(EObjectFlatComboSettings)
	 */
	public void initServiceRef(EObjectFlatComboSettings settings) {
		serviceRef.setInput(settings);
		if (current != null) {
			serviceRef.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.ServiceInvocation.Properties.serviceRef);
		if (eefElementEditorReadOnlyState && serviceRef.isEnabled()) {
			serviceRef.setEnabled(false);
			serviceRef.setToolTipText(EipMessages.ServiceInvocation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !serviceRef.isEnabled()) {
			serviceRef.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ServiceInvocationPropertiesEditionPart#setServiceRef(EObject newValue)
	 * 
	 */
	public void setServiceRef(EObject newValue) {
		if (newValue != null) {
			serviceRef.setSelection(new StructuredSelection(newValue));
		} else {
			serviceRef.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.ServiceInvocation.Properties.serviceRef);
		if (eefElementEditorReadOnlyState && serviceRef.isEnabled()) {
			serviceRef.setEnabled(false);
			serviceRef.setToolTipText(EipMessages.ServiceInvocation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !serviceRef.isEnabled()) {
			serviceRef.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ServiceInvocationPropertiesEditionPart#setServiceRefButtonMode(ButtonsModeEnum newValue)
	 */
	public void setServiceRefButtonMode(ButtonsModeEnum newValue) {
		serviceRef.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ServiceInvocationPropertiesEditionPart#addFilterServiceRef(ViewerFilter filter)
	 * 
	 */
	public void addFilterToServiceRef(ViewerFilter filter) {
		serviceRef.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ServiceInvocationPropertiesEditionPart#addBusinessFilterServiceRef(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToServiceRef(ViewerFilter filter) {
		serviceRef.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EipMessages.ServiceInvocation_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
