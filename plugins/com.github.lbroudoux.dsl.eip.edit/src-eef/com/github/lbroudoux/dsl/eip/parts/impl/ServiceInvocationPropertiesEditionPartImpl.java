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

import com.github.lbroudoux.dsl.eip.parts.EipViewsRepository;
import com.github.lbroudoux.dsl.eip.parts.ServiceInvocationPropertiesEditionPart;
import com.github.lbroudoux.dsl.eip.providers.EipMessages;

// End of user code

/**
 * @author yanngv29
 * 
 */
public class ServiceInvocationPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ServiceInvocationPropertiesEditionPart {

	protected Text context;
	protected Text operationName;
	protected EObjectFlatComboViewer serviceRef;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ServiceInvocationPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence serviceInvocationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = serviceInvocationStep.addStep(EipViewsRepository.ServiceInvocation.Properties.class);
		propertiesStep.addStep(EipViewsRepository.ServiceInvocation.Properties.context);
		propertiesStep.addStep(EipViewsRepository.ServiceInvocation.Properties.operationName);
		propertiesStep.addStep(EipViewsRepository.ServiceInvocation.Properties.serviceRef);
		
		
		composer = new PartComposer(serviceInvocationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EipViewsRepository.ServiceInvocation.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EipViewsRepository.ServiceInvocation.Properties.context) {
					return createContextText(parent);
				}
				if (key == EipViewsRepository.ServiceInvocation.Properties.operationName) {
					return createOperationNameText(parent);
				}
				if (key == EipViewsRepository.ServiceInvocation.Properties.serviceRef) {
					return createServiceRefFlatComboViewer(parent);
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
		propertiesGroup.setText(EipMessages.ServiceInvocationPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createContextText(Composite parent) {
		createDescription(parent, EipViewsRepository.ServiceInvocation.Properties.context, EipMessages.ServiceInvocationPropertiesEditionPart_ContextLabel);
		context = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData contextData = new GridData(GridData.FILL_HORIZONTAL);
		context.setLayoutData(contextData);
		context.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServiceInvocationPropertiesEditionPartImpl.this, EipViewsRepository.ServiceInvocation.Properties.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, context.getText()));
			}

		});
		context.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServiceInvocationPropertiesEditionPartImpl.this, EipViewsRepository.ServiceInvocation.Properties.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, context.getText()));
				}
			}

		});
		EditingUtils.setID(context, EipViewsRepository.ServiceInvocation.Properties.context);
		EditingUtils.setEEFtype(context, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.ServiceInvocation.Properties.context, EipViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createContextText

		// End of user code
		return parent;
	}

	
	protected Composite createOperationNameText(Composite parent) {
		createDescription(parent, EipViewsRepository.ServiceInvocation.Properties.operationName, EipMessages.ServiceInvocationPropertiesEditionPart_OperationNameLabel);
		operationName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData operationNameData = new GridData(GridData.FILL_HORIZONTAL);
		operationName.setLayoutData(operationNameData);
		operationName.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServiceInvocationPropertiesEditionPartImpl.this, EipViewsRepository.ServiceInvocation.Properties.operationName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, operationName.getText()));
			}

		});
		operationName.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServiceInvocationPropertiesEditionPartImpl.this, EipViewsRepository.ServiceInvocation.Properties.operationName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, operationName.getText()));
				}
			}

		});
		EditingUtils.setID(operationName, EipViewsRepository.ServiceInvocation.Properties.operationName);
		EditingUtils.setEEFtype(operationName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.ServiceInvocation.Properties.operationName, EipViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createOperationNameText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createServiceRefFlatComboViewer(Composite parent) {
		createDescription(parent, EipViewsRepository.ServiceInvocation.Properties.serviceRef, EipMessages.ServiceInvocationPropertiesEditionPart_ServiceRefLabel);
		serviceRef = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EipViewsRepository.ServiceInvocation.Properties.serviceRef, EipViewsRepository.SWT_KIND));
		serviceRef.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		serviceRef.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServiceInvocationPropertiesEditionPartImpl.this, EipViewsRepository.ServiceInvocation.Properties.serviceRef, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getServiceRef()));
			}

		});
		GridData serviceRefData = new GridData(GridData.FILL_HORIZONTAL);
		serviceRef.setLayoutData(serviceRefData);
		serviceRef.setID(EipViewsRepository.ServiceInvocation.Properties.serviceRef);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.ServiceInvocation.Properties.serviceRef, EipViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
