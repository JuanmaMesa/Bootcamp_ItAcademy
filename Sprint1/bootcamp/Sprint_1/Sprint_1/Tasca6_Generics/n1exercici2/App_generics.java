package n1exercici2;

public class App_generics {

	public static void main(String[] args) {
	
		GenericMethods generics = new GenericMethods();
	
		float floatnumber =3.14f;
	
		generics.printGenericArguments(floatnumber,27,new Persona().getClass() );
		
		System.out.println("---Segunda prueba---");
		
		generics.printGenericArguments(true, new Persona().getClass(),floatnumber);
		
		
		
		
		
	}

}
