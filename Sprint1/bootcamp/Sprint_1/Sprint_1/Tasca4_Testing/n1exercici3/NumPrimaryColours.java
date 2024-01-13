package n1exercici3;

public class NumPrimaryColours {

	public String[]  primaryColours(int size) throws ArrayIndexOutOfBoundsException {
		
		if (size !=3) {
			throw new ArrayIndexOutOfBoundsException("Tamaño del array incorrecto");
		}
		String colors[]= {"Red","Blue","Yellow"}; 
		return colors;
		
		
		
		
	}

	public static void main(String[]args) {
		
	try{
		NumPrimaryColours colors = new NumPrimaryColours();
		colors.primaryColours(3);
		System.out.println("Tu tamaño del array es correcto");
	
	}catch( ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsException: "+e.getMessage());
	}
		
	NumPrimaryColours colors1 = new NumPrimaryColours();
	String lista [] = new String[3];
	
	System.out.println("Creado");
	
	for(String m : colors1.primaryColours(3)) {
		System.out.println(m);
	}
	
	
	}
}
