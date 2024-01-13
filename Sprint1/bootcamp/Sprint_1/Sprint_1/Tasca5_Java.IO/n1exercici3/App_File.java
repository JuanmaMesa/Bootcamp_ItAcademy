package n1exercici3;

import java.util.Scanner;

public class App_File {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean istrue = false;
		
		while(!istrue) {

			System.out.println("Escribe un directorio de tu pc para saber lo que hay dentro");
			String path = input.nextLine();
			System.out.println("ahora se te guardara una carpeta llamada informacion en la carpeta que has seleccionado anteriormente");
			String file = path +"/informacion.txt";
		
			try {
				DirectoryTree_version2 myFile = new DirectoryTree_version2(path);
				if(myFile.getDirectory().isDirectory()) {
					FileWriterReader fileWriter = new FileWriterReader(file, true);
					myFile.verificationDirectory(myFile.getDirectory(),fileWriter);
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
