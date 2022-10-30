package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyNode;
import qualitypatternmodel.cyphertranslationtests.CypherAbstractTranslation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;

public class CypherTest07QuantifiedCondition extends CypherAbstractTranslation {
	//Add BooleanOperators Test here
	//Add a beginning in the morph which is not the end to thest the pattern-match generation alg
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CypherTest07QuantifiedCondition quantifiedCond = new CypherTest07QuantifiedCondition();
		try {
			quantifiedCond.generalizedTests();         
			quantifiedCond.generalizedInvalidtyExceptionTests(); 
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	@Override
	public void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatterns.add(getNodesWhereExits(false));
		completePatterns.add(getNodesWhereExits(true));
		completePatterns.add(getNodesWhereMultiplePropertyExistsChecks(false));
		completePatterns.add(getNodesWhereMultiplePropertyExistsChecks(true));		
	}
	
	//CHECKING WHAT HAPPENS IF THE GRAPH HAS ALSO CONDITIONS --> Build test with multiple properties!
	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatternsExceptions.add(generateNodesWhereNoBeginningsException(false));
		completePatternsExceptions.add(generateNodesWhereNoBeginningsException(true));
		completePatternsExceptions.add(generateWithForAllPropertyExistenceException());
		completePatternsExceptions.add(generateNoNodesAreDefinedInTheGraphException());
		completePatternsExceptions.add(generateQuantifiedCondContainsCountPatternException());
	}
	

	
	//Does not throw an Exception --> have a deeper look inside again what it does
	//PATTERN where to identifie a missing element with exists
	private CompletePattern getNodesWhereExits(boolean not) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherAbstractTranslation.getCompBasePattern();
		QuantifiedCondition quantifiedCond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		quantifiedCond.setQuantifier(Quantifier.EXISTS);
		if (not) {
			NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
			completePattern.setCondition(notCond);
			notCond.setCondition(quantifiedCond);
		} else {
			completePattern.setCondition(quantifiedCond);
		}
		
		completePattern.createNeo4jAdaption();
		
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addLabel("Regesta");
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("origPlaceOfIssue");
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) quantifiedCond.getGraph().getNodes().get(1);
		neoPropertyNode.setNeoPlace(NeoPlace.BEGINNING);
		
		return completePattern;	
	}
	
	
	private CompletePattern getNodesWhereMultiplePropertyExistsChecks(boolean not) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return generateNodesWhereMultiplePropertyExistsChecksException(false);
	}
	
	
	//Exception
	private CompletePattern generateNodesWhereMultiplePropertyExistsChecksException(boolean not) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherAbstractTranslation.getCompBasePattern();
		PrimitiveNode pn = completePattern.getGraph().addPrimitiveNode();
		ComplexNode cn = (ComplexNode) completePattern.getGraph().getNodes().get(0);
		completePattern.getGraph().addRelation(cn, pn);
		QuantifiedCondition quantifiedCond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		quantifiedCond.setQuantifier(Quantifier.EXISTS);
		if (not) {
			NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
			completePattern.setCondition(notCond);
			notCond.setCondition(quantifiedCond);
		} else {
			completePattern.setCondition(quantifiedCond);
		}
		
		pn = quantifiedCond.getGraph().addPrimitiveNode();
		cn = (ComplexNode) quantifiedCond.getGraph().getNodes().get(0);
		quantifiedCond.getGraph().addRelation(cn, pn);
		
		completePattern.createNeo4jAdaption();
		
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addLabel("Regesta");
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("origPlaceOfIssue");
		
		neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(1);
		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("origPlaceOfIssue");
		
		neoPropertyEdge = (NeoPropertyEdge) quantifiedCond.getGraph().getRelations().get(2);
		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("origPlaceOfIssue");
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) quantifiedCond.getGraph().getNodes().get(1);
		neoPropertyNode.setNeoPlace(NeoPlace.BEGINNING);
		
		neoPropertyNode = (NeoPropertyNode) quantifiedCond.getGraph().getNodes().get(2);
		neoPropertyNode.setNeoPlace(NeoPlace.BEGINNING);
		
		neoPropertyNode = (NeoPropertyNode) quantifiedCond.getGraph().getNodes().get(3);
		neoPropertyNode.setNeoPlace(NeoPlace.BEGINNING);
		
		return completePattern;	
	}
	
	private CompletePattern generateWithForAllPropertyExistenceException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = generateNodesWhereMultiplePropertyExistsChecksException(false);
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		quantifiedCondition.setQuantifier(Quantifier.FORALL);
		return completePattern;
	}
	
	private CompletePattern generateNodesWhereNoBeginningsException(boolean not) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherAbstractTranslation.getCompBasePattern();
		PrimitiveNode pn = completePattern.getGraph().addPrimitiveNode();
		ComplexNode cn = (ComplexNode) completePattern.getGraph().getNodes().get(0);
		completePattern.getGraph().addRelation(cn, pn);
		QuantifiedCondition quantifiedCond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		quantifiedCond.setQuantifier(Quantifier.EXISTS);
		if (not) {
			NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
			completePattern.setCondition(notCond);
			notCond.setCondition(quantifiedCond);
		} else {
			completePattern.setCondition(quantifiedCond);
		}
		
		pn = quantifiedCond.getGraph().addPrimitiveNode();
		cn = (ComplexNode) quantifiedCond.getGraph().getNodes().get(0);
		quantifiedCond.getGraph().addRelation(cn, pn);
		
		completePattern.createNeo4jAdaption();
		
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addLabel("Regesta");
	
		
		return completePattern;	
	}
		
	//Exception tests
	private CompletePattern generateNoNodesAreDefinedInTheGraphException() throws InvalidityException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setGraph(null);
		
		return completePattern;
	}
	
	private CompletePattern generateQuantifiedCondContainsCountPatternException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherAbstractTranslation.getCompBasePattern();
		completePattern.setCondition(PatternstructureFactory.eINSTANCE.createQuantifiedCondition());
		CypherAbstractTranslation.setCountCounditionInsideOfAnotherCondition(completePattern);		
		
		completePattern.createNeo4jAdaption();
	
		return completePattern;
	}
}
