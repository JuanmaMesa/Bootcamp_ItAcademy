package tasca1_herencia.n1exercici1;

public abstract class Instrumento {

	private String nombre;
	private double precio;
	private int id;
	private static int instrumento = 1;
	
	static {
		System.out.println("Los Instrumentos se estan preparando para afinar.");
	}

	
	public Instrumento(String nombre, double  precio) {
		
		this.nombre = nombre;
		this.precio = precio;
		id = instrumento;
		instrumento++;
	}
	
	public String getNombre() {
		
		return nombre;
	}

	public double getPrecio() {
		
		return precio;
		
	}
	
	public int getId() {
		
		return id;
	}
	
	public abstract String tocar();
	
	
	public String toString() {
		
		return id +"- Instrumento "+ nombre+":";
							
	}
	
}
