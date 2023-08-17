/**
 *
 * $Id$
 */
package qualitypatternmodel.graphstructure.validation;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.graphstructure.Node;

/**
 * A sample validator interface for {@link qualitypatternmodel.graphstructure.Node}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ElementValidator {
	boolean validate();
	
	boolean validatePrevious(Node value);
	boolean validateNextSet(EList<Node> value);

	boolean validateGraph(Graph value);

	boolean validateResultOf(Graph value);

	boolean validateName(String value);

	boolean validateTranslated(boolean value);

	boolean validatePredicatesAreBeingTranslated(boolean value);

	boolean validateProperties(EList<PrimitiveNode> value);

	boolean validatePredicates(EList<BooleanOperator> value);

	boolean validateOutgoing(EList<Relation> value);

	boolean validateIncoming(EList<Relation> value);

	boolean validateNext(EList<Node> value);
	boolean validateRoot(Graph value);

	boolean validateNextSingle(EList<Node> value);

	boolean validateGraphDepth(int value);
}
