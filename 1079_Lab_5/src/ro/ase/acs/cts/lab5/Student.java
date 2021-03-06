package ro.ase.acs.cts.lab5;

import ro.ase.acs.cts.lab5.exceptions.BadIndexException;
import ro.ase.acs.cts.lab5.exceptions.StudentException;

public class Student {
	int age;
	String name;
	int[] grades;
	
	public static String[] forbbidenChars = 
		{"1","2","3","@","$","!"};
	public static int MAX_NAME = 255;
	public static int MIN_NAME = 2;
	
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws StudentException{
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws StudentException{
		
		for(String symbol : forbbidenChars){
			if(name.contains(symbol))
				throw new StudentException();
		}
		
		if(name.length() > Student.MAX_NAME)
			throw new StudentException();
		
		if(name.length() < Student.MIN_NAME)
			throw new StudentException();
		
		this.name = name;
	}

	public int getGrade(int index) throws BadIndexException {
		if(this.grades!=null && 
				index >=0 && 
				index < this.grades.length)
			return this.grades[index];
		else
			throw new BadIndexException();
	}

	public void setGrades(int[] grades) throws StudentException{
		this.grades = grades;
	}
	
	
	
}
