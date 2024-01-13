package n1exercici7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import org.hamcrest.core.IsInstanceOf;

public class App_Reverse {

	public static void main(String[] args) {

		ArrayList<Object> mixArray = new ArrayList<>(Arrays.asList("Joana", "Mark", "Cascos", 22, "Juan Manuel","Piruletas", 54, "Luna"));
		ArrayList<String> stringList = new ArrayList<>();
		
		for(Object object : mixArray) {
			
			if(object instanceof String) {
				stringList.add((String)object);
			}
			
		}
		
		Comparator<String> lengthString = (s1, s2) ->Integer.compare(s2.length(), s1.length()); 
		Collections.sort(stringList,lengthString);
		
		stringList.forEach( n -> System.out.println(n));
		 
		 
		
		
			
		}
		
	
	
}
