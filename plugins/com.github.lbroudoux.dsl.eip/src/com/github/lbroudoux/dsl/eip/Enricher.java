/**
 */
package com.github.lbroudoux.dsl.eip;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enricher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.Enricher#getPart <em>Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.lbroudoux.dsl.eip.EipPackage#getEnricher()
 * @model
 * @generated
 */
public interface Enricher extends Endpoint {
	/**
	 * Returns the value of the '<em><b>Part</b></em>' attribute.
	 * The default value is <code>"PAYLOAD"</code>.
	 * The literals are from the enumeration {@link com.github.lbroudoux.dsl.eip.MessagePart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' attribute.
	 * @see com.github.lbroudoux.dsl.eip.MessagePart
	 * @see #setPart(MessagePart)
	 * @see com.github.lbroudoux.dsl.eip.EipPackage#getEnricher_Part()
	 * @model default="PAYLOAD"
	 * @generated
	 */
	MessagePart getPart();

	/**
	 * Sets the value of the '{@link com.github.lbroudoux.dsl.eip.Enricher#getPart <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' attribute.
	 * @see com.github.lbroudoux.dsl.eip.MessagePart
	 * @see #getPart()
	 * @generated
	 */
	void setPart(MessagePart value);

} // Enricher
