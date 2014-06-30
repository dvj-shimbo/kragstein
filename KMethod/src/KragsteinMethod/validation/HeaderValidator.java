/**
 *
 * $Id$
 */
package KragsteinMethod.validation;

import KragsteinMethod.Parameter;
import org.eclipse.emf.common.util.EList;


/**
 * A sample validator interface for {@link KragsteinMethod.Header}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface HeaderValidator {
	boolean validate();

	boolean validateName(String value);

	boolean validateType(String value);

	boolean validateVisibility(String value);

	boolean validateIsConst(boolean value);

	boolean validateIsVirtual(boolean value);

	boolean validateIsStatic(boolean value);

	boolean validateParameter(EList<Parameter> value);
}
