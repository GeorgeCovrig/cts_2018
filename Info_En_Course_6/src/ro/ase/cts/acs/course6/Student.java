package ro.ase.cts.acs.course6;

import ro.ase.cts.acs.course6.exceptions.StudentAgeException;
import ro.ase.cts.acs.course6.exceptions.StudentException;

public class Student {
	
	public static final int MINIMUM_AGE = 5;
	public static final int MAXIMUM_AGE = 90;
	
	int age;
	String name;
	int[] grades;
	
	

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws StudentException {
		
	}

	public void setAge(Integer value) throws StudentAgeException{
		if(value == null)
			throw new StudentAgeException();
		if(value > MAXIMUM_AGE 
				|| value <MINIMUM_AGE )
			throw new StudentAgeException();
		this.age = value;
	}

	public int getAge() {
		return age;
	}

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getGrade(int index){
		return this.grades[index];
	}
	
}
