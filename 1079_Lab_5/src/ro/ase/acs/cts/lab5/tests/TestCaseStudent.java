package ro.ase.acs.cts.lab5.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.acs.cts.lab5.Student;
import ro.ase.acs.cts.lab5.exceptions.StudentException;

public class TestCaseStudent {
	
	//test case fixture
	Student student;
	public static final int INITIAL_AGE = 20;
	public static final String INITIAL_NAME = "John";
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Let's start");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("The end !");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("A test begins");
		
		student = new Student(INITIAL_AGE,
				INITIAL_NAME);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("A test ended");
		
		student = null;
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetNameConformanceNormalValues(){
		String newName = "Alice";
		
		try {
			student.setName(newName);
			assertEquals(newName, student.getName());
			
		} catch (StudentException e) {
			fail("The input was correct");
		}	
	}
	
	@Test (expected = StudentException.class)
	public void testSetNameConformanceBadValues() throws StudentException{
		String newNameWithWrongValues = "test@1";
		
		student.setName(newNameWithWrongValues);
	}
	
	@Test(expected = StudentException.class)
	public void testSetNameRangeAboveLimit() throws StudentException{
		String newName = "";
		for(int i = 0;i<Student.MAX_NAME+1;i++)
			newName+="x";
		
		student.setName(newName);
	}
	
	@Test(expected = StudentException.class)
	public void testSetNameRangeUnderLimit() throws StudentException{
		String newName = "";
		for(int i = 0;i<Student.MIN_NAME-1;i++)
			newName+="x";
		
		student.setName(newName);
	}
	
	@Test
	public void testSetNameLowerLimit() throws StudentException{
		String newName = "";
		for(int i = 0;i<Student.MIN_NAME;i++)
			newName+="x";
		
		student.setName(newName);
		
		assertEquals(newName, student.getName());
	}

}
