package ro.ase.acs.cts.laborator4;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestToate extends TestCase {
	
	//suita teste din mai multe TestCase-uri
	public static Test suite(){
		
		TestSuite testSuite = new TestSuite();
		
		//adaugare teste dintr-un TestCase
		testSuite.addTestSuite(TestLibrarieMatematica.class);
		
		//adaugare anumite teste dintr-un TestCase
		//...este nevoie de constructor in clasele TestCase
		
		return testSuite;
	}
}
