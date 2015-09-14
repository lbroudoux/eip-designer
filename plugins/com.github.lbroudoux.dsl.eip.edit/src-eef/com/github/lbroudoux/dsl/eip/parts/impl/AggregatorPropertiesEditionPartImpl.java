/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.parts.impl;

// Start of user code for imports
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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
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

import com.github.lbroudoux.dsl.eip.parts.AggregatorPropertiesEditionPart;
import com.github.lbroudoux.dsl.eip.parts.EipViewsRepository;
import com.github.lbroudoux.dsl.eip.providers.EipMessages;

// End of user code

/**
 * @author yanngv29
 * 
 */
public class AggregatorPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, AggregatorPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable toChannels;
	protected List<ViewerFilter> toChannelsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> toChannelsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable fromChannels;
	protected List<ViewerFilter> fromChannelsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> fromChannelsFilters = new ArrayList<ViewerFilter>();
	protected EMFComboViewer part;
	protected Text strategy;
	protected Text expression;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AggregatorPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence aggregatorStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = aggregatorStep.addStep(EipViewsRepository.Aggregator.Properties.class);
		propertiesStep.addStep(EipViewsRepository.Aggregator.Properties.name);
		propertiesStep.addStep(EipViewsRepository.Aggregator.Properties.toChannels);
		propertiesStep.addStep(EipViewsRepository.Aggregator.Properties.fromChannels);
		propertiesStep.addStep(EipViewsRepository.Aggregator.Properties.part);
		propertiesStep.addStep(EipViewsRepository.Aggregator.Properties.strategy);
		propertiesStep.addStep(EipViewsRepository.Aggregator.Properties.expression);
		
		
		composer = new PartComposer(aggregatorStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EipViewsRepository.Aggregator.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EipViewsRepository.Aggregator.Properties.name) {
					return createNameText(parent);
				}
				if (key == EipViewsRepository.Aggregator.Properties.toChannels) {
					return createToChannelsAdvancedReferencesTable(parent);
				}
				if (key == EipViewsRepository.Aggregator.Properties.fromChannels) {
					return createFromChannelsAdvancedReferencesTable(parent);
				}
				if (key == EipViewsRepository.Aggregator.Properties.part) {
					return createPartEMFComboViewer(parent);
				}
				if (key == EipViewsRepository.Aggregator.Properties.strategy) {
					return createStrategyText(parent);
				}
				if (key == EipViewsRepository.Aggregator.Properties.expression) {
					return createExpressionText(parent);
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
		propertiesGroup.setText(EipMessages.AggregatorPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, EipViewsRepository.Aggregator.Properties.name, EipMessages.AggregatorPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AggregatorPropertiesEditionPartImpl.this, EipViewsRepository.Aggregator.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AggregatorPropertiesEditionPartImpl.this, EipViewsRepository.Aggregator.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, EipViewsRepository.Aggregator.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.Aggregator.Properties.name, EipViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createToChannelsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(EipViewsRepository.Aggregator.Properties.toChannels, EipMessages.AggregatorPropertiesEditionPart_ToChannelsLabel);		 
		this.toChannels = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addToChannels(); }
			public void handleEdit(EObject element) { editToChannels(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveToChannels(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromToChannels(element); }
			public void navigateTo(EObject element) { }
		});
		this.toChannels.setHelpText(propertiesEditionComponent.getHelpContent(EipViewsRepository.Aggregator.Properties.toChannels, EipViewsRepository.SWT_KIND));
		this.toChannels.createControls(parent);
		this.toChannels.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AggregatorPropertiesEditionPartImpl.this, EipViewsRepository.Aggregator.Properties.toChannels, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData toChannelsData = new GridData(GridData.FILL_HORIZONTAL);
		toChannelsData.horizontalSpan = 3;
		this.toChannels.setLayoutData(toChannelsData);
		this.toChannels.disableMove();
		toChannels.setID(EipViewsRepository.Aggregator.Properties.toChannels);
		toChannels.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AggregatorPropertiesEditionPartImpl.this, EipViewsRepository.Aggregator.Properties.toChannels,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AggregatorPropertiesEditionPartImpl.this, EipViewsRepository.Aggregator.Properties.toChannels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		toChannels.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromToChannels(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AggregatorPropertiesEditionPartImpl.this, EipViewsRepository.Aggregator.Properties.toChannels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createFromChannelsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(EipViewsRepository.Aggregator.Properties.fromChannels, EipMessages.AggregatorPropertiesEditionPart_FromChannelsLabel);		 
		this.fromChannels = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addFromChannels(); }
			public void handleEdit(EObject element) { editFromChannels(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveFromChannels(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromFromChannels(element); }
			public void navigateTo(EObject element) { }
		});
		this.fromChannels.setHelpText(propertiesEditionComponent.getHelpContent(EipViewsRepository.Aggregator.Properties.fromChannels, EipViewsRepository.SWT_KIND));
		this.fromChannels.createControls(parent);
		this.fromChannels.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AggregatorPropertiesEditionPartImpl.this, EipViewsRepository.Aggregator.Properties.fromChannels, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData fromChannelsData = new GridData(GridData.FILL_HORIZONTAL);
		fromChannelsData.horizontalSpan = 3;
		this.fromChannels.setLayoutData(fromChannelsData);
		this.fromChannels.disableMove();
		fromChannels.setID(EipViewsRepository.Aggregator.Properties.fromChannels);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AggregatorPropertiesEditionPartImpl.this, EipViewsRepository.Aggregator.Properties.fromChannels,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AggregatorPropertiesEditionPartImpl.this, EipViewsRepository.Aggregator.Properties.fromChannels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		fromChannels.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromFromChannels(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AggregatorPropertiesEditionPartImpl.this, EipViewsRepository.Aggregator.Properties.fromChannels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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

	
	protected Composite createPartEMFComboViewer(Composite parent) {
		createDescription(parent, EipViewsRepository.Aggregator.Properties.part, EipMessages.AggregatorPropertiesEditionPart_PartLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AggregatorPropertiesEditionPartImpl.this, EipViewsRepository.Aggregator.Properties.part, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPart()));
			}

		});
		part.setID(EipViewsRepository.Aggregator.Properties.part);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.Aggregator.Properties.part, EipViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPartEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createStrategyText(Composite parent) {
		createDescription(parent, EipViewsRepository.Aggregator.Properties.strategy, EipMessages.AggregatorPropertiesEditionPart_StrategyLabel);
		strategy = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData strategyData = new GridData(GridData.FILL_HORIZONTAL);
		strategy.setLayoutData(strategyData);
		strategy.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AggregatorPropertiesEditionPartImpl.this, EipViewsRepository.Aggregator.Properties.strategy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strategy.getText()));
			}

		});
		strategy.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AggregatorPropertiesEditionPartImpl.this, EipViewsRepository.Aggregator.Properties.strategy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, strategy.getText()));
				}
			}

		});
		EditingUtils.setID(strategy, EipViewsRepository.Aggregator.Properties.strategy);
		EditingUtils.setEEFtype(strategy, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.Aggregator.Properties.strategy, EipViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStrategyText

		// End of user code
		return parent;
	}

	
	protected Composite createExpressionText(Composite parent) {
		createDescription(parent, EipViewsRepository.Aggregator.Properties.expression, EipMessages.AggregatorPropertiesEditionPart_ExpressionLabel);
		expression = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData expressionData = new GridData(GridData.FILL_HORIZONTAL);
		expression.setLayoutData(expressionData);
		expression.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AggregatorPropertiesEditionPartImpl.this, EipViewsRepository.Aggregator.Properties.expression, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, expression.getText()));
			}

		});
		expression.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AggregatorPropertiesEditionPartImpl.this, EipViewsRepository.Aggregator.Properties.expression, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, expression.getText()));
				}
			}

		});
		EditingUtils.setID(expression, EipViewsRepository.Aggregator.Properties.expression);
		EditingUtils.setEEFtype(expression, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EipViewsRepository.Aggregator.Properties.expression, EipViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createExpressionText

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
	 * @see com.github.lbroudoux.dsl.eip.parts.AggregatorPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.AggregatorPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Aggregator.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(EipMessages.Aggregator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.AggregatorPropertiesEditionPart#initToChannels(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initToChannels(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		toChannels.setContentProvider(contentProvider);
		toChannels.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Aggregator.Properties.toChannels);
		if (eefElementEditorReadOnlyState && toChannels.getTable().isEnabled()) {
			toChannels.setEnabled(false);
			toChannels.setToolTipText(EipMessages.Aggregator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !toChannels.getTable().isEnabled()) {
			toChannels.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.AggregatorPropertiesEditionPart#updateToChannels()
	 * 
	 */
	public void updateToChannels() {
	toChannels.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.AggregatorPropertiesEditionPart#addFilterToChannels(ViewerFilter filter)
	 * 
	 */
	public void addFilterToToChannels(ViewerFilter filter) {
		toChannelsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.AggregatorPropertiesEditionPart#addBusinessFilterToChannels(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToToChannels(ViewerFilter filter) {
		toChannelsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.AggregatorPropertiesEditionPart#isContainedInToChannelsTable(EObject element)
	 * 
	 */
	public boolean isContainedInToChannelsTable(EObject element) {
		return ((ReferencesTableSettings)toChannels.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.AggregatorPropertiesEditionPart#initFromChannels(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initFromChannels(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		fromChannels.setContentProvider(contentProvider);
		fromChannels.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Aggregator.Properties.fromChannels);
		if (eefElementEditorReadOnlyState && fromChannels.getTable().isEnabled()) {
			fromChannels.setEnabled(false);
			fromChannels.setToolTipText(EipMessages.Aggregator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fromChannels.getTable().isEnabled()) {
			fromChannels.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.AggregatorPropertiesEditionPart#updateFromChannels()
	 * 
	 */
	public void updateFromChannels() {
	fromChannels.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.AggregatorPropertiesEditionPart#addFilterFromChannels(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFromChannels(ViewerFilter filter) {
		fromChannelsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.AggregatorPropertiesEditionPart#addBusinessFilterFromChannels(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFromChannels(ViewerFilter filter) {
		fromChannelsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.AggregatorPropertiesEditionPart#isContainedInFromChannelsTable(EObject element)
	 * 
	 */
	public boolean isContainedInFromChannelsTable(EObject element) {
		return ((ReferencesTableSettings)fromChannels.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.AggregatorPropertiesEditionPart#getPart()
	 * 
	 */
	public Enumerator getPart() {
		Enumerator selection = (Enumerator) ((StructuredSelection) part.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.AggregatorPropertiesEditionPart#initPart(Object input, Enumerator current)
	 */
	public void initPart(Object input, Enumerator current) {
		part.setInput(input);
		part.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Aggregator.Properties.part);
		if (eefElementEditorReadOnlyState && part.isEnabled()) {
			part.setEnabled(false);
			part.setToolTipText(EipMessages.Aggregator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !part.isEnabled()) {
			part.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.AggregatorPropertiesEditionPart#setPart(Enumerator newValue)
	 * 
	 */
	public void setPart(Enumerator newValue) {
		part.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Aggregator.Properties.part);
		if (eefElementEditorReadOnlyState && part.isEnabled()) {
			part.setEnabled(false);
			part.setToolTipText(EipMessages.Aggregator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !part.isEnabled()) {
			part.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.AggregatorPropertiesEditionPart#getStrategy()
	 * 
	 */
	public String getStrategy() {
		return strategy.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.AggregatorPropertiesEditionPart#setStrategy(String newValue)
	 * 
	 */
	public void setStrategy(String newValue) {
		if (newValue != null) {
			strategy.setText(newValue);
		} else {
			strategy.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Aggregator.Properties.strategy);
		if (eefElementEditorReadOnlyState && strategy.isEnabled()) {
			strategy.setEnabled(false);
			strategy.setToolTipText(EipMessages.Aggregator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strategy.isEnabled()) {
			strategy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.AggregatorPropertiesEditionPart#getExpression()
	 * 
	 */
	public String getExpression() {
		return expression.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.AggregatorPropertiesEditionPart#setExpression(String newValue)
	 * 
	 */
	public void setExpression(String newValue) {
		if (newValue != null) {
			expression.setText(newValue);
		} else {
			expression.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.Aggregator.Properties.expression);
		if (eefElementEditorReadOnlyState && expression.isEnabled()) {
			expression.setEnabled(false);
			expression.setToolTipText(EipMessages.Aggregator_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !expression.isEnabled()) {
			expression.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EipMessages.Aggregator_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
