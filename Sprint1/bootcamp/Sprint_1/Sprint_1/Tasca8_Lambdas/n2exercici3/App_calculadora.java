package n2exercici3;


public class App_calculadora {

	public static void main(String[] args) {
		
		CalculatorThreeNumbers addiction = (a, b, c) -> a + b + c;
		CalculatorThreeNumbers subtract = (a, b, c) -> (a - b)- c;
		CalculatorTwoNumbers multiply = (a, b) -> (a * b) ;
		CalculatorTwoNumbers division = (a, b)  -> (a / ((b == 0)? 1:b) ); 
		
		System.out.println("suma -> "+addiction.operations(5, 5, 6));
		System.out.println("resta -> "+subtract.operations(5, 6, 6));
		System.out.println("multiplicacion -> "+multiply.operations(5, 6.9f));
		System.out.println("division -> "+ String.format("%.2f", division.operations(5, 8)));
	
			

	}
	
	@FunctionalInterface
	interface CalculatorTwoNumbers{
		float operations(float a, float b);
		
		
	}
	@FunctionalInterface
	interface CalculatorThreeNumbers{
		float operations(float a, float b, float c);
	}
	
	

}
