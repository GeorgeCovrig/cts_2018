package ro.ase.cts.acs.course6.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.acs.course6.Student;
import ro.ase.cts.acs.course6.exceptions.StudentAgeException;

public class TestCaseStudent {
	
	Student student;
	public static int INITIAL_AGE = 20;
	public static String INITIAL_NAME = "John";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Tests start !");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("The end !");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Unit test starts");
		
		student = new Student(INITIAL_AGE,
				INITIAL_NAME);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Unit test ends");
		
		student = null;
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Category(CategorieTesteImportante.class)
	@Test
	public void testSetAgeConformanceNormalValues(){
		int newAge = 25;
		
		try {
			
			student.setAge(newAge);
			int actualAge = student.getAge();
			assertEquals(newAge,actualAge);
			
		} catch (StudentAgeException e) {
			fail("Exception not expected");
		}
	}
	
	@Test(expected = StudentAgeException.class)
	public void testSetAgeConformanceWrongValues() throws StudentAgeException{
		int newAge = 95;
		student.setAge(newAge);
		
	}
	
	@Test
	public void testSetAgeLowBoundaryValue(){
		int newAge = Student.MINIMUM_AGE;
		
		try {
			
			student.setAge(newAge);
			int actualAge = student.getAge();
			assertEquals(newAge,actualAge);
			
		} catch (StudentAgeException e) {
			fail("Exception not expected");
		}
	}

	@Test
	public void testSetAgeUpperBoundaryValue(){
		int newAge = Student.MAXIMUM_AGE;
		
		try {
			
			student.setAge(newAge);
			int actualAge = student.getAge();
			assertEquals(newAge,actualAge);
			
		} catch (StudentAgeException e) {
			fail("Exception not expected");
		}
	}
	
	@Test(expected = StudentAgeException.class)
	public void testSetAgeLeftRange() throws StudentAgeException{
		int newAge = -95;
		student.setAge(newAge);
		
	}
	
	@Test(expected = StudentAgeException.class)
	public void testSetAgeNullReference() throws StudentAgeException{
		Integer newAge = null;
		student.setAge(newAge);
		
	}
	
	@Category(CategorieTesteImportante.class)
	@Test
	public void testSetGradesReference(){
		int[] grades = {9,9,10};
		

		student.setGrades(grades);
		
		int expectedGrade = 
				student.getGrade(0);
		
		grades[0] = 10;
		//assert the 1st grade in the Student
		
		int actualGrade = 
				student.getGrade(0);
		
		assertEquals(expectedGrade, actualGrade);

	}
}
