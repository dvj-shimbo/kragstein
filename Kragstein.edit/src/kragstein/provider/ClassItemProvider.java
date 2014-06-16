/**
 */
package kragstein.provider;


import java.util.Collection;
import java.util.List;

import kragstein.KragsteinFactory;
import kragstein.KragsteinPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link kragstein.Class} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassItemProvider extends UnitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(KragsteinPackage.Literals.CLASS__TARGET_CONNECTIONS);
			childrenFeatures.add(KragsteinPackage.Literals.CLASS__SOURCE_CONNECTIONS);
			childrenFeatures.add(KragsteinPackage.Literals.CLASS__ATTRIBUTES);
			childrenFeatures.add(KragsteinPackage.Literals.CLASS__METHODS);
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
	 * This returns Class.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Class"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((kragstein.Class)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Class_type") :
			getString("_UI_Class_type") + " " + label;
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

		switch (notification.getFeatureID(kragstein.Class.class)) {
			case KragsteinPackage.CLASS__TARGET_CONNECTIONS:
			case KragsteinPackage.CLASS__SOURCE_CONNECTIONS:
			case KragsteinPackage.CLASS__ATTRIBUTES:
			case KragsteinPackage.CLASS__METHODS:
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
				(KragsteinPackage.Literals.CLASS__TARGET_CONNECTIONS,
				 KragsteinFactory.eINSTANCE.createRealization()));

		newChildDescriptors.add
			(createChildParameter
				(KragsteinPackage.Literals.CLASS__TARGET_CONNECTIONS,
				 KragsteinFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(KragsteinPackage.Literals.CLASS__TARGET_CONNECTIONS,
				 KragsteinFactory.eINSTANCE.createAggregation()));

		newChildDescriptors.add
			(createChildParameter
				(KragsteinPackage.Literals.CLASS__TARGET_CONNECTIONS,
				 KragsteinFactory.eINSTANCE.createComposition()));

		newChildDescriptors.add
			(createChildParameter
				(KragsteinPackage.Literals.CLASS__TARGET_CONNECTIONS,
				 KragsteinFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(KragsteinPackage.Literals.CLASS__SOURCE_CONNECTIONS,
				 KragsteinFactory.eINSTANCE.createRealization()));

		newChildDescriptors.add
			(createChildParameter
				(KragsteinPackage.Literals.CLASS__SOURCE_CONNECTIONS,
				 KragsteinFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(KragsteinPackage.Literals.CLASS__SOURCE_CONNECTIONS,
				 KragsteinFactory.eINSTANCE.createAggregation()));

		newChildDescriptors.add
			(createChildParameter
				(KragsteinPackage.Literals.CLASS__SOURCE_CONNECTIONS,
				 KragsteinFactory.eINSTANCE.createComposition()));

		newChildDescriptors.add
			(createChildParameter
				(KragsteinPackage.Literals.CLASS__SOURCE_CONNECTIONS,
				 KragsteinFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(KragsteinPackage.Literals.CLASS__ATTRIBUTES,
				 KragsteinFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(KragsteinPackage.Literals.CLASS__METHODS,
				 KragsteinFactory.eINSTANCE.createMethod()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == KragsteinPackage.Literals.UNIT__SOURCE_CONNECTION ||
			childFeature == KragsteinPackage.Literals.UNIT__TARGET_CONNECTION ||
			childFeature == KragsteinPackage.Literals.CLASS__TARGET_CONNECTIONS ||
			childFeature == KragsteinPackage.Literals.CLASS__SOURCE_CONNECTIONS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
