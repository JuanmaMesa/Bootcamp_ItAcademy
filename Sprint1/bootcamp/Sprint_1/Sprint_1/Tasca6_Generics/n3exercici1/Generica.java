package n3exercici1;

public class Generica {
	
	
	public <T extends Phone>  void phoneGenerics (T arg) {
		arg.call();

	
		/* Intentar llamar a takePhotos generara un error de complilacion porque no esta
		 definida en la implimentacion de la interfaz de Phone*/
		// arg.takePhotos();
		
	}
	
	public<T extends SmartPhone> void smartPhoneGenerics(T arg) {
		arg.call();
		arg.takePhotos();
		
	}

}
