package ro.ase.cts.acs.course5.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.acs.course5.MathLibrary;
import ro.ase.cts.acs.course5.exceptions.MyLibraryException;

public class TestCaseMathLibrary {

	@Test
	public void testMinDescendingOrdering() {
		int[] values = {10,9,8,7,6,5};
		int expectedMin = 5;
		
		try {
			
			int actualMin = 
					MathLibrary.min(values);
			assertEquals(expectedMin, actualMin);
			
		} catch (MyLibraryException e) {
			fail("Exception");
		}
	}
	
	@Test
	public void testMinAscendingOrdering() {
		int[] values = {5,6,7,8,9,10};
		int expectedMin = 5;
		
		try {
			
			int actualMin = 
					MathLibrary.min(values);
			assertEquals(expectedMin, actualMin);
			
		} catch (MyLibraryException e) {
			fail("Exception");
		}
	}

}
