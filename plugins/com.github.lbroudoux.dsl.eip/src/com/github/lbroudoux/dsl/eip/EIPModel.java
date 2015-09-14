/**
 */
package com.github.lbroudoux.dsl.eip;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EIP Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.EIPModel#getOwnedRoutes <em>Owned Routes</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.EIPModel#getOwnedServiceRefs <em>Owned Service Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.lbroudoux.dsl.eip.EipPackage#getEIPModel()
 * @model
 * @generated
 */
public interface EIPModel extends EObject {
	/**
    * Returns the value of the '<em><b>Owned Routes</b></em>' containment reference list.
    * The list contents are of type {@link com.github.lbroudoux.dsl.eip.Route}.
    * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Routes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
    * @return the value of the '<em>Owned Routes</em>' containment reference list.
    * @see com.github.lbroudoux.dsl.eip.EipPackage#getEIPModel_OwnedRoutes()
    * @model containment="true"
    * @generated
    */
	EList<Route> getOwnedRoutes();

   /**
    * Returns the value of the '<em><b>Owned Service Refs</b></em>' containment reference list.
    * The list contents are of type {@link com.github.lbroudoux.dsl.eip.ServiceRef}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Owned Service Refs</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Owned Service Refs</em>' containment reference list.
    * @see com.github.lbroudoux.dsl.eip.EipPackage#getEIPModel_OwnedServiceRefs()
    * @model containment="true"
    * @generated
    */
   EList<ServiceRef> getOwnedServiceRefs();

} // EIPModel
