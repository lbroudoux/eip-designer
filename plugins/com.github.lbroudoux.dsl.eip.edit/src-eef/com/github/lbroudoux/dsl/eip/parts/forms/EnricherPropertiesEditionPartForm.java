/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.parts.forms;

// Start of user code for imports
import com.github.lbroudoux.dsl.eip.parts.EipViewsRepository;
import com.github.lbroudoux.dsl.eip.parts.EnricherPropertiesEditionPart;

import com.github.lbroudoux.dsl.eip.providers.EipMessages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EcoreAdapterFactory;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
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
public class EnricherPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, EnricherPropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer toChannel;
	protected ReferencesTable fromChannels;
	protected List<ViewerFilter> fromChannelsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> fromChannelsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ownedServiceInvocations;
	protected List<ViewerFilter> ownedServiceInvocationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedServiceInvocationsFilters = new ArrayList<ViewerFilter>();
	protected EMFComboViewer part;



	/**
	 * For {@link ISection} use only.
	 */
	public EnricherPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EnricherPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence enricherStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = enricherStep.addStep(EipViewsRepository.Enricher.Properties.class);
		propertiesStep.addStep(EipViewsRepository.Enricher.Properties.name);
		propertiesStep.addStep(EipViewsRepository.Enricher.Properties.toChannel);
		propertiesStep.addStep(EipViewsRepository.Enricher.Properties.fromChannels);
		propertiesStep.addStep(EipViewsRepository.Enricher.Properties.ownedServiceInvocations);
		propertiesStep.addStep(EipViewsRepository.Enricher.Properties.part);
		
		
		composer = new PartComposer(enricherStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EipViewsRepository.Enricher.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EipViewsRepository.Enricher.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == EipViewsRepository.Enricher.Properties.toChannel) {
					return createToChannelFlatComboViewer(parent, widgetFactory);
				}
				if (key == EipViewsRepository.Enricher.Properties.fromChannels) {
					return createFromChannelsReferencesTable(widgetFactory, parent);
				}
				if (key == EipViewsRepository.Enricher.Properties.ownedServiceInvocations) {
					return createOwnedServiceInvocationsTableComposition(widgetFactory, parent);
				}
				if (key == EipViewsRepository.Enricher.Properties.part) {
					return createPartEMFComboViewer(widgetFactory, parent);
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
		propertiesSection.setText(EipMessages.EnricherPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, EipViewsRepository.Enricher.Properties.name, EipMessages.EnricherPropertiesEditionPart_NameLabel);
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
							EnricherPropertiesEditionPartForm.this,
							EipViewsRepository.Enricher.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EnricherPropertiesEditionPartForm.this,
									EipViewsRepository.Enricher.Properties.name,
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
									EnricherPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnricherPropertiesEditionPartForm.this, EipViewsRepository.Enricher.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, EipViewsRepository.Enricher.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.Enricher.Properties.name, EipViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createToChannelFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, EipViewsRepository.Enricher.Properties.toChannel, EipMessages.EnricherPropertiesEditionPart_ToChannelLabel);
		toChannel = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EipViewsRepository.Enricher.Properties.toChannel, EipViewsRepository.FORM_KIND));
		widgetFactory.adapt(toChannel);
		toChannel.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData toChannelData = new GridData(GridData.FILL_HORIZONTAL);
		toChannel.setLayoutData(toChannelData);
		toChannel.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnricherPropertiesEditionPartForm.this, EipViewsRepository.Enricher.Properties.toChannel, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getToChannel()));
			}

		});
		toChannel.setID(EipViewsRepository.Enricher.Properties.toChannel);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.Enricher.Properties.toChannel, EipViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createToChannelFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createFromChannelsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.fromChannels = new ReferencesTable(getDescription(EipViewsRepository.Enricher.Properties.fromChannels, EipMessages.EnricherPropertiesEditionPart_FromChannelsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addFromChannels(); }
			public void handleEdit(EObject element) { editFromChannels(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveFromChannels(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromFromChannels(element); }
			public void navigateTo(EObject element) { }
		});
		this.fromChannels.setHelpText(propertiesEditionComponent.getHelpContent(EipViewsRepository.Enricher.Properties.fromChannels, EipViewsRepository.FORM_KIND));
		this.fromChannels.createControls(parent, widgetFactory);
		this.fromChannels.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnricherPropertiesEditionPartForm.this, EipViewsRepository.Enricher.Properties.fromChannels, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData fromChannelsData = new GridData(GridData.FILL_HORIZONTAL);
		fromChannelsData.horizontalSpan = 3;
		this.fromChannels.setLayoutData(fromChannelsData);
		this.fromChannels.disableMove();
		fromChannels.setID(EipViewsRepository.Enricher.Properties.fromChannels);
		fromChannels.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createFromChannelsReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addFromChannels() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(fromChannels.getInput(), fromChannelsFilters, fromChannelsBusinessFilters,
		"fromChannels", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnricherPropertiesEditionPartForm.this, EipViewsRepository.Enricher.Properties.fromChannels,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				fromChannels.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveFromChannels(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnricherPropertiesEditionPartForm.this, EipViewsRepository.Enricher.Properties.fromChannels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		fromChannels.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromFromChannels(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnricherPropertiesEditionPartForm.this, EipViewsRepository.Enricher.Properties.fromChannels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		fromChannels.refresh();
	}

	/**
	 * 
	 */
	protected void editFromChannels(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				fromChannels.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedServiceInvocationsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.ownedServiceInvocations = new ReferencesTable(getDescription(EipViewsRepository.Enricher.Properties.ownedServiceInvocations, EipMessages.EnricherPropertiesEditionPart_OwnedServiceInvocationsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnricherPropertiesEditionPartForm.this, EipViewsRepository.Enricher.Properties.ownedServiceInvocations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ownedServiceInvocations.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnricherPropertiesEditionPartForm.this, EipViewsRepository.Enricher.Properties.ownedServiceInvocations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ownedServiceInvocations.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnricherPropertiesEditionPartForm.this, EipViewsRepository.Enricher.Properties.ownedServiceInvocations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ownedServiceInvocations.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnricherPropertiesEditionPartForm.this, EipViewsRepository.Enricher.Properties.ownedServiceInvocations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ownedServiceInvocations.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.ownedServiceInvocationsFilters) {
			this.ownedServiceInvocations.addFilter(filter);
		}
		this.ownedServiceInvocations.setHelpText(propertiesEditionComponent.getHelpContent(EipViewsRepository.Enricher.Properties.ownedServiceInvocations, EipViewsRepository.FORM_KIND));
		this.ownedServiceInvocations.createControls(parent, widgetFactory);
		this.ownedServiceInvocations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnricherPropertiesEditionPartForm.this, EipViewsRepository.Enricher.Properties.ownedServiceInvocations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ownedServiceInvocationsData = new GridData(GridData.FILL_HORIZONTAL);
		ownedServiceInvocationsData.horizontalSpan = 3;
		this.ownedServiceInvocations.setLayoutData(ownedServiceInvocationsData);
		this.ownedServiceInvocations.setLowerBound(0);
		this.ownedServiceInvocations.setUpperBound(-1);
		ownedServiceInvocations.setID(EipViewsRepository.Enricher.Properties.ownedServiceInvocations);
		ownedServiceInvocations.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedServiceInvocationsTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createPartEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EipViewsRepository.Enricher.Properties.part, EipMessages.EnricherPropertiesEditionPart_PartLabel);
		part = new EMFComboViewer(parent);
		part.setContentProvider(new ArrayContentProvider());
		part.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData partData = new GridData(GridData.FILL_HORIZONTAL);
		part.getCombo().setLayoutData(partData);
		part.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnricherPropertiesEditionPartForm.this, EipViewsRepository.Enricher.Properties.part, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPart()));
			}

		});
		part.setID(EipViewsRepository.Enricher.Properties.part);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.Enricher.Properties.part, EipViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPartEMFComboViewer

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
	 * @see com.github.lbroudoux.dsl.eip.parts.EnricherPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EnricherPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Enricher.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(EipMessages.Enricher_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EnricherPropertiesEditionPart#getToChannel()
	 * 
	 */
	public EObject getToChannel() {
		if (toChannel.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) toChannel.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EnricherPropertiesEditionPart#initToChannel(EObjectFlatComboSettings)
	 */
	public void initToChannel(EObjectFlatComboSettings settings) {
		toChannel.setInput(settings);
		if (current != null) {
			toChannel.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Enricher.Properties.toChannel);
		if (eefElementEditorReadOnlyState && toChannel.isEnabled()) {
			toChannel.setEnabled(false);
			toChannel.setToolTipText(EipMessages.Enricher_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !toChannel.isEnabled()) {
			toChannel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EnricherPropertiesEditionPart#setToChannel(EObject newValue)
	 * 
	 */
	public void setToChannel(EObject newValue) {
		if (newValue != null) {
			toChannel.setSelection(new StructuredSelection(newValue));
		} else {
			toChannel.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Enricher.Properties.toChannel);
		if (eefElementEditorReadOnlyState && toChannel.isEnabled()) {
			toChannel.setEnabled(false);
			toChannel.setToolTipText(EipMessages.Enricher_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !toChannel.isEnabled()) {
			toChannel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EnricherPropertiesEditionPart#setToChannelButtonMode(ButtonsModeEnum newValue)
	 */
	public void setToChannelButtonMode(ButtonsModeEnum newValue) {
		toChannel.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EnricherPropertiesEditionPart#addFilterToChannel(ViewerFilter filter)
	 * 
	 */
	public void addFilterToToChannel(ViewerFilter filter) {
		toChannel.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EnricherPropertiesEditionPart#addBusinessFilterToChannel(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToToChannel(ViewerFilter filter) {
		toChannel.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EnricherPropertiesEditionPart#initFromChannels(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initFromChannels(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		fromChannels.setContentProvider(contentProvider);
		fromChannels.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Enricher.Properties.fromChannels);
		if (eefElementEditorReadOnlyState && fromChannels.getTable().isEnabled()) {
			fromChannels.setEnabled(false);
			fromChannels.setToolTipText(EipMessages.Enricher_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fromChannels.getTable().isEnabled()) {
			fromChannels.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EnricherPropertiesEditionPart#updateFromChannels()
	 * 
	 */
	public void updateFromChannels() {
	fromChannels.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EnricherPropertiesEditionPart#addFilterFromChannels(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFromChannels(ViewerFilter filter) {
		fromChannelsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EnricherPropertiesEditionPart#addBusinessFilterFromChannels(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFromChannels(ViewerFilter filter) {
		fromChannelsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EnricherPropertiesEditionPart#isContainedInFromChannelsTable(EObject element)
	 * 
	 */
	public boolean isContainedInFromChannelsTable(EObject element) {
		return ((ReferencesTableSettings)fromChannels.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EnricherPropertiesEditionPart#initOwnedServiceInvocations(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedServiceInvocations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedServiceInvocations.setContentProvider(contentProvider);
		ownedServiceInvocations.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Enricher.Properties.ownedServiceInvocations);
		if (eefElementEditorReadOnlyState && ownedServiceInvocations.isEnabled()) {
			ownedServiceInvocations.setEnabled(false);
			ownedServiceInvocations.setToolTipText(EipMessages.Enricher_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedServiceInvocations.isEnabled()) {
			ownedServiceInvocations.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EnricherPropertiesEditionPart#updateOwnedServiceInvocations()
	 * 
	 */
	public void updateOwnedServiceInvocations() {
	ownedServiceInvocations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EnricherPropertiesEditionPart#addFilterOwnedServiceInvocations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOwnedServiceInvocations(ViewerFilter filter) {
		ownedServiceInvocationsFilters.add(filter);
		if (this.ownedServiceInvocations != null) {
			this.ownedServiceInvocations.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EnricherPropertiesEditionPart#addBusinessFilterOwnedServiceInvocations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwnedServiceInvocations(ViewerFilter filter) {
		ownedServiceInvocationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EnricherPropertiesEditionPart#isContainedInOwnedServiceInvocationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInOwnedServiceInvocationsTable(EObject element) {
		return ((ReferencesTableSettings)ownedServiceInvocations.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EnricherPropertiesEditionPart#getPart()
	 * 
	 */
	public Enumerator getPart() {
		Enumerator selection = (Enumerator) ((StructuredSelection) part.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EnricherPropertiesEditionPart#initPart(Object input, Enumerator current)
	 */
	public void initPart(Object input, Enumerator current) {
		part.setInput(input);
		part.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Enricher.Properties.part);
		if (eefElementEditorReadOnlyState && part.isEnabled()) {
			part.setEnabled(false);
			part.setToolTipText(EipMessages.Enricher_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !part.isEnabled()) {
			part.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EnricherPropertiesEditionPart#setPart(Enumerator newValue)
	 * 
	 */
	public void setPart(Enumerator newValue) {
		part.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Enricher.Properties.part);
		if (eefElementEditorReadOnlyState && part.isEnabled()) {
			part.setEnabled(false);
			part.setToolTipText(EipMessages.Enricher_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !part.isEnabled()) {
			part.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EipMessages.Enricher_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
