/**
 */
package KragsteinMethod;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Icon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link KragsteinMethod.Icon#getValencePoint <em>Valence Point</em>}</li>
 *   <li>{@link KragsteinMethod.Icon#getLeftComment <em>Left Comment</em>}</li>
 *   <li>{@link KragsteinMethod.Icon#getRightComment <em>Right Comment</em>}</li>
 *   <li>{@link KragsteinMethod.Icon#getNextIcon <em>Next Icon</em>}</li>
 *   <li>{@link KragsteinMethod.Icon#getSynchroniser <em>Synchroniser</em>}</li>
 * </ul>
 * </p>
 *
 * @see KragsteinMethod.KragsteinMethodPackage#getIcon()
 * @model abstract="true"
 * @generated
 */
public interface Icon extends EObject {
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
	 * @see KragsteinMethod.KragsteinMethodPackage#getIcon_ValencePoint()
	 * @model containment="true"
	 * @generated
	 */
	ValencePoint getValencePoint();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Icon#getValencePoint <em>Valence Point</em>}' containment reference.
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
	 * @see KragsteinMethod.KragsteinMethodPackage#getIcon_LeftComment()
	 * @model containment="true"
	 * @generated
	 */
	LeftComment getLeftComment();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Icon#getLeftComment <em>Left Comment</em>}' containment reference.
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
	 * @see KragsteinMethod.KragsteinMethodPackage#getIcon_RightComment()
	 * @model containment="true"
	 * @generated
	 */
	RightComment getRightComment();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Icon#getRightComment <em>Right Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Comment</em>' containment reference.
	 * @see #getRightComment()
	 * @generated
	 */
	void setRightComment(RightComment value);

	/**
	 * Returns the value of the '<em><b>Next Icon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Icon</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Icon</em>' reference.
	 * @see #setNextIcon(Icon)
	 * @see KragsteinMethod.KragsteinMethodPackage#getIcon_NextIcon()
	 * @model
	 * @generated
	 */
	Icon getNextIcon();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Icon#getNextIcon <em>Next Icon</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Icon</em>' reference.
	 * @see #getNextIcon()
	 * @generated
	 */
	void setNextIcon(Icon value);

	/**
	 * Returns the value of the '<em><b>Synchroniser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchroniser</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchroniser</em>' containment reference.
	 * @see #setSynchroniser(Synchronizer)
	 * @see KragsteinMethod.KragsteinMethodPackage#getIcon_Synchroniser()
	 * @model containment="true"
	 * @generated
	 */
	Synchronizer getSynchroniser();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Icon#getSynchroniser <em>Synchroniser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchroniser</em>' containment reference.
	 * @see #getSynchroniser()
	 * @generated
	 */
	void setSynchroniser(Synchronizer value);

} // Icon
