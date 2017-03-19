/**
 */
package xPPU.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import xPPU.ComponentRepository.ComponentRepositoryFactory;

import xPPU.Identifier.provider.IdentifierItemProvider;

import xPPU.InterfaceRepository.InterfaceRepositoryFactory;

import xPPU.Plant;

import xPPU.StructureRepository.StructureRepositoryFactory;

import xPPU.XPPUPackage;

/**
 * This is the item provider adapter for a {@link xPPU.Plant} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlantItemProvider extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlantItemProvider(AdapterFactory adapterFactory) {
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

			addPlantNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Plant Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlantNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Plant_PlantName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plant_PlantName_feature", "_UI_Plant_type"),
				 XPPUPackage.Literals.PLANT__PLANT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(XPPUPackage.Literals.PLANT__STRUCTURES);
			childrenFeatures.add(XPPUPackage.Literals.PLANT__INTERFACE_REPOSITORY);
			childrenFeatures.add(XPPUPackage.Literals.PLANT__COMPONENT_REPOSITORY);
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
	 * This returns Plant.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Plant"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Plant)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Plant_type") :
			getString("_UI_Plant_type") + " " + label;
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

		switch (notification.getFeatureID(Plant.class)) {
			case XPPUPackage.PLANT__PLANT_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XPPUPackage.PLANT__STRUCTURES:
			case XPPUPackage.PLANT__INTERFACE_REPOSITORY:
			case XPPUPackage.PLANT__COMPONENT_REPOSITORY:
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
				(XPPUPackage.Literals.PLANT__STRUCTURES,
				 StructureRepositoryFactory.eINSTANCE.createCommunicationNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.PLANT__STRUCTURES,
				 StructureRepositoryFactory.eINSTANCE.createPowerNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.PLANT__STRUCTURES,
				 StructureRepositoryFactory.eINSTANCE.createControlCabinet()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.PLANT__STRUCTURES,
				 StructureRepositoryFactory.eINSTANCE.createPneumaticNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.PLANT__STRUCTURES,
				 StructureRepositoryFactory.eINSTANCE.createConveyor()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.PLANT__STRUCTURES,
				 StructureRepositoryFactory.eINSTANCE.createCrane()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.PLANT__STRUCTURES,
				 StructureRepositoryFactory.eINSTANCE.createPowerWiring()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.PLANT__INTERFACE_REPOSITORY,
				 InterfaceRepositoryFactory.eINSTANCE.createInterfaceRepository()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.PLANT__COMPONENT_REPOSITORY,
				 ComponentRepositoryFactory.eINSTANCE.createComponentRepository()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return XppuEditPlugin.INSTANCE;
	}

}
