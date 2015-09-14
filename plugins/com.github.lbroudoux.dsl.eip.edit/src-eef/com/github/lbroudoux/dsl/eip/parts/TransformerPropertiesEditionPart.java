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
public interface TransformerPropertiesEditionPart {

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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
