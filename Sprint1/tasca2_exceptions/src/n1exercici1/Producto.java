package tasca2_exceptions.n1exercici1;

public class Producto {

	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio) {
		
		this.nombre = nombre;
		this.precio = precio;
		
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public double getPrecio() {
		
		return precio;
	}

	
	public void setPrecio(int nuevoPrecio) {
		
		precio = nuevoPrecio;
	}
	
	
	
	
	
	
}
