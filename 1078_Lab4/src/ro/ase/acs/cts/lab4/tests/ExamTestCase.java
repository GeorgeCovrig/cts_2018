package ro.ase.acs.cts.lab4.tests;

import junit.framework.TestCase;
import ro.ase.acs.cts.lab4.Exam;
import ro.ase.acs.cts.lab4.exceptions.ExamCourseNameException;
import ro.ase.acs.cts.lab4.exceptions.ExamGradesException;

public class ExamTestCase extends TestCase {
	
	//fixture
	Exam exam;
	public static final String INITIAL_NAME = "POO";

	public ExamTestCase(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		exam = new Exam(INITIAL_NAME);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		exam = null;
	}
	
	public void testSetNameConformanceRightValues(){
		String newCourseName = "CTS";
		
		try {
			exam.setCourseName(newCourseName);
		} catch (ExamCourseNameException e) {
			fail("An unxpected exception");
		}
		String actualName = exam.getCourseName();
		assertEquals(newCourseName, actualName);
	}
	
	public void testSetNameConformanceWrongValues(){
		String wrongCourseName = "X";
		try {
			exam.setCourseName(wrongCourseName);
			fail("Is not throwing an exception");
		} catch (ExamCourseNameException e) {
			assertTrue(true);
		}
		catch(Exception e){
			fail("It's a different exception");
		}
	}
	
	public void testSetNameConformanceAcceptedChars(){
		String wrongCourseName = "CTS234!";
		try {
			exam.setCourseName(wrongCourseName);
			fail("Is not throwing an exception");
		} catch (ExamCourseNameException e) {
			assertTrue(true);
		}
		catch(Exception e){
			fail("It's a different exception");
		}
	}
	
	public void testComputeAverageRightValues() throws ExamGradesException{
		int[] grades = {9,9,10};
		exam.setGrades(grades);
		
		float expectedAverage = 9.33f;
		
		float actualAverage = exam.computeAverageGrade();
		
		assertEquals(expectedAverage, actualAverage, 0.004f);
		
	}

}
