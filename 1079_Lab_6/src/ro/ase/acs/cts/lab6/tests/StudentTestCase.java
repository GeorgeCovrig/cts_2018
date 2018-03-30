package ro.ase.acs.cts.lab6.tests;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.acs.cts.lab6.Student;
import ro.ase.acs.cts.lab6.exceptions.BadIndexException;
import ro.ase.acs.cts.lab6.exceptions.StudentException;

public class StudentTestCase {
	
	Student student;

	@Before
	public void setUp() throws Exception {
		student = new Student(20, "John");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = StudentException.class)
	public void testSetGradesReferenceForNull() throws StudentException{
		int[] grades = null;
		
		student.setGrades(grades);
	}
	
	@Test
	public void testSetGradesReference() throws StudentException, BadIndexException{
		int[] grades = {9,9,10};
		student.setGrades(grades);
		
		int expectedFirstGrade = 
				student.getGrade(0);
		
		grades[0] = 4;
		
		int actualGrade = 
				student.getGrade(0);
		
		assertEquals(expectedFirstGrade,actualGrade);
	}
	
	@Test (expected = StudentException.class)
	public void testGetAverageExistenceNull() throws StudentException{
		//by default grades is null
		float average = student.getAverageGrade();
	}
	
	@Test
	public void testGetAverageCardinalityZero() throws StudentException{
		int[] grades = new int[0];
		student.setGrades(grades);
		
		float expectedAverage = 0.0f;
		float actualAverage = student.getAverageGrade();
		
		assertEquals(expectedAverage, 
				actualAverage, 0.0f);
	}
	
	@Test
	public void testGetAverageCardinalityOne() throws StudentException{
		int[] grades = {9};
		student.setGrades(grades);
		
		float expectedAverage = grades[0];
		float actualAverage = student.getAverageGrade();
		
		assertEquals(expectedAverage, 
				actualAverage, 0.0f);
	}
	
	@Test
	public void testGetAverageCardinalityMany() throws StudentException{
		int[] grades = {9,9,10};
		student.setGrades(grades);
		
		float expectedAverage = 9.33f;
		float actualAverage = student.getAverageGrade();
		
		assertEquals(expectedAverage, 
				actualAverage, 0.009f);
	}
	
	@Category(ImportantTestCategory.class)
	@Test
	public void testGetAverageTime() throws StudentException{
		int[] grades = new int[100000];
		Random rand = new Random();
		for(int i=0;i<100000;i++)
			grades[i] = rand.nextInt(10);
		student.setGrades(grades);
		
		long start = System.currentTimeMillis();
		student.getAverageGrade();
		long finish = System.currentTimeMillis();
		
		if((finish-start)<1000)
			assertTrue(true);
		else
			fail("It takes too long");
		
		
	}
	
	@Test(timeout = 1000)
	public void testGetAveragePerformance() throws StudentException{
		int[] grades = new int[100000];
		Random rand = new Random();
		for(int i=0;i<100000;i++)
			grades[i] = rand.nextInt(10);
		student.setGrades(grades);
			
		student.getAverageGrade();
	}
}
