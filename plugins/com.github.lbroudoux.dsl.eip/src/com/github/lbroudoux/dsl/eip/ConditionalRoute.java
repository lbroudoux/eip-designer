/**
 */
package com.github.lbroudoux.dsl.eip;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.ConditionalRoute#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.ConditionalRoute#getChannel <em>Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.lbroudoux.dsl.eip.EipPackage#getConditionalRoute()
 * @model
 * @generated
 */
public interface ConditionalRoute extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see com.github.lbroudoux.dsl.eip.EipPackage#getConditionalRoute_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link com.github.lbroudoux.dsl.eip.ConditionalRoute#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' reference.
	 * @see #setChannel(Channel)
	 * @see com.github.lbroudoux.dsl.eip.EipPackage#getConditionalRoute_Channel()
	 * @model required="true"
	 * @generated
	 */
	Channel getChannel();

	/**
	 * Sets the value of the '{@link com.github.lbroudoux.dsl.eip.ConditionalRoute#getChannel <em>Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel</em>' reference.
	 * @see #getChannel()
	 * @generated
	 */
	void setChannel(Channel value);

} // ConditionalRoute
