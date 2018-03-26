package ro.ase.acs.cts.lab4.tests;

import junit.framework.TestCase;
import ro.ase.acs.cts.lab4.Dummy;

public class DummyTestCase extends TestCase {

	public DummyTestCase(String name) {
		super(name);
	}
	
	public void testSumNormalValues(){
		int initialValueA = 5;
		int initialValueB = 6;
		int expectedResult = 11;
		
		int actualResult = Dummy.sum(initialValueA, initialValueB);
		
		assertEquals(expectedResult, actualResult);
	}

}
