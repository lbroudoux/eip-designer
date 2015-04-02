/**
 */
package com.github.lbroudoux.dsl.eip;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.CompositeProcessor#getOwnedEndpoints <em>Owned Endpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.lbroudoux.dsl.eip.EipPackage#getCompositeProcessor()
 * @model
 * @generated
 */
public interface CompositeProcessor extends Endpoint {
	/**
	 * Returns the value of the '<em><b>Owned Endpoints</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.lbroudoux.dsl.eip.Endpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Endpoints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Endpoints</em>' containment reference list.
	 * @see com.github.lbroudoux.dsl.eip.EipPackage#getCompositeProcessor_OwnedEndpoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Endpoint> getOwnedEndpoints();

} // CompositeProcessor
