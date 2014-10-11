/**
 *
 * $Id$
 */
package KragsteinMethod.validation;

import KragsteinMethod.Case;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link KragsteinMethod.Choice}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ChoiceValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateValue(String value);
	boolean validateCase(EList<Case> value);
	boolean validateFirstCaseName(String value);
	boolean validateFirstCaseValue(String value);
}
