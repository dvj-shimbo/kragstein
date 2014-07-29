/**
 */
package KragsteinMethod.impl;

import KragsteinMethod.Icon;
import KragsteinMethod.KragsteinMethodPackage;
import KragsteinMethod.LeftComment;
import KragsteinMethod.RightComment;
import KragsteinMethod.ValencePoint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Icon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link KragsteinMethod.impl.IconImpl#getValencePoint <em>Valence Point</em>}</li>
 *   <li>{@link KragsteinMethod.impl.IconImpl#getLeftComment <em>Left Comment</em>}</li>
 *   <li>{@link KragsteinMethod.impl.IconImpl#getRightComment <em>Right Comment</em>}</li>
 *   <li>{@link KragsteinMethod.impl.IconImpl#getNextIcon <em>Next Icon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IconImpl extends EObjectImpl implements Icon {
	/**
	 * The cached value of the '{@link #getValencePoint() <em>Valence Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValencePoint()
	 * @generated
	 * @ordered
	 */
	protected ValencePoint valencePoint;

	/**
	 * The cached value of the '{@link #getLeftComment() <em>Left Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftComment()
	 * @generated
	 * @ordered
	 */
	protected LeftComment leftComment;

	/**
	 * The cached value of the '{@link #getRightComment() <em>Right Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightComment()
	 * @generated
	 * @ordered
	 */
	protected RightComment rightComment;

	/**
	 * The cached value of the '{@link #getNextIcon() <em>Next Icon</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextIcon()
	 * @generated
	 * @ordered
	 */
	protected Icon nextIcon;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IconImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KragsteinMethodPackage.Literals.ICON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValencePoint getValencePoint() {
		return valencePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValencePoint(ValencePoint newValencePoint, NotificationChain msgs) {
		ValencePoint oldValencePoint = valencePoint;
		valencePoint = newValencePoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.ICON__VALENCE_POINT, oldValencePoint, newValencePoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValencePoint(ValencePoint newValencePoint) {
		if (newValencePoint != valencePoint) {
			NotificationChain msgs = null;
			if (valencePoint != null)
				msgs = ((InternalEObject)valencePoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KragsteinMethodPackage.ICON__VALENCE_POINT, null, msgs);
			if (newValencePoint != null)
				msgs = ((InternalEObject)newValencePoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KragsteinMethodPackage.ICON__VALENCE_POINT, null, msgs);
			msgs = basicSetValencePoint(newValencePoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.ICON__VALENCE_POINT, newValencePoint, newValencePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftComment getLeftComment() {
		return leftComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftComment(LeftComment newLeftComment, NotificationChain msgs) {
		LeftComment oldLeftComment = leftComment;
		leftComment = newLeftComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.ICON__LEFT_COMMENT, oldLeftComment, newLeftComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftComment(LeftComment newLeftComment) {
		if (newLeftComment != leftComment) {
			NotificationChain msgs = null;
			if (leftComment != null)
				msgs = ((InternalEObject)leftComment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KragsteinMethodPackage.ICON__LEFT_COMMENT, null, msgs);
			if (newLeftComment != null)
				msgs = ((InternalEObject)newLeftComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KragsteinMethodPackage.ICON__LEFT_COMMENT, null, msgs);
			msgs = basicSetLeftComment(newLeftComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.ICON__LEFT_COMMENT, newLeftComment, newLeftComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightComment getRightComment() {
		return rightComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightComment(RightComment newRightComment, NotificationChain msgs) {
		RightComment oldRightComment = rightComment;
		rightComment = newRightComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.ICON__RIGHT_COMMENT, oldRightComment, newRightComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightComment(RightComment newRightComment) {
		if (newRightComment != rightComment) {
			NotificationChain msgs = null;
			if (rightComment != null)
				msgs = ((InternalEObject)rightComment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KragsteinMethodPackage.ICON__RIGHT_COMMENT, null, msgs);
			if (newRightComment != null)
				msgs = ((InternalEObject)newRightComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KragsteinMethodPackage.ICON__RIGHT_COMMENT, null, msgs);
			msgs = basicSetRightComment(newRightComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.ICON__RIGHT_COMMENT, newRightComment, newRightComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Icon getNextIcon() {
		if (nextIcon != null && nextIcon.eIsProxy()) {
			InternalEObject oldNextIcon = (InternalEObject)nextIcon;
			nextIcon = (Icon)eResolveProxy(oldNextIcon);
			if (nextIcon != oldNextIcon) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KragsteinMethodPackage.ICON__NEXT_ICON, oldNextIcon, nextIcon));
			}
		}
		return nextIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Icon basicGetNextIcon() {
		return nextIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextIcon(Icon newNextIcon) {
		Icon oldNextIcon = nextIcon;
		nextIcon = newNextIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.ICON__NEXT_ICON, oldNextIcon, nextIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KragsteinMethodPackage.ICON__VALENCE_POINT:
				return basicSetValencePoint(null, msgs);
			case KragsteinMethodPackage.ICON__LEFT_COMMENT:
				return basicSetLeftComment(null, msgs);
			case KragsteinMethodPackage.ICON__RIGHT_COMMENT:
				return basicSetRightComment(null, msgs);
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
			case KragsteinMethodPackage.ICON__VALENCE_POINT:
				return getValencePoint();
			case KragsteinMethodPackage.ICON__LEFT_COMMENT:
				return getLeftComment();
			case KragsteinMethodPackage.ICON__RIGHT_COMMENT:
				return getRightComment();
			case KragsteinMethodPackage.ICON__NEXT_ICON:
				if (resolve) return getNextIcon();
				return basicGetNextIcon();
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
			case KragsteinMethodPackage.ICON__VALENCE_POINT:
				setValencePoint((ValencePoint)newValue);
				return;
			case KragsteinMethodPackage.ICON__LEFT_COMMENT:
				setLeftComment((LeftComment)newValue);
				return;
			case KragsteinMethodPackage.ICON__RIGHT_COMMENT:
				setRightComment((RightComment)newValue);
				return;
			case KragsteinMethodPackage.ICON__NEXT_ICON:
				setNextIcon((Icon)newValue);
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
			case KragsteinMethodPackage.ICON__VALENCE_POINT:
				setValencePoint((ValencePoint)null);
				return;
			case KragsteinMethodPackage.ICON__LEFT_COMMENT:
				setLeftComment((LeftComment)null);
				return;
			case KragsteinMethodPackage.ICON__RIGHT_COMMENT:
				setRightComment((RightComment)null);
				return;
			case KragsteinMethodPackage.ICON__NEXT_ICON:
				setNextIcon((Icon)null);
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
			case KragsteinMethodPackage.ICON__VALENCE_POINT:
				return valencePoint != null;
			case KragsteinMethodPackage.ICON__LEFT_COMMENT:
				return leftComment != null;
			case KragsteinMethodPackage.ICON__RIGHT_COMMENT:
				return rightComment != null;
			case KragsteinMethodPackage.ICON__NEXT_ICON:
				return nextIcon != null;
		}
		return super.eIsSet(featureID);
	}

} //IconImpl
