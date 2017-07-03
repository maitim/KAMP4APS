/**
 */
package edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.provider;


import edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECRepositoryFactory;
import edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RepositoryItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
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
				 getString("_UI_Repository_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Repository_Name_feature", "_UI_Repository_type"),
				 IECRepositoryPackage.Literals.REPOSITORY__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Repository_Id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Repository_Id_feature", "_UI_Repository_type"),
				 IECRepositoryPackage.Literals.REPOSITORY__ID,
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
			childrenFeatures.add(IECRepositoryPackage.Literals.REPOSITORY__CONTAINS_PROGRAM);
			childrenFeatures.add(IECRepositoryPackage.Literals.REPOSITORY__CONTAINS_INTERFACE);
			childrenFeatures.add(IECRepositoryPackage.Literals.REPOSITORY__CONTAINS_FUNCTION_BLOCK);
			childrenFeatures.add(IECRepositoryPackage.Literals.REPOSITORY__CONTAINS_FUNCTION);
			childrenFeatures.add(IECRepositoryPackage.Literals.REPOSITORY__CONTAINS_VARIABLE);
			childrenFeatures.add(IECRepositoryPackage.Literals.REPOSITORY__CONTAINS_STATIC_FUNCTIONBLOCK);
			childrenFeatures.add(IECRepositoryPackage.Literals.REPOSITORY__CONTAINS_ENUM);
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
	 * This returns Repository.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Repository"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Repository)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Repository_type") :
			getString("_UI_Repository_type") + " " + label;
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

		switch (notification.getFeatureID(Repository.class)) {
			case IECRepositoryPackage.REPOSITORY__NAME:
			case IECRepositoryPackage.REPOSITORY__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case IECRepositoryPackage.REPOSITORY__CONTAINS_PROGRAM:
			case IECRepositoryPackage.REPOSITORY__CONTAINS_INTERFACE:
			case IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION_BLOCK:
			case IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION:
			case IECRepositoryPackage.REPOSITORY__CONTAINS_VARIABLE:
			case IECRepositoryPackage.REPOSITORY__CONTAINS_STATIC_FUNCTIONBLOCK:
			case IECRepositoryPackage.REPOSITORY__CONTAINS_ENUM:
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
				(IECRepositoryPackage.Literals.REPOSITORY__CONTAINS_PROGRAM,
				 IECRepositoryFactory.eINSTANCE.createProgram()));

		newChildDescriptors.add
			(createChildParameter
				(IECRepositoryPackage.Literals.REPOSITORY__CONTAINS_INTERFACE,
				 IECRepositoryFactory.eINSTANCE.createIECInterface()));

		newChildDescriptors.add
			(createChildParameter
				(IECRepositoryPackage.Literals.REPOSITORY__CONTAINS_FUNCTION_BLOCK,
				 IECRepositoryFactory.eINSTANCE.createFunctionBlock()));

		newChildDescriptors.add
			(createChildParameter
				(IECRepositoryPackage.Literals.REPOSITORY__CONTAINS_FUNCTION,
				 IECRepositoryFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(IECRepositoryPackage.Literals.REPOSITORY__CONTAINS_VARIABLE,
				 IECRepositoryFactory.eINSTANCE.createGlobalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(IECRepositoryPackage.Literals.REPOSITORY__CONTAINS_STATIC_FUNCTIONBLOCK,
				 IECRepositoryFactory.eINSTANCE.createStaticFunctionblock()));

		newChildDescriptors.add
			(createChildParameter
				(IECRepositoryPackage.Literals.REPOSITORY__CONTAINS_ENUM,
				 IECRepositoryFactory.eINSTANCE.createEnum()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return IECRepositoryEditPlugin.INSTANCE;
	}

}