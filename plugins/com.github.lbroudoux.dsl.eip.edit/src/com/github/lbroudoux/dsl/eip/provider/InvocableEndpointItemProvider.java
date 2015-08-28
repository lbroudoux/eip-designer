/**
 */
package com.github.lbroudoux.dsl.eip.provider;


import com.github.lbroudoux.dsl.eip.EipFactory;
import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.InvocableEndpoint;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.github.lbroudoux.dsl.eip.InvocableEndpoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InvocableEndpointItemProvider 
	extends MetadatableItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InvocableEndpointItemProvider(AdapterFactory adapterFactory) {
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
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addNamePropertyDescriptor(object);
      addToChannelsPropertyDescriptor(object);
      addFromChannelsPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

	/**
   * This adds a property descriptor for the Name feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Endpoint_name_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Endpoint_name_feature", "_UI_Endpoint_type"),
         EipPackage.Literals.ENDPOINT__NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the To Channels feature.
   * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
   * @generated
   */
   protected void addToChannelsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Endpoint_toChannels_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Endpoint_toChannels_feature", "_UI_Endpoint_type"),
         EipPackage.Literals.ENDPOINT__TO_CHANNELS,
         true,
         false,
         true,
         null,
         null,
         null));
  }

   /**
   * This adds a property descriptor for the From Channels feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addFromChannelsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Endpoint_fromChannels_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Endpoint_fromChannels_feature", "_UI_Endpoint_type"),
         EipPackage.Literals.ENDPOINT__FROM_CHANNELS,
         true,
         false,
         true,
         null,
         null,
         null));
  }

	/**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(EipPackage.Literals.INVOCABLE_ENDPOINT__OWNED_SERVICE_INVOCATIONS);
    }
    return childrenFeatures;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

	/**
   * This returns InvocableEndpoint.gif.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/InvocableEndpoint"));
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
    String label = ((InvocableEndpoint)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_InvocableEndpoint_type") :
      getString("_UI_InvocableEndpoint_type") + " " + label;
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

    switch (notification.getFeatureID(InvocableEndpoint.class))
    {
      case EipPackage.INVOCABLE_ENDPOINT__NAME:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case EipPackage.INVOCABLE_ENDPOINT__OWNED_SERVICE_INVOCATIONS:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

    newChildDescriptors.add
      (createChildParameter
        (EipPackage.Literals.INVOCABLE_ENDPOINT__OWNED_SERVICE_INVOCATIONS,
         EipFactory.eINSTANCE.createServiceInvocation()));
  }

}
