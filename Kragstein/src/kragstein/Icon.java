/**
 */
package kragstein;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Icon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kragstein.Icon#getSourceIconConnection <em>Source Icon Connection</em>}</li>
 *   <li>{@link kragstein.Icon#getTargetIconConnection <em>Target Icon Connection</em>}</li>
 *   <li>{@link kragstein.Icon#getValencePoint <em>Valence Point</em>}</li>
 *   <li>{@link kragstein.Icon#getLeftComment <em>Left Comment</em>}</li>
 *   <li>{@link kragstein.Icon#getRightComment <em>Right Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see kragstein.KragsteinPackage#getIcon()
 * @model abstract="true"
 * @generated
 */
public interface Icon extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Icon Connection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Icon Connection</em>' containment reference.
	 * @see #setSourceIconConnection(IconConnection)
	 * @see kragstein.KragsteinPackage#getIcon_SourceIconConnection()
	 * @model containment="true"
	 * @generated
	 */
	IconConnection getSourceIconConnection();

	/**
	 * Sets the value of the '{@link kragstein.Icon#getSourceIconConnection <em>Source Icon Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Icon Connection</em>' containment reference.
	 * @see #getSourceIconConnection()
	 * @generated
	 */
	void setSourceIconConnection(IconConnection value);

	/**
	 * Returns the value of the '<em><b>Target Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Icon Connection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Icon Connection</em>' containment reference.
	 * @see #setTargetIconConnection(IconConnection)
	 * @see kragstein.KragsteinPackage#getIcon_TargetIconConnection()
	 * @model containment="true"
	 * @generated
	 */
	IconConnection getTargetIconConnection();

	/**
	 * Sets the value of the '{@link kragstein.Icon#getTargetIconConnection <em>Target Icon Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Icon Connection</em>' containment reference.
	 * @see #getTargetIconConnection()
	 * @generated
	 */
	void setTargetIconConnection(IconConnection value);

	/**
	 * Returns the value of the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valence Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valence Point</em>' containment reference.
	 * @see #setValencePoint(ValencePoint)
	 * @see kragstein.KragsteinPackage#getIcon_ValencePoint()
	 * @model containment="true"
	 * @generated
	 */
	ValencePoint getValencePoint();

	/**
	 * Sets the value of the '{@link kragstein.Icon#getValencePoint <em>Valence Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valence Point</em>' containment reference.
	 * @see #getValencePoint()
	 * @generated
	 */
	void setValencePoint(ValencePoint value);

	/**
	 * Returns the value of the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Comment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Comment</em>' containment reference.
	 * @see #setLeftComment(LeftComment)
	 * @see kragstein.KragsteinPackage#getIcon_LeftComment()
	 * @model containment="true"
	 * @generated
	 */
	LeftComment getLeftComment();

	/**
	 * Sets the value of the '{@link kragstein.Icon#getLeftComment <em>Left Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Comment</em>' containment reference.
	 * @see #getLeftComment()
	 * @generated
	 */
	void setLeftComment(LeftComment value);

	/**
	 * Returns the value of the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Comment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Comment</em>' containment reference.
	 * @see #setRightComment(RightComment)
	 * @see kragstein.KragsteinPackage#getIcon_RightComment()
	 * @model containment="true"
	 * @generated
	 */
	RightComment getRightComment();

	/**
	 * Sets the value of the '{@link kragstein.Icon#getRightComment <em>Right Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Comment</em>' containment reference.
	 * @see #getRightComment()
	 * @generated
	 */
	void setRightComment(RightComment value);

} // Icon
