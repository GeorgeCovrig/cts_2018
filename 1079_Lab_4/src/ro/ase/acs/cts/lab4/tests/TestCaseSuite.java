package ro.ase.acs.cts.lab4.tests;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestCaseSuite extends TestCase {
	public static Test suite(){
		TestSuite collection = new TestSuite();
		
		//import all unit tests from TestCaseCourse
		collection.addTestSuite(TestCaseCourse.class);
		
		//import specific unit tests
		collection.addTest(new TestCaseStudent("testSetAgeLowerLimitValue"));
		collection.addTest(new TestCaseStudent("testSetAgeBadValues"));
		
		return collection;
	}
}
