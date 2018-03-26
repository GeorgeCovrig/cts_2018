package ro.ase.cts.acs.curs5.teste;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestSuita extends TestCase {
	public static Test suite(){
		TestSuite colectie = new TestSuite();
		
		colectie.addTestSuite(TestCaseStudent.class);
		colectie.addTest(
				new TestCaseLibrarieMatematica("testMinimCardinalitateUnu"));
		
		
		return colectie;
	}
}
