package n2exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Strings {

	public static void main(String[] args) {
		
		ArrayList<String> strings = new ArrayList<String>(Arrays.asList("Elena","ALBA","Ana", "ana","Anton","Axl"));
		 List<String> filteredStrings = new ArrayList<String>();
		
		
		 
		 filteredStrings =   filterStrings(strings);
		 filteredStrings.forEach( (s) -> System.out.println("Nombre: "+s));
		
		
		
		
	}
	
	public static List<String> filterStrings(ArrayList<String> arrayString){
		
		return arrayString.stream()
				.filter( (s) -> s.startsWith("A") && s.length() < 4)
				.collect(Collectors.toList());
	}

}
