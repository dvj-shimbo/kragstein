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
 *   <li>{@link kragstein.impl.BranchImpl#getSourceConnection <em>Source Connection</em>}</li>
 *   <li>{@link kragstein.impl.BranchImpl#getTargetConnection <em>Target Connection</em>}</li>
 *   <li>{@link kragstein.impl.BranchImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link kragstein.impl.BranchImpl#getName <em>Name</em>}</li>
 *   <li>{@link kragstein.impl.BranchImpl#isIsLoop <em>Is Loop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BranchImpl extends MinimalEObjectImpl.Container implements Branch {
	/**
	 * The cached value of the '{@link #getSourceConnection() <em>Source Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceConnection()
	 * @generated
	 * @ordered
	 */
	protected BranchConnection sourceConnection;

	/**
	 * The cached value of the '{@link #getTargetConnection() <em>Target Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetConnection()
	 * @generated
	 * @ordered
	 */
	protected BranchConnection targetConnection;

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
	 * The default value of the '{@link #isIsLoop() <em>Is Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLoop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOOP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLoop() <em>Is Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLoop()
	 * @generated
	 * @ordered
	 */
	protected boolean isLoop = IS_LOOP_EDEFAULT;

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
	public BranchConnection getSourceConnection() {
		return sourceConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceConnection(BranchConnection newSourceConnection, NotificationChain msgs) {
		BranchConnection oldSourceConnection = sourceConnection;
		sourceConnection = newSourceConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KragsteinPackage.BRANCH__SOURCE_CONNECTION, oldSourceConnection, newSourceConnection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceConnection(BranchConnection newSourceConnection) {
		if (newSourceConnection != sourceConnection) {
			NotificationChain msgs = null;
			if (sourceConnection != null)
				msgs = ((InternalEObject)sourceConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.BRANCH__SOURCE_CONNECTION, null, msgs);
			if (newSourceConnection != null)
				msgs = ((InternalEObject)newSourceConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.BRANCH__SOURCE_CONNECTION, null, msgs);
			msgs = basicSetSourceConnection(newSourceConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackage.BRANCH__SOURCE_CONNECTION, newSourceConnection, newSourceConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchConnection getTargetConnection() {
		return targetConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetConnection(BranchConnection newTargetConnection, NotificationChain msgs) {
		BranchConnection oldTargetConnection = targetConnection;
		targetConnection = newTargetConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KragsteinPackage.BRANCH__TARGET_CONNECTION, oldTargetConnection, newTargetConnection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetConnection(BranchConnection newTargetConnection) {
		if (newTargetConnection != targetConnection) {
			NotificationChain msgs = null;
			if (targetConnection != null)
				msgs = ((InternalEObject)targetConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.BRANCH__TARGET_CONNECTION, null, msgs);
			if (newTargetConnection != null)
				msgs = ((InternalEObject)newTargetConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.BRANCH__TARGET_CONNECTION, null, msgs);
			msgs = basicSetTargetConnection(newTargetConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackage.BRANCH__TARGET_CONNECTION, newTargetConnection, newTargetConnection));
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
	public boolean isIsLoop() {
		return isLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLoop(boolean newIsLoop) {
		boolean oldIsLoop = isLoop;
		isLoop = newIsLoop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackage.BRANCH__IS_LOOP, oldIsLoop, isLoop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KragsteinPackage.BRANCH__SOURCE_CONNECTION:
				return basicSetSourceConnection(null, msgs);
			case KragsteinPackage.BRANCH__TARGET_CONNECTION:
				return basicSetTargetConnection(null, msgs);
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
			case KragsteinPackage.BRANCH__SOURCE_CONNECTION:
				return getSourceConnection();
			case KragsteinPackage.BRANCH__TARGET_CONNECTION:
				return getTargetConnection();
			case KragsteinPackage.BRANCH__ROUTE:
				return getRoute();
			case KragsteinPackage.BRANCH__NAME:
				return getName();
			case KragsteinPackage.BRANCH__IS_LOOP:
				return isIsLoop();
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
			case KragsteinPackage.BRANCH__SOURCE_CONNECTION:
				setSourceConnection((BranchConnection)newValue);
				return;
			case KragsteinPackage.BRANCH__TARGET_CONNECTION:
				setTargetConnection((BranchConnection)newValue);
				return;
			case KragsteinPackage.BRANCH__ROUTE:
				setRoute((Route)newValue);
				return;
			case KragsteinPackage.BRANCH__NAME:
				setName((String)newValue);
				return;
			case KragsteinPackage.BRANCH__IS_LOOP:
				setIsLoop((Boolean)newValue);
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
			case KragsteinPackage.BRANCH__SOURCE_CONNECTION:
				setSourceConnection((BranchConnection)null);
				return;
			case KragsteinPackage.BRANCH__TARGET_CONNECTION:
				setTargetConnection((BranchConnection)null);
				return;
			case KragsteinPackage.BRANCH__ROUTE:
				setRoute((Route)null);
				return;
			case KragsteinPackage.BRANCH__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KragsteinPackage.BRANCH__IS_LOOP:
				setIsLoop(IS_LOOP_EDEFAULT);
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
			case KragsteinPackage.BRANCH__SOURCE_CONNECTION:
				return sourceConnection != null;
			case KragsteinPackage.BRANCH__TARGET_CONNECTION:
				return targetConnection != null;
			case KragsteinPackage.BRANCH__ROUTE:
				return route != null;
			case KragsteinPackage.BRANCH__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KragsteinPackage.BRANCH__IS_LOOP:
				return isLoop != IS_LOOP_EDEFAULT;
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
		result.append(", isLoop: ");
		result.append(isLoop);
		result.append(')');
		return result.toString();
	}

} //BranchImpl
