/**
 */
package KragsteinMethod.impl;

import KragsteinMethod.Case;
import KragsteinMethod.Choice;
import KragsteinMethod.KragsteinMethodPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link KragsteinMethod.impl.ChoiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link KragsteinMethod.impl.ChoiceImpl#getValue <em>Value</em>}</li>
 *   <li>{@link KragsteinMethod.impl.ChoiceImpl#getCase <em>Case</em>}</li>
 *   <li>{@link KragsteinMethod.impl.ChoiceImpl#getDefaultCaseValue <em>Default Case Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChoiceImpl extends IconImpl implements Choice {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCase() <em>Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCase()
	 * @generated
	 * @ordered
	 */
	protected EList<Case> case_;

	/**
	 * The default value of the '{@link #getDefaultCaseValue() <em>Default Case Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCaseValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CASE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultCaseValue() <em>Default Case Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCaseValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultCaseValue = DEFAULT_CASE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KragsteinMethodPackage.Literals.CHOICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.CHOICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.CHOICE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Case> getCase() {
		if (case_ == null) {
			case_ = new EObjectContainmentEList<Case>(Case.class, this, KragsteinMethodPackage.CHOICE__CASE);
		}
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultCaseValue() {
		return defaultCaseValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultCaseValue(String newDefaultCaseValue) {
		String oldDefaultCaseValue = defaultCaseValue;
		defaultCaseValue = newDefaultCaseValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.CHOICE__DEFAULT_CASE_VALUE, oldDefaultCaseValue, defaultCaseValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KragsteinMethodPackage.CHOICE__CASE:
				return ((InternalEList<?>)getCase()).basicRemove(otherEnd, msgs);
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
			case KragsteinMethodPackage.CHOICE__NAME:
				return getName();
			case KragsteinMethodPackage.CHOICE__VALUE:
				return getValue();
			case KragsteinMethodPackage.CHOICE__CASE:
				return getCase();
			case KragsteinMethodPackage.CHOICE__DEFAULT_CASE_VALUE:
				return getDefaultCaseValue();
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
			case KragsteinMethodPackage.CHOICE__NAME:
				setName((String)newValue);
				return;
			case KragsteinMethodPackage.CHOICE__VALUE:
				setValue((String)newValue);
				return;
			case KragsteinMethodPackage.CHOICE__CASE:
				getCase().clear();
				getCase().addAll((Collection<? extends Case>)newValue);
				return;
			case KragsteinMethodPackage.CHOICE__DEFAULT_CASE_VALUE:
				setDefaultCaseValue((String)newValue);
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
			case KragsteinMethodPackage.CHOICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KragsteinMethodPackage.CHOICE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case KragsteinMethodPackage.CHOICE__CASE:
				getCase().clear();
				return;
			case KragsteinMethodPackage.CHOICE__DEFAULT_CASE_VALUE:
				setDefaultCaseValue(DEFAULT_CASE_VALUE_EDEFAULT);
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
			case KragsteinMethodPackage.CHOICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KragsteinMethodPackage.CHOICE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case KragsteinMethodPackage.CHOICE__CASE:
				return case_ != null && !case_.isEmpty();
			case KragsteinMethodPackage.CHOICE__DEFAULT_CASE_VALUE:
				return DEFAULT_CASE_VALUE_EDEFAULT == null ? defaultCaseValue != null : !DEFAULT_CASE_VALUE_EDEFAULT.equals(defaultCaseValue);
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
		result.append(", value: ");
		result.append(value);
		result.append(", defaultCaseValue: ");
		result.append(defaultCaseValue);
		result.append(')');
		return result.toString();
	}

} //ChoiceImpl
