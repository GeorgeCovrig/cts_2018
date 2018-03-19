package ro.ase.acs.cts.lab4.tests;

import junit.framework.TestCase;
import ro.ase.acs.cts.lab4.BadAgeException;
import ro.ase.acs.cts.lab4.Student;

public class TestCaseStudent extends TestCase {

	//TestCase fixture
	Student student;
	public static final int INITIAL_AGE =21;
	public static final String INITIAL_NAME = "Gigel";
	
	public TestCaseStudent(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		//shadowing
		//Student 
		student = new Student(INITIAL_AGE, INITIAL_NAME);
		System.out.println("Student created !");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		
		student = null;
		System.out.println("Student destroyed !");
	}
	
	public void testSetAgeNormalValues() throws BadAgeException{
		//prepare the test
		int newAge = 19;
		
		//test the function
		student.setAge(newAge);
		
		//asses the result
		int actualAge = student.getAge();
		
		assertEquals(newAge, actualAge);
	}
	
	public void testSetAgeLowerLimitValue(){
		//prepare the test
		int newAge = Student.LOWER_AGE_LIMIT;
		
		//test the function
		try{
			student.setAge(newAge);
			
			assertEquals("Testing for boundary limits",
					Student.LOWER_AGE_LIMIT, student.getAge());
		}
		catch(Exception ex){
			fail("setAge is throwing an exception for minimum accepted value");
		}
	}
	
	public void testSetAgeBadValues(){
		//prepare the test
		int newAge = -19;
		
		//test the function
		try{
			student.setAge(newAge);
			fail("setAge does not throw an exception");
		}
		catch(BadAgeException ex){
			assertTrue(true);
		}
		catch(Exception ex){
			fail("setAge is throwing a different exception");
		}
	}

}
