package n1exercici2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import n1exercici1.StringFilter;

public class Filtered {

	public static void main(String[] args) {


		ArrayList<String> names = new ArrayList<>(Arrays.asList("John","mouse","number","paper","Orlando","Sunday"));
		
		List<String> filteredNames = filteredLetter(names);
		
		// metodo creado en n1exercici1
		StringFilter.printFilterStrings(filteredNames);
	
		
		
	}
	
	public static List<String> filteredLetter(ArrayList<String> strings){
		
		return strings.stream()
			.filter(letter  -> letter.contains("o") && letter.length() >= 5)
			.collect(Collectors.toList());
			
		
		
		
	}

}
