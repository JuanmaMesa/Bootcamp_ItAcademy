package n2exercici1;

public class AppSmartPhone {

	public static void main(String[] args) {
	
		SmartPhone mySmartPhone = new SmartPhone("Xiami", "Oppo due", "Android");
		
		System.out.println("SmartPhone creado: " + mySmartPhone.toString());
		System.out.println("El SmartPhone "+ mySmartPhone.getModel()+" : "+ mySmartPhone.call("744402589"));
		System.out.println("----");
		mySmartPhone.alarm();
		mySmartPhone.takePhoto();

	}

}
