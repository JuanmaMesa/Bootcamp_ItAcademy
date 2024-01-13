package n1exercici3;
import java.util.ArrayList;
import java.util.Arrays;
public class Monhs {

	public static void main(String[] args) {
		
		ArrayList<String> monthsArray = new ArrayList<>(Arrays.asList("Enero", "Febrero", "Marzo","Abril","Mayo","Junio","Julio",
																		"Agosto","Septiembre", "Octubre", "Noviembre","Diciembre"));
	
		monthsArray.forEach( m  -> System.out.println(m));

		
		
	}
	
	
	

}
