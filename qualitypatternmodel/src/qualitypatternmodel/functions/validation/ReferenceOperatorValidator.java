/**
 *
 * $Id$
 */
package qualitypatternmodel.functions.validation;

import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.ReturnType;

/**
 * A sample validator interface for {@link qualitypatternmodel.functions.ReferenceOperator}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ReferenceOperatorValidator {
	boolean validate();

	boolean validateProperty2(Property value);
	boolean validateProperty(Property value);
	boolean validateType(ReturnType value);
}
