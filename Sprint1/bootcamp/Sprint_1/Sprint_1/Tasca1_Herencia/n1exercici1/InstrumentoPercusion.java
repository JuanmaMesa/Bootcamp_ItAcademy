package n1exercici1;

public class InstrumentoPercusion extends Instrumento {
	
	static {
		
		System.out.println("La clase InstrumentoPercusion se ha cargado.");
	}
	
	public InstrumentoPercusion(String nombre, double precio) {
		
		super(nombre,precio);
		
	}
	
	
	//@Override
	public String tocar() {
		
		return " Esta sonando un instrumento de Percusión.";
	}
	
	
	

}
