/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.parts.forms;

// Start of user code for imports
import com.github.lbroudoux.dsl.eip.parts.EipViewsRepository;
import com.github.lbroudoux.dsl.eip.parts.SplitterPropertiesEditionPart;

import com.github.lbroudoux.dsl.eip.providers.EipMessages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

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
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

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
public class SplitterPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, SplitterPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable toChannels;
	protected List<ViewerFilter> toChannelsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> toChannelsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable fromChannels;
	protected List<ViewerFilter> fromChannelsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> fromChannelsFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public SplitterPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SplitterPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence splitterStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = splitterStep.addStep(EipViewsRepository.Splitter.Properties.class);
		propertiesStep.addStep(EipViewsRepository.Splitter.Properties.name);
		propertiesStep.addStep(EipViewsRepository.Splitter.Properties.toChannels);
		propertiesStep.addStep(EipViewsRepository.Splitter.Properties.fromChannels);
		
		
		composer = new PartComposer(splitterStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EipViewsRepository.Splitter.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EipViewsRepository.Splitter.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == EipViewsRepository.Splitter.Properties.toChannels) {
					return createToChannelsReferencesTable(widgetFactory, parent);
				}
				if (key == EipViewsRepository.Splitter.Properties.fromChannels) {
					return createFromChannelsReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(EipMessages.SplitterPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, EipViewsRepository.Splitter.Properties.name, EipMessages.SplitterPropertiesEditionPart_NameLabel);
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
							SplitterPropertiesEditionPartForm.this,
							EipViewsRepository.Splitter.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									SplitterPropertiesEditionPartForm.this,
									EipViewsRepository.Splitter.Properties.name,
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
									SplitterPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SplitterPropertiesEditionPartForm.this, EipViewsRepository.Splitter.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, EipViewsRepository.Splitter.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.Splitter.Properties.name, EipViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createToChannelsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.toChannels = new ReferencesTable(getDescription(EipViewsRepository.Splitter.Properties.toChannels, EipMessages.SplitterPropertiesEditionPart_ToChannelsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addToChannels(); }
			public void handleEdit(EObject element) { editToChannels(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveToChannels(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromToChannels(element); }
			public void navigateTo(EObject element) { }
		});
		this.toChannels.setHelpText(propertiesEditionComponent.getHelpContent(EipViewsRepository.Splitter.Properties.toChannels, EipViewsRepository.FORM_KIND));
		this.toChannels.createControls(parent, widgetFactory);
		this.toChannels.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SplitterPropertiesEditionPartForm.this, EipViewsRepository.Splitter.Properties.toChannels, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData toChannelsData = new GridData(GridData.FILL_HORIZONTAL);
		toChannelsData.horizontalSpan = 3;
		this.toChannels.setLayoutData(toChannelsData);
		this.toChannels.disableMove();
		toChannels.setID(EipViewsRepository.Splitter.Properties.toChannels);
		toChannels.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createToChannelsReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addToChannels() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(toChannels.getInput(), toChannelsFilters, toChannelsBusinessFilters,
		"toChannels", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SplitterPropertiesEditionPartForm.this, EipViewsRepository.Splitter.Properties.toChannels,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				toChannels.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveToChannels(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SplitterPropertiesEditionPartForm.this, EipViewsRepository.Splitter.Properties.toChannels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		toChannels.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromToChannels(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SplitterPropertiesEditionPartForm.this, EipViewsRepository.Splitter.Properties.toChannels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		toChannels.refresh();
	}

	/**
	 * 
	 */
	protected void editToChannels(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				toChannels.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createFromChannelsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.fromChannels = new ReferencesTable(getDescription(EipViewsRepository.Splitter.Properties.fromChannels, EipMessages.SplitterPropertiesEditionPart_FromChannelsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addFromChannels(); }
			public void handleEdit(EObject element) { editFromChannels(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveFromChannels(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromFromChannels(element); }
			public void navigateTo(EObject element) { }
		});
		this.fromChannels.setHelpText(propertiesEditionComponent.getHelpContent(EipViewsRepository.Splitter.Properties.fromChannels, EipViewsRepository.FORM_KIND));
		this.fromChannels.createControls(parent, widgetFactory);
		this.fromChannels.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SplitterPropertiesEditionPartForm.this, EipViewsRepository.Splitter.Properties.fromChannels, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData fromChannelsData = new GridData(GridData.FILL_HORIZONTAL);
		fromChannelsData.horizontalSpan = 3;
		this.fromChannels.setLayoutData(fromChannelsData);
		this.fromChannels.disableMove();
		fromChannels.setID(EipViewsRepository.Splitter.Properties.fromChannels);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SplitterPropertiesEditionPartForm.this, EipViewsRepository.Splitter.Properties.fromChannels,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SplitterPropertiesEditionPartForm.this, EipViewsRepository.Splitter.Properties.fromChannels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		fromChannels.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromFromChannels(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SplitterPropertiesEditionPartForm.this, EipViewsRepository.Splitter.Properties.fromChannels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @see com.github.lbroudoux.dsl.eip.parts.SplitterPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.SplitterPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Splitter.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(EipMessages.Splitter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.SplitterPropertiesEditionPart#initToChannels(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initToChannels(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		toChannels.setContentProvider(contentProvider);
		toChannels.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Splitter.Properties.toChannels);
		if (eefElementEditorReadOnlyState && toChannels.getTable().isEnabled()) {
			toChannels.setEnabled(false);
			toChannels.setToolTipText(EipMessages.Splitter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !toChannels.getTable().isEnabled()) {
			toChannels.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.SplitterPropertiesEditionPart#updateToChannels()
	 * 
	 */
	public void updateToChannels() {
	toChannels.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.SplitterPropertiesEditionPart#addFilterToChannels(ViewerFilter filter)
	 * 
	 */
	public void addFilterToToChannels(ViewerFilter filter) {
		toChannelsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.SplitterPropertiesEditionPart#addBusinessFilterToChannels(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToToChannels(ViewerFilter filter) {
		toChannelsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.SplitterPropertiesEditionPart#isContainedInToChannelsTable(EObject element)
	 * 
	 */
	public boolean isContainedInToChannelsTable(EObject element) {
		return ((ReferencesTableSettings)toChannels.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.SplitterPropertiesEditionPart#initFromChannels(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initFromChannels(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		fromChannels.setContentProvider(contentProvider);
		fromChannels.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Splitter.Properties.fromChannels);
		if (eefElementEditorReadOnlyState && fromChannels.getTable().isEnabled()) {
			fromChannels.setEnabled(false);
			fromChannels.setToolTipText(EipMessages.Splitter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fromChannels.getTable().isEnabled()) {
			fromChannels.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.SplitterPropertiesEditionPart#updateFromChannels()
	 * 
	 */
	public void updateFromChannels() {
	fromChannels.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.SplitterPropertiesEditionPart#addFilterFromChannels(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFromChannels(ViewerFilter filter) {
		fromChannelsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.SplitterPropertiesEditionPart#addBusinessFilterFromChannels(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFromChannels(ViewerFilter filter) {
		fromChannelsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.SplitterPropertiesEditionPart#isContainedInFromChannelsTable(EObject element)
	 * 
	 */
	public boolean isContainedInFromChannelsTable(EObject element) {
		return ((ReferencesTableSettings)fromChannels.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EipMessages.Splitter_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
