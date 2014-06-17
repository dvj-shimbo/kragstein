/**
 */
package kragstein.impl;

import kragstein.Branch;
import kragstein.BranchConnection;
import kragstein.KragsteinPackage;
import kragstein.Route;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kragstein.impl.BranchImpl#getSourceBranchConnection <em>Source Branch Connection</em>}</li>
 *   <li>{@link kragstein.impl.BranchImpl#getTargetBranchConnection <em>Target Branch Connection</em>}</li>
 *   <li>{@link kragstein.impl.BranchImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link kragstein.impl.BranchImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BranchImpl extends MinimalEObjectImpl.Container implements Branch {
	/**
	 * The cached value of the '{@link #getSourceBranchConnection() <em>Source Branch Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceBranchConnection()
	 * @generated
	 * @ordered
	 */
	protected BranchConnection sourceBranchConnection;

	/**
	 * The cached value of the '{@link #getTargetBranchConnection() <em>Target Branch Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetBranchConnection()
	 * @generated
	 * @ordered
	 */
	protected BranchConnection targetBranchConnection;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected Route route;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KragsteinPackage.Literals.BRANCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchConnection getSourceBranchConnection() {
		return sourceBranchConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceBranchConnection(BranchConnection newSourceBranchConnection, NotificationChain msgs) {
		BranchConnection oldSourceBranchConnection = sourceBranchConnection;
		sourceBranchConnection = newSourceBranchConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KragsteinPackage.BRANCH__SOURCE_BRANCH_CONNECTION, oldSourceBranchConnection, newSourceBranchConnection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceBranchConnection(BranchConnection newSourceBranchConnection) {
		if (newSourceBranchConnection != sourceBranchConnection) {
			NotificationChain msgs = null;
			if (sourceBranchConnection != null)
				msgs = ((InternalEObject)sourceBranchConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.BRANCH__SOURCE_BRANCH_CONNECTION, null, msgs);
			if (newSourceBranchConnection != null)
				msgs = ((InternalEObject)newSourceBranchConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.BRANCH__SOURCE_BRANCH_CONNECTION, null, msgs);
			msgs = basicSetSourceBranchConnection(newSourceBranchConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackage.BRANCH__SOURCE_BRANCH_CONNECTION, newSourceBranchConnection, newSourceBranchConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchConnection getTargetBranchConnection() {
		return targetBranchConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetBranchConnection(BranchConnection newTargetBranchConnection, NotificationChain msgs) {
		BranchConnection oldTargetBranchConnection = targetBranchConnection;
		targetBranchConnection = newTargetBranchConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KragsteinPackage.BRANCH__TARGET_BRANCH_CONNECTION, oldTargetBranchConnection, newTargetBranchConnection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetBranchConnection(BranchConnection newTargetBranchConnection) {
		if (newTargetBranchConnection != targetBranchConnection) {
			NotificationChain msgs = null;
			if (targetBranchConnection != null)
				msgs = ((InternalEObject)targetBranchConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.BRANCH__TARGET_BRANCH_CONNECTION, null, msgs);
			if (newTargetBranchConnection != null)
				msgs = ((InternalEObject)newTargetBranchConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.BRANCH__TARGET_BRANCH_CONNECTION, null, msgs);
			msgs = basicSetTargetBranchConnection(newTargetBranchConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackage.BRANCH__TARGET_BRANCH_CONNECTION, newTargetBranchConnection, newTargetBranchConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route getRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoute(Route newRoute, NotificationChain msgs) {
		Route oldRoute = route;
		route = newRoute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KragsteinPackage.BRANCH__ROUTE, oldRoute, newRoute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(Route newRoute) {
		if (newRoute != route) {
			NotificationChain msgs = null;
			if (route != null)
				msgs = ((InternalEObject)route).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.BRANCH__ROUTE, null, msgs);
			if (newRoute != null)
				msgs = ((InternalEObject)newRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.BRANCH__ROUTE, null, msgs);
			msgs = basicSetRoute(newRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackage.BRANCH__ROUTE, newRoute, newRoute));
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackage.BRANCH__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KragsteinPackage.BRANCH__SOURCE_BRANCH_CONNECTION:
				return basicSetSourceBranchConnection(null, msgs);
			case KragsteinPackage.BRANCH__TARGET_BRANCH_CONNECTION:
				return basicSetTargetBranchConnection(null, msgs);
			case KragsteinPackage.BRANCH__ROUTE:
				return basicSetRoute(null, msgs);
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
			case KragsteinPackage.BRANCH__SOURCE_BRANCH_CONNECTION:
				return getSourceBranchConnection();
			case KragsteinPackage.BRANCH__TARGET_BRANCH_CONNECTION:
				return getTargetBranchConnection();
			case KragsteinPackage.BRANCH__ROUTE:
				return getRoute();
			case KragsteinPackage.BRANCH__NAME:
				return getName();
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
			case KragsteinPackage.BRANCH__SOURCE_BRANCH_CONNECTION:
				setSourceBranchConnection((BranchConnection)newValue);
				return;
			case KragsteinPackage.BRANCH__TARGET_BRANCH_CONNECTION:
				setTargetBranchConnection((BranchConnection)newValue);
				return;
			case KragsteinPackage.BRANCH__ROUTE:
				setRoute((Route)newValue);
				return;
			case KragsteinPackage.BRANCH__NAME:
				setName((String)newValue);
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
			case KragsteinPackage.BRANCH__SOURCE_BRANCH_CONNECTION:
				setSourceBranchConnection((BranchConnection)null);
				return;
			case KragsteinPackage.BRANCH__TARGET_BRANCH_CONNECTION:
				setTargetBranchConnection((BranchConnection)null);
				return;
			case KragsteinPackage.BRANCH__ROUTE:
				setRoute((Route)null);
				return;
			case KragsteinPackage.BRANCH__NAME:
				setName(NAME_EDEFAULT);
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
			case KragsteinPackage.BRANCH__SOURCE_BRANCH_CONNECTION:
				return sourceBranchConnection != null;
			case KragsteinPackage.BRANCH__TARGET_BRANCH_CONNECTION:
				return targetBranchConnection != null;
			case KragsteinPackage.BRANCH__ROUTE:
				return route != null;
			case KragsteinPackage.BRANCH__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BranchImpl
