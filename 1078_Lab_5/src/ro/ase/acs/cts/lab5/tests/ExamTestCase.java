package ro.ase.acs.cts.lab5.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.acs.cts.lab5.Exam;
import ro.ase.acs.cts.lab5.exceptions.ExamGradesException;

public class ExamTestCase {
	
	Exam exam;
	
	public static final String INITIAL_NAME = "CTS";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("TesCase started !");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("TesCase finished !");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Unit test started !");
		exam = new Exam(INITIAL_NAME);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Unit test finished !");
		exam = null;
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testExamConstructorConformance(){
		
		String newExamName = "OOP";
		
		exam = null;
		exam = new Exam(newExamName);
		
		assertNotNull("Object not created by the constructor", exam);
		assertEquals("The exame name is not correct", 
				newExamName, exam.getCourseName());
	}
	
	@Test
	public void testExamAverageOrderingAscending() throws ExamGradesException{
		int[] grades = {8,9,10};
		exam.setGrades(grades);
		
		float actualValue = exam.computeAverageGrade();
		float expectedValue = 9.0f;
		
		assertEquals(expectedValue, actualValue, 0.0f);
		
	}
	
	@Test
	public void testExamAverageOrderingDescending() throws ExamGradesException{
		int[] grades = {9,8,7,6};
		exam.setGrades(grades);
		
		float actualValue = exam.computeAverageGrade();
		float expectedValue = 7.5f;
		
		assertEquals(expectedValue, actualValue, 0.0f);
		
	}
	
	@Test(expected = ExamGradesException.class)
	public void testExamAverageRangeNullValue() throws ExamGradesException{
		
		exam = new Exam(INITIAL_NAME);
		float actualValue = exam.computeAverageGrade();
	}
	
	@Test
	public void testExamAverageBoundaryLowerLimit() throws ExamGradesException{
		int[] grades = new int[Exam.MIN_GRADES_NO];
		exam.setGrades(grades);
		
		float actualValue = exam.computeAverageGrade();
		float expectedValue = 0.0f;
		
		assertEquals(expectedValue, actualValue, 0.0f);
	}
	
	@Test
	public void testExamAverageBoundaryUpperLimit() throws ExamGradesException{
		int[] grades = new int[Exam.MAX_GRADES_NO];
		int gradeValue = 9;
		for(int i=0;i<Exam.MAX_GRADES_NO;i++)
			grades[i] = gradeValue;
		
		exam.setGrades(grades);
		
		float actualValue = exam.computeAverageGrade();
		float expectedValue = 9.0f;
		
		assertEquals(expectedValue, actualValue, 0.0f);
	}
	
	@Test(expected = ExamGradesException.class)
	public void testExamAverageRangeBeyondUpperLimit() throws ExamGradesException{
		int[] grades = new int[Exam.MAX_GRADES_NO+1];	
		exam.setGrades(grades);
		
		float actualValue = exam.computeAverageGrade();
	}
	
	@Test(expected = ExamGradesException.class)
	public void testExamSetGradesNullReference() throws ExamGradesException{
		int[] grades = null;
		exam.setGrades(grades);
	}
	
	@Test
	public void testExamSetGradesExternalReference() throws ExamGradesException{
		int[] grades = {9,9,10};
		exam.setGrades(grades);
		
		int initialGrade = grades[0];
		int newGrade = 5;
		grades[0] = newGrade;
		
		int actualGrade = exam.getGrade(0);
		
		assertEquals(initialGrade, actualGrade);
		
	}

}
