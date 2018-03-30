package ro.ase.cts.acs.course6.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.acs.course6.MathLibrary;
import ro.ase.cts.acs.course6.Student;
import ro.ase.cts.acs.course6.exceptions.MyLibraryException;

@Category(CategorieTesteObligatorii.class)
public class TestCaseMathLibrary {
	
	int[] values;
	
	@Before
	public void setUp(){
		int NO_VALUES = 100000;
		values = new int[NO_VALUES];
		
		Random random = new Random();
		for(int i=0;i<NO_VALUES;i++)
			values[i] = random.nextInt(1000);
	}

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
	
	@Test(expected = MyLibraryException.class)
	public void testMinCardinalityZero() throws MyLibraryException {
		int[] values = new int[0];
		
		MathLibrary.min(values);
	
	}
	
	@Test
	public void testMinCardinalityOne() throws MyLibraryException {
		int[] values = {6};
		
		int expectedValue = values[0];
		int actualValue = MathLibrary.min(values);
		
		assertEquals(expectedValue, actualValue);
	
	}
	
	@Ignore
	@Test
	public void testSortPerformance() throws MyLibraryException{
		int NO_VALUES = 100000;
		int[] values = new int[NO_VALUES];
		
		Random random = new Random();
		for(int i=0;i<NO_VALUES;i++)
			values[i] = random.nextInt(1000);
		
		long start = System.currentTimeMillis();
		MathLibrary.sort(values);
		long finish = System.currentTimeMillis();
		
		if((finish-start)>1000)
			fail("It's taking too long");
		else
			assertTrue(true);

	}
	
	@Ignore
	@Test(timeout = 30000)
	public void testSortTime() throws MyLibraryException{

		MathLibrary.sort(values);

	}
	
	public int[] mySuperSort(int[] values){
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int value : values)
			list.add(value);
		
		Collections.sort(list);
		
		int[] result = new int[list.size()];
		for(int i=0; i< list.size(); i++)
			result[i] = list.get(i);
		
		return result;
	}
	
	@Test
	public void testSortCrossCheck() throws MyLibraryException{
		int[] values = {9,2,7,-4};
		
		int[] actualResult = 
				MathLibrary.sort(values);
		int[] expectedResult = 
				mySuperSort(values);
		
		assertArrayEquals(expectedResult, actualResult);
		
	}


}
