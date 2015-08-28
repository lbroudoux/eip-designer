/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * @author yanngv29
 * 
 */
public interface AggregatorPropertiesEditionPart {

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
	 * @return the part
	 * 
	 */
	public Enumerator getPart();

	/**
	 * Init the part
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initPart(Object input, Enumerator current);

	/**
	 * Defines a new part
	 * @param newValue the new part to set
	 * 
	 */
	public void setPart(Enumerator newValue);


	/**
	 * @return the strategy
	 * 
	 */
	public String getStrategy();

	/**
	 * Defines a new strategy
	 * @param newValue the new strategy to set
	 * 
	 */
	public void setStrategy(String newValue);


	/**
	 * @return the expression
	 * 
	 */
	public String getExpression();

	/**
	 * Defines a new expression
	 * @param newValue the new expression to set
	 * 
	 */
	public void setExpression(String newValue);





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
