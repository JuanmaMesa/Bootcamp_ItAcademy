package n2exercici4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;



public class App_lab {

	public static void main(String[] args) {
		ArrayList<Object> objectsArray = new ArrayList<Object>(Arrays.asList(1,"Marta","55","Numero", 22,"Oscar", -117,"Alma", 5.5 ,"Berto","Cintia","Antartida"));
		ArrayList<String> stringsList = new ArrayList<String>();
		
		for(Object obj: objectsArray) {
			
			if(obj instanceof String) {
				
				stringsList.add((String)obj);
			}
		}
		
		List<String> orderfilter = stringsList.stream()
				
				.sorted((s1, s2) ->{
					boolean e1 = s1.contains("e");
					boolean e2 = s2.contains("e");
					return Boolean.compare(e2,e1);
					})
				.sorted((s1, s2) -> Integer.compare(s1.charAt(0), s2.charAt(0)))
				.map( s -> s.replaceAll("a", "4"))
				.collect(Collectors.toList());
		
		System.out.println("ordenado por filtro: "+orderfilter);
	
		List<Object> onlyNumbers = objectsArray.stream()
				.filter( n  -> String.valueOf(n).matches("-?\\d+(\\.\\d+)?"))
				.collect(Collectors.toList());
		
		System.out.println("\nNumeros de la lista: " +onlyNumbers);
		
		//https://www.cleveritgroup.com/blog/comenzando-con-lambdas-y-streams-en-java
		
	}

	
	
	
	

}
