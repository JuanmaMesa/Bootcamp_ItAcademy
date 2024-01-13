package n2exercici1;

public class SmartPhone extends Phone implements Watch, Camera {

	private String operatinSystem;
	
	public SmartPhone(String make, String model,String operatingSystem ) {
		
		super(make,model);
		this.operatinSystem = operatingSystem;
		
	}
	
	public String getOperatinSystem() {
		return operatinSystem;
	}

	public void setOperatinSystem(String operatinSystem) {
		this.operatinSystem = operatinSystem;
	}
	
	
	public void takePhoto() {
		System.out.println("Se esta haciendo una foto.");
		
	}
	
	public void alarm() {
		System.out.println("La alarma esta sonando.");
		
	}

	@Override
	public String toString() {
		return "SmartPhone: [ Sistema Operativo: " + operatinSystem + ", Marca: "+super.getMake()+
				", Modelo: "+ super.getModel()+" ]";
	}
	
	
	


}
