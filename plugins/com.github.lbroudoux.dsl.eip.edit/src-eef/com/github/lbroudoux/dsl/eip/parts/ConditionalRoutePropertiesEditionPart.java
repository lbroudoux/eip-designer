/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * @author yanngv29
 * 
 */
public interface ConditionalRoutePropertiesEditionPart {

	/**
	 * @return the condition
	 * 
	 */
	public String getCondition();

	/**
	 * Defines a new condition
	 * @param newValue the new condition to set
	 * 
	 */
	public void setCondition(String newValue);


	/**
	 * @return the channel
	 * 
	 */
	public EObject getChannel();

	/**
	 * Init the channel
	 * @param settings the combo setting
	 */
	public void initChannel(EObjectFlatComboSettings settings);

	/**
	 * Defines a new channel
	 * @param newValue the new channel to set
	 * 
	 */
	public void setChannel(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setChannelButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the channel edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToChannel(ViewerFilter filter);

	/**
	 * Adds the given filter to the channel edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToChannel(ViewerFilter filter);





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
