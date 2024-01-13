package n1exercici2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CalculoDni {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numDni = getDniNumber(input);
		
		if(isDniTrue(numDni)) {
			char letter = calculateLetter(numDni);
			String completeDni = Integer.toString(numDni)+letter;
			System.out.println("Your DNI is: "+ completeDni);
		}
	}
			
	
	
	public static char calculateLetter(int num) {
		num = (num %23);
		final String letter = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letterDni = letter.charAt(num);
		return letterDni;
	}

	public static boolean isDniTrue(int numDni) {
		String dniString = Integer.toString(numDni);
		return dniString.length()==8;
		
		
	}
	
	public static int getDniNumber(Scanner input) {
		
		int numDni = 0;
		boolean validDni = false;
		
		while(!validDni) {
			
			System.out.println("Enter your DNI digits");
			try {
				numDni = input.nextInt();
				if(isDniTrue(numDni)) {
					validDni = true;
				}else {
					System.out.println("You need to enter 8 digits!!");
					
				}
			}catch(InputMismatchException e) {
				System.out.println("InputMismatchException: Error!! you have not entered digits.");
				input.next();
			}
		}
		
		return numDni;
		
	}
}
		
	

