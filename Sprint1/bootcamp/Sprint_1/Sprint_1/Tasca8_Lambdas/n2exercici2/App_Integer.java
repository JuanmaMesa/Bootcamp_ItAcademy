package n2exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App_Integer {

	public static void main(String[] args) {
		
		ArrayList<Integer> integerList = new ArrayList<Integer>(Arrays.asList(1,22,33,44,66));

		
		;
		filterIntegers(integerList);
		
		
	}
	
	public static void filterIntegers (ArrayList<Integer> numberList){
		
		numberList.stream()
			.map( (n) -> (n %2 == 0) ? "e"+n : "o"+n  )
			.forEach( n -> System.out.println(n));
		
		
	}

}
