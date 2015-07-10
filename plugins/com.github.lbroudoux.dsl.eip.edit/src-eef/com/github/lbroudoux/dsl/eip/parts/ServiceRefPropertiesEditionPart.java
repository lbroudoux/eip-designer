/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;


// End of user code

/**
 * @author yanngv29
 * 
 */
public interface ServiceRefPropertiesEditionPart {

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
	 * @return the reference
	 * 
	 */
	public String getReference();

	/**
	 * Defines a new reference
	 * @param newValue the new reference to set
	 * 
	 */
	public void setReference(String newValue);


	/**
	 * @return the operations
	 * 
	 */
	public EList getOperations();

	/**
	 * Defines a new operations
	 * @param newValue the new operations to set
	 * 
	 */
	public void setOperations(EList newValue);

	/**
	 * Add a value to the operations multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToOperations(Object newValue);

	/**
	 * Remove a value to the operations multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToOperations(Object newValue);





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
