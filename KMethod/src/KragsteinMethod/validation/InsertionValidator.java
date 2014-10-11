/**
 *
 * $Id$
 */
package KragsteinMethod.validation;

import KragsteinMethod.Method;

/**
 * A sample validator interface for {@link KragsteinMethod.Insertion}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InsertionValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateValue(String value);
	boolean validateMethod(Method value);
}
