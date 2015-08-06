/**
 */
package com.github.lbroudoux.dsl.eip.impl;

import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.Metadata;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.MetadataImpl#getKey <em>Key</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.MetadataImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetadataImpl extends MinimalEObjectImpl.Container implements Metadata {
   /**
    * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getKey()
    * @generated
    * @ordered
    */
   protected static final String KEY_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getKey()
    * @generated
    * @ordered
    */
   protected String key = KEY_EDEFAULT;

   /**
    * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getValues()
    * @generated
    * @ordered
    */
   protected EList<String> values;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected MetadataImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return EipPackage.Literals.METADATA;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getKey() {
      return key;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setKey(String newKey) {
      String oldKey = key;
      key = newKey;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, EipPackage.METADATA__KEY, oldKey, key));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<String> getValues() {
      if (values == null) {
         values = new EDataTypeUniqueEList<String>(String.class, this, EipPackage.METADATA__VALUES);
      }
      return values;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case EipPackage.METADATA__KEY:
            return getKey();
         case EipPackage.METADATA__VALUES:
            return getValues();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case EipPackage.METADATA__KEY:
            setKey((String)newValue);
            return;
         case EipPackage.METADATA__VALUES:
            getValues().clear();
            getValues().addAll((Collection<? extends String>)newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset(int featureID) {
      switch (featureID) {
         case EipPackage.METADATA__KEY:
            setKey(KEY_EDEFAULT);
            return;
         case EipPackage.METADATA__VALUES:
            getValues().clear();
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID) {
      switch (featureID) {
         case EipPackage.METADATA__KEY:
            return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
         case EipPackage.METADATA__VALUES:
            return values != null && !values.isEmpty();
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString() {
      if (eIsProxy()) return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (key: ");
      result.append(key);
      result.append(", values: ");
      result.append(values);
      result.append(')');
      return result.toString();
   }

} //MetadataImpl
