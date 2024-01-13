package n1exercici8;

public class App {

	public static void main(String[] args) {
	
		
		Reverse reverse = (s) -> String.valueOf(new StringBuilder(s).reverse());
		
		System.out.println(reverse.stringReverse("dale roma."));
		
		
		
	
	}
	
	@FunctionalInterface
	interface  Reverse {
		String stringReverse(String str);
		
		
		
		
	}

}
