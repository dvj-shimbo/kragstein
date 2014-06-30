/**
 */
package KragsteinProject.impl;

import KragsteinProject.KragsteinProjectPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link KragsteinProject.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link KragsteinProject.impl.ClassImpl#getType <em>Type</em>}</li>
 *   <li>{@link KragsteinProject.impl.ClassImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link KragsteinProject.impl.ClassImpl#isIsSingletone <em>Is Singletone</em>}</li>
 *   <li>{@link KragsteinProject.impl.ClassImpl#isIsInterface <em>Is Interface</em>}</li>
 *   <li>{@link KragsteinProject.impl.ClassImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link KragsteinProject.impl.ClassImpl#getSupplierElement <em>Supplier Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends EObjectImpl implements KragsteinProject.Class {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

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
	 * The default value of the '{@link #isIsSingletone() <em>Is Singletone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSingletone()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SINGLETONE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSingletone() <em>Is Singletone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSingletone()
	 * @generated
	 * @ordered
	 */
	protected boolean isSingletone = IS_SINGLETONE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsInterface() <em>Is Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INTERFACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInterface() <em>Is Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean isInterface = IS_INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuperClass() <em>Super Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClass()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClass()
	 * @generated
	 * @ordered
	 */
	protected String superClass = SUPER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupplierElement() <em>Supplier Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierElement()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplierElement() <em>Supplier Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierElement()
	 * @generated
	 * @ordered
	 */
	protected String supplierElement = SUPPLIER_ELEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KragsteinProjectPackage.Literals.CLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinProjectPackage.CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinProjectPackage.CLASS__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinProjectPackage.CLASS__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSingletone() {
		return isSingletone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSingletone(boolean newIsSingletone) {
		boolean oldIsSingletone = isSingletone;
		isSingletone = newIsSingletone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinProjectPackage.CLASS__IS_SINGLETONE, oldIsSingletone, isSingletone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInterface() {
		return isInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInterface(boolean newIsInterface) {
		boolean oldIsInterface = isInterface;
		isInterface = newIsInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinProjectPackage.CLASS__IS_INTERFACE, oldIsInterface, isInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuperClass() {
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperClass(String newSuperClass) {
		String oldSuperClass = superClass;
		superClass = newSuperClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinProjectPackage.CLASS__SUPER_CLASS, oldSuperClass, superClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupplierElement() {
		return supplierElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplierElement(String newSupplierElement) {
		String oldSupplierElement = supplierElement;
		supplierElement = newSupplierElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinProjectPackage.CLASS__SUPPLIER_ELEMENT, oldSupplierElement, supplierElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KragsteinProjectPackage.CLASS__NAME:
				return getName();
			case KragsteinProjectPackage.CLASS__TYPE:
				return getType();
			case KragsteinProjectPackage.CLASS__VISIBILITY:
				return getVisibility();
			case KragsteinProjectPackage.CLASS__IS_SINGLETONE:
				return isIsSingletone();
			case KragsteinProjectPackage.CLASS__IS_INTERFACE:
				return isIsInterface();
			case KragsteinProjectPackage.CLASS__SUPER_CLASS:
				return getSuperClass();
			case KragsteinProjectPackage.CLASS__SUPPLIER_ELEMENT:
				return getSupplierElement();
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
			case KragsteinProjectPackage.CLASS__NAME:
				setName((String)newValue);
				return;
			case KragsteinProjectPackage.CLASS__TYPE:
				setType((String)newValue);
				return;
			case KragsteinProjectPackage.CLASS__VISIBILITY:
				setVisibility((String)newValue);
				return;
			case KragsteinProjectPackage.CLASS__IS_SINGLETONE:
				setIsSingletone((Boolean)newValue);
				return;
			case KragsteinProjectPackage.CLASS__IS_INTERFACE:
				setIsInterface((Boolean)newValue);
				return;
			case KragsteinProjectPackage.CLASS__SUPER_CLASS:
				setSuperClass((String)newValue);
				return;
			case KragsteinProjectPackage.CLASS__SUPPLIER_ELEMENT:
				setSupplierElement((String)newValue);
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
			case KragsteinProjectPackage.CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KragsteinProjectPackage.CLASS__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case KragsteinProjectPackage.CLASS__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case KragsteinProjectPackage.CLASS__IS_SINGLETONE:
				setIsSingletone(IS_SINGLETONE_EDEFAULT);
				return;
			case KragsteinProjectPackage.CLASS__IS_INTERFACE:
				setIsInterface(IS_INTERFACE_EDEFAULT);
				return;
			case KragsteinProjectPackage.CLASS__SUPER_CLASS:
				setSuperClass(SUPER_CLASS_EDEFAULT);
				return;
			case KragsteinProjectPackage.CLASS__SUPPLIER_ELEMENT:
				setSupplierElement(SUPPLIER_ELEMENT_EDEFAULT);
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
			case KragsteinProjectPackage.CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KragsteinProjectPackage.CLASS__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case KragsteinProjectPackage.CLASS__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
			case KragsteinProjectPackage.CLASS__IS_SINGLETONE:
				return isSingletone != IS_SINGLETONE_EDEFAULT;
			case KragsteinProjectPackage.CLASS__IS_INTERFACE:
				return isInterface != IS_INTERFACE_EDEFAULT;
			case KragsteinProjectPackage.CLASS__SUPER_CLASS:
				return SUPER_CLASS_EDEFAULT == null ? superClass != null : !SUPER_CLASS_EDEFAULT.equals(superClass);
			case KragsteinProjectPackage.CLASS__SUPPLIER_ELEMENT:
				return SUPPLIER_ELEMENT_EDEFAULT == null ? supplierElement != null : !SUPPLIER_ELEMENT_EDEFAULT.equals(supplierElement);
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
		result.append(", type: ");
		result.append(type);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(", isSingletone: ");
		result.append(isSingletone);
		result.append(", isInterface: ");
		result.append(isInterface);
		result.append(", superClass: ");
		result.append(superClass);
		result.append(", supplierElement: ");
		result.append(supplierElement);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
