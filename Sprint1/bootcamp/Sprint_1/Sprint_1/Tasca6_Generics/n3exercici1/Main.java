package n3exercici1;

public class Main {

	public static void main(String[] args) {
		
		SmartPhone samsung = new SmartPhone();
		Generica classGenerica = new Generica();
		
		
		classGenerica.phoneGenerics(samsung);
		System.out.println();
		classGenerica.smartPhoneGenerics(samsung);
		
		

	}

}
