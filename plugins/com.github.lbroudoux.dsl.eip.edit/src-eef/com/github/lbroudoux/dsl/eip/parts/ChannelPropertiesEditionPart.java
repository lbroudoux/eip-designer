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
public interface ChannelPropertiesEditionPart {

	/**
	 * @return the toEndpoint
	 * 
	 */
	public EObject getToEndpoint();

	/**
	 * Init the toEndpoint
	 * @param settings the combo setting
	 */
	public void initToEndpoint(EObjectFlatComboSettings settings);

	/**
	 * Defines a new toEndpoint
	 * @param newValue the new toEndpoint to set
	 * 
	 */
	public void setToEndpoint(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setToEndpointButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the toEndpoint edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToToEndpoint(ViewerFilter filter);

	/**
	 * Adds the given filter to the toEndpoint edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToToEndpoint(ViewerFilter filter);


	/**
	 * @return the fromEndpoint
	 * 
	 */
	public EObject getFromEndpoint();

	/**
	 * Init the fromEndpoint
	 * @param settings the combo setting
	 */
	public void initFromEndpoint(EObjectFlatComboSettings settings);

	/**
	 * Defines a new fromEndpoint
	 * @param newValue the new fromEndpoint to set
	 * 
	 */
	public void setFromEndpoint(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setFromEndpointButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the fromEndpoint edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFromEndpoint(ViewerFilter filter);

	/**
	 * Adds the given filter to the fromEndpoint edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFromEndpoint(ViewerFilter filter);


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
	 * @return the guaranteed
	 * 
	 */
	public Boolean getGuaranteed();

	/**
	 * Defines a new guaranteed
	 * @param newValue the new guaranteed to set
	 * 
	 */
	public void setGuaranteed(Boolean newValue);





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
