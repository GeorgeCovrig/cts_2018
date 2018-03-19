package ro.ase.acs.cts.lab4;

public class Course {
	int[] grades;

	public Course(int[] grades) {
		this.grades = new int[grades.length];
		for(int i = 0;i<grades.length;i++)
			this.grades[i] = grades[i];
	}
	
	public float getCourseAverage(){
		int average = 0;
		for(int i=0;i<this.grades.length;i++)
			average += this.grades[i];
		return (float)average/this.grades.length;
	}
	
	
}
