package qualitypatternmodel.newservlets.initialisation;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.impl.NumberElementImpl;

public class GenericPatterns {
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		int i = 0;
		for (CompletePattern pattern: getAllGenericPattern()) {
			i+=1;
			System.out.println("Example " + i);
			System.out.println(pattern.myToString());
			System.out.println();
		}
	}
	
	public static List<CompletePattern> getAllGenericPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		patterns.add(getGenericCard());
		patterns.add(getGenericComp());
		patterns.add(getGenericFunc());
		patterns.add(getGenericUnique());
		patterns.add(getGenericMatch());
		patterns.add(getGenericContains());
		patterns.add(getGenericAppdup3());
		patterns.add(getGenericDupVal());
		return patterns;
	}

	public static CompletePattern getGenericCard() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId("Card_generic");
		pattern.setAbstractId("Card_generic");
		pattern.setName("Card");
		pattern.setShortDescription("Cardinality Constraint");
		pattern.setDescription("Check, wether the occurence count of specific elements apply.");
		
		// Context graph of pattern:
		Node returnNode = pattern.getGraph().getNodes().get(0).makeComplex();
		returnNode.setName("RecordElement");
		
		// First-order logic condition of pattern:
		CountCondition countCondition = PatternstructureFactory.eINSTANCE.createCountCondition();
		pattern.setCondition(countCondition);
		countCondition.createCountPattern();
		NumberElementImpl ne = new NumberElementImpl();
		countCondition.setArgument2(ne);
		ne.createParameters();
		ne.getNumberParam().setValue(1.);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);
		
		Node countReturn = returnNode.addOutgoing(countCondition.getCountPattern().getGraph()).getTarget().makePrimitive();
		countReturn.setName("PropertyToCount");
		countReturn.setReturnNode(true);
		
		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;	
	}
	
	public static CompletePattern getGenericComp() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId("Comp_generic");
		pattern.setAbstractId("Comp_generic");
		pattern.setName("Comp");
		pattern.setShortDescription("Comparison Pattern");
		pattern.setDescription("Check, wether the occurence count of specific elements apply.");
		
		Graph graph1 = pattern.getGraph();
		Node returnNode = graph1.getReturnNodes().get(0).makeComplex();
		
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);
		Graph graph2 = quantifiedCondition.getGraph();
		
		Node element1 = returnNode.addOutgoing(graph2).getTarget().makePrimitive();
		Node element2 = returnNode.addOutgoing(graph2).getTarget().makePrimitive();
		
		Comparison comp2 = element1.addComparison(element2);
		comp2.getOption().getOptions().add(ComparisonOperator.GREATER);
		comp2.getOption().getOptions().add(ComparisonOperator.LESS);
		comp2.getOption().getOptions().add(ComparisonOperator.GREATEROREQUAL);
		comp2.getOption().getOptions().add(ComparisonOperator.LESSOREQUAL);
		
		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}
	
	public static CompletePattern getGenericFunc() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId("Func_generic");
		pattern.setAbstractId("Func_generic");
		pattern.setName("Func");
		pattern.setShortDescription("Functional Dependency Constraint");
		pattern.setDescription("Validate a dependency between two subordinate fields is valid in comparison to data records next to it.");
		
		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		
		pattern.setCondition(qc);
		
		Graph g1 = pattern.getGraph();
		Graph g2 = qc.getGraph();
		
		ComplexNode ret = g1.getNodes().get(0).makeComplex();
		ComplexNode other = g2.addComplexNode();
		
		PrimitiveNode fieldA1 = ret.addOutgoing(g2).getTarget().makePrimitive();
		PrimitiveNode fieldA2 = ret.addOutgoing(g2).getTarget().makePrimitive();
		PrimitiveNode fieldB1 = other.addOutgoing().getTarget().makePrimitive();
		PrimitiveNode fieldB2 = other.addOutgoing().getTarget().makePrimitive();
		
		Comparison c1 = fieldA1.addComparison(fieldB1);
		c1.getTypeOption().setValue(ReturnType.STRING);
		c1.getTypeOption().setPredefined(true);
		c1.getOption().setValue(ComparisonOperator.EQUAL);
		c1.getOption().setPredefined(true);

		Comparison c2 = fieldA2.addComparison(fieldB2);
		c2.getTypeOption().setValue(ReturnType.STRING);
		c2.getTypeOption().setPredefined(true);
		c2.getOption().setValue(ComparisonOperator.NOTEQUAL);
		c2.getOption().setPredefined(true);
		
		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}
	
	public static CompletePattern getGenericUnique() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId("Unique_generic");
		pattern.setAbstractId("Unique_generic");
		pattern.setName("Unique");
		pattern.setShortDescription("Uniqueness Constraint");
		pattern.setDescription("Check, whether a value is unique within the dataset.");
		
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);
		
		CountCondition countCondition = PatternstructureFactory.eINSTANCE.createCountCondition();
		quantifiedCondition.setCondition(countCondition);
		countCondition.createCountPattern();
		CountPattern countPattern = countCondition.getCountPattern(); 
		NumberElementImpl numberElement = new NumberElementImpl();
		countCondition.setArgument2(numberElement);
		numberElement.createParameters();
		numberElement.getNumberParam().setValue(1.);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);
		
		NumberParam numberParam = numberElement.getNumberParam();
		
		numberParam.setValue(1.0);
		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);	
				
		Graph g0 = pattern.getGraph();
		Graph g1 = quantifiedCondition.getGraph();
		Graph g2 = countPattern.getGraph();
		
		Node ret = g0.getReturnNodes().get(0).makeComplex();
		Node e1 = ret.addOutgoing(g1).getTarget().makePrimitive();
		
		Node g2base = g2.addComplexNode();
		Node g2return = g2base.addOutgoing().getTarget().makePrimitive();
		g2return.setReturnNode(true);
		
		Comparison c = g2return.addComparison(e1);
		c.getTypeOption().setValue(ReturnType.STRING);

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}
	
	public static CompletePattern getGenericMatch() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId("Match_generic");
		pattern.setAbstractId("Match_generic");
		pattern.setName("Match");
		pattern.setShortDescription("Regular Expression Check");
		pattern.setDescription("Check, whether a value matches a specific regular expression.");
		
		pattern.getGraph().getReturnNodes().get(0).makeComplex();
		
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);
		
		Node ret  = pattern.getGraph().getReturnNodes().get(0);
		Node element1 = ret.addOutgoing(quantifiedCondition.getGraph()).getTarget().makePrimitive();
		element1.addPrimitiveMatch();

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;	
	}
	
	public static CompletePattern getGenericContains() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId("Contains_generic");
		pattern.setAbstractId("Contains_generic");
		pattern.setName("Contains");
		pattern.setShortDescription("Contains Check");
		pattern.setDescription("Check, whether a value contains a specific substring.");
		
		// Context graph of pattern:
		pattern.getGraph().getReturnNodes().get(0).makeComplex();
		Graph g1 = pattern.getGraph();
		Node ret = g1.getReturnNodes().get(0);
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);
		Graph g2 = quantifiedCondition.getGraph();
		
		Node element1 = ret.addOutgoing(g2).getTarget().makePrimitive();
		element1.addPrimitiveContains();

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;	
	}

	public static CompletePattern getGenericAppdup2() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId("Appdup2_generic");
		pattern.setAbstractId("Appdup2_generic");
		pattern.setName("Appdup2");
		pattern.setShortDescription("Approximate Duplicate based on two attributes");
		pattern.setDescription("Check whether there are records that have the same value in two important attributes, suggesting that they describe the same real-world object.");
		
		pattern.getGraph().getReturnNodes().get(0).makeComplex();
		pattern.getGraph().getReturnNodes().get(0).setName("main");
		
		ComplexNode main = (ComplexNode) pattern.getGraph().getReturnNodes().get(0);
		ComplexNode other = GraphstructureFactory.eINSTANCE.createComplexNode();
		other.setName("other");
		other.setReturnNode(true);
		other.setGraph(pattern.getGraph());
		Comparison c = main.addComparison(other);
		
		QuantifiedCondition qc1 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qc1);
		
		Graph g1 = qc1.getGraph();
		
		c.getOption().setValue(ComparisonOperator.NOTEQUAL);
		c.getOption().setPredefined(true);
		
		Node n1 = main.addOutgoing(g1).getTarget().makePrimitive();
		other.addOutgoing(n1);
		
		Node n2 = main.addOutgoing(g1).getTarget().makePrimitive();
		other.addOutgoing(n2);

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}

	public static CompletePattern getGenericAppdup3() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = getGenericAppdup2();
		pattern.setPatternId("Appdup3_generic");
		pattern.setAbstractId("Appdup3_generic");
		pattern.setName("Appdup3");
		pattern.setShortDescription("Approximate Duplicate based on three attributes");
		pattern.setDescription("Check whether there are records that have the same value in three important attributes, suggesting that they describe the same real-world object.");
		
		Graph g0 = pattern.getGraph();
		QuantifiedCondition qc1 = (QuantifiedCondition) pattern.getCondition();
		Graph g1 = qc1.getGraph();
		
		Node main = g0.getNodes().get(0);
		Node other = g0.getNodes().get(1);
		
		Node n2 = main.addOutgoing(g1).getTarget().makePrimitive();
		other.addOutgoing(n2);

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}
	
	public static CompletePattern getGenericDupVal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId("DupVal_generic");
		pattern.setAbstractId("DupVal_generic");
		pattern.setName("DupVal");
		pattern.setShortDescription("Duplicate value");
		pattern.setDescription("Check whether a record has the same value in two distinct fields.");
		
		ComplexNode main = (ComplexNode) pattern.getGraph().getReturnNodes().get(0).makeComplex();
		main.setName("main");
		
		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qc);
		
		PrimitiveNode field = main.addOutgoing(qc.getGraph()).getTarget().makePrimitive();
		field.setName("field");
		
		CountCondition countCondition = PatternstructureFactory.eINSTANCE.createCountCondition();
		qc.setCondition(countCondition);
		countCondition.createCountPattern();
		NumberElementImpl ne = new NumberElementImpl();
		countCondition.setArgument2(ne);
		ne.createParameters();
		ne.getNumberParam().setValue(1.);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);
		
		Relation rel = main.addOutgoing(countCondition.getCountPattern().getGraph());
		PrimitiveNode field2 = rel.getTarget().makePrimitive();
		field2.setName("field2");
		field2.setReturnNode(true);
		Comparison c = field2.addComparison(field);
		ComparisonOptionParam comparisonOption = c.getOption();
		comparisonOption.setValue(ComparisonOperator.EQUAL);
		comparisonOption.setPredefined(true);

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}
}
