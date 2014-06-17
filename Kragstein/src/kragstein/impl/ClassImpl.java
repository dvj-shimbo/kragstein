/**
 */
package kragstein.impl;

import java.util.Collection;

import kragstein.Attribute;
import kragstein.Comment;
import kragstein.ImportedPackage;
import kragstein.KragsteinPackage;
import kragstein.Method;
import kragstein.Relationship;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kragstein.impl.ClassImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link kragstein.impl.ClassImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link kragstein.impl.ClassImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link kragstein.impl.ClassImpl#getTargetRelationship <em>Target Relationship</em>}</li>
 *   <li>{@link kragstein.impl.ClassImpl#getSourceRelationship <em>Source Relationship</em>}</li>
 *   <li>{@link kragstein.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link kragstein.impl.ClassImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link kragstein.impl.ClassImpl#isIsSingletone <em>Is Singletone</em>}</li>
 *   <li>{@link kragstein.impl.ClassImpl#isIsInterface <em>Is Interface</em>}</li>
 *   <li>{@link kragstein.impl.ClassImpl#getImportedPackages <em>Imported Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends MinimalEObjectImpl.Container implements kragstein.Class {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> methods;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected Comment comments;

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
	 * The cached value of the '{@link #getSourceRelationship() <em>Source Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> sourceRelationship;

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
	 * The cached value of the '{@link #getImportedPackages() <em>Imported Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportedPackage> importedPackages;

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
		return KragsteinPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, KragsteinPackage.CLASS__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<Method>(Method.class, this, KragsteinPackage.CLASS__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComments(Comment newComments, NotificationChain msgs) {
		Comment oldComments = comments;
		comments = newComments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KragsteinPackage.CLASS__COMMENTS, oldComments, newComments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(Comment newComments) {
		if (newComments != comments) {
			NotificationChain msgs = null;
			if (comments != null)
				msgs = ((InternalEObject)comments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.CLASS__COMMENTS, null, msgs);
			if (newComments != null)
				msgs = ((InternalEObject)newComments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.CLASS__COMMENTS, null, msgs);
			msgs = basicSetComments(newComments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackage.CLASS__COMMENTS, newComments, newComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getTargetRelationship() {
		if (targetRelationship == null) {
			targetRelationship = new EObjectContainmentEList<Relationship>(Relationship.class, this, KragsteinPackage.CLASS__TARGET_RELATIONSHIP);
		}
		return targetRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getSourceRelationship() {
		if (sourceRelationship == null) {
			sourceRelationship = new EObjectContainmentEList<Relationship>(Relationship.class, this, KragsteinPackage.CLASS__SOURCE_RELATIONSHIP);
		}
		return sourceRelationship;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackage.CLASS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackage.CLASS__VISIBILITY, oldVisibility, visibility));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackage.CLASS__IS_SINGLETONE, oldIsSingletone, isSingletone));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackage.CLASS__IS_INTERFACE, oldIsInterface, isInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportedPackage> getImportedPackages() {
		if (importedPackages == null) {
			importedPackages = new EObjectContainmentEList<ImportedPackage>(ImportedPackage.class, this, KragsteinPackage.CLASS__IMPORTED_PACKAGES);
		}
		return importedPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KragsteinPackage.CLASS__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case KragsteinPackage.CLASS__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case KragsteinPackage.CLASS__COMMENTS:
				return basicSetComments(null, msgs);
			case KragsteinPackage.CLASS__TARGET_RELATIONSHIP:
				return ((InternalEList<?>)getTargetRelationship()).basicRemove(otherEnd, msgs);
			case KragsteinPackage.CLASS__SOURCE_RELATIONSHIP:
				return ((InternalEList<?>)getSourceRelationship()).basicRemove(otherEnd, msgs);
			case KragsteinPackage.CLASS__IMPORTED_PACKAGES:
				return ((InternalEList<?>)getImportedPackages()).basicRemove(otherEnd, msgs);
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
			case KragsteinPackage.CLASS__ATTRIBUTES:
				return getAttributes();
			case KragsteinPackage.CLASS__METHODS:
				return getMethods();
			case KragsteinPackage.CLASS__COMMENTS:
				return getComments();
			case KragsteinPackage.CLASS__TARGET_RELATIONSHIP:
				return getTargetRelationship();
			case KragsteinPackage.CLASS__SOURCE_RELATIONSHIP:
				return getSourceRelationship();
			case KragsteinPackage.CLASS__NAME:
				return getName();
			case KragsteinPackage.CLASS__VISIBILITY:
				return getVisibility();
			case KragsteinPackage.CLASS__IS_SINGLETONE:
				return isIsSingletone();
			case KragsteinPackage.CLASS__IS_INTERFACE:
				return isIsInterface();
			case KragsteinPackage.CLASS__IMPORTED_PACKAGES:
				return getImportedPackages();
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
			case KragsteinPackage.CLASS__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case KragsteinPackage.CLASS__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends Method>)newValue);
				return;
			case KragsteinPackage.CLASS__COMMENTS:
				setComments((Comment)newValue);
				return;
			case KragsteinPackage.CLASS__TARGET_RELATIONSHIP:
				getTargetRelationship().clear();
				getTargetRelationship().addAll((Collection<? extends Relationship>)newValue);
				return;
			case KragsteinPackage.CLASS__SOURCE_RELATIONSHIP:
				getSourceRelationship().clear();
				getSourceRelationship().addAll((Collection<? extends Relationship>)newValue);
				return;
			case KragsteinPackage.CLASS__NAME:
				setName((String)newValue);
				return;
			case KragsteinPackage.CLASS__VISIBILITY:
				setVisibility((String)newValue);
				return;
			case KragsteinPackage.CLASS__IS_SINGLETONE:
				setIsSingletone((Boolean)newValue);
				return;
			case KragsteinPackage.CLASS__IS_INTERFACE:
				setIsInterface((Boolean)newValue);
				return;
			case KragsteinPackage.CLASS__IMPORTED_PACKAGES:
				getImportedPackages().clear();
				getImportedPackages().addAll((Collection<? extends ImportedPackage>)newValue);
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
			case KragsteinPackage.CLASS__ATTRIBUTES:
				getAttributes().clear();
				return;
			case KragsteinPackage.CLASS__METHODS:
				getMethods().clear();
				return;
			case KragsteinPackage.CLASS__COMMENTS:
				setComments((Comment)null);
				return;
			case KragsteinPackage.CLASS__TARGET_RELATIONSHIP:
				getTargetRelationship().clear();
				return;
			case KragsteinPackage.CLASS__SOURCE_RELATIONSHIP:
				getSourceRelationship().clear();
				return;
			case KragsteinPackage.CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KragsteinPackage.CLASS__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case KragsteinPackage.CLASS__IS_SINGLETONE:
				setIsSingletone(IS_SINGLETONE_EDEFAULT);
				return;
			case KragsteinPackage.CLASS__IS_INTERFACE:
				setIsInterface(IS_INTERFACE_EDEFAULT);
				return;
			case KragsteinPackage.CLASS__IMPORTED_PACKAGES:
				getImportedPackages().clear();
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
			case KragsteinPackage.CLASS__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case KragsteinPackage.CLASS__METHODS:
				return methods != null && !methods.isEmpty();
			case KragsteinPackage.CLASS__COMMENTS:
				return comments != null;
			case KragsteinPackage.CLASS__TARGET_RELATIONSHIP:
				return targetRelationship != null && !targetRelationship.isEmpty();
			case KragsteinPackage.CLASS__SOURCE_RELATIONSHIP:
				return sourceRelationship != null && !sourceRelationship.isEmpty();
			case KragsteinPackage.CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KragsteinPackage.CLASS__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
			case KragsteinPackage.CLASS__IS_SINGLETONE:
				return isSingletone != IS_SINGLETONE_EDEFAULT;
			case KragsteinPackage.CLASS__IS_INTERFACE:
				return isInterface != IS_INTERFACE_EDEFAULT;
			case KragsteinPackage.CLASS__IMPORTED_PACKAGES:
				return importedPackages != null && !importedPackages.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ClassImpl
