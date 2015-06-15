/**
 */
package com.github.lbroudoux.dsl.eip;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Exchange Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.github.lbroudoux.dsl.eip.EipPackage#getExchangeType()
 * @model
 * @generated
 */
public enum ExchangeType implements Enumerator {
   /**
    * The '<em><b>IN ONLY</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #IN_ONLY_VALUE
    * @generated
    * @ordered
    */
   IN_ONLY(0, "IN_ONLY", "IN_ONLY"),

   /**
    * The '<em><b>IN OUT</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #IN_OUT_VALUE
    * @generated
    * @ordered
    */
   IN_OUT(0, "IN_OUT", "IN_OUT");

   /**
    * The '<em><b>IN ONLY</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>IN ONLY</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #IN_ONLY
    * @model
    * @generated
    * @ordered
    */
   public static final int IN_ONLY_VALUE = 0;

   /**
    * The '<em><b>IN OUT</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>IN OUT</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #IN_OUT
    * @model
    * @generated
    * @ordered
    */
   public static final int IN_OUT_VALUE = 0;

   /**
    * An array of all the '<em><b>Exchange Type</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static final ExchangeType[] VALUES_ARRAY =
      new ExchangeType[] {
         IN_ONLY,
         IN_OUT,
      };

   /**
    * A public read-only list of all the '<em><b>Exchange Type</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final List<ExchangeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>Exchange Type</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static ExchangeType get(String literal) {
      for (int i = 0; i < VALUES_ARRAY.length; ++i) {
         ExchangeType result = VALUES_ARRAY[i];
         if (result.toString().equals(literal)) {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Exchange Type</b></em>' literal with the specified name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static ExchangeType getByName(String name) {
      for (int i = 0; i < VALUES_ARRAY.length; ++i) {
         ExchangeType result = VALUES_ARRAY[i];
         if (result.getName().equals(name)) {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Exchange Type</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static ExchangeType get(int value) {
      switch (value) {
         case IN_ONLY_VALUE: return IN_ONLY;
      }
      return null;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private final int value;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private final String name;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private final String literal;

   /**
    * Only this class can construct instances.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private ExchangeType(int value, String name, String literal) {
      this.value = value;
      this.name = name;
      this.literal = literal;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getValue() {
     return value;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getName() {
     return name;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getLiteral() {
     return literal;
   }

   /**
    * Returns the literal value of the enumerator, which is its string representation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString() {
      return literal;
   }
   
} //ExchangeType
