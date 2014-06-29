/**
 */
package KragsteinPackage.impl;

import KragsteinPackage.KragsteinPackagePackage;
import KragsteinPackage.Link;
import KragsteinPackage.Unit;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link KragsteinPackage.impl.UnitImpl#getSourceLink <em>Source Link</em>}</li>
 *   <li>{@link KragsteinPackage.impl.UnitImpl#getTargetLink <em>Target Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UnitImpl extends EObjectImpl implements Unit {
	/**
	 * The cached value of the '{@link #getSourceLink() <em>Source Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> sourceLink;

	/**
	 * The cached value of the '{@link #getTargetLink() <em>Target Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> targetLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KragsteinPackagePackage.Literals.UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getSourceLink() {
		if (sourceLink == null) {
			sourceLink = new EObjectContainmentEList<Link>(Link.class, this, KragsteinPackagePackage.UNIT__SOURCE_LINK);
		}
		return sourceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getTargetLink() {
		if (targetLink == null) {
			targetLink = new EObjectContainmentEList<Link>(Link.class, this, KragsteinPackagePackage.UNIT__TARGET_LINK);
		}
		return targetLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KragsteinPackagePackage.UNIT__SOURCE_LINK:
				return ((InternalEList<?>)getSourceLink()).basicRemove(otherEnd, msgs);
			case KragsteinPackagePackage.UNIT__TARGET_LINK:
				return ((InternalEList<?>)getTargetLink()).basicRemove(otherEnd, msgs);
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
			case KragsteinPackagePackage.UNIT__SOURCE_LINK:
				return getSourceLink();
			case KragsteinPackagePackage.UNIT__TARGET_LINK:
				return getTargetLink();
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
			case KragsteinPackagePackage.UNIT__SOURCE_LINK:
				getSourceLink().clear();
				getSourceLink().addAll((Collection<? extends Link>)newValue);
				return;
			case KragsteinPackagePackage.UNIT__TARGET_LINK:
				getTargetLink().clear();
				getTargetLink().addAll((Collection<? extends Link>)newValue);
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
			case KragsteinPackagePackage.UNIT__SOURCE_LINK:
				getSourceLink().clear();
				return;
			case KragsteinPackagePackage.UNIT__TARGET_LINK:
				getTargetLink().clear();
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
			case KragsteinPackagePackage.UNIT__SOURCE_LINK:
				return sourceLink != null && !sourceLink.isEmpty();
			case KragsteinPackagePackage.UNIT__TARGET_LINK:
				return targetLink != null && !targetLink.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UnitImpl
