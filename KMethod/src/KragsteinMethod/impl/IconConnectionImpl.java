/**
 */
package KragsteinMethod.impl;

import KragsteinMethod.Icon;
import KragsteinMethod.IconConnection;
import KragsteinMethod.KragsteinMethodPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Icon Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link KragsteinMethod.impl.IconConnectionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link KragsteinMethod.impl.IconConnectionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link KragsteinMethod.impl.IconConnectionImpl#getTargetIcon <em>Target Icon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IconConnectionImpl extends EObjectImpl implements IconConnection {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Icon target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Icon source;

	/**
	 * The default value of the '{@link #getTargetIcon() <em>Target Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetIcon() <em>Target Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetIcon()
	 * @generated
	 * @ordered
	 */
	protected String targetIcon = TARGET_ICON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IconConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KragsteinMethodPackage.Literals.ICON_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Icon getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Icon)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KragsteinMethodPackage.ICON_CONNECTION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Icon basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Icon newTarget) {
		Icon oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.ICON_CONNECTION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Icon getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Icon)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KragsteinMethodPackage.ICON_CONNECTION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Icon basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Icon newSource) {
		Icon oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.ICON_CONNECTION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetIcon() {
		return targetIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetIcon(String newTargetIcon) {
		String oldTargetIcon = targetIcon;
		targetIcon = newTargetIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.ICON_CONNECTION__TARGET_ICON, oldTargetIcon, targetIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KragsteinMethodPackage.ICON_CONNECTION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case KragsteinMethodPackage.ICON_CONNECTION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case KragsteinMethodPackage.ICON_CONNECTION__TARGET_ICON:
				return getTargetIcon();
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
			case KragsteinMethodPackage.ICON_CONNECTION__TARGET:
				setTarget((Icon)newValue);
				return;
			case KragsteinMethodPackage.ICON_CONNECTION__SOURCE:
				setSource((Icon)newValue);
				return;
			case KragsteinMethodPackage.ICON_CONNECTION__TARGET_ICON:
				setTargetIcon((String)newValue);
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
			case KragsteinMethodPackage.ICON_CONNECTION__TARGET:
				setTarget((Icon)null);
				return;
			case KragsteinMethodPackage.ICON_CONNECTION__SOURCE:
				setSource((Icon)null);
				return;
			case KragsteinMethodPackage.ICON_CONNECTION__TARGET_ICON:
				setTargetIcon(TARGET_ICON_EDEFAULT);
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
			case KragsteinMethodPackage.ICON_CONNECTION__TARGET:
				return target != null;
			case KragsteinMethodPackage.ICON_CONNECTION__SOURCE:
				return source != null;
			case KragsteinMethodPackage.ICON_CONNECTION__TARGET_ICON:
				return TARGET_ICON_EDEFAULT == null ? targetIcon != null : !TARGET_ICON_EDEFAULT.equals(targetIcon);
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
		result.append(" (targetIcon: ");
		result.append(targetIcon);
		result.append(')');
		return result.toString();
	}

} //IconConnectionImpl
