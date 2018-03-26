package ro.ase.acs.cts.lab4.tests;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestSuiteCollection extends TestCase {
	
	public static Test suite(){
		
		TestSuite collection = new TestSuite();
		
		//import all unit tests from a test case
		collection.addTestSuite(DummyTestCase.class);
		//import some unit tests from a test case
		collection.addTest(new ExamTestCase("testSetNameConformanceRightValues"));
		collection.addTest(new ExamTestCase("testSetNameConformanceAcceptedChars"));
		
		return collection;
		
	}
}
