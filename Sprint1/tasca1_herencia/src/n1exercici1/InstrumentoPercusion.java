package tasca1_herencia.n1exercici1;

public class InstrumentoPercusion extends Instrumento {

	// bloque static
	static {
		
		System.out.println("El instrumento percusion se esta preparando para afinar");
	}
	// bloque inicializacion de instancia
	{
		System.out.println("El instrumento percusion (" + getNombre() +") se afina con un 'La'");
	}
	
	public InstrumentoPercusion(String nombre, double precio) {
		
		super(nombre,precio);
		
	}
	
	
	//@Override
	public String tocar() {
		
		return " Esta sonando un instrumento de Percusión.";
	}
	
	
	

}
