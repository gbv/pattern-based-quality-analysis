/**
 *
 * $Id$
 */
package qualitypatternmodel.graphstructure.validation;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.functions.OperatorList;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

/**
 * A sample validator interface for {@link qualitypatternmodel.graphstructure.Graph}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GraphValidator {
	boolean validate();

	boolean validateRootElements(SingleElement value);

	boolean validateRootElements(EList<SingleElement> value);

	boolean validateReturnElements(EList<SingleElement> value);
	boolean validateMorphismTo(EList<Morphism> value);

	boolean validateMorphismFrom(Morphism value);

	boolean validateRootElement(SingleElement value);
	boolean validateOperatorList(OperatorList value);
	boolean validateGraphDepth(int value);

	boolean validateReturnGraph(boolean value);

	boolean validateGetAllElements(EList<Element> value);

	boolean validateGetAllRelations(EList<Relation> value);

	boolean validateQuantifiedCondition(QuantifiedCondition value);

	boolean validateQuantifiedcondition(QuantifiedCondition value);

	boolean validatePattern(Pattern value);
}
