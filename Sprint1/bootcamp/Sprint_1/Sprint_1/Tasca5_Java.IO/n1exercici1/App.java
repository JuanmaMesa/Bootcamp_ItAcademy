package n1exercici1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean istrue = false;
		
		while(!istrue) {

			System.out.println("Escribe un directorio de tu pc para saber lo que hay dentro");
			String path = input.nextLine();
			
		
			try {
				Directory myFile = new Directory(path);
				if(myFile.getDirectory().isDirectory()) {
				myFile.verificationDirectory(myFile.getDirectory());
				istrue = true;
				}else {
					System.out.println("Lo que me has proporcionado no es un directorio");
				}
				
			}catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
			}
			
			
		}
		input.close();
	}
		
		
		
		
	
}


