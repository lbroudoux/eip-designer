/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * @author yanngv29
 * 
 */
public interface RouterPropertiesEditionPart {

	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);




	/**
	 * Init the toChannels
	 * @param settings settings for the toChannels ReferencesTable 
	 */
	public void initToChannels(ReferencesTableSettings settings);

	/**
	 * Update the toChannels
	 * @param newValue the toChannels to update
	 * 
	 */
	public void updateToChannels();

	/**
	 * Adds the given filter to the toChannels edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToToChannels(ViewerFilter filter);

	/**
	 * Adds the given filter to the toChannels edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToToChannels(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the toChannels table
	 * 
	 */
	public boolean isContainedInToChannelsTable(EObject element);




	/**
	 * Init the fromChannels
	 * @param settings settings for the fromChannels ReferencesTable 
	 */
	public void initFromChannels(ReferencesTableSettings settings);

	/**
	 * Update the fromChannels
	 * @param newValue the fromChannels to update
	 * 
	 */
	public void updateFromChannels();

	/**
	 * Adds the given filter to the fromChannels edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFromChannels(ViewerFilter filter);

	/**
	 * Adds the given filter to the fromChannels edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFromChannels(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the fromChannels table
	 * 
	 */
	public boolean isContainedInFromChannelsTable(EObject element);




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
	 * @return the type
	 * 
	 */
	public Enumerator getType();

	/**
	 * Init the type
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initType(Object input, Enumerator current);

	/**
	 * Defines a new type
	 * @param newValue the new type to set
	 * 
	 */
	public void setType(Enumerator newValue);





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
