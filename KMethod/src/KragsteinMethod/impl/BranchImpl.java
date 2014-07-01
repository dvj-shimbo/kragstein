/**
 */
package KragsteinMethod.impl;

import KragsteinMethod.Branch;
import KragsteinMethod.BranchConnection;
import KragsteinMethod.KragsteinMethodPackage;
import KragsteinMethod.Route;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link KragsteinMethod.impl.BranchImpl#getTargetBranchConnection <em>Target Branch Connection</em>}</li>
 *   <li>{@link KragsteinMethod.impl.BranchImpl#getRoute <em>Route</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BranchImpl extends EObjectImpl implements Branch {
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
		return KragsteinMethodPackage.Literals.BRANCH;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.BRANCH__TARGET_BRANCH_CONNECTION, oldTargetBranchConnection, newTargetBranchConnection);
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
				msgs = ((InternalEObject)targetBranchConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KragsteinMethodPackage.BRANCH__TARGET_BRANCH_CONNECTION, null, msgs);
			if (newTargetBranchConnection != null)
				msgs = ((InternalEObject)newTargetBranchConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KragsteinMethodPackage.BRANCH__TARGET_BRANCH_CONNECTION, null, msgs);
			msgs = basicSetTargetBranchConnection(newTargetBranchConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.BRANCH__TARGET_BRANCH_CONNECTION, newTargetBranchConnection, newTargetBranchConnection));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.BRANCH__ROUTE, oldRoute, newRoute);
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
				msgs = ((InternalEObject)route).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KragsteinMethodPackage.BRANCH__ROUTE, null, msgs);
			if (newRoute != null)
				msgs = ((InternalEObject)newRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KragsteinMethodPackage.BRANCH__ROUTE, null, msgs);
			msgs = basicSetRoute(newRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.BRANCH__ROUTE, newRoute, newRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KragsteinMethodPackage.BRANCH__TARGET_BRANCH_CONNECTION:
				return basicSetTargetBranchConnection(null, msgs);
			case KragsteinMethodPackage.BRANCH__ROUTE:
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
			case KragsteinMethodPackage.BRANCH__TARGET_BRANCH_CONNECTION:
				return getTargetBranchConnection();
			case KragsteinMethodPackage.BRANCH__ROUTE:
				return getRoute();
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
			case KragsteinMethodPackage.BRANCH__TARGET_BRANCH_CONNECTION:
				setTargetBranchConnection((BranchConnection)newValue);
				return;
			case KragsteinMethodPackage.BRANCH__ROUTE:
				setRoute((Route)newValue);
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
			case KragsteinMethodPackage.BRANCH__TARGET_BRANCH_CONNECTION:
				setTargetBranchConnection((BranchConnection)null);
				return;
			case KragsteinMethodPackage.BRANCH__ROUTE:
				setRoute((Route)null);
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
			case KragsteinMethodPackage.BRANCH__TARGET_BRANCH_CONNECTION:
				return targetBranchConnection != null;
			case KragsteinMethodPackage.BRANCH__ROUTE:
				return route != null;
		}
		return super.eIsSet(featureID);
	}

} //BranchImpl
