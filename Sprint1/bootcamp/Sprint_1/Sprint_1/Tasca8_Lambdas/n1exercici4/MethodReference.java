package n1exercici4;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodReference {

	public static void main(String[] args) {
		ArrayList<String> monthsArray = new ArrayList<>(Arrays.asList("Enero", "Febrero", "Marzo","Abril","Mayo","Junio","Julio",
				"Agosto","Septiembre", "Octubre", "Noviembre","Diciembre"));
		
		
		monthsArray.forEach(System.out::println);
		
		
		
		
	}

}
