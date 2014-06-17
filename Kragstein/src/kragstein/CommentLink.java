/**
 */
package kragstein;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kragstein.CommentLink#getSourceConnection <em>Source Connection</em>}</li>
 *   <li>{@link kragstein.CommentLink#getTargetConnection <em>Target Connection</em>}</li>
 *   <li>{@link kragstein.CommentLink#getSource <em>Source</em>}</li>
 *   <li>{@link kragstein.CommentLink#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see kragstein.KragsteinPackage#getCommentLink()
 * @model
 * @generated
 */
public interface CommentLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Connection</b></em>' containment reference list.
	 * The list contents are of type {@link kragstein.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Connection</em>' containment reference list.
	 * @see kragstein.KragsteinPackage#getCommentLink_SourceConnection()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getSourceConnection();

	/**
	 * Returns the value of the '<em><b>Target Connection</b></em>' containment reference list.
	 * The list contents are of type {@link kragstein.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Connection</em>' containment reference list.
	 * @see kragstein.KragsteinPackage#getCommentLink_TargetConnection()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getTargetConnection();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Comment)
	 * @see kragstein.KragsteinPackage#getCommentLink_Source()
	 * @model
	 * @generated
	 */
	Comment getSource();

	/**
	 * Sets the value of the '{@link kragstein.CommentLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Comment value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Comment)
	 * @see kragstein.KragsteinPackage#getCommentLink_Target()
	 * @model
	 * @generated
	 */
	Comment getTarget();

	/**
	 * Sets the value of the '{@link kragstein.CommentLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Comment value);

} // CommentLink
