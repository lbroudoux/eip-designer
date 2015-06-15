/**
 */
package com.github.lbroudoux.dsl.eip.impl;

import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.Resequencer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resequencer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.ResequencerImpl#isStreamSequences <em>Stream Sequences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResequencerImpl extends AggregatorImpl implements Resequencer {
   /**
    * The default value of the '{@link #isStreamSequences() <em>Stream Sequences</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isStreamSequences()
    * @generated
    * @ordered
    */
   protected static final boolean STREAM_SEQUENCES_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isStreamSequences() <em>Stream Sequences</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isStreamSequences()
    * @generated
    * @ordered
    */
   protected boolean streamSequences = STREAM_SEQUENCES_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ResequencerImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return EipPackage.Literals.RESEQUENCER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isStreamSequences() {
      return streamSequences;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setStreamSequences(boolean newStreamSequences) {
      boolean oldStreamSequences = streamSequences;
      streamSequences = newStreamSequences;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, EipPackage.RESEQUENCER__STREAM_SEQUENCES, oldStreamSequences, streamSequences));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case EipPackage.RESEQUENCER__STREAM_SEQUENCES:
            return isStreamSequences();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case EipPackage.RESEQUENCER__STREAM_SEQUENCES:
            setStreamSequences((Boolean)newValue);
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
         case EipPackage.RESEQUENCER__STREAM_SEQUENCES:
            setStreamSequences(STREAM_SEQUENCES_EDEFAULT);
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
         case EipPackage.RESEQUENCER__STREAM_SEQUENCES:
            return streamSequences != STREAM_SEQUENCES_EDEFAULT;
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
      result.append(" (streamSequences: ");
      result.append(streamSequences);
      result.append(')');
      return result.toString();
   }

} //ResequencerImpl
