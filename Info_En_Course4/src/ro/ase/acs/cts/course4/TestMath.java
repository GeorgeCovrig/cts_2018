package ro.ase.acs.cts.course4;

import junit.framework.TestCase;

public class TestMath extends TestCase {

	public TestMath(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSumNormalValues(){
		
		int valueA = 2;
		int valueB = 3;
		int result = MathLibrary.sum(valueA, valueB);
		
		int expectedResult = 5;
		
		assertEquals(expectedResult, result);
	}

}
