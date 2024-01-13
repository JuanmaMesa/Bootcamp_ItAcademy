package n1exercisi3;

import java.util.Map;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;




public class CountriesGame {

	public static void main(String[] args) {
		

		String countriesFile = CountriesGame.class.getResource("resources/countries.txt").getFile();
		
		HashMap<String, String> countries = loadCountries(countriesFile);
		
	
		
		
		menu(countries);
				
	}
	 private static Scanner input = new Scanner(System.in);
	 public static void menu(HashMap<String, String> countries) {
	
		 boolean isfinish = false;
		
		 if(countries.isEmpty()) {
			 System.out.println("loading.... An error has been detected!! Please try again later." );
		
		 }else {
			 System.out.println("=== Welcome to Countries Game ===");
		
			 while(!isfinish) {
			 System.out.println("---- Menu ----");
			int option = getnumber("Chose a number:\n1: Start Game\n2. Exit");
			
			switch(option) {
			
			case 1:
				game(countries);
				isfinish = true;
				break;
			case 2:
				System.out.println("Goodbye, I hope see you soon!!");
				isfinish = true;
				break;
			default:
				System.out.println("Error, choose another number: 1-2");
				
			}
		  }
		}
	 }
	 
	 public static void game(HashMap<String, String> countries) {
		ArrayList<Map.Entry<String, String>>entryList = new ArrayList<>(countries.entrySet());
		 
		int indice = 0;
		int points = 0;
		String name = getname("What's your name.");
		
		while(indice < 10) {
			Collections.shuffle(entryList);
			
			for(Map.Entry<String, String> entry : entryList) {
				
				if(indice <= 10) {
					String country = entry.getKey();
					String capital = entry.getValue();
			
					System.out.println(country);
					String city = getname("What is the capital");
			
					if(capital.equalsIgnoreCase(city) ) {
						System.out.println("Correct!");
						points++;
					}else {
					System.out.println("Oopps, you are wrong!");
					}
		
					indice++;
					}
				
				
			}
	 	}
		System.out.println("Finish!! well done\n"+"user: "+name+" Total points: "+points);
		saveScore(name, points);
	}
	 
	 public static HashMap<String, String> loadCountries(String filename){
		 
		 HashMap<String,String>countries = new HashMap<>();
		 
		 try {
			 BufferedReader br = new BufferedReader(new FileReader(filename));
			 String line;
			
			while((line = br.readLine()) != null  ) {
				
				String[] parts = line.trim().split(" ");
				if(parts.length == 2) {
					String country = parts[0];
					String capital = parts[1];
					
					countries.put(country, capital);
					
				}
			}
			
			br.close();
		}catch(FileNotFoundException e) {
			System.out.println("FileNotFoundException: File not found" + e.getMessage());
			
		}
		 catch (IOException e) {
			System.out.println("IOException: "+e.getMessage());
		}
		 return countries;
		 
	 }
		 

	public static String getname(String message) {
		
		System.out.println(message);
		return input.nextLine();
		
			
	}

	public static int getnumber(String message) {
	
		System.out.println(message);
		int number = input.nextInt();
		input.nextLine();
		return number;
		
	}
	
	public static void saveScore(String name, int points) {
		
		try {
			String scoreFile =("src/n1exercici3/classificacio.txt");
			FileWriter writer = new FileWriter(scoreFile, true);
			writer.write("User: " +name+ ", Total Points: "+points+"\n");
			writer.close();
		}catch(IOException e) {
			System.out.println("IOException: "+ e.getMessage());
			
		}
		
		
		

		
	}
	
	
	
	
}
