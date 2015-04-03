/**
 */
package com.github.lbroudoux.dsl.eip;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.Aggregator#getStrategy <em>Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.lbroudoux.dsl.eip.EipPackage#getAggregator()
 * @model
 * @generated
 */
public interface Aggregator extends Endpoint {

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' attribute.
	 * @see #setStrategy(String)
	 * @see com.github.lbroudoux.dsl.eip.EipPackage#getAggregator_Strategy()
	 * @model
	 * @generated
	 */
	String getStrategy();

	/**
	 * Sets the value of the '{@link com.github.lbroudoux.dsl.eip.Aggregator#getStrategy <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' attribute.
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(String value);
} // Aggregator
