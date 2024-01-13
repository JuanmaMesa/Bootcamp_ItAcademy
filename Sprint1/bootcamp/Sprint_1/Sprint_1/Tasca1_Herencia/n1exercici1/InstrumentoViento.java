package n1exercici1;

public class InstrumentoViento extends Instrumento {
	
	static {
		
		System.out.println("La claseInstrumentoViento se ha cargado.");
	}
	InstrumentoViento(String nombre, double precio){
		
		super(nombre,precio);
		
	}
	//@Override
	public String tocar() {
		
		return " Esta sonando un instrumento de viento.";
	}
	

	
	
	
	
}
