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
public interface ServiceInvocationPropertiesEditionPart {

	/**
	 * @return the context
	 * 
	 */
	public String getContext();

	/**
	 * Defines a new context
	 * @param newValue the new context to set
	 * 
	 */
	public void setContext(String newValue);


	/**
	 * @return the operationName
	 * 
	 */
	public String getOperationName();

	/**
	 * Defines a new operationName
	 * @param newValue the new operationName to set
	 * 
	 */
	public void setOperationName(String newValue);


	/**
	 * @return the serviceRef
	 * 
	 */
	public EObject getServiceRef();

	/**
	 * Init the serviceRef
	 * @param settings the combo setting
	 */
	public void initServiceRef(EObjectFlatComboSettings settings);

	/**
	 * Defines a new serviceRef
	 * @param newValue the new serviceRef to set
	 * 
	 */
	public void setServiceRef(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setServiceRefButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the serviceRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToServiceRef(ViewerFilter filter);

	/**
	 * Adds the given filter to the serviceRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToServiceRef(ViewerFilter filter);





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
