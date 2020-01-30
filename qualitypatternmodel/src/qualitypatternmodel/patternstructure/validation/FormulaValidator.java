/**
 *
 * $Id$
 */
package qualitypatternmodel.patternstructure.validation;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.LogicalOperator;

/**
 * A sample validator interface for {@link qualitypatternmodel.patternstructure.Formula}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FormulaValidator {
	boolean validate();

	boolean validateArguments(EList<Condition> value);
	boolean validateOperator(LogicalOperator value);

	boolean validateArgument1(Condition value);

	boolean validateArgument2(Condition value);
}
