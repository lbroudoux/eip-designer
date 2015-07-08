/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.parts.forms;

// Start of user code for imports
import com.github.lbroudoux.dsl.eip.parts.EipViewsRepository;
import com.github.lbroudoux.dsl.eip.parts.RoutePropertiesEditionPart;

import com.github.lbroudoux.dsl.eip.providers.EipMessages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EcoreAdapterFactory;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

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

import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ArrayContentProvider;
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
public class RoutePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, RoutePropertiesEditionPart {

	protected Text name;
	protected ReferencesTable ownedServiceRefs;
	protected List<ViewerFilter> ownedServiceRefsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedServiceRefsFilters = new ArrayList<ViewerFilter>();
	protected EMFComboViewer exchangeType;



	/**
	 * For {@link ISection} use only.
	 */
	public RoutePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RoutePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence routeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = routeStep.addStep(EipViewsRepository.Route.Properties.class);
		propertiesStep.addStep(EipViewsRepository.Route.Properties.name);
		propertiesStep.addStep(EipViewsRepository.Route.Properties.ownedServiceRefs);
		propertiesStep.addStep(EipViewsRepository.Route.Properties.exchangeType);
		
		
		composer = new PartComposer(routeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EipViewsRepository.Route.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EipViewsRepository.Route.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == EipViewsRepository.Route.Properties.ownedServiceRefs) {
					return createOwnedServiceRefsTableComposition(widgetFactory, parent);
				}
				if (key == EipViewsRepository.Route.Properties.exchangeType) {
					return createExchangeTypeEMFComboViewer(widgetFactory, parent);
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
		propertiesSection.setText(EipMessages.RoutePropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, EipViewsRepository.Route.Properties.name, EipMessages.RoutePropertiesEditionPart_NameLabel);
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
							RoutePropertiesEditionPartForm.this,
							EipViewsRepository.Route.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									RoutePropertiesEditionPartForm.this,
									EipViewsRepository.Route.Properties.name,
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
									RoutePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoutePropertiesEditionPartForm.this, EipViewsRepository.Route.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, EipViewsRepository.Route.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.Route.Properties.name, EipViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedServiceRefsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.ownedServiceRefs = new ReferencesTable(getDescription(EipViewsRepository.Route.Properties.ownedServiceRefs, EipMessages.RoutePropertiesEditionPart_OwnedServiceRefsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoutePropertiesEditionPartForm.this, EipViewsRepository.Route.Properties.ownedServiceRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ownedServiceRefs.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoutePropertiesEditionPartForm.this, EipViewsRepository.Route.Properties.ownedServiceRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ownedServiceRefs.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoutePropertiesEditionPartForm.this, EipViewsRepository.Route.Properties.ownedServiceRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ownedServiceRefs.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoutePropertiesEditionPartForm.this, EipViewsRepository.Route.Properties.ownedServiceRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ownedServiceRefs.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.ownedServiceRefsFilters) {
			this.ownedServiceRefs.addFilter(filter);
		}
		this.ownedServiceRefs.setHelpText(propertiesEditionComponent.getHelpContent(EipViewsRepository.Route.Properties.ownedServiceRefs, EipViewsRepository.FORM_KIND));
		this.ownedServiceRefs.createControls(parent, widgetFactory);
		this.ownedServiceRefs.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoutePropertiesEditionPartForm.this, EipViewsRepository.Route.Properties.ownedServiceRefs, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ownedServiceRefsData = new GridData(GridData.FILL_HORIZONTAL);
		ownedServiceRefsData.horizontalSpan = 3;
		this.ownedServiceRefs.setLayoutData(ownedServiceRefsData);
		this.ownedServiceRefs.setLowerBound(0);
		this.ownedServiceRefs.setUpperBound(-1);
		ownedServiceRefs.setID(EipViewsRepository.Route.Properties.ownedServiceRefs);
		ownedServiceRefs.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedServiceRefsTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createExchangeTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EipViewsRepository.Route.Properties.exchangeType, EipMessages.RoutePropertiesEditionPart_ExchangeTypeLabel);
		exchangeType = new EMFComboViewer(parent);
		exchangeType.setContentProvider(new ArrayContentProvider());
		exchangeType.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData exchangeTypeData = new GridData(GridData.FILL_HORIZONTAL);
		exchangeType.getCombo().setLayoutData(exchangeTypeData);
		exchangeType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoutePropertiesEditionPartForm.this, EipViewsRepository.Route.Properties.exchangeType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getExchangeType()));
			}

		});
		exchangeType.setID(EipViewsRepository.Route.Properties.exchangeType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.Route.Properties.exchangeType, EipViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createExchangeTypeEMFComboViewer

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
	 * @see com.github.lbroudoux.dsl.eip.parts.RoutePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RoutePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Route.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(EipMessages.Route_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RoutePropertiesEditionPart#initOwnedServiceRefs(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedServiceRefs(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedServiceRefs.setContentProvider(contentProvider);
		ownedServiceRefs.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Route.Properties.ownedServiceRefs);
		if (eefElementEditorReadOnlyState && ownedServiceRefs.isEnabled()) {
			ownedServiceRefs.setEnabled(false);
			ownedServiceRefs.setToolTipText(EipMessages.Route_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedServiceRefs.isEnabled()) {
			ownedServiceRefs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RoutePropertiesEditionPart#updateOwnedServiceRefs()
	 * 
	 */
	public void updateOwnedServiceRefs() {
	ownedServiceRefs.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RoutePropertiesEditionPart#addFilterOwnedServiceRefs(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOwnedServiceRefs(ViewerFilter filter) {
		ownedServiceRefsFilters.add(filter);
		if (this.ownedServiceRefs != null) {
			this.ownedServiceRefs.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RoutePropertiesEditionPart#addBusinessFilterOwnedServiceRefs(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwnedServiceRefs(ViewerFilter filter) {
		ownedServiceRefsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RoutePropertiesEditionPart#isContainedInOwnedServiceRefsTable(EObject element)
	 * 
	 */
	public boolean isContainedInOwnedServiceRefsTable(EObject element) {
		return ((ReferencesTableSettings)ownedServiceRefs.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RoutePropertiesEditionPart#getExchangeType()
	 * 
	 */
	public Enumerator getExchangeType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) exchangeType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RoutePropertiesEditionPart#initExchangeType(Object input, Enumerator current)
	 */
	public void initExchangeType(Object input, Enumerator current) {
		exchangeType.setInput(input);
		exchangeType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Route.Properties.exchangeType);
		if (eefElementEditorReadOnlyState && exchangeType.isEnabled()) {
			exchangeType.setEnabled(false);
			exchangeType.setToolTipText(EipMessages.Route_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !exchangeType.isEnabled()) {
			exchangeType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RoutePropertiesEditionPart#setExchangeType(Enumerator newValue)
	 * 
	 */
	public void setExchangeType(Enumerator newValue) {
		exchangeType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Route.Properties.exchangeType);
		if (eefElementEditorReadOnlyState && exchangeType.isEnabled()) {
			exchangeType.setEnabled(false);
			exchangeType.setToolTipText(EipMessages.Route_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !exchangeType.isEnabled()) {
			exchangeType.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EipMessages.Route_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
