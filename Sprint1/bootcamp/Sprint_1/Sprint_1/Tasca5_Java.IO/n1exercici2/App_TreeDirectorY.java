package n1exercici2;

import java.util.Scanner;

import n1exercici1.Directory;

public class App_TreeDirectorY {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean istrue = false;
		
		while(!istrue) {

			System.out.println("Escribe un directorio de tu pc para saber lo que hay dentro");
			String path = input.nextLine();
			
		
			try {
				DirectoryTree myFile = new DirectoryTree(path);
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
