package qualitypatternmodel.cypherevaluation;

import java.time.Duration;
import java.time.Instant;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionneo4j.NeoNode;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyNode;
import qualitypatternmodel.evaluation.EvalContains;
import qualitypatternmodel.evaluation.EvalExNEx;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.Contains;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

//also called MANDSTRUC2
//has to be checked if necessary since it is to similar to the MANDSTRUC
public class CypherEvalExNEx {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//New Ones		
		
		//Old ones
//		printExNEx();
//		
//		System.out.println();
//		System.out.println("---");
//		System.out.println();
		
		printExNExCond();
		
//		System.out.println();
//		System.out.println("---");
//		System.out.println();
//		
//		printExNExCond2Cond();
	}

	//New Ones

		
	//Old Ones
	//BEGIN
	private static void printExNEx() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternOldExNEx;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternOldExNEx = getOldExNExGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternOldExNEx = getOldExNExAbstract(completePatternOldExNEx);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);

		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternOldExNEx = getOldExNExConcrete(completePatternOldExNEx);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternOldExNEx.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldExNExGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalExNEx.getExNExGeneric();
	}
	
	private static CompletePattern getOldExNExAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	/**
	 * Every regesta with a regid should have a Place
	 * @param completePattern
	 * @return
	 * @throws InvalidityException
	 * @throws OperatorCycleException
	 * @throws MissingPatternContainerException
	 */
	private static CompletePattern getOldExNExConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addNeoLabel("Regesta");
		NeoPropertyNode neoPropertyNode1 = (NeoPropertyNode) neoNode.getOutgoing().get(0).getTarget();
		NeoPropertyEdge neoPropertyEdge1 = (NeoPropertyEdge) neoPropertyNode1.getIncoming().get(0);
		neoPropertyEdge1.getNeoPropertyPathParam().setNeoPropertyName("regid");
	
		Graph g = ((QuantifiedCondition) ((NotCondition) completePattern.getCondition()).getCondition()).getGraph(); 
		NeoNode neoNode2 = (NeoNode) g.getNodes().get(2);
		neoNode2.addNeoLabel("Place");
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
		TextLiteralParam tx1 = new TextLiteralParamImpl();
		tx1.setValue("");
		p0. replace(tx1);
		Comparison comparison1 = (Comparison) neoPropertyNode1.getAllOperators().get(0);
		ComparisonOptionParam comparisonOptionParam = new ComparisonOptionParamImpl();
		comparisonOptionParam.setValue(ComparisonOperator.NOTEQUAL);
		comparison1.setOption(comparisonOptionParam);
		
		return completePattern;
	}
	//END 
	
	//BEGIN
	private static void printExNExCond() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternOldExNExCond;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternOldExNExCond = getOldExNExCondGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternOldExNExCond = getOldExNExCondAbstract(completePatternOldExNExCond);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);

		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternOldExNExCond = getOldExNExCondConcrete(completePatternOldExNExCond);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternOldExNExCond.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldExNExCondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalExNEx.getExNExCondGeneric();
	}
	
	private static CompletePattern getOldExNExCondAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	//Need to be completed
	private static CompletePattern getOldExNExCondConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addNeoLabel("Regesta");
		NeoPropertyNode neoPropertyNode1 = (NeoPropertyNode) neoNode.getOutgoing().get(0).getTarget();
		NeoPropertyEdge neoPropertyEdge1 = (NeoPropertyEdge) neoPropertyNode1.getIncoming().get(0);
		neoPropertyEdge1.getNeoPropertyPathParam().setNeoPropertyName("regid");
		
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		Graph g = quantifiedCondition.getGraph(); 
		NeoNode neoNode2 = (NeoNode) g.getNodes().get(2);
		neoNode2.addNeoLabel("Regesta");
		NeoPropertyNode neoPropertyNode2 = (NeoPropertyNode) neoNode2.getOutgoing().get(0).getTarget();
		NeoPropertyEdge neoPropertyEdge2 = (NeoPropertyEdge) neoPropertyNode2.getIncoming().get(0);
		neoPropertyEdge2.getNeoPropertyPathParam().setNeoPropertyName("regid");
		
		NotCondition notCondition = (NotCondition) quantifiedCondition.getCondition();
		QuantifiedCondition quantifiedCondition2 = (QuantifiedCondition) notCondition.getCondition();
		g = quantifiedCondition2.getGraph(); 
		NeoNode neoNode3 = (NeoNode) g.getNodes().get(4);
		neoNode.addNeoLabel("Regesta");		
		
		return completePattern;
	}
	//END 
	
	//BEGIN
	private static void printExNExCond2Cond() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternOldExNExCond2;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternOldExNExCond2 = getOldExNExCond2CondGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternOldExNExCond2 = getOldExNExCond2CondAbstract(completePatternOldExNExCond2);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
		
		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternOldExNExCond2 = getOldExNExCond2Concrete(completePatternOldExNExCond2);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternOldExNExCond2.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldExNExCond2CondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalContains.getContainsGeneric();
	}
	
	private static CompletePattern getOldExNExCond2CondAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getOldExNExCond2Concrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addNeoLabel("IndexEntry");
		neoNode.addNeoLabel("IndexPerson");
		
		Graph g = ((QuantifiedCondition) completePattern.getCondition()).getGraph(); 
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) g.getNodes().get(1);
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) neoPropertyNode.getIncoming().get(0);
		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("label");
		Contains contains = (Contains) ((QuantifiedCondition) completePattern.getCondition()).getGraph().getAllOperators().get(0); 
		TextLiteralParam textLiteralParam = new TextLiteralParamImpl();
		textLiteralParam.setValue(",");
		contains.setContent(textLiteralParam);
		
		return completePattern;
	}
	//END 
}
