package n3exercici1;

import java.util.Objects;

public class Student {
	
	private String name, course;
	private int age;
	private float grade;
	
	public Student(String name, int age, String course, float grade) {
		
		this.name = name;
		this.age = age;
		this.course = course;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
	

	@Override
	public String toString() {
		return "Student: "+ name + 
				", age: "+ age+
				", course: " + course +
				", grade: " + grade ;
	}
	
	
	
	

}
