package javaoperatortests;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;

public class XQueryJavaTests {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<Boolean> results = new ArrayList<Boolean>();
		List<String> expectations = List.of(expectedReturn1, expectedReturn2, expectedReturn3, expectedReturn4,
				expectedReturn5, expectedReturn6, expectedReturn7, expectedReturn8, expectedReturn9, expectedReturn10);
		List<CompletePattern> patterns = OneArgTestPatterns.getXmlTestPatterns();
		
		int scope = 1;
		for (int i = 0; i<patterns.size() && i < expectations.size() && i < scope; i++) {
			System.out.println("Example " + (i+1) + ":");
			results.add(testTestPattern(patterns.get(i), expectations.get(i)));
		}
			
//		System.out.println(results);
//		System.out.print("total: " + (!results.contains(false)));
	}

	static Boolean testTestPattern(CompletePattern testpattern, String expected) throws InvalidityException {
//		System.out.println("\n\nquery:\n\n" + testpattern.generateXQuery());
//		testpattern.generateXQuery();
		String result = testpattern.generateXQueryJava();
		System.out.println("\n\nresult:\n\n" + result);
		System.out.println("\n\nexpected:\n\n" + expected);
		return Objects.equals(expected, result);
	}
	
	static String expectedStart = "\"return concat(\r\n"
			+ "\"<interim>\",\r\n"
			+ "  <return>\",\r\n";
	static String expectedMid =
			 "  \"</return>,\r\n"
			+ "  <condition>\",\r\n";
	static String expectedEnd =
			"  \"</condition>,\r\n"
			+ "  \"</interim>\")\"";	
	
	static String expectedReturn1 = 
			"for $var2_0 in /descendant::*[name()]\r\n"
			+ "return \r\n"
			+ "  concat(\r\n"
			+ "  \"<interim>\",\r\n"
			+ "  \"<return>\",\r\n"
			+ "  $var2_0,\r\n"
			+ "  \"</return>\",\r\n"
			+ "  \"<condition>\",\r\n"
			+ "  \"<quantified>\",\r\n"
			+ "  (\r\n"
			+ "  for $var3_0 in $var2_0/text()\r\n"
			+ "  return $var3_0\r\n"
			+ "  ),\r\n"
			+ "  \"</quantified>\",\r\n"
			+ "  \"</condition>\",\r\n"
			+ "  \"</interim>\")";
	
	static String expectedReturn2 = 
			"for $var2_0 in /descendant::*[name()]\r\n"
			+ "return \r\n"
			+ "  concat(\r\n"
			+ "  \"<interim>\",\r\n"
			+ "  \"<return>\",\r\n"
			+ "  $var2_0,\r\n"
			+ "  \"</return>\",\r\n"
			+ "  \"<condition>\",\r\n"
			+ "  \"<quantified>\",\r\n"
			+ "  ("
			+ "  for $var3_0 in $var2_0/text()[matches(., \".*a.*\")]\r\n"
			+ "  return $var3_0),\r\n"
			+ "  \"</quantified>\",\r\n"
			+ "  \"</condition>\",\r\n"
			+ "  \"</interim>\")";
	static String expectedReturn3 = 
			"for $var3_0 in /descendant::*[name()]\r\n"
			+ "return \r\n"
			+ "  concat(\r\n"
			+ "  \"<interim>\",\r\n"
			+ "  \"<return>\",\r\n"
			+ "  $var2_0,\r\n"
			+ "  \"</return>\",\r\n"
			+ "  \"<condition>\",\r\n"
			+ "  \"<quantified>\",\r\n"
			+ "  (\r\n"
			+ "  for $var4_0 in $var3_0/text()\r\n"
			+ "  return $var4_0\r\n"
			+ "  ),\r\n"
			+ "  \"</quantified>\",\r\n"
			+ "  \"<quantified>\",\r\n"
			+ "  (\r\n"
			+ "  for $var5_0 in $var3_0/text()\r\n"
			+ "  return $var5_0\r\n"
			+ "  ),\r\n"
			+ "  \"</quantified>\",\r\n"
			+ "  \"</condition>\",\r\n"
			+ "  \"</interim>\")";
	static String expectedReturn4 = 
			"for $var3_0 in /descendant::*[name()]\r\n"
			+ "where ((\r\n"
			+ "  some $var4_0 in $var3_0/text()[matches(., \"\"something\"\")]\r\n"
			+ "  satisfies (true()))\r\n"
			+ "return $var3_0\r\n"
			+ "  concat(\r\n"
			+ "  \"<interim>\",\r\n"
			+ "  \"<return>\",\r\n"
			+ "  $var3_0,\r\n"
			+ "  \"</return>\",\r\n"
			+ "  \"<condition>\",\r\n"
			+ "  \"<quantified>\",\r\n"
			+ "  (\r\n"
			+ "  for $var5_0 in $var3_0/text()\r\n"
			+ "  return $var5_0\r\n"
			+ "  ),\r\n"
			+ "  \"</quantified>\",\r\n"
			+ "  \"</condition>\",\r\n"
			+ "  \"</interim>\")";
	static String expectedReturn5 = 
			"for $var3_0 in /descendant::*[name()]\r\n"
			+ "where ((\r\n"
			+ "  some $var4_0 in $var3_0/text()[matches(., \"\"something\"\")]\r\n"
			+ "  satisfies (true()))\r\n" 
			+ "return $var3_0\r\n"
			+ "  concat(\r\n"
			+ "  \"<interim>\",\r\n"
			+ "  \"<return>\",\r\n"
			+ "  $var3_0,\r\n"
			+ "  \"</return>\",\r\n"
			+ "  \"<condition>\",\r\n"
			+ "  \"<quantified>\",\r\n"
			+ "  (\r\n"
			+ "  for $var5_0 in $var3_0/text()\r\n"
			+ "  return $var5_0\r\n"
			+ "  ),\r\n"
			+ "  \"</quantified>\",\r\n"
			+ "  \"</condition>\",\r\n"
			+ "  \"</interim>\")";
	static String expectedReturn6 = 
			"for $var3_0 in /descendant::*[name()]\r\n"
			+ "return\r\n"
			+ "  concat(\r\n"
			+ "  \"<interim>\",\r\n"
			+ "  \"<return>\",\r\n"
			+ "  $var3_0,\r\n"
			+ "  \"</return>\",\r\n"
			+ "  \"<condition>\",\r\n"
			+ "  \"<boolean>\",\r\n"
			+ "  (some $var4_0 in $var3_0/text()[matches(., \"something\")]\r\n"
			+ "  satisfies (true())),\r\n"
			+ "  \"</boolean>\",\r\n"
			+ "  \"<quantified>\",\r\n"
			+ "  (for $var5_0 in $var3_0/text()\r\n"
			+ "  return $var5_0),\r\n"
			+ "  \"</quantified>\",\r\n"
			+ "  \"</condition>\",\r\n"
			+ "  \"</interim>\")";
	static String expectedReturn7 = 
			"for $var3_0 in /descendant::*[name()]\r\n" 
			+ "return \r\n"
			+ "  concat(\r\n"
			+ "  \"<interim>\",\r\n"
			+ "  \"<return>\",\r\n"
			+ "  $var3_0,\r\n"
			+ "  \"</return>\",\r\n"
			+ "  \"<condition>\",\r\n"
			+ "  \"<quantified>\",\r\n"
			+ "  (for $var4_0 in $var3_0/child::*\r\n"
			+ "  return \r\n"
			+ "  concat(\r\n"
			+ "  \"<quantified>\",\r\n"
			+ "  (for $var5_0 in $var4_0/text()\r\n"
			+ "  return $var5_0)\r\n"
			+ "  \"</quantified>\")\r\n"
			+ "  )\r\n"
			+ "  \"</quantified>\",\r\n"
			+ "  \"</condition>\",\r\n"
			+ "  \"</interim>\")";
	static String expectedReturn8 = 
			"for $var4_0 in /descendant::*[name()]\r\n"
			+ "return \r\n"
			+ "  concat(\r\n"
			+ "  \"<interim>\",\r\n"
			+ "  \"<return>\",\r\n"
			+ "  $var4_0,\r\n"
			+ "  \"</return>\",\r\n"
			+ "  \"<condition>\",\r\n"
			+ "  \"<quantified>\",\r\n"
			+ "  (for $var5_0 in $var4_0/child::*\r\n"
			+ "  return \r\n"
			+ "  concat(\r\n"
			+ "  \"<quantified>\",\r\n"
			+ "  (for $var6_0 in $var5_0/text()\r\n"
			+ "  return \r\n"
			+ "  concat(\r\n"
			+ "  \"<quantified>\",\r\n"
			+ "  (for $var7_0 in $var6_0/text()\r\n"
			+ "  return $var7_0),\r\n"
			+ "  \"</quantified>\")\r\n"
			+ "  ),\r\n"
			+ "  \"</quantified>\")\r\n"
			+ "  ),\r\n"
			+ "  \"</quantified>\",\r\n"
			+ "  \"</condition>\",\r\n"
			+ "  \"</interim>\")";
	static String expectedReturn9 = 
			"for $var3_0 in /descendant::*[name()]\r\n"
			+ "where ((\r\n"
			+ "  some $var4_0 in $var3_0/text()[matches(., \"\"\"\"something\"\"\"\")]\r\n"
			+ "  satisfies (true()))\r\n" 
			+ "return $var3_0\r\n"
			+ "  concat(\r\n"
			+ "  \"\"<interim>\"\",\r\n"
			+ "  \"<return>\",\r\n"
			+ "  $var3_0,\r\n"
			+ "  \"</return>\",\r\n"
			+ "  \"<condition>\",\r\n"
			+ "  \"\"<quantified>\"\",\r\n"
			+ "  (for $var5_0 in $var3_0/text()\r\n"
			+ "  return $var5_0),\r\n"
			+ "  \"\"</quantified>\"\",\r\n"
			+ "  \"</condition>\",\r\n"
			+ "  \"\"</interim>\"\")\"";
	static String expectedReturn10 = 
			"for $var3_0 in /descendant::*[name()]\r\n"
			+ "return \r\n"
			+ "  concat(\r\n"
			+ "  \"<interim>\",\r\n"
			+ "  \"<return>\",\r\n"
			+ "  $var3_0,\r\n"
			+ "  \"</return>\",\r\n"
			+ "  \"<condition>\",\r\n"
			+ "  \"<quantified>\",\r\n"
			+ "  (for $var4_0 in $var3_0/text()\r\n"
			+ "  return $var4_0),\r\n"
			+ "  \"</quantified>\",\r\n"
			+ "  \"<quantified>\",\r\n"
			+ "  (for $var5_0 in $var3_0/text()\r\n"
			+ "  return $var5_0),\r\n"
			+ "  \"</quantified>\",\r\n"
			+ "  \"</condition>\",\r\n"
			+ "  \"</interim>\")";
}
