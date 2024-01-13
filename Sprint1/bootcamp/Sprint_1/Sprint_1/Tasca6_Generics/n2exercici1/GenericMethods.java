package n2exercici1;

public class GenericMethods {
	
	public <T> void printGenericArguments(T arg1, T arg2, boolean arg3) {
		System.out.println("Argument 1:  "+ arg1);
		System.out.println("Argument 2:  "+ arg2);
		System.out.println("Argument 3:  "+ arg3);
		
	}

}
