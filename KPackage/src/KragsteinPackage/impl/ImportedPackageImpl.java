/**
 */
package KragsteinPackage.impl;

import KragsteinPackage.ImportedPackage;
import KragsteinPackage.KragsteinPackagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imported Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link KragsteinPackage.impl.ImportedPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link KragsteinPackage.impl.ImportedPackageImpl#getPath <em>Path</em>}</li>
 *   <li>{@link KragsteinPackage.impl.ImportedPackageImpl#isIsInternal <em>Is Internal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportedPackageImpl extends EObjectImpl implements ImportedPackage {
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
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsInternal() <em>Is Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInternal() <em>Is Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInternal()
	 * @generated
	 * @ordered
	 */
	protected boolean isInternal = IS_INTERNAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportedPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KragsteinPackagePackage.Literals.IMPORTED_PACKAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackagePackage.IMPORTED_PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInternal() {
		return isInternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInternal(boolean newIsInternal) {
		boolean oldIsInternal = isInternal;
		isInternal = newIsInternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackagePackage.IMPORTED_PACKAGE__IS_INTERNAL, oldIsInternal, isInternal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackagePackage.IMPORTED_PACKAGE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KragsteinPackagePackage.IMPORTED_PACKAGE__NAME:
				return getName();
			case KragsteinPackagePackage.IMPORTED_PACKAGE__PATH:
				return getPath();
			case KragsteinPackagePackage.IMPORTED_PACKAGE__IS_INTERNAL:
				return isIsInternal();
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
			case KragsteinPackagePackage.IMPORTED_PACKAGE__NAME:
				setName((String)newValue);
				return;
			case KragsteinPackagePackage.IMPORTED_PACKAGE__PATH:
				setPath((String)newValue);
				return;
			case KragsteinPackagePackage.IMPORTED_PACKAGE__IS_INTERNAL:
				setIsInternal((Boolean)newValue);
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
			case KragsteinPackagePackage.IMPORTED_PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KragsteinPackagePackage.IMPORTED_PACKAGE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case KragsteinPackagePackage.IMPORTED_PACKAGE__IS_INTERNAL:
				setIsInternal(IS_INTERNAL_EDEFAULT);
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
			case KragsteinPackagePackage.IMPORTED_PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KragsteinPackagePackage.IMPORTED_PACKAGE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case KragsteinPackagePackage.IMPORTED_PACKAGE__IS_INTERNAL:
				return isInternal != IS_INTERNAL_EDEFAULT;
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
		result.append(", path: ");
		result.append(path);
		result.append(", isInternal: ");
		result.append(isInternal);
		result.append(')');
		return result.toString();
	}

} //ImportedPackageImpl
