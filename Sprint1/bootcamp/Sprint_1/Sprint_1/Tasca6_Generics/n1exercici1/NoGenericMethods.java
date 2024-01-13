package n1exercici1;

public class NoGenericMethods {
	
	private String name;
	private String surName;
	private String city;
	
	public NoGenericMethods(String name, String surName, String city) {
		
		this.name = name;
		this.surName = surName;
		this.city = city;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}
