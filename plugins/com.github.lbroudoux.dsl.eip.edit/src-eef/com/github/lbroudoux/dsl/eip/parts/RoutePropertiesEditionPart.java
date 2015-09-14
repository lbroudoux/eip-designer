/**
 * Generated with Acceleo
 */
package com.github.lbroudoux.dsl.eip.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;


// End of user code

/**
 * @author yanngv29
 * 
 */
public interface RoutePropertiesEditionPart {

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
	 * @return the exchangeType
	 * 
	 */
	public Enumerator getExchangeType();

	/**
	 * Init the exchangeType
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initExchangeType(Object input, Enumerator current);

	/**
	 * Defines a new exchangeType
	 * @param newValue the new exchangeType to set
	 * 
	 */
	public void setExchangeType(Enumerator newValue);





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
