/**
 */
package kragstein;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kragstein.FormalParameters#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see kragstein.KragsteinPackage#getFormalParameters()
 * @model
 * @generated
 */
public interface FormalParameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link kragstein.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see kragstein.KragsteinPackage#getFormalParameters_Parameters()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // FormalParameters
