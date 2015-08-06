/**
 */
package com.github.lbroudoux.dsl.eip.impl;

import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.Metadata;
import com.github.lbroudoux.dsl.eip.Metadatable;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadatable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.MetadatableImpl#getOwnedMetadatas <em>Owned Metadatas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MetadatableImpl extends MinimalEObjectImpl.Container implements Metadatable {
   /**
    * The cached value of the '{@link #getOwnedMetadatas() <em>Owned Metadatas</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOwnedMetadatas()
    * @generated
    * @ordered
    */
   protected EList<Metadata> ownedMetadatas;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected MetadatableImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return EipPackage.Literals.METADATABLE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Metadata> getOwnedMetadatas() {
      if (ownedMetadatas == null) {
         ownedMetadatas = new EObjectContainmentEList<Metadata>(Metadata.class, this, EipPackage.METADATABLE__OWNED_METADATAS);
      }
      return ownedMetadatas;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case EipPackage.METADATABLE__OWNED_METADATAS:
            return ((InternalEList<?>)getOwnedMetadatas()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case EipPackage.METADATABLE__OWNED_METADATAS:
            return getOwnedMetadatas();
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
         case EipPackage.METADATABLE__OWNED_METADATAS:
            getOwnedMetadatas().clear();
            getOwnedMetadatas().addAll((Collection<? extends Metadata>)newValue);
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
         case EipPackage.METADATABLE__OWNED_METADATAS:
            getOwnedMetadatas().clear();
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
         case EipPackage.METADATABLE__OWNED_METADATAS:
            return ownedMetadatas != null && !ownedMetadatas.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //MetadatableImpl
