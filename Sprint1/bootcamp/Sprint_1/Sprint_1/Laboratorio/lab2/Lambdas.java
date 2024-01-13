package lab2;
import java.util.*;
import java.util.stream.Stream;


import static java.util.Collections.replaceAll;
public class Lambdas {


	    public static void main(String[] args) {

	        List<String> list = Arrays.asList("Pedro","Juan","5","Miguel","Maria","Nicolasa","Eusebio","48","53","36","Almudena");

	        System.out.println("Imprimiendo la lista según los criterios de ordenación.");

	        list.stream()
	                .sorted(Comparator.comparingInt(s -> s.charAt(0)))
	                .sorted(Comparator.comparingInt(s -> s.contains("e") ? 0 : 1))
	                .forEach(s -> System.out.println(s.replaceAll("a","4")));


	        System.out.println("Imprimiendo solo numeros.");

	        list.stream()
	                .filter(s -> s.matches("\\d+"))
	                .forEach(System.out::println);





	    
	
	


	
	
	
	
	
	
	
	}

}
