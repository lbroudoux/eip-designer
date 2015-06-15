/**
 */
package com.github.lbroudoux.dsl.eip;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.ServiceRef#getName <em>Name</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.ServiceRef#getReference <em>Reference</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.ServiceRef#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.lbroudoux.dsl.eip.EipPackage#getServiceRef()
 * @model
 * @generated
 */
public interface ServiceRef extends EObject {
	/**
    * Returns the value of the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
    * @return the value of the '<em>Name</em>' attribute.
    * @see #setName(String)
    * @see com.github.lbroudoux.dsl.eip.EipPackage#getServiceRef_Name()
    * @model required="true"
    * @generated
    */
	String getName();

	/**
    * Sets the value of the '{@link com.github.lbroudoux.dsl.eip.ServiceRef#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
	void setName(String value);

	/**
    * Returns the value of the '<em><b>Reference</b></em>' attribute.
    * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
    * @return the value of the '<em>Reference</em>' attribute.
    * @see #setReference(Object)
    * @see com.github.lbroudoux.dsl.eip.EipPackage#getServiceRef_Reference()
    * @model
    * @generated
    */
	Object getReference();

	/**
    * Sets the value of the '{@link com.github.lbroudoux.dsl.eip.ServiceRef#getReference <em>Reference</em>}' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @param value the new value of the '<em>Reference</em>' attribute.
    * @see #getReference()
    * @generated
    */
	void setReference(Object value);

	/**
    * Returns the value of the '<em><b>Operations</b></em>' attribute list.
    * The list contents are of type {@link java.lang.String}.
    * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
    * @return the value of the '<em>Operations</em>' attribute list.
    * @see com.github.lbroudoux.dsl.eip.EipPackage#getServiceRef_Operations()
    * @model
    * @generated
    */
	EList<String> getOperations();

} // ServiceRef
