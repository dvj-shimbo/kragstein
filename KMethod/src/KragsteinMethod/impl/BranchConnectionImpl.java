/**
 */
package KragsteinMethod.impl;

import KragsteinMethod.Branch;
import KragsteinMethod.BranchConnection;
import KragsteinMethod.KragsteinMethodPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link KragsteinMethod.impl.BranchConnectionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link KragsteinMethod.impl.BranchConnectionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link KragsteinMethod.impl.BranchConnectionImpl#getTargetBranch <em>Target Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BranchConnectionImpl extends EObjectImpl implements BranchConnection {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Branch source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Branch target;

	/**
	 * The default value of the '{@link #getTargetBranch() <em>Target Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetBranch()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_BRANCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetBranch() <em>Target Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetBranch()
	 * @generated
	 * @ordered
	 */
	protected String targetBranch = TARGET_BRANCH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KragsteinMethodPackage.Literals.BRANCH_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Branch)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KragsteinMethodPackage.BRANCH_CONNECTION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Branch newSource) {
		Branch oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.BRANCH_CONNECTION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Branch)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KragsteinMethodPackage.BRANCH_CONNECTION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Branch newTarget) {
		Branch oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.BRANCH_CONNECTION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetBranch() {
		return targetBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetBranch(String newTargetBranch) {
		String oldTargetBranch = targetBranch;
		targetBranch = newTargetBranch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.BRANCH_CONNECTION__TARGET_BRANCH, oldTargetBranch, targetBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KragsteinMethodPackage.BRANCH_CONNECTION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case KragsteinMethodPackage.BRANCH_CONNECTION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case KragsteinMethodPackage.BRANCH_CONNECTION__TARGET_BRANCH:
				return getTargetBranch();
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
			case KragsteinMethodPackage.BRANCH_CONNECTION__SOURCE:
				setSource((Branch)newValue);
				return;
			case KragsteinMethodPackage.BRANCH_CONNECTION__TARGET:
				setTarget((Branch)newValue);
				return;
			case KragsteinMethodPackage.BRANCH_CONNECTION__TARGET_BRANCH:
				setTargetBranch((String)newValue);
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
			case KragsteinMethodPackage.BRANCH_CONNECTION__SOURCE:
				setSource((Branch)null);
				return;
			case KragsteinMethodPackage.BRANCH_CONNECTION__TARGET:
				setTarget((Branch)null);
				return;
			case KragsteinMethodPackage.BRANCH_CONNECTION__TARGET_BRANCH:
				setTargetBranch(TARGET_BRANCH_EDEFAULT);
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
			case KragsteinMethodPackage.BRANCH_CONNECTION__SOURCE:
				return source != null;
			case KragsteinMethodPackage.BRANCH_CONNECTION__TARGET:
				return target != null;
			case KragsteinMethodPackage.BRANCH_CONNECTION__TARGET_BRANCH:
				return TARGET_BRANCH_EDEFAULT == null ? targetBranch != null : !TARGET_BRANCH_EDEFAULT.equals(targetBranch);
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
		result.append(" (targetBranch: ");
		result.append(targetBranch);
		result.append(')');
		return result.toString();
	}

} //BranchConnectionImpl
