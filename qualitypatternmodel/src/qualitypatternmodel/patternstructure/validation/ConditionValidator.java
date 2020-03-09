/**
 *
 * $Id$
 */
package qualitypatternmodel.patternstructure.validation;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.Not;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;


/**
 * A sample validator interface for {@link qualitypatternmodel.patternstructure.Condition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ConditionValidator {
	boolean validate();

	boolean validateCondDepth(int value);

	boolean validateGetNextQuantifiedConditions(EList<QuantifiedCondition> value);

	boolean validatePattern(Pattern value);

	boolean validateQuantifiedcondition(QuantifiedCondition value);

	boolean validateFormula1(Formula value);

	boolean validateFormula2(Formula value);

	boolean validateNot(Not value);

	boolean validateFormula(Formula value);

}
