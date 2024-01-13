package tasca1_Patterns1.nivell1_Singleton;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		
	
	
	menuPrincipal();
		
		
		

		
		
	}
	
	

	public static void menuPrincipal() {
		Undo manager = Undo.getInstance();
		Input input = Input.getInstance();
		
		System.out.println("Menu principal");
		int number;
		do {
			
			System.out.println("\n1.Introducir comando nuevo"+
								"\n2.Undo"+
								"\n3.Ver historial"+
								"\n4.Finalizar la app");
		number = input.readNumber("Elige una opcion");
		switch(number) {
		
		case 1:
			manager.addCommand(input.readString("Introduce commando nuevo"));
			break;
		case 2:
			manager.undo();
			break;
		case 3:
			if(!manager.getHistory().isEmpty()) {
				System.out.println("--Historial--");
				manager.getHistory().forEach(n -> System.out.println(n));
			}else {
				System.out.println("El historial esta vacio");
			}
			break;
		case 4:
			System.out.println("Finalizando el programa... ");
		
			break;
		
		default:
			System.out.println("Lo siento esta opcion no esta contemplada,introduce del 1-4.");
		
		
		}
			
			
			
		}
		while(number!=4);
		input.closeInput();
		

	}
	

	/*public static int readNumber(String message) {
	
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		int number = 0;
		
		try {
		number = input.nextInt();
		input.nextLine();// limpieza buffer
		return number;
		}catch(InputMismatchException e) {
			System.out.println("Tienes que poner un digito.");
		}return number;
		
		
	
		
	}
	public static String readString(String message) {
		
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		String command = input.nextLine();
		
		return command;
		
	}*/
}
