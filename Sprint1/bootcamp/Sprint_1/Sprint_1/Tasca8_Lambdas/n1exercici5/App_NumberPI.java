package n1exercici5;

public class App_NumberPI {

	public static void main(String[] args) {
		
		NumberPi numberPi = () -> (3.1415);
		
		double pi = numberPi.getPiValue();
		System.out.println("El valor de pi es: "+pi);

	}

	@FunctionalInterface
	interface NumberPi{
		double getPiValue();
		
	}
}
