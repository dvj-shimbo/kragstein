/**
 */
package kragstein.impl;

import kragstein.Generalization;
import kragstein.KragsteinPackage;
import kragstein.Unit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kragstein.impl.UnitImpl#getName <em>Name</em>}</li>
 *   <li>{@link kragstein.impl.UnitImpl#getSourceConnection <em>Source Connection</em>}</li>
 *   <li>{@link kragstein.impl.UnitImpl#getTargetConnection <em>Target Connection</em>}</li>
 *   <li>{@link kragstein.impl.UnitImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UnitImpl extends MinimalEObjectImpl.Container implements Unit {
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
	 * The cached value of the '{@link #getSourceConnection() <em>Source Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceConnection()
	 * @generated
	 * @ordered
	 */
	protected Generalization sourceConnection;

	/**
	 * The cached value of the '{@link #getTargetConnection() <em>Target Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetConnection()
	 * @generated
	 * @ordered
	 */
	protected Generalization targetConnection;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected String visibility = VISIBILITY_EDEFAULT;

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
		return KragsteinPackage.Literals.UNIT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackage.UNIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization getSourceConnection() {
		return sourceConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceConnection(Generalization newSourceConnection, NotificationChain msgs) {
		Generalization oldSourceConnection = sourceConnection;
		sourceConnection = newSourceConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KragsteinPackage.UNIT__SOURCE_CONNECTION, oldSourceConnection, newSourceConnection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceConnection(Generalization newSourceConnection) {
		if (newSourceConnection != sourceConnection) {
			NotificationChain msgs = null;
			if (sourceConnection != null)
				msgs = ((InternalEObject)sourceConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.UNIT__SOURCE_CONNECTION, null, msgs);
			if (newSourceConnection != null)
				msgs = ((InternalEObject)newSourceConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.UNIT__SOURCE_CONNECTION, null, msgs);
			msgs = basicSetSourceConnection(newSourceConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackage.UNIT__SOURCE_CONNECTION, newSourceConnection, newSourceConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization getTargetConnection() {
		return targetConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetConnection(Generalization newTargetConnection, NotificationChain msgs) {
		Generalization oldTargetConnection = targetConnection;
		targetConnection = newTargetConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KragsteinPackage.UNIT__TARGET_CONNECTION, oldTargetConnection, newTargetConnection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetConnection(Generalization newTargetConnection) {
		if (newTargetConnection != targetConnection) {
			NotificationChain msgs = null;
			if (targetConnection != null)
				msgs = ((InternalEObject)targetConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.UNIT__TARGET_CONNECTION, null, msgs);
			if (newTargetConnection != null)
				msgs = ((InternalEObject)newTargetConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.UNIT__TARGET_CONNECTION, null, msgs);
			msgs = basicSetTargetConnection(newTargetConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackage.UNIT__TARGET_CONNECTION, newTargetConnection, newTargetConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(String newVisibility) {
		String oldVisibility = visibility;
		visibility = newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackage.UNIT__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KragsteinPackage.UNIT__SOURCE_CONNECTION:
				return basicSetSourceConnection(null, msgs);
			case KragsteinPackage.UNIT__TARGET_CONNECTION:
				return basicSetTargetConnection(null, msgs);
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
			case KragsteinPackage.UNIT__NAME:
				return getName();
			case KragsteinPackage.UNIT__SOURCE_CONNECTION:
				return getSourceConnection();
			case KragsteinPackage.UNIT__TARGET_CONNECTION:
				return getTargetConnection();
			case KragsteinPackage.UNIT__VISIBILITY:
				return getVisibility();
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
			case KragsteinPackage.UNIT__NAME:
				setName((String)newValue);
				return;
			case KragsteinPackage.UNIT__SOURCE_CONNECTION:
				setSourceConnection((Generalization)newValue);
				return;
			case KragsteinPackage.UNIT__TARGET_CONNECTION:
				setTargetConnection((Generalization)newValue);
				return;
			case KragsteinPackage.UNIT__VISIBILITY:
				setVisibility((String)newValue);
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
			case KragsteinPackage.UNIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KragsteinPackage.UNIT__SOURCE_CONNECTION:
				setSourceConnection((Generalization)null);
				return;
			case KragsteinPackage.UNIT__TARGET_CONNECTION:
				setTargetConnection((Generalization)null);
				return;
			case KragsteinPackage.UNIT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
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
			case KragsteinPackage.UNIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KragsteinPackage.UNIT__SOURCE_CONNECTION:
				return sourceConnection != null;
			case KragsteinPackage.UNIT__TARGET_CONNECTION:
				return targetConnection != null;
			case KragsteinPackage.UNIT__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
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
		result.append(", visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //UnitImpl
