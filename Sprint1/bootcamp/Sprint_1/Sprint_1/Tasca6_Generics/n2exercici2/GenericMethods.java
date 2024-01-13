package n2exercici2;

public class GenericMethods {
	
	public <T> void printGenericArguments(T ...arg1 ) {
		
		for(T palabras : arg1) {
			System.out.println(palabras);
		}
		
		
	}

}
