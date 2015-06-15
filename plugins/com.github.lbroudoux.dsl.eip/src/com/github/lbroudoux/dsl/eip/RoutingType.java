/**
 */
package com.github.lbroudoux.dsl.eip;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Routing Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.github.lbroudoux.dsl.eip.EipPackage#getRoutingType()
 * @model
 * @generated
 */
public enum RoutingType implements Enumerator {
	/**
    * The '<em><b>HEADER VALUE</b></em>' literal object.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #HEADER_VALUE_VALUE
    * @generated
    * @ordered
    */
	HEADER_VALUE(0, "HEADER_VALUE", "HEADER_VALUE"),

	/**
    * The '<em><b>PAYLOAD VALUE</b></em>' literal object.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #PAYLOAD_VALUE_VALUE
    * @generated
    * @ordered
    */
	PAYLOAD_VALUE(0, "PAYLOAD_VALUE", "PAYLOAD_VALUE"),

	/**
    * The '<em><b>PAYLOAD TYPE</b></em>' literal object.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #PAYLOAD_TYPE_VALUE
    * @generated
    * @ordered
    */
	PAYLOAD_TYPE(0, "PAYLOAD_TYPE", "PAYLOAD_TYPE");

	/**
    * The '<em><b>HEADER VALUE</b></em>' literal value.
    * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HEADER VALUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
    * @see #HEADER_VALUE
    * @model
    * @generated
    * @ordered
    */
	public static final int HEADER_VALUE_VALUE = 0;

	/**
    * The '<em><b>PAYLOAD VALUE</b></em>' literal value.
    * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAYLOAD VALUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
    * @see #PAYLOAD_VALUE
    * @model
    * @generated
    * @ordered
    */
	public static final int PAYLOAD_VALUE_VALUE = 0;

	/**
    * The '<em><b>PAYLOAD TYPE</b></em>' literal value.
    * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAYLOAD TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
    * @see #PAYLOAD_TYPE
    * @model
    * @generated
    * @ordered
    */
	public static final int PAYLOAD_TYPE_VALUE = 0;

	/**
    * An array of all the '<em><b>Routing Type</b></em>' enumerators.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private static final RoutingType[] VALUES_ARRAY =
		new RoutingType[] {
         HEADER_VALUE,
         PAYLOAD_VALUE,
         PAYLOAD_TYPE,
      };

	/**
    * A public read-only list of all the '<em><b>Routing Type</b></em>' enumerators.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public static final List<RoutingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
    * Returns the '<em><b>Routing Type</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public static RoutingType get(String literal) {
      for (int i = 0; i < VALUES_ARRAY.length; ++i) {
         RoutingType result = VALUES_ARRAY[i];
         if (result.toString().equals(literal)) {
            return result;
         }
      }
      return null;
   }

	/**
    * Returns the '<em><b>Routing Type</b></em>' literal with the specified name.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public static RoutingType getByName(String name) {
      for (int i = 0; i < VALUES_ARRAY.length; ++i) {
         RoutingType result = VALUES_ARRAY[i];
         if (result.getName().equals(name)) {
            return result;
         }
      }
      return null;
   }

	/**
    * Returns the '<em><b>Routing Type</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public static RoutingType get(int value) {
      switch (value) {
         case HEADER_VALUE_VALUE: return HEADER_VALUE;
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
	private RoutingType(int value, String name, String literal) {
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
	
} //RoutingType
