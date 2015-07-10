/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.parts.impl;

// Start of user code for imports
import com.github.lbroudoux.dsl.eip.parts.EipViewsRepository;
import com.github.lbroudoux.dsl.eip.parts.RecipientListRouterPropertiesEditionPart;

import com.github.lbroudoux.dsl.eip.providers.EipMessages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * @author yanngv29
 * 
 */
public class RecipientListRouterPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RecipientListRouterPropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer toChannel;
	protected ReferencesTable fromChannels;
	protected List<ViewerFilter> fromChannelsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> fromChannelsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ownedRoutes;
	protected List<ViewerFilter> ownedRoutesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedRoutesFilters = new ArrayList<ViewerFilter>();
	protected EMFComboViewer type;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RecipientListRouterPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence recipientListRouterStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = recipientListRouterStep.addStep(EipViewsRepository.RecipientListRouter.Properties.class);
		propertiesStep.addStep(EipViewsRepository.RecipientListRouter.Properties.name);
		propertiesStep.addStep(EipViewsRepository.RecipientListRouter.Properties.toChannel);
		propertiesStep.addStep(EipViewsRepository.RecipientListRouter.Properties.fromChannels);
		propertiesStep.addStep(EipViewsRepository.RecipientListRouter.Properties.ownedRoutes);
		propertiesStep.addStep(EipViewsRepository.RecipientListRouter.Properties.type);
		
		
		composer = new PartComposer(recipientListRouterStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EipViewsRepository.RecipientListRouter.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EipViewsRepository.RecipientListRouter.Properties.name) {
					return createNameText(parent);
				}
				if (key == EipViewsRepository.RecipientListRouter.Properties.toChannel) {
					return createToChannelFlatComboViewer(parent);
				}
				if (key == EipViewsRepository.RecipientListRouter.Properties.fromChannels) {
					return createFromChannelsAdvancedReferencesTable(parent);
				}
				if (key == EipViewsRepository.RecipientListRouter.Properties.ownedRoutes) {
					return createOwnedRoutesAdvancedTableComposition(parent);
				}
				if (key == EipViewsRepository.RecipientListRouter.Properties.type) {
					return createTypeEMFComboViewer(parent);
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
		propertiesGroup.setText(EipMessages.RecipientListRouterPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, EipViewsRepository.RecipientListRouter.Properties.name, EipMessages.RecipientListRouterPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RecipientListRouterPropertiesEditionPartImpl.this, EipViewsRepository.RecipientListRouter.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RecipientListRouterPropertiesEditionPartImpl.this, EipViewsRepository.RecipientListRouter.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, EipViewsRepository.RecipientListRouter.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.RecipientListRouter.Properties.name, EipViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createToChannelFlatComboViewer(Composite parent) {
		createDescription(parent, EipViewsRepository.RecipientListRouter.Properties.toChannel, EipMessages.RecipientListRouterPropertiesEditionPart_ToChannelLabel);
		toChannel = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EipViewsRepository.RecipientListRouter.Properties.toChannel, EipViewsRepository.SWT_KIND));
		toChannel.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		toChannel.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RecipientListRouterPropertiesEditionPartImpl.this, EipViewsRepository.RecipientListRouter.Properties.toChannel, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getToChannel()));
			}

		});
		GridData toChannelData = new GridData(GridData.FILL_HORIZONTAL);
		toChannel.setLayoutData(toChannelData);
		toChannel.setID(EipViewsRepository.RecipientListRouter.Properties.toChannel);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.RecipientListRouter.Properties.toChannel, EipViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createToChannelFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createFromChannelsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(EipViewsRepository.RecipientListRouter.Properties.fromChannels, EipMessages.RecipientListRouterPropertiesEditionPart_FromChannelsLabel);		 
		this.fromChannels = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addFromChannels(); }
			public void handleEdit(EObject element) { editFromChannels(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveFromChannels(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromFromChannels(element); }
			public void navigateTo(EObject element) { }
		});
		this.fromChannels.setHelpText(propertiesEditionComponent.getHelpContent(EipViewsRepository.RecipientListRouter.Properties.fromChannels, EipViewsRepository.SWT_KIND));
		this.fromChannels.createControls(parent);
		this.fromChannels.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RecipientListRouterPropertiesEditionPartImpl.this, EipViewsRepository.RecipientListRouter.Properties.fromChannels, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData fromChannelsData = new GridData(GridData.FILL_HORIZONTAL);
		fromChannelsData.horizontalSpan = 3;
		this.fromChannels.setLayoutData(fromChannelsData);
		this.fromChannels.disableMove();
		fromChannels.setID(EipViewsRepository.RecipientListRouter.Properties.fromChannels);
		fromChannels.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RecipientListRouterPropertiesEditionPartImpl.this, EipViewsRepository.RecipientListRouter.Properties.fromChannels,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RecipientListRouterPropertiesEditionPartImpl.this, EipViewsRepository.RecipientListRouter.Properties.fromChannels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		fromChannels.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromFromChannels(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RecipientListRouterPropertiesEditionPartImpl.this, EipViewsRepository.RecipientListRouter.Properties.fromChannels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createOwnedRoutesAdvancedTableComposition(Composite parent) {
		this.ownedRoutes = new ReferencesTable(getDescription(EipViewsRepository.RecipientListRouter.Properties.ownedRoutes, EipMessages.RecipientListRouterPropertiesEditionPart_OwnedRoutesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RecipientListRouterPropertiesEditionPartImpl.this, EipViewsRepository.RecipientListRouter.Properties.ownedRoutes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ownedRoutes.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RecipientListRouterPropertiesEditionPartImpl.this, EipViewsRepository.RecipientListRouter.Properties.ownedRoutes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ownedRoutes.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RecipientListRouterPropertiesEditionPartImpl.this, EipViewsRepository.RecipientListRouter.Properties.ownedRoutes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ownedRoutes.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RecipientListRouterPropertiesEditionPartImpl.this, EipViewsRepository.RecipientListRouter.Properties.ownedRoutes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ownedRoutes.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.ownedRoutesFilters) {
			this.ownedRoutes.addFilter(filter);
		}
		this.ownedRoutes.setHelpText(propertiesEditionComponent.getHelpContent(EipViewsRepository.RecipientListRouter.Properties.ownedRoutes, EipViewsRepository.SWT_KIND));
		this.ownedRoutes.createControls(parent);
		this.ownedRoutes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RecipientListRouterPropertiesEditionPartImpl.this, EipViewsRepository.RecipientListRouter.Properties.ownedRoutes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ownedRoutesData = new GridData(GridData.FILL_HORIZONTAL);
		ownedRoutesData.horizontalSpan = 3;
		this.ownedRoutes.setLayoutData(ownedRoutesData);
		this.ownedRoutes.setLowerBound(0);
		this.ownedRoutes.setUpperBound(-1);
		ownedRoutes.setID(EipViewsRepository.RecipientListRouter.Properties.ownedRoutes);
		ownedRoutes.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedRoutesAdvancedTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createTypeEMFComboViewer(Composite parent) {
		createDescription(parent, EipViewsRepository.RecipientListRouter.Properties.type, EipMessages.RecipientListRouterPropertiesEditionPart_TypeLabel);
		type = new EMFComboViewer(parent);
		type.setContentProvider(new ArrayContentProvider());
		type.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.getCombo().setLayoutData(typeData);
		type.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RecipientListRouterPropertiesEditionPartImpl.this, EipViewsRepository.RecipientListRouter.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getType()));
			}

		});
		type.setID(EipViewsRepository.RecipientListRouter.Properties.type);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.RecipientListRouter.Properties.type, EipViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTypeEMFComboViewer

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
	 * @see com.github.lbroudoux.dsl.eip.parts.RecipientListRouterPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RecipientListRouterPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.RecipientListRouter.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(EipMessages.RecipientListRouter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RecipientListRouterPropertiesEditionPart#getToChannel()
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
	 * @see com.github.lbroudoux.dsl.eip.parts.RecipientListRouterPropertiesEditionPart#initToChannel(EObjectFlatComboSettings)
	 */
	public void initToChannel(EObjectFlatComboSettings settings) {
		toChannel.setInput(settings);
		if (current != null) {
			toChannel.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.RecipientListRouter.Properties.toChannel);
		if (eefElementEditorReadOnlyState && toChannel.isEnabled()) {
			toChannel.setEnabled(false);
			toChannel.setToolTipText(EipMessages.RecipientListRouter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !toChannel.isEnabled()) {
			toChannel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RecipientListRouterPropertiesEditionPart#setToChannel(EObject newValue)
	 * 
	 */
	public void setToChannel(EObject newValue) {
		if (newValue != null) {
			toChannel.setSelection(new StructuredSelection(newValue));
		} else {
			toChannel.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.RecipientListRouter.Properties.toChannel);
		if (eefElementEditorReadOnlyState && toChannel.isEnabled()) {
			toChannel.setEnabled(false);
			toChannel.setToolTipText(EipMessages.RecipientListRouter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !toChannel.isEnabled()) {
			toChannel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RecipientListRouterPropertiesEditionPart#setToChannelButtonMode(ButtonsModeEnum newValue)
	 */
	public void setToChannelButtonMode(ButtonsModeEnum newValue) {
		toChannel.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RecipientListRouterPropertiesEditionPart#addFilterToChannel(ViewerFilter filter)
	 * 
	 */
	public void addFilterToToChannel(ViewerFilter filter) {
		toChannel.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RecipientListRouterPropertiesEditionPart#addBusinessFilterToChannel(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToToChannel(ViewerFilter filter) {
		toChannel.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RecipientListRouterPropertiesEditionPart#initFromChannels(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initFromChannels(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		fromChannels.setContentProvider(contentProvider);
		fromChannels.setInput(settings);
		fromChannelsBusinessFilters.clear();
		fromChannelsFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.RecipientListRouter.Properties.fromChannels);
		if (eefElementEditorReadOnlyState && fromChannels.getTable().isEnabled()) {
			fromChannels.setEnabled(false);
			fromChannels.setToolTipText(EipMessages.RecipientListRouter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fromChannels.getTable().isEnabled()) {
			fromChannels.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RecipientListRouterPropertiesEditionPart#updateFromChannels()
	 * 
	 */
	public void updateFromChannels() {
	fromChannels.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RecipientListRouterPropertiesEditionPart#addFilterFromChannels(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFromChannels(ViewerFilter filter) {
		fromChannelsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RecipientListRouterPropertiesEditionPart#addBusinessFilterFromChannels(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFromChannels(ViewerFilter filter) {
		fromChannelsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RecipientListRouterPropertiesEditionPart#isContainedInFromChannelsTable(EObject element)
	 * 
	 */
	public boolean isContainedInFromChannelsTable(EObject element) {
		return ((ReferencesTableSettings)fromChannels.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RecipientListRouterPropertiesEditionPart#initOwnedRoutes(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedRoutes(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedRoutes.setContentProvider(contentProvider);
		ownedRoutes.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.RecipientListRouter.Properties.ownedRoutes);
		if (eefElementEditorReadOnlyState && ownedRoutes.isEnabled()) {
			ownedRoutes.setEnabled(false);
			ownedRoutes.setToolTipText(EipMessages.RecipientListRouter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedRoutes.isEnabled()) {
			ownedRoutes.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RecipientListRouterPropertiesEditionPart#updateOwnedRoutes()
	 * 
	 */
	public void updateOwnedRoutes() {
	ownedRoutes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RecipientListRouterPropertiesEditionPart#addFilterOwnedRoutes(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOwnedRoutes(ViewerFilter filter) {
		ownedRoutesFilters.add(filter);
		if (this.ownedRoutes != null) {
			this.ownedRoutes.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RecipientListRouterPropertiesEditionPart#addBusinessFilterOwnedRoutes(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwnedRoutes(ViewerFilter filter) {
		ownedRoutesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RecipientListRouterPropertiesEditionPart#isContainedInOwnedRoutesTable(EObject element)
	 * 
	 */
	public boolean isContainedInOwnedRoutesTable(EObject element) {
		return ((ReferencesTableSettings)ownedRoutes.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RecipientListRouterPropertiesEditionPart#getType()
	 * 
	 */
	public Enumerator getType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) type.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RecipientListRouterPropertiesEditionPart#initType(Object input, Enumerator current)
	 */
	public void initType(Object input, Enumerator current) {
		type.setInput(input);
		type.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.RecipientListRouter.Properties.type);
		if (eefElementEditorReadOnlyState && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(EipMessages.RecipientListRouter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !type.isEnabled()) {
			type.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.RecipientListRouterPropertiesEditionPart#setType(Enumerator newValue)
	 * 
	 */
	public void setType(Enumerator newValue) {
		type.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.RecipientListRouter.Properties.type);
		if (eefElementEditorReadOnlyState && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(EipMessages.RecipientListRouter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !type.isEnabled()) {
			type.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EipMessages.RecipientListRouter_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
