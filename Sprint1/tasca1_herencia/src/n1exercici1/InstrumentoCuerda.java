package tasca1_herencia.n1exercici1;

public class InstrumentoCuerda extends Instrumento{
	
	private int numeroCuerdas;

	static {
		System.out.println("El instrumento Cuerda se esta preparando para afinar.");

	}
	
	// bloque inicializacion de instancia
	{
		System.out.println("Instrumento cuerda (" + getNombre() +") se afina con un 'La'");
	}

	{
		if(super.getNombre().equalsIgnoreCase("Guitarra")){
			
			numeroCuerdas = 4;
		}
		else if(super.getNombre().equalsIgnoreCase("violín")) {
			
			numeroCuerdas = 6;
		}
		else {
			numeroCuerdas = 0;
		}
	}
	
	public InstrumentoCuerda(String nombre, double precio) {
		
		super(nombre,precio);
		
	}
	
	
	public int getNumeroCuerdas() {
		
		return numeroCuerdas;
	}
	
	//@Override
	public String tocar() {
		
		return " Esta sonando un instrumento de cuerda.";
	}
}
