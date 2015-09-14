/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import com.github.lbroudoux.dsl.eip.parts.EIPModelPropertiesEditionPart;
import com.github.lbroudoux.dsl.eip.parts.EipViewsRepository;
import com.github.lbroudoux.dsl.eip.providers.EipMessages;

// End of user code

/**
 * @author yanngv29
 * 
 */
public class EIPModelPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, EIPModelPropertiesEditionPart {

	protected ReferencesTable ownedRoutes;
	protected List<ViewerFilter> ownedRoutesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedRoutesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ownedServiceRefs;
	protected List<ViewerFilter> ownedServiceRefsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedServiceRefsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EIPModelPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence eIPModelStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = eIPModelStep.addStep(EipViewsRepository.EIPModel.Properties.class);
		propertiesStep.addStep(EipViewsRepository.EIPModel.Properties.ownedRoutes);
		propertiesStep.addStep(EipViewsRepository.EIPModel.Properties.ownedServiceRefs);
		
		
		composer = new PartComposer(eIPModelStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EipViewsRepository.EIPModel.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EipViewsRepository.EIPModel.Properties.ownedRoutes) {
					return createOwnedRoutesAdvancedTableComposition(parent);
				}
				if (key == EipViewsRepository.EIPModel.Properties.ownedServiceRefs) {
					return createOwnedServiceRefsAdvancedTableComposition(parent);
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
		propertiesGroup.setText(EipMessages.EIPModelPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedRoutesAdvancedTableComposition(Composite parent) {
		this.ownedRoutes = new ReferencesTable(getDescription(EipViewsRepository.EIPModel.Properties.ownedRoutes, EipMessages.EIPModelPropertiesEditionPart_OwnedRoutesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EIPModelPropertiesEditionPartImpl.this, EipViewsRepository.EIPModel.Properties.ownedRoutes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ownedRoutes.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EIPModelPropertiesEditionPartImpl.this, EipViewsRepository.EIPModel.Properties.ownedRoutes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ownedRoutes.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EIPModelPropertiesEditionPartImpl.this, EipViewsRepository.EIPModel.Properties.ownedRoutes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ownedRoutes.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EIPModelPropertiesEditionPartImpl.this, EipViewsRepository.EIPModel.Properties.ownedRoutes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ownedRoutes.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.ownedRoutesFilters) {
			this.ownedRoutes.addFilter(filter);
		}
		this.ownedRoutes.setHelpText(propertiesEditionComponent.getHelpContent(EipViewsRepository.EIPModel.Properties.ownedRoutes, EipViewsRepository.SWT_KIND));
		this.ownedRoutes.createControls(parent);
		this.ownedRoutes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EIPModelPropertiesEditionPartImpl.this, EipViewsRepository.EIPModel.Properties.ownedRoutes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ownedRoutesData = new GridData(GridData.FILL_HORIZONTAL);
		ownedRoutesData.horizontalSpan = 3;
		this.ownedRoutes.setLayoutData(ownedRoutesData);
		this.ownedRoutes.setLowerBound(0);
		this.ownedRoutes.setUpperBound(-1);
		ownedRoutes.setID(EipViewsRepository.EIPModel.Properties.ownedRoutes);
		ownedRoutes.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedRoutesAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedServiceRefsAdvancedTableComposition(Composite parent) {
		this.ownedServiceRefs = new ReferencesTable(getDescription(EipViewsRepository.EIPModel.Properties.ownedServiceRefs, EipMessages.EIPModelPropertiesEditionPart_OwnedServiceRefsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EIPModelPropertiesEditionPartImpl.this, EipViewsRepository.EIPModel.Properties.ownedServiceRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ownedServiceRefs.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EIPModelPropertiesEditionPartImpl.this, EipViewsRepository.EIPModel.Properties.ownedServiceRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ownedServiceRefs.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EIPModelPropertiesEditionPartImpl.this, EipViewsRepository.EIPModel.Properties.ownedServiceRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ownedServiceRefs.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EIPModelPropertiesEditionPartImpl.this, EipViewsRepository.EIPModel.Properties.ownedServiceRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ownedServiceRefs.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.ownedServiceRefsFilters) {
			this.ownedServiceRefs.addFilter(filter);
		}
		this.ownedServiceRefs.setHelpText(propertiesEditionComponent.getHelpContent(EipViewsRepository.EIPModel.Properties.ownedServiceRefs, EipViewsRepository.SWT_KIND));
		this.ownedServiceRefs.createControls(parent);
		this.ownedServiceRefs.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EIPModelPropertiesEditionPartImpl.this, EipViewsRepository.EIPModel.Properties.ownedServiceRefs, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ownedServiceRefsData = new GridData(GridData.FILL_HORIZONTAL);
		ownedServiceRefsData.horizontalSpan = 3;
		this.ownedServiceRefs.setLayoutData(ownedServiceRefsData);
		this.ownedServiceRefs.setLowerBound(0);
		this.ownedServiceRefs.setUpperBound(-1);
		ownedServiceRefs.setID(EipViewsRepository.EIPModel.Properties.ownedServiceRefs);
		ownedServiceRefs.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedServiceRefsAdvancedTableComposition

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
	 * @see com.github.lbroudoux.dsl.eip.parts.EIPModelPropertiesEditionPart#initOwnedRoutes(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedRoutes(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedRoutes.setContentProvider(contentProvider);
		ownedRoutes.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.EIPModel.Properties.ownedRoutes);
		if (eefElementEditorReadOnlyState && ownedRoutes.isEnabled()) {
			ownedRoutes.setEnabled(false);
			ownedRoutes.setToolTipText(EipMessages.EIPModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedRoutes.isEnabled()) {
			ownedRoutes.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EIPModelPropertiesEditionPart#updateOwnedRoutes()
	 * 
	 */
	public void updateOwnedRoutes() {
	ownedRoutes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EIPModelPropertiesEditionPart#addFilterOwnedRoutes(ViewerFilter filter)
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
	 * @see com.github.lbroudoux.dsl.eip.parts.EIPModelPropertiesEditionPart#addBusinessFilterOwnedRoutes(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwnedRoutes(ViewerFilter filter) {
		ownedRoutesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EIPModelPropertiesEditionPart#isContainedInOwnedRoutesTable(EObject element)
	 * 
	 */
	public boolean isContainedInOwnedRoutesTable(EObject element) {
		return ((ReferencesTableSettings)ownedRoutes.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EIPModelPropertiesEditionPart#initOwnedServiceRefs(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedServiceRefs(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedServiceRefs.setContentProvider(contentProvider);
		ownedServiceRefs.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EipViewsRepository.EIPModel.Properties.ownedServiceRefs);
		if (eefElementEditorReadOnlyState && ownedServiceRefs.isEnabled()) {
			ownedServiceRefs.setEnabled(false);
			ownedServiceRefs.setToolTipText(EipMessages.EIPModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedServiceRefs.isEnabled()) {
			ownedServiceRefs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EIPModelPropertiesEditionPart#updateOwnedServiceRefs()
	 * 
	 */
	public void updateOwnedServiceRefs() {
	ownedServiceRefs.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EIPModelPropertiesEditionPart#addFilterOwnedServiceRefs(ViewerFilter filter)
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
	 * @see com.github.lbroudoux.dsl.eip.parts.EIPModelPropertiesEditionPart#addBusinessFilterOwnedServiceRefs(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwnedServiceRefs(ViewerFilter filter) {
		ownedServiceRefsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.github.lbroudoux.dsl.eip.parts.EIPModelPropertiesEditionPart#isContainedInOwnedServiceRefsTable(EObject element)
	 * 
	 */
	public boolean isContainedInOwnedServiceRefsTable(EObject element) {
		return ((ReferencesTableSettings)ownedServiceRefs.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EipMessages.EIPModel_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
