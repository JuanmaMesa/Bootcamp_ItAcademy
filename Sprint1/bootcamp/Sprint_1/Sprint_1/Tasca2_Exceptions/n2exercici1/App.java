package n2exercici1;


public class App {

	public static void main(String[] args) {
	
		menu();


	}
	
	
	public static void menu() {			
		boolean exit = false;
		System.out.println("En el menu");	
		while(!exit) {
		System.out.println("Choose an option:");
		System.out.println("1. Answer questions \n2. Exit");
	
		int choice = Input.readInt("Enter your choice: ");
			
		switch(choice) {
			
			case 1:
				answerQuestions();
				exit = true;
				break;
			case 2:
				exit = true;
				break;
			default:
				System.out.println("Invalid choice, please write '1' or '2' ");
				break;
		}
			System.out.println("Goodbye, I hope I see you soon");
			
		}
			
	}
		
	public static void answerQuestions() {
		
		
		
		boolean response = Input.readYesNo("Do you want to continue?");
		
		if(response) {
			String name = Input.readString("What is your name?");
			byte age = Input.readByte("What is your age?");
				
			if( age > 0) {
				float decimal = Input.readFloat("Tell me a decimal number");
				double doubleNumber = Input.readDouble("Tell me another decimal number");
				char letter = Input.readChar("Tell me a letter");
			}else {
				System.out.println("Sorry, you have entered a non positive number");
				 age = Input.readByte("What is your age?");
				 float decimal = Input.readFloat("Tell me a decimal number");
				 double doubleNumber = Input.readDouble("Tell me another decimal number");
				 char letter = Input.readChar("Tell me a letter");
					
			}
		
		}
		
	
				
	}
		
}
