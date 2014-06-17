/**
 */
package kragstein.impl;

import java.util.Collection;

import kragstein.Comment;
import kragstein.CommentLink;
import kragstein.KragsteinPackage;

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
 * An implementation of the model object '<em><b>Comment Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kragstein.impl.CommentLinkImpl#getSourceCommentLink <em>Source Comment Link</em>}</li>
 *   <li>{@link kragstein.impl.CommentLinkImpl#getTargetCommentLink <em>Target Comment Link</em>}</li>
 *   <li>{@link kragstein.impl.CommentLinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link kragstein.impl.CommentLinkImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommentLinkImpl extends MinimalEObjectImpl.Container implements CommentLink {
	/**
	 * The cached value of the '{@link #getSourceCommentLink() <em>Source Comment Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCommentLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> sourceCommentLink;

	/**
	 * The cached value of the '{@link #getTargetCommentLink() <em>Target Comment Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCommentLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> targetCommentLink;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Comment source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Comment target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KragsteinPackage.Literals.COMMENT_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getSourceCommentLink() {
		if (sourceCommentLink == null) {
			sourceCommentLink = new EObjectContainmentEList<Comment>(Comment.class, this, KragsteinPackage.COMMENT_LINK__SOURCE_COMMENT_LINK);
		}
		return sourceCommentLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getTargetCommentLink() {
		if (targetCommentLink == null) {
			targetCommentLink = new EObjectContainmentEList<Comment>(Comment.class, this, KragsteinPackage.COMMENT_LINK__TARGET_COMMENT_LINK);
		}
		return targetCommentLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Comment)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KragsteinPackage.COMMENT_LINK__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Comment newSource) {
		Comment oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackage.COMMENT_LINK__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Comment)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KragsteinPackage.COMMENT_LINK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Comment newTarget) {
		Comment oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinPackage.COMMENT_LINK__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KragsteinPackage.COMMENT_LINK__SOURCE_COMMENT_LINK:
				return ((InternalEList<?>)getSourceCommentLink()).basicRemove(otherEnd, msgs);
			case KragsteinPackage.COMMENT_LINK__TARGET_COMMENT_LINK:
				return ((InternalEList<?>)getTargetCommentLink()).basicRemove(otherEnd, msgs);
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
			case KragsteinPackage.COMMENT_LINK__SOURCE_COMMENT_LINK:
				return getSourceCommentLink();
			case KragsteinPackage.COMMENT_LINK__TARGET_COMMENT_LINK:
				return getTargetCommentLink();
			case KragsteinPackage.COMMENT_LINK__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case KragsteinPackage.COMMENT_LINK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case KragsteinPackage.COMMENT_LINK__SOURCE_COMMENT_LINK:
				getSourceCommentLink().clear();
				getSourceCommentLink().addAll((Collection<? extends Comment>)newValue);
				return;
			case KragsteinPackage.COMMENT_LINK__TARGET_COMMENT_LINK:
				getTargetCommentLink().clear();
				getTargetCommentLink().addAll((Collection<? extends Comment>)newValue);
				return;
			case KragsteinPackage.COMMENT_LINK__SOURCE:
				setSource((Comment)newValue);
				return;
			case KragsteinPackage.COMMENT_LINK__TARGET:
				setTarget((Comment)newValue);
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
			case KragsteinPackage.COMMENT_LINK__SOURCE_COMMENT_LINK:
				getSourceCommentLink().clear();
				return;
			case KragsteinPackage.COMMENT_LINK__TARGET_COMMENT_LINK:
				getTargetCommentLink().clear();
				return;
			case KragsteinPackage.COMMENT_LINK__SOURCE:
				setSource((Comment)null);
				return;
			case KragsteinPackage.COMMENT_LINK__TARGET:
				setTarget((Comment)null);
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
			case KragsteinPackage.COMMENT_LINK__SOURCE_COMMENT_LINK:
				return sourceCommentLink != null && !sourceCommentLink.isEmpty();
			case KragsteinPackage.COMMENT_LINK__TARGET_COMMENT_LINK:
				return targetCommentLink != null && !targetCommentLink.isEmpty();
			case KragsteinPackage.COMMENT_LINK__SOURCE:
				return source != null;
			case KragsteinPackage.COMMENT_LINK__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //CommentLinkImpl
