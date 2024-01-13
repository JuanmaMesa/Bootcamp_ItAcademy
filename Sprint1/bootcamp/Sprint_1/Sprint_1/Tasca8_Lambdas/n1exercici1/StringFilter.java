package n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>(Arrays.asList("John","mouse","number","paper","Ockland","Sunday"));
		
		List<String> filteredNames = filterStrings(names);
		
		printFilterStrings(filteredNames);
	
				
	}

	
	public static List<String> filterStrings(ArrayList<String>strings){
		
		return strings.stream()
				.filter( (s) -> s.toLowerCase().contains("o"))
				.collect(Collectors.toList());
			
	}
	
	public static void printFilterStrings(List<String> filteredString) {
		
		filteredString.forEach(string -> System.out.println(string));
		
		
		
		
	}
	
}
