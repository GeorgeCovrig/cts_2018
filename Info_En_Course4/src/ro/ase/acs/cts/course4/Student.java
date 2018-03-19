package ro.ase.acs.cts.course4;

public class Student {
	private int age;

	public Student(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if(age >= 8 && age <= 100)
			this.age = age;
		else
			throw new Exception("Too small");
	}
	
	
	
}
