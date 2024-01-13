package n1exercici5;
//import n1exercici4.DirectoryTree;

import java.util.InputMismatchException;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
	
		try(Scanner input = new Scanner(System.in)){
			
		String file ="miObject1.ser";
		ObjectFileManager objectFileManager = new ObjectFileManager(file, true);
		
		System.out.println("dime tu nombre,");
		String name = input.nextLine();
		
		try {
			System.out.println("dime tus años");
			int age = input.nextInt();
			input.nextLine();// limpieza buffer
			
			if(age < 0 || age >=105) {
				System.out.println("Lo siento, la edad no es correcta.");
				return;
			}
			ObjectTest myObject = new ObjectTest(name,age);
			objectFileManager.serializeObject(myObject, file);
			
			ObjectTest myObjectReturn = (ObjectTest) objectFileManager.desSerializeObject(file);
			if(myObjectReturn != null) {
				System.out.println("Deserialized object is: "+myObjectReturn.getClass()+ "\nInfo  Objet:\n"+ myObjectReturn.toString());
			}
		}catch( InputMismatchException e) {
			System.out.println("Has introducido un numero no valido valido");
		}catch (Exception e) {
			System.out.println("Ha habido un error: "+e.getMessage());
		}
	}
		
		
	
		
		
	
	}

}
