package n1exercici5;

import java.io.Serializable;

public class ObjectTest implements Serializable {
	
	private String name;
	private int age;
	
	public ObjectTest(String name, int age) {
		
		this.name = name;
		this.age = age;
		
		
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
	
	
	public void birthDay() {
		
		age += 1;
		
	}
	
	@Override
	public String toString() {
		return "Name: "+ name +", Age: "+age;
		
	}
	
	
	
	

}
