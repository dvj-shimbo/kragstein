/**
 */
package KragsteinPackage.impl;

import KragsteinPackage.Attribute;
import KragsteinPackage.ImportedClass;
import KragsteinPackage.ImportedPackage;
import KragsteinPackage.KragsteinPackagePackage;
import KragsteinPackage.Method;
import KragsteinPackage.Relationship;

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
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link KragsteinPackage.impl.ClassImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link KragsteinPackage.impl.ClassImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link KragsteinPackage.impl.ClassImpl#getTargetRelationship <em>Target Relationship</em>}</li>
 *   <li>{@link KragsteinPackage.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link KragsteinPackage.impl.ClassImpl#getImportedClass <em>Imported Class</em>}</li>
 *   <li>{@link KragsteinPackage.impl.ClassImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link KragsteinPackage.impl.ClassImpl#isIsSingletone <em>Is Singletone</em>}</li>
 *   <li>{@link KragsteinPackage.impl.ClassImpl#isIsInterface <em>Is Interface</em>}</li>
 *   <li>{@link KragsteinPackage.impl.ClassImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link KragsteinPackage.impl.ClassImpl#getSupplierElement <em>Supplier Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends UnitImpl implements KragsteinPackage.Class {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> method;

	/**
	 * The cached value of the '{@link #getTargetRelationship() <em>Target Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> targetRelationship;

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
	 * The cached value of the '{@link #getImportedClass() <em>Imported Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedClass()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportedClass> importedClass;

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
		return KragsteinPackagePackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, KragsteinPackagePackage.CLASS__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethod() {
		if (method == null) {
			method = new EObjectContainmentEList<Method>(Method.class, this, KragsteinPackagePackage.CLASS__METHOD);
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getTargetRelationship() {
		if (targetRelationship == null) {
			targetRelationship = new EObjectContainmentEList<Relationship>(Relationship.class, this, KragsteinPackagePackage.CLASS__TARGET_RELATIONSHIP);
		}
		return targetRelationship;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackagePackage.CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportedClass> getImportedClass() {
		if (importedClass == null) {
			importedClass = new EObjectContainmentEList<ImportedClass>(ImportedClass.class, this, KragsteinPackagePackage.CLASS__IMPORTED_CLASS);
		}
		return importedClass;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackagePackage.CLASS__VISIBILITY, oldVisibility, visibility));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackagePackage.CLASS__IS_SINGLETONE, oldIsSingletone, isSingletone));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackagePackage.CLASS__IS_INTERFACE, oldIsInterface, isInterface));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackagePackage.CLASS__SUPER_CLASS, oldSuperClass, superClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackagePackage.CLASS__SUPPLIER_ELEMENT, oldSupplierElement, supplierElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KragsteinPackagePackage.CLASS__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case KragsteinPackagePackage.CLASS__METHOD:
				return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
			case KragsteinPackagePackage.CLASS__TARGET_RELATIONSHIP:
				return ((InternalEList<?>)getTargetRelationship()).basicRemove(otherEnd, msgs);
			case KragsteinPackagePackage.CLASS__IMPORTED_CLASS:
				return ((InternalEList<?>)getImportedClass()).basicRemove(otherEnd, msgs);
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
			case KragsteinPackagePackage.CLASS__ATTRIBUTE:
				return getAttribute();
			case KragsteinPackagePackage.CLASS__METHOD:
				return getMethod();
			case KragsteinPackagePackage.CLASS__TARGET_RELATIONSHIP:
				return getTargetRelationship();
			case KragsteinPackagePackage.CLASS__NAME:
				return getName();
			case KragsteinPackagePackage.CLASS__IMPORTED_CLASS:
				return getImportedClass();
			case KragsteinPackagePackage.CLASS__VISIBILITY:
				return getVisibility();
			case KragsteinPackagePackage.CLASS__IS_SINGLETONE:
				return isIsSingletone();
			case KragsteinPackagePackage.CLASS__IS_INTERFACE:
				return isIsInterface();
			case KragsteinPackagePackage.CLASS__SUPER_CLASS:
				return getSuperClass();
			case KragsteinPackagePackage.CLASS__SUPPLIER_ELEMENT:
				return getSupplierElement();
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
			case KragsteinPackagePackage.CLASS__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case KragsteinPackagePackage.CLASS__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends Method>)newValue);
				return;
			case KragsteinPackagePackage.CLASS__TARGET_RELATIONSHIP:
				getTargetRelationship().clear();
				getTargetRelationship().addAll((Collection<? extends Relationship>)newValue);
				return;
			case KragsteinPackagePackage.CLASS__NAME:
				setName((String)newValue);
				return;
			case KragsteinPackagePackage.CLASS__IMPORTED_CLASS:
				getImportedClass().clear();
				getImportedClass().addAll((Collection<? extends ImportedClass>)newValue);
				return;
			case KragsteinPackagePackage.CLASS__VISIBILITY:
				setVisibility((String)newValue);
				return;
			case KragsteinPackagePackage.CLASS__IS_SINGLETONE:
				setIsSingletone((Boolean)newValue);
				return;
			case KragsteinPackagePackage.CLASS__IS_INTERFACE:
				setIsInterface((Boolean)newValue);
				return;
			case KragsteinPackagePackage.CLASS__SUPER_CLASS:
				setSuperClass((String)newValue);
				return;
			case KragsteinPackagePackage.CLASS__SUPPLIER_ELEMENT:
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
			case KragsteinPackagePackage.CLASS__ATTRIBUTE:
				getAttribute().clear();
				return;
			case KragsteinPackagePackage.CLASS__METHOD:
				getMethod().clear();
				return;
			case KragsteinPackagePackage.CLASS__TARGET_RELATIONSHIP:
				getTargetRelationship().clear();
				return;
			case KragsteinPackagePackage.CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KragsteinPackagePackage.CLASS__IMPORTED_CLASS:
				getImportedClass().clear();
				return;
			case KragsteinPackagePackage.CLASS__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case KragsteinPackagePackage.CLASS__IS_SINGLETONE:
				setIsSingletone(IS_SINGLETONE_EDEFAULT);
				return;
			case KragsteinPackagePackage.CLASS__IS_INTERFACE:
				setIsInterface(IS_INTERFACE_EDEFAULT);
				return;
			case KragsteinPackagePackage.CLASS__SUPER_CLASS:
				setSuperClass(SUPER_CLASS_EDEFAULT);
				return;
			case KragsteinPackagePackage.CLASS__SUPPLIER_ELEMENT:
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
			case KragsteinPackagePackage.CLASS__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case KragsteinPackagePackage.CLASS__METHOD:
				return method != null && !method.isEmpty();
			case KragsteinPackagePackage.CLASS__TARGET_RELATIONSHIP:
				return targetRelationship != null && !targetRelationship.isEmpty();
			case KragsteinPackagePackage.CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KragsteinPackagePackage.CLASS__IMPORTED_CLASS:
				return importedClass != null && !importedClass.isEmpty();
			case KragsteinPackagePackage.CLASS__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
			case KragsteinPackagePackage.CLASS__IS_SINGLETONE:
				return isSingletone != IS_SINGLETONE_EDEFAULT;
			case KragsteinPackagePackage.CLASS__IS_INTERFACE:
				return isInterface != IS_INTERFACE_EDEFAULT;
			case KragsteinPackagePackage.CLASS__SUPER_CLASS:
				return SUPER_CLASS_EDEFAULT == null ? superClass != null : !SUPER_CLASS_EDEFAULT.equals(superClass);
			case KragsteinPackagePackage.CLASS__SUPPLIER_ELEMENT:
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
