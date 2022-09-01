package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JFactoryImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;

//Integrate the tests for the NeoNode and NeoPropertyNode in this tests
//Test if it works if the targetNode before is from the NeoPathPart and then the NeoPropertyNode has to address this node
public class CypherTest01NeoPropertyEdge {
	public static final AdaptionNeo4JFactory factory = new AdaptionNeo4JFactoryImpl();
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		//Tests
		
		
		//Call tester from CypherTest00
		CypherTest00.test(completePatterns);
	}
	
	public static CompletePattern getBasePatternNeoPropertyEdge() {
		
		return null;
	}
	
	public static CompletePattern getNeoPropertyEdge() {
		
		return null;
	}
	
	public static CompletePattern getUnspecifiedEdge() {
		
		return null;
	}
	
	public static CompletePattern getSimpleEdge() {
		
		return null;
	}
	
	public static CompletePattern getSimpleEdgeWithLabels() {
		
		return null;
	}
	
	public static CompletePattern getSimpleEdgeWithLabelsRight() {
		
		return null;
	}
	
	public static CompletePattern getSimpleEdgeWithLabelsLeft() {
		
		return null;
	}
	
	public static CompletePattern getSimpleEdgeWithTargetNode() {
		
		return null;
	}
	
	public static CompletePattern getSimpleEdgeWithOptionalMatch() {
		
		return null;
	}
	
	public static CompletePattern getComplexEdge() {
		
		return null;
	}
	
	public static CompletePattern getComplexEdgeWithLabels() {
		
		return null;
	}
	
	public static CompletePattern getComplexEdgeWithLabelsDiffrentDirections() {
		
		return null;
	}
	
	public static CompletePattern getComplexEdgeWithLabelsDiffrentDirectionsAndTargetNodes() {
		
		return null;
	}
}