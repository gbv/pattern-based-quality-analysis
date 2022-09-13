package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import playground.Java2Neo4JConnector;
import qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JFactoryImpl;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.impl.DateParamImpl;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import static qualitypatternmodel.xmltranslationtests.Test00.*;

public class CypherTest00 {
	public static final AdaptionNeo4JFactory FACTORY = new AdaptionNeo4JFactoryImpl();
	
//	public CypherTest00() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CypherTest00.main(null);
//	} --> Add this to all the classes otherwise the main will be not called
	
	public static void test(ArrayList<CompletePattern> completePatterns) {
		Java2Neo4JConnector connector = new Java2Neo4JConnector();
		for (CompletePattern completePattern : completePatterns) {
			replace(completePattern);
			try {
//				completePattern.isValid(AbstractionLevel.CONCRETE); // TODO: allow technology-dependent validation
				System.out.println("\n\n___PATTERN_(VALID)___");
				System.out.println(completePattern.myToString());
				System.out.print("\n___TRANSLATION___");
				String query = completePattern.generateCypher();
				//Depending on the test mode activated the db-connector
//				System.out.println(query); 
				String hashCode = query.hashCode() + "";
				connector.queryTester(query, hashCode);
			} catch (Exception e) {
				System.out.println();
				e.printStackTrace();
				try {
				  System.out.println(completePattern.myToString());
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
	
	public static void exceptionHandler(ArrayList<CompletePattern> completePatterns) {
		for (CompletePattern completePattern : completePatterns) {
			try {
				replace(completePattern);
				System.out.println("\n\n___PATTERN_(VALID)___");
				System.out.println(completePattern.myToString());
				System.out.print("\n___TRANSLATION___");
				System.out.println(completePattern.generateCypher());
				System.out.println("No Exception has been triggered");
			} catch (Exception e) {
				System.out.println("-- Beginning of the Exceptions --");
				System.out.println(e.toString());
//				e.printStackTrace();
				try {
				  System.out.println(completePattern.myToString());
				} catch (Exception e2) {
					System.out.println(e2.toString());
					//e2.printStackTrace();
				}
				System.out.println("Test successful");
			}
		}
	}
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getBasePatternFinal());
		completePatterns.add(getBasePatternComplexFinal());
		completePatterns.add(getComplexMatchStructure());
		completePatterns.add(getBasePatternCondDateConcrete("1440-02-02"));
		completePatterns.add(getBasePatternCondConcrete("1439-12-20"));
		completePatterns.add(getBasePatternMatchConcrete("1439.*"));
		completePatterns.add(getBasePatternMatchNotConcrete("1439.*"));
		CypherTest00.test(completePatterns);
	}
	
	public static CompletePattern getBasePatternFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		completePattern.createNeo4jAdaption();
		
		return completePattern;
	}
	
	//Test ist nicht correct
	public static CompletePattern getComplexMatchStructure() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
		
		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
		ComplexNode pn1 = completePattern.getGraph().addComplexNode();
		completePattern.getGraph().addRelation(complexNode1, pn1);
		
		ComplexNode pn2 = completePattern.getGraph().addComplexNode();
		completePattern.getGraph().addRelation(complexNode1, pn2);
		
		ComplexNode pn3 = completePattern.getGraph().addComplexNode();
		completePattern.getGraph().addRelation(complexNode1, pn3);
		
		ComplexNode pn4 = completePattern.getGraph().addComplexNode();
		completePattern.getGraph().addRelation(pn1, pn4);
		
		ComplexNode pn5 = completePattern.getGraph().addComplexNode();
		completePattern.getGraph().addRelation(pn1, pn5);
		
		ComplexNode pn6 = completePattern.getGraph().addComplexNode();
		completePattern.getGraph().addRelation(pn1, pn6);
	
		
		completePattern.createNeo4jAdaption();
		
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(1);
		NeoEdge neoEdge = (NeoEdge) completePattern.getGraph().getRelations().get(1);
		
		neoNode = (NeoNode) completePattern.getGraph().getNodes().get(2);
		neoEdge = (NeoEdge) completePattern.getGraph().getRelations().get(2);
		
		neoNode = (NeoNode) completePattern.getGraph().getNodes().get(3);
		neoEdge = (NeoEdge) completePattern.getGraph().getRelations().get(3);
		
		neoNode = (NeoNode) completePattern.getGraph().getNodes().get(4);
		neoEdge = (NeoEdge) completePattern.getGraph().getRelations().get(4);
		
		neoNode = (NeoNode) completePattern.getGraph().getNodes().get(5);
		neoEdge = (NeoEdge) completePattern.getGraph().getRelations().get(5);
		
		return completePattern;
	}
	
	
	public static CompletePattern getBasePattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
		
		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
		PrimitiveNode pn = completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation(complexNode1, pn);
	
		return completePattern;	
	}
	
	public static CompletePattern getBasePatternComplexFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternComplex();
		
		completePattern.createNeo4jAdaption();
		
		return completePattern;
	}
	
	public static CompletePattern getBasePatternComplex() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
		
		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
		completePattern.getGraph().addNode();
		ComplexNode complexNode2 = completePattern.getGraph().getNodes().get(1).makeComplex();
		completePattern.getGraph().addRelation(complexNode1, complexNode2);
		
		return completePattern;		
	}
	
	public static CompletePattern getBasePatternCondDateConcrete(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternCondDate(comp);

		NeoPropertyEdge relation = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam nppp = FACTORY.createNeoPropertyPathParam();
		nppp.setNeoPropertyName("isoStartDate");
		relation.setNeoPropertyPathParam(nppp);
		
		NeoNode node = (NeoNode) completePattern.getGraph().getNodes().get(0);
		TextListParam labels = new TextListParamImpl();
		EList<String> textLabels = new BasicEList<String>();
		textLabels.add("Regesta");
		labels.setValueIfValid(textLabels);
		node.setNeoNodeLabels(labels);
			
		return completePattern;		
	}
	
	public static CompletePattern getBasePatternCondDate(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		Node se = completePattern.getGraph().getNodes().get(1);
		DateParamImpl dp = new DateParamImpl();
		dp.setValue(comp);
		se.addPrimitiveComparison(dp);
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	
	public static CompletePattern getBasePatternCondConcrete(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternCond(comp);

		NeoPropertyEdge relation = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam nppp = FACTORY.createNeoPropertyPathParam();
		nppp.setNeoPropertyName("endDate");
		relation.setNeoPropertyPathParam(nppp);
		
		NeoNode node = (NeoNode) completePattern.getGraph().getNodes().get(0);
		TextListParam labels = new TextListParamImpl();
		EList<String> textLabels = new BasicEList<String>();
		textLabels.add("Regesta");
		labels.setValueIfValid(textLabels);
//		labels.setValueFromString("Regesta"); --> Darf ich diese Methode überschreiben?
		node.setNeoNodeLabels(labels);
			
		return completePattern;		
	}
	
	public static CompletePattern getBasePatternCond(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		Node se = completePattern.getGraph().getNodes().get(1);
		se.addPrimitiveComparison(comp);
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	public static CompletePattern getBasePatternMatchConcrete(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternMatch(comp);
		
		NeoPropertyEdge relation = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = FACTORY.createNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("endDate");
		relation.setNeoPropertyPathParam(neoPropertyPathParam);
		
		NeoNode node = (NeoNode) completePattern.getGraph().getNodes().get(0);
		TextListParam labels = new TextListParamImpl();
		EList<String> textLabels = new BasicEList<String>();
		textLabels.add("Regesta");
		labels.setValueIfValid(textLabels);
//		labels.setValueFromString("Regesta"); --> Darf ich diese Methode überschreiben?
		node.setNeoNodeLabels(labels);
		
		return completePattern;		
	}
	
	public static CompletePattern getBasePatternMatch(String regex) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		Node se = completePattern.getGraph().getNodes().get(1);
		se.addPrimitiveMatch(regex);
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	public static CompletePattern getBasePatternMatchNotConcrete(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternMatch(comp);
		
		((Match) completePattern.getGraph().getOperatorList().getOperators().get(0)).getOption().setValue(false);
		NeoPropertyEdge relation = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = FACTORY.createNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("endDate");
		relation.setNeoPropertyPathParam(neoPropertyPathParam);
		
		NeoNode node = (NeoNode) completePattern.getGraph().getNodes().get(0);
		TextListParam labels = new TextListParamImpl();
		EList<String> textLabels = new BasicEList<String>();
		textLabels.add("Regesta");
		labels.setValueIfValid(textLabels);
		node.setNeoNodeLabels(labels);
		
		return completePattern;		
	}
}




//Build something with the setting because here is some error
//private static void makeConcreteSimpleEdge(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
////	NeoEdge ne = (NeoEdge) completePattern.getGraph().getRelations().get(0);
////	NeoPathParam npp = CypherTest00.factory.createNeoPathParam();
////	npp.setNeoPath(CypherTest00.factory.createNeoSimpleEdge());
////	ne.setNeoPathParam(npp);
//}