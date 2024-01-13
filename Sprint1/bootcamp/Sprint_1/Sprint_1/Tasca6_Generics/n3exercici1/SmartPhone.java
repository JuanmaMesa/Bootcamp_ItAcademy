package n3exercici1;

public class SmartPhone implements Phone {

	
	@Override
	public  void call() {
		System.out.println("Llamando desde mi SmartPhone");
		
	}
	
	public void takePhotos() {
		System.out.println("Haciendo fotos desde mi SmartPhone");
		
	}
	
}
