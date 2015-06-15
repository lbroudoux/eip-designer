/**
 */
package com.github.lbroudoux.dsl.eip;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resequencer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.Resequencer#isStreamSequences <em>Stream Sequences</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.lbroudoux.dsl.eip.EipPackage#getResequencer()
 * @model
 * @generated
 */
public interface Resequencer extends Aggregator {
   /**
    * Returns the value of the '<em><b>Stream Sequences</b></em>' attribute.
    * The default value is <code>"false"</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * Whether to apply a stream semantic : send out ordered sequences as soon as they are available, or only after the whole message group arrives.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Stream Sequences</em>' attribute.
    * @see #setStreamSequences(boolean)
    * @see com.github.lbroudoux.dsl.eip.EipPackage#getResequencer_StreamSequences()
    * @model default="false"
    * @generated
    */
   boolean isStreamSequences();

   /**
    * Sets the value of the '{@link com.github.lbroudoux.dsl.eip.Resequencer#isStreamSequences <em>Stream Sequences</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Stream Sequences</em>' attribute.
    * @see #isStreamSequences()
    * @generated
    */
   void setStreamSequences(boolean value);

} // Resequencer
