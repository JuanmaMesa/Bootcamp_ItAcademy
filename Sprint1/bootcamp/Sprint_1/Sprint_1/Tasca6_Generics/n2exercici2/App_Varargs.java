package n2exercici2;
import n1exercici2.Persona;
public class App_Varargs {

	public static void main(String[] args) {
		GenericMethods prueba = new GenericMethods();
		
		System.out.println("--Comprobacion numero indefinido de parametros--\n");
		prueba.printGenericArguments("Marcos",32,"Barcelona");
		
		System.out.println("--- Segundo test ---");
		prueba.printGenericArguments(new Persona(),true,"Pilar",42,3.5);

	}

}
