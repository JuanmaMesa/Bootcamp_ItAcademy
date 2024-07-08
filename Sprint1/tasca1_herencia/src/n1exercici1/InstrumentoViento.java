package tasca1_herencia.n1exercici1;

public class InstrumentoViento extends Instrumento {
	
	static {
		System.out.println("El instrumento Viento se esta preparando para afinar.");
	}

	// bloque inicializacion de instancia
	{
		System.out.println("El instrumento viento (" + getNombre() +") se afina con un 'La'");
	}

	InstrumentoViento(String nombre, double precio){
		
		super(nombre,precio);
		
	}
	//@Override
	public String tocar() {
		
		return " Esta sonando un instrumento de viento.";
	}
}
