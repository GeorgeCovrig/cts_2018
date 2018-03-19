package ro.ase.acs.cts.lab4.tests;

import junit.framework.TestCase;
import ro.ase.acs.cts.lab4.Course;

public class TestCaseCourse extends TestCase {

	//fixture
	Course course;
	
	public TestCaseCourse(String name) {
		super(name);
		
	}

	protected void setUp() throws Exception {
		super.setUp();
		
		int[] grades = {1,1,0};
		course = new Course(grades);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testCourseAverageInitialValues(){
		float exceptedAverage = 2.0f/3;
		
		float actualAverage = course.getCourseAverage();
		
		assertEquals(exceptedAverage, actualAverage,0);
	}

}
