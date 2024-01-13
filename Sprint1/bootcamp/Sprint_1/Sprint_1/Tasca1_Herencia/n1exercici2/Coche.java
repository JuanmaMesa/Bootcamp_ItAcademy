package n1exercici2;

public class Coche {


	private static final String MARCA; 
	private static String modelo; 
	private final int potencia;
	
	static {
		
		MARCA = "Seat";
		modelo = "Ibiza";
		
	}
	
	public Coche() {
		potencia = 1100;

	}	
	public void setModelo(String nuevoModelo) {
		
		modelo = nuevoModelo;
	}
	
	
	public static String getMarca() {
		
		return MARCA;
	}
	
	public static String getModelo() {
		
		return modelo;
	}
	
	public int getPotencia() {
		
		return potencia;
	}
	
	
	
	public static String frenar() {
		
		return"El vehiculo esta frenando.";
	}
	
	
	public String acelerar() {
		
		return"El vehiculo esta acelerando.";
	}
	
	//override
	public String toString() {
		
		return "vehiculo-->  "+"Marca: "+MARCA+", Modelo: "+modelo+ ", Potencia: "+potencia+" CC";
		
	}
	
}
