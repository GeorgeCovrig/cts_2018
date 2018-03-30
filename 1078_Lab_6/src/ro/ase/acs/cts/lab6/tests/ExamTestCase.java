package ro.ase.acs.cts.lab6.tests;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.acs.cts.lab6.Exam;
import ro.ase.acs.cts.lab6.exceptions.ExamGradesException;

public class ExamTestCase {
	
	Exam exam;
	int[] grades;

	@Before
	public void setUpBeforeClass(){
		grades = new int[1000000];
		Random random = new Random();
		for(int i=0;i<1000000;i++){
			grades[i] = random.nextInt(11);
		}
	}
	
	@Before
	public void setUp() throws Exception {
		exam = new Exam("Test");
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testExamConstructorExistence(){
		Exam exam = new Exam("CTS Exam");
		assertNotNull(exam);
	}
	
	@Category(ImportantTests.class)
	@Test(expected = ExamGradesException.class)
	public void testComputeAverageCardinalityZero() throws ExamGradesException{
		int[] values = new int[0];
		exam.setGrades(values);
		
		exam.computeAverageGrade();
	}
	
	@Test
	public void testComputeAverageCardinalityOne() throws ExamGradesException{
		int[] values = {9};
		exam.setGrades(values);
		
		float expectedAverage = values[0];
		float actualAverage = exam.computeAverageGrade();
		
		assertEquals(expectedAverage, actualAverage, 0.0f);
	}
	
	@Test
	public void testComputeAverageCardinalityMany() throws ExamGradesException{
		int[] values = {9,9,10};
		exam.setGrades(values);
		
		float expectedAverage = 9.33f;
		float actualAverage = exam.computeAverageGrade();
		
		assertEquals(expectedAverage, actualAverage, 0.009f);
	}
	
	@Category(ImportantTests.class)
	@Test(timeout = 10)
	public void testComputeAveragePerformance() throws ExamGradesException{
		
		exam.setGrades(grades);
		exam.computeAverageGrade();
		
	}
	

}
