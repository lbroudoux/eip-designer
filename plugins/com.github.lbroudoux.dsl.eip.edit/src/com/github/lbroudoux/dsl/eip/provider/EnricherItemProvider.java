/**
 */
package com.github.lbroudoux.dsl.eip.provider;


import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.Enricher;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.github.lbroudoux.dsl.eip.Enricher} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EnricherItemProvider 
	extends InvocableEndpointItemProvider {
	/**
    * This constructs an instance from a factory and a notifier.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EnricherItemProvider(AdapterFactory adapterFactory) {
      super(adapterFactory);
   }

	/**
    * This returns the property descriptors for the adapted class.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
      if (itemPropertyDescriptors == null) {
         super.getPropertyDescriptors(object);

         addPartPropertyDescriptor(object);
      }
      return itemPropertyDescriptors;
   }

	/**
    * This adds a property descriptor for the Part feature.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	protected void addPartPropertyDescriptor(Object object) {
      itemPropertyDescriptors.add
         (createItemPropertyDescriptor
            (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
             getResourceLocator(),
             getString("_UI_Enricher_part_feature"),
             getString("_UI_PropertyDescriptor_description", "_UI_Enricher_part_feature", "_UI_Enricher_type"),
             EipPackage.Literals.ENRICHER__PART,
             true,
             false,
             false,
             ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
             null,
             null));
   }

	/**
    * This returns Enricher.gif.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	public Object getImage(Object object) {
      return overlayImage(object, getResourceLocator().getImage("full/obj16/Enricher"));
   }

	/**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected boolean shouldComposeCreationImage() {
      return true;
   }

   /**
    * This returns the label text for the adapted class.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	public String getText(Object object) {
      String label = ((Enricher)object).getName();
      return label == null || label.length() == 0 ?
         getString("_UI_Enricher_type") :
         getString("_UI_Enricher_type") + " " + label;
   }
	

	/**
    * This handles model notifications by calling {@link #updateChildren} to update any cached
    * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	public void notifyChanged(Notification notification) {
      updateChildren(notification);

      switch (notification.getFeatureID(Enricher.class)) {
         case EipPackage.ENRICHER__PART:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
      }
      super.notifyChanged(notification);
   }

	/**
    * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
    * that can be created under this object.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
      super.collectNewChildDescriptors(newChildDescriptors, object);
   }

}
