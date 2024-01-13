package n1exercici4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		try(Scanner input = new Scanner(System.in)){
			boolean istrue = false;
		
			while(!istrue) {
			
				System.out.println("Escribe un directorio de tu pc para saber lo que hay dentro");
				String path = input.nextLine();
			
				String file = path +"/informacion.txt";
		
			try {
				DirectoryTree myFile = new DirectoryTree(path);
				if(myFile.getDirectory().isDirectory()) {
					FileWriterReader fileWriterReader = new FileWriterReader(file, true);
					myFile.verificationDirectory(myFile.getDirectory(),fileWriterReader);
				
					String readFile = fileWriterReader.readFromFile();
        
					if(readFile != null) {
						System.out.println("---Content of file---\n"+readFile);
						istrue = true;
					}
				}else {
				System.out.println("Lo que me has proporcionado no es un directorio");
				}
						
			}
			catch(Exception e) {
			System.out.println(e.getMessage());
			}
		
        
			}
		}
	}
}
