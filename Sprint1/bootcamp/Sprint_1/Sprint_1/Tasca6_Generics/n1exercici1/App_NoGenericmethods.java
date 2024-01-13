package n1exercici1;

public class App_NoGenericmethods {

	public static void main(String[] args) {
	
		NoGenericMethods obj1 = new NoGenericMethods("Juanma", "Sanchez", "Barcelona");
		NoGenericMethods obj2 = new NoGenericMethods("Barcelona", "Juanma", "Sanchez");
		NoGenericMethods obj3 = new NoGenericMethods("Sanchez", "Barcelona", "Juanma");
		
		// podemos ponerlos en cual orden pero...
		
		System.out.println(obj1.getCity());
		System.out.println(obj2.getCity());

	}

}
