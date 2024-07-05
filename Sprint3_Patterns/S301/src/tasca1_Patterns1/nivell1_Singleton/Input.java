package src.tasca1_Patterns1.nivell1_Singleton;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
	
	private static Input instance;
	private Scanner input;
	
	private Input() {
		input = new Scanner(System.in);
		
	}
	
	public static Input getInstance() {
		
		if(instance == null) {
		   instance = new Input();	
		}
		return instance;
		
	}
	
	public int readNumber(String message) {
		System.out.println(message);
		int number = 4;
		try {
		 number = input.nextInt();
		input.nextLine();// limpieza buffer
		return number;
		}catch(InputMismatchException e){
			System.out.println("Has de escribir un digito");
			
		}
		return number;

	}
	
	public String readString(String message) {
		
		System.out.println(message);
		String string = input.nextLine();
		return string;
	}
	
	public void closeInput() {
		input.close();
		
	}
		
}