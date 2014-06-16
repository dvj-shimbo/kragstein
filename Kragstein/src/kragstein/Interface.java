/**
 */
package kragstein;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kragstein.Interface#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see kragstein.KragsteinPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends Unit {
	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link kragstein.InterfaceMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see kragstein.KragsteinPackage#getInterface_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceMethod> getMethods();

} // Interface
