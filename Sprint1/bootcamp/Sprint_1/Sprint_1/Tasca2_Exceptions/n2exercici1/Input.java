package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
	
	private static Scanner input = new Scanner(System.in);
	
	public static byte readByte(String message) {
		
		byte result = 0;
		boolean isTrue = false;
		
		do {
			try {
				System.out.println(message + ": ");
				result = input.nextByte();
				System.out.println("byte entered: "+result);
				isTrue = true;
			}catch(InputMismatchException e) {
				System.out.println("InputMismatchException: Please enter a valid byte ");
				input.nextLine();// limpieza de buffer
				
			}
			
		} while(!isTrue);
		
		return result;
		}
	
	public static int readInt(String message) {
		
		int result = 0 ;
		boolean isTrue = false;
		
		do {
			try {
				System.out.println(message + ": ");
				result = input.nextInt();
				System.out.println("Int entered: "+result);
				isTrue = true;
			}catch(InputMismatchException e) {
				System.out.println("InputMismatchException: Error! Plesase enter a valid int.");
				input.next();
			}
		}while(!isTrue);
		
		return result;
	}
	
	public static String readString(String message) {
		String result = "" ;
		boolean isTrue = false;
		
		do {
			try {
				System.out.println(message + ": ");
				result = input.nextLine();
				System.out.println("String entered: "+result);
				isTrue = true;
			}catch(Exception e) {
				System.out.println("Exception: Error! Plesase enter a valid String.");
				input.next();
			}
		}while(!isTrue);
	
		return result;
		
	}
	
	public static float readFloat(String message) {
		
		float result = 0f ;
		boolean isTrue = false;
		
		do {
			try {
				System.out.println(message + ": ");
				result = input.nextFloat();
				System.out.println("Float entered: "+result);
				isTrue = true;
			}catch(InputMismatchException e) {
				System.out.println("InputMismatchException: Error! Plesase enter a valid float.");
				input.next();
			}
		}while(!isTrue);
		
		return result;
	}

	public static double readDouble(String message) {
	
		double result = 0 ;
		boolean isTrue = false;
	
		do {
			try {
				System.out.println(message + ": ");
				result = input.nextDouble();
				System.out.println("double entered: "+result);
				isTrue = true;
			}catch(InputMismatchException e) {
				System.out.println("InputMismatchException: Error! Plesase enter a valid double.");
				input.next();
			}
		}while(!isTrue);
		
		return result;
	}
	
	public static char readChar(String message) {
		
		char result = ' ' ;
		boolean isTrue = false;
		
		do {
			try {
				System.out.println(message + ": ");
				result = input.next().charAt(0);
				System.out.println("Char entered: "+result);
				isTrue = true;
			}catch(Exception e) {
				System.out.println("Exception: Error! Plesase enter a valid char.");
				input.next();
			}
		}while(!isTrue);
		
		return result;
	}
	
	public static boolean readYesNo(String message) {
		boolean result = false;
		boolean isTrue = false;
		
		do {
			System.out.println(message + ": ");
			String response = input.nextLine();
			
			if(response.equalsIgnoreCase("y")) {
				result = true;
				isTrue = true;
				System.out.println("Entered: "+result);
			}else if( response.equalsIgnoreCase("n")) {
				isTrue = true;
				System.out.println("Entered: "+result);
			}else {
				System.out.println("Please enter 'y' or 'n'");
			}
			
		}while(!isTrue);
		
		return result;
		
		
	}
	
	
		
}

