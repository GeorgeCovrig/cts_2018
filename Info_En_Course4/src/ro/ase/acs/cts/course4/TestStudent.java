package ro.ase.acs.cts.course4;

import junit.framework.TestCase;

public class TestStudent extends TestCase {

	//fixture
	Student student;
	
	public TestStudent(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		
		student = new Student(14);
		
		//System.out.println("Executed before");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		//System.out.println("Executed after");
	}
	
	public void testSetAgeNormalValues(){
		
		
		int inputAge = 21;
		
		try {
			student.setAge(inputAge);
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		int actualValue = student.getAge();
		
		assertEquals("testing setAge for normal values ",
				inputAge, actualValue);
	}
	
	public void testSetAgeNotNormalValues(){
		
		int inputAge = -21;
		
		try {
			student.setAge(inputAge);
			fail();
		} catch (Exception e) {
			assertTrue(true);
		}

	}
	
public void testSetAgeBiggerValues(){
		
		int inputAge = 120;
		
		try {
			student.setAge(inputAge);
			fail();
		} catch (Exception e) {
			assertTrue(true);
		}

	}

public void testSetAgeMinimumAcceptedValues(){

	int inputAge = 8;
	
	try {
		student.setAge(inputAge);
		assertEquals(inputAge, student.getAge());
	} catch (Exception e) {
		fail();
	}

}

}
