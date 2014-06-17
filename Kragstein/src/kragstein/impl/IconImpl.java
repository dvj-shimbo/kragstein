/**
 */
package kragstein.impl;

import kragstein.Icon;
import kragstein.IconConnection;
import kragstein.KragsteinPackage;
import kragstein.LeftComment;
import kragstein.RightComment;
import kragstein.ValencePoint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Icon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kragstein.impl.IconImpl#getSourceIconConnection <em>Source Icon Connection</em>}</li>
 *   <li>{@link kragstein.impl.IconImpl#getTargetIconConnection <em>Target Icon Connection</em>}</li>
 *   <li>{@link kragstein.impl.IconImpl#getValencePoint <em>Valence Point</em>}</li>
 *   <li>{@link kragstein.impl.IconImpl#getLeftComment <em>Left Comment</em>}</li>
 *   <li>{@link kragstein.impl.IconImpl#getRightComment <em>Right Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IconImpl extends MinimalEObjectImpl.Container implements Icon {
	/**
	 * The cached value of the '{@link #getSourceIconConnection() <em>Source Icon Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceIconConnection()
	 * @generated
	 * @ordered
	 */
	protected IconConnection sourceIconConnection;

	/**
	 * The cached value of the '{@link #getTargetIconConnection() <em>Target Icon Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetIconConnection()
	 * @generated
	 * @ordered
	 */
	protected IconConnection targetIconConnection;

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
		return KragsteinPackage.Literals.ICON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconConnection getSourceIconConnection() {
		return sourceIconConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceIconConnection(IconConnection newSourceIconConnection, NotificationChain msgs) {
		IconConnection oldSourceIconConnection = sourceIconConnection;
		sourceIconConnection = newSourceIconConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KragsteinPackage.ICON__SOURCE_ICON_CONNECTION, oldSourceIconConnection, newSourceIconConnection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceIconConnection(IconConnection newSourceIconConnection) {
		if (newSourceIconConnection != sourceIconConnection) {
			NotificationChain msgs = null;
			if (sourceIconConnection != null)
				msgs = ((InternalEObject)sourceIconConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.ICON__SOURCE_ICON_CONNECTION, null, msgs);
			if (newSourceIconConnection != null)
				msgs = ((InternalEObject)newSourceIconConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.ICON__SOURCE_ICON_CONNECTION, null, msgs);
			msgs = basicSetSourceIconConnection(newSourceIconConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackage.ICON__SOURCE_ICON_CONNECTION, newSourceIconConnection, newSourceIconConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconConnection getTargetIconConnection() {
		return targetIconConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetIconConnection(IconConnection newTargetIconConnection, NotificationChain msgs) {
		IconConnection oldTargetIconConnection = targetIconConnection;
		targetIconConnection = newTargetIconConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KragsteinPackage.ICON__TARGET_ICON_CONNECTION, oldTargetIconConnection, newTargetIconConnection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetIconConnection(IconConnection newTargetIconConnection) {
		if (newTargetIconConnection != targetIconConnection) {
			NotificationChain msgs = null;
			if (targetIconConnection != null)
				msgs = ((InternalEObject)targetIconConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.ICON__TARGET_ICON_CONNECTION, null, msgs);
			if (newTargetIconConnection != null)
				msgs = ((InternalEObject)newTargetIconConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.ICON__TARGET_ICON_CONNECTION, null, msgs);
			msgs = basicSetTargetIconConnection(newTargetIconConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackage.ICON__TARGET_ICON_CONNECTION, newTargetIconConnection, newTargetIconConnection));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KragsteinPackage.ICON__VALENCE_POINT, oldValencePoint, newValencePoint);
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
				msgs = ((InternalEObject)valencePoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.ICON__VALENCE_POINT, null, msgs);
			if (newValencePoint != null)
				msgs = ((InternalEObject)newValencePoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.ICON__VALENCE_POINT, null, msgs);
			msgs = basicSetValencePoint(newValencePoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackage.ICON__VALENCE_POINT, newValencePoint, newValencePoint));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KragsteinPackage.ICON__LEFT_COMMENT, oldLeftComment, newLeftComment);
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
				msgs = ((InternalEObject)leftComment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.ICON__LEFT_COMMENT, null, msgs);
			if (newLeftComment != null)
				msgs = ((InternalEObject)newLeftComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.ICON__LEFT_COMMENT, null, msgs);
			msgs = basicSetLeftComment(newLeftComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackage.ICON__LEFT_COMMENT, newLeftComment, newLeftComment));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KragsteinPackage.ICON__RIGHT_COMMENT, oldRightComment, newRightComment);
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
				msgs = ((InternalEObject)rightComment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.ICON__RIGHT_COMMENT, null, msgs);
			if (newRightComment != null)
				msgs = ((InternalEObject)newRightComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KragsteinPackage.ICON__RIGHT_COMMENT, null, msgs);
			msgs = basicSetRightComment(newRightComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackage.ICON__RIGHT_COMMENT, newRightComment, newRightComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KragsteinPackage.ICON__SOURCE_ICON_CONNECTION:
				return basicSetSourceIconConnection(null, msgs);
			case KragsteinPackage.ICON__TARGET_ICON_CONNECTION:
				return basicSetTargetIconConnection(null, msgs);
			case KragsteinPackage.ICON__VALENCE_POINT:
				return basicSetValencePoint(null, msgs);
			case KragsteinPackage.ICON__LEFT_COMMENT:
				return basicSetLeftComment(null, msgs);
			case KragsteinPackage.ICON__RIGHT_COMMENT:
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
			case KragsteinPackage.ICON__SOURCE_ICON_CONNECTION:
				return getSourceIconConnection();
			case KragsteinPackage.ICON__TARGET_ICON_CONNECTION:
				return getTargetIconConnection();
			case KragsteinPackage.ICON__VALENCE_POINT:
				return getValencePoint();
			case KragsteinPackage.ICON__LEFT_COMMENT:
				return getLeftComment();
			case KragsteinPackage.ICON__RIGHT_COMMENT:
				return getRightComment();
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
			case KragsteinPackage.ICON__SOURCE_ICON_CONNECTION:
				setSourceIconConnection((IconConnection)newValue);
				return;
			case KragsteinPackage.ICON__TARGET_ICON_CONNECTION:
				setTargetIconConnection((IconConnection)newValue);
				return;
			case KragsteinPackage.ICON__VALENCE_POINT:
				setValencePoint((ValencePoint)newValue);
				return;
			case KragsteinPackage.ICON__LEFT_COMMENT:
				setLeftComment((LeftComment)newValue);
				return;
			case KragsteinPackage.ICON__RIGHT_COMMENT:
				setRightComment((RightComment)newValue);
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
			case KragsteinPackage.ICON__SOURCE_ICON_CONNECTION:
				setSourceIconConnection((IconConnection)null);
				return;
			case KragsteinPackage.ICON__TARGET_ICON_CONNECTION:
				setTargetIconConnection((IconConnection)null);
				return;
			case KragsteinPackage.ICON__VALENCE_POINT:
				setValencePoint((ValencePoint)null);
				return;
			case KragsteinPackage.ICON__LEFT_COMMENT:
				setLeftComment((LeftComment)null);
				return;
			case KragsteinPackage.ICON__RIGHT_COMMENT:
				setRightComment((RightComment)null);
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
			case KragsteinPackage.ICON__SOURCE_ICON_CONNECTION:
				return sourceIconConnection != null;
			case KragsteinPackage.ICON__TARGET_ICON_CONNECTION:
				return targetIconConnection != null;
			case KragsteinPackage.ICON__VALENCE_POINT:
				return valencePoint != null;
			case KragsteinPackage.ICON__LEFT_COMMENT:
				return leftComment != null;
			case KragsteinPackage.ICON__RIGHT_COMMENT:
				return rightComment != null;
		}
		return super.eIsSet(featureID);
	}

} //IconImpl
