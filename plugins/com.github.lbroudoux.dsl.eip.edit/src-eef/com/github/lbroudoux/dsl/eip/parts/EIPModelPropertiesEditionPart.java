/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * @author yanngv29
 * 
 */
public interface EIPModelPropertiesEditionPart {



	/**
	 * Init the ownedRoutes
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOwnedRoutes(ReferencesTableSettings settings);

	/**
	 * Update the ownedRoutes
	 * @param newValue the ownedRoutes to update
	 * 
	 */
	public void updateOwnedRoutes();

	/**
	 * Adds the given filter to the ownedRoutes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOwnedRoutes(ViewerFilter filter);

	/**
	 * Adds the given filter to the ownedRoutes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOwnedRoutes(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the ownedRoutes table
	 * 
	 */
	public boolean isContainedInOwnedRoutesTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
