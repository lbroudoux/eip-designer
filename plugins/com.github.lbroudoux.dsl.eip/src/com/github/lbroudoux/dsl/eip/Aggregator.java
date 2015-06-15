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
 *   <li>{@link com.github.lbroudoux.dsl.eip.Aggregator#getPart <em>Part</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.Aggregator#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.Aggregator#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.lbroudoux.dsl.eip.EipPackage#getAggregator()
 * @model
 * @generated
 */
public interface Aggregator extends Endpoint {

	/**
    * Returns the value of the '<em><b>Part</b></em>' attribute.
    * The default value is <code>"HEADER"</code>.
    * The literals are from the enumeration {@link com.github.lbroudoux.dsl.eip.MessagePart}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Part</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The message part upon whom is made correlation before aggregation.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Part</em>' attribute.
    * @see com.github.lbroudoux.dsl.eip.MessagePart
    * @see #setPart(MessagePart)
    * @see com.github.lbroudoux.dsl.eip.EipPackage#getAggregator_Part()
    * @model default="HEADER"
    * @generated
    */
   MessagePart getPart();

   /**
    * Sets the value of the '{@link com.github.lbroudoux.dsl.eip.Aggregator#getPart <em>Part</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Part</em>' attribute.
    * @see com.github.lbroudoux.dsl.eip.MessagePart
    * @see #getPart()
    * @generated
    */
   void setPart(MessagePart value);

   /**
    * Returns the value of the '<em><b>Strategy</b></em>' attribute.
    * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The name of Aggregation strategy to use to correlate or merge the incoming message with previous ones.
    * <!-- end-model-doc -->
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

   /**
    * Returns the value of the '<em><b>Expression</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Expression</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The expression which evaluates the correlation key to use for aggregation.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Expression</em>' attribute.
    * @see #setExpression(String)
    * @see com.github.lbroudoux.dsl.eip.EipPackage#getAggregator_Expression()
    * @model
    * @generated
    */
   String getExpression();

   /**
    * Sets the value of the '{@link com.github.lbroudoux.dsl.eip.Aggregator#getExpression <em>Expression</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Expression</em>' attribute.
    * @see #getExpression()
    * @generated
    */
   void setExpression(String value);
} // Aggregator
