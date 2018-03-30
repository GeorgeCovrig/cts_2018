package ro.ase.acs.cts.lab5;

import java.util.regex.Pattern;

import ro.ase.acs.cts.lab5.exceptions.ExamCourseNameException;
import ro.ase.acs.cts.lab5.exceptions.ExamGradesException;

public class Exam {
	/*
	 * Specifications
	 * 
	 * grades
	 * - allowed grades are 0,1,2, ... up to 10
	 * - 0 means the student is absent
	 * - maximum number of grades = 1000;
	 * - for 0 grades the average should be 0.0
	 * 
	 * name
	 * - between 3 and 100 chars
	 * - only letters and space
	 */
	
	
	String courseName;
	int[] grades;
	
	public static final int MIN_COURSE_NAME = 3;
	public static final int MAX_COURSE_NAME = 100;
	
	public static final int MIN_GRADES_NO = 0;
	public static final int MAX_GRADES_NO = 1000;
	
	public Exam(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) throws ExamCourseNameException{
		
		if(!Pattern.matches("^[a-zA-Z\\s]+", courseName))
			throw new ExamCourseNameException();
		
		if(courseName.length() < MIN_COURSE_NAME)
			throw new ExamCourseNameException();
		this.courseName = courseName;
	}

	public int getGrade(int index) throws ExamGradesException {
		if(this.grades!=null &&
				index >= 0 &&
				index <grades.length){
			return this.grades[index];
		}
		else
			throw new ExamGradesException();
	}

	public void setGrades(int[] grades) throws ExamGradesException{
		if(grades == null)
			throw new ExamGradesException();
		this.grades = grades.clone();
	}
	
	
	public float computeAverageGrade() throws ExamGradesException{
		
		if(this.grades==null)
			throw new ExamGradesException();
		
		if(this.grades.length > MAX_GRADES_NO)
			throw new ExamGradesException();
		
		if(this.grades.length == 0)
			return 0;
		
		int sum = 0;
		for(int i = 0;i<this.grades.length;i++)
			sum+=grades[i];
		return (float)sum/grades.length;
	}

}
