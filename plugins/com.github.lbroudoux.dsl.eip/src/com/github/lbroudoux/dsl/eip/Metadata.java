/**
 */
package com.github.lbroudoux.dsl.eip;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.Metadata#getKey <em>Key</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.Metadata#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.lbroudoux.dsl.eip.EipPackage#getMetadata()
 * @model
 * @generated
 */
public interface Metadata extends EObject {
   /**
    * Returns the value of the '<em><b>Key</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Key</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Key</em>' attribute.
    * @see #setKey(String)
    * @see com.github.lbroudoux.dsl.eip.EipPackage#getMetadata_Key()
    * @model required="true"
    * @generated
    */
   String getKey();

   /**
    * Sets the value of the '{@link com.github.lbroudoux.dsl.eip.Metadata#getKey <em>Key</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Key</em>' attribute.
    * @see #getKey()
    * @generated
    */
   void setKey(String value);

   /**
    * Returns the value of the '<em><b>Values</b></em>' attribute list.
    * The list contents are of type {@link java.lang.String}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Values</em>' attribute list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Values</em>' attribute list.
    * @see com.github.lbroudoux.dsl.eip.EipPackage#getMetadata_Values()
    * @model
    * @generated
    */
   EList<String> getValues();

} // Metadata
