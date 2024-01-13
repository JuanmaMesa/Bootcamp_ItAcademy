package n2exercici1;

public class Phone {
	
	private String make;
	private String model;
	
	
	public Phone(String make, String model) {
		
		this.make = make;
		this.model = model;
	}
	

	public String getMake() {
		return make;
	}

	public void setMake(String marca) {
		this.make = marca;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String modelo) {
		this.model = modelo;
	}


	public String call(String message) {
		
		return " Llamando al numero "+message;
			
	}

}
