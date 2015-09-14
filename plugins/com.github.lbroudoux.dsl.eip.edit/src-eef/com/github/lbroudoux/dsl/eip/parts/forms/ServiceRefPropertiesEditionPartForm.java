/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.parts.forms;

// Start of user code for imports
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.jface.window.Window;
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
import org.eclipse.ui.views.properties.tabbed.ISection;

import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.parts.EipViewsRepository;
import com.github.lbroudoux.dsl.eip.parts.ServiceRefPropertiesEditionPart;
import com.github.lbroudoux.dsl.eip.providers.EipMessages;

// End of user code

/**
 * @author yanngv29
 * 
 */
public class ServiceRefPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ServiceRefPropertiesEditionPart {

	protected Text name;
	protected Text reference;
	protected Text operations;
	protected Button editOperations;
	private EList operationsList;



	/**
	 * For {@link ISection} use only.
	 */
	public ServiceRefPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ServiceRefPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence serviceRefStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = serviceRefStep.addStep(EipViewsRepository.ServiceRef.Properties.class);
		propertiesStep.addStep(EipViewsRepository.ServiceRef.Properties.name);
		propertiesStep.addStep(EipViewsRepository.ServiceRef.Properties.reference);
		propertiesStep.addStep(EipViewsRepository.ServiceRef.Properties.operations);
		
		
		composer = new PartComposer(serviceRefStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EipViewsRepository.ServiceRef.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EipViewsRepository.ServiceRef.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == EipViewsRepository.ServiceRef.Properties.reference) {
					return createReferenceText(widgetFactory, parent);
				}
				if (key == EipViewsRepository.ServiceRef.Properties.operations) {
					return createOperationsMultiValuedEditor(widgetFactory, parent);
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
		propertiesSection.setText(EipMessages.ServiceRefPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EipViewsRepository.ServiceRef.Properties.name, EipMessages.ServiceRefPropertiesEditionPart_NameLabel);
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
							ServiceRefPropertiesEditionPartForm.this,
							EipViewsRepository.ServiceRef.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ServiceRefPropertiesEditionPartForm.this,
									EipViewsRepository.ServiceRef.Properties.name,
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
									ServiceRefPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServiceRefPropertiesEditionPartForm.this, EipViewsRepository.ServiceRef.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, EipViewsRepository.ServiceRef.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.ServiceRef.Properties.name, EipViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createReferenceText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EipViewsRepository.ServiceRef.Properties.reference, EipMessages.ServiceRefPropertiesEditionPart_ReferenceLabel);
		reference = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		reference.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData referenceData = new GridData(GridData.FILL_HORIZONTAL);
		reference.setLayoutData(referenceData);
		reference.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ServiceRefPropertiesEditionPartForm.this,
							EipViewsRepository.ServiceRef.Properties.reference,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, reference.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ServiceRefPropertiesEditionPartForm.this,
									EipViewsRepository.ServiceRef.Properties.reference,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, reference.getText()));
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
									ServiceRefPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		reference.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServiceRefPropertiesEditionPartForm.this, EipViewsRepository.ServiceRef.Properties.reference, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, reference.getText()));
				}
			}
		});
		EditingUtils.setID(reference, EipViewsRepository.ServiceRef.Properties.reference);
		EditingUtils.setEEFtype(reference, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.ServiceRef.Properties.reference, EipViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createReferenceText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createOperationsMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		operations = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData operationsData = new GridData(GridData.FILL_HORIZONTAL);
		operationsData.horizontalSpan = 2;
		operations.setLayoutData(operationsData);
		EditingUtils.setID(operations, EipViewsRepository.ServiceRef.Properties.operations);
		EditingUtils.setEEFtype(operations, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editOperations = widgetFactory.createButton(parent, getDescription(EipViewsRepository.ServiceRef.Properties.operations, EipMessages.ServiceRefPropertiesEditionPart_OperationsLabel), SWT.NONE);
		GridData editOperationsData = new GridData();
		editOperations.setLayoutData(editOperationsData);
		editOperations.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						operations.getShell(), "ServiceRef", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						operationsList, EipPackage.eINSTANCE.getServiceRef_Operations().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					operationsList = dialog.getResult();
					if (operationsList == null) {
						operationsList = new BasicEList();
					}
					operations.setText(operationsList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServiceRefPropertiesEditionPartForm.this, EipViewsRepository.ServiceRef.Properties.operations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(operationsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editOperations, EipViewsRepository.ServiceRef.Properties.operations);
		EditingUtils.setEEFtype(editOperations, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createOperationsMultiValuedEditor

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
	 * @see com.github.lbroudoux.dsl.eip.parts.ServiceRefPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ServiceRefPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.ServiceRef.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(EipMessages.ServiceRef_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ServiceRefPropertiesEditionPart#getReference()
	 * 
	 */
	public String getReference() {
		return reference.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ServiceRefPropertiesEditionPart#setReference(String newValue)
	 * 
	 */
	public void setReference(String newValue) {
		if (newValue != null) {
			reference.setText(newValue);
		} else {
			reference.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.ServiceRef.Properties.reference);
		if (eefElementEditorReadOnlyState && reference.isEnabled()) {
			reference.setEnabled(false);
			reference.setToolTipText(EipMessages.ServiceRef_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !reference.isEnabled()) {
			reference.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ServiceRefPropertiesEditionPart#getOperations()
	 * 
	 */
	public EList getOperations() {
		return operationsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.ServiceRefPropertiesEditionPart#setOperations(EList newValue)
	 * 
	 */
	public void setOperations(EList newValue) {
		operationsList = newValue;
		if (newValue != null) {
			operations.setText(operationsList.toString());
		} else {
			operations.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.ServiceRef.Properties.operations);
		if (eefElementEditorReadOnlyState && operations.isEnabled()) {
			operations.setEnabled(false);
			operations.setToolTipText(EipMessages.ServiceRef_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !operations.isEnabled()) {
			operations.setEnabled(true);
		}	
		
	}

	public void addToOperations(Object newValue) {
		operationsList.add(newValue);
		if (newValue != null) {
			operations.setText(operationsList.toString());
		} else {
			operations.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToOperations(Object newValue) {
		operationsList.remove(newValue);
		if (newValue != null) {
			operations.setText(operationsList.toString());
		} else {
			operations.setText(""); //$NON-NLS-1$
		}
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EipMessages.ServiceRef_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
