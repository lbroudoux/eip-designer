/**
 */
package com.github.lbroudoux.dsl.eip;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadatable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.Metadatable#getOwnedMetadatas <em>Owned Metadatas</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.lbroudoux.dsl.eip.EipPackage#getMetadatable()
 * @model abstract="true"
 * @generated
 */
public interface Metadatable extends EObject {
   /**
    * Returns the value of the '<em><b>Owned Metadatas</b></em>' containment reference list.
    * The list contents are of type {@link com.github.lbroudoux.dsl.eip.Metadata}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Owned Metadatas</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Owned Metadatas</em>' containment reference list.
    * @see com.github.lbroudoux.dsl.eip.EipPackage#getMetadatable_OwnedMetadatas()
    * @model containment="true"
    * @generated
    */
   EList<Metadata> getOwnedMetadatas();

} // Metadatable
