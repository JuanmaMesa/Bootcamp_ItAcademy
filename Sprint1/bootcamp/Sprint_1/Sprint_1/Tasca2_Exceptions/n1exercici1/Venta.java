package n1exercici1;
import java.util.ArrayList;


public class Venta {

	private ArrayList<Producto> productos;
	private double precioTotal;
	
	
	public Venta() {
		
		productos = new ArrayList<>();
		precioTotal = 0;
		
	}
	
	public double getPrecioTotal() {
		
		return precioTotal;
	}
	
	public ArrayList<Producto> getProductos(){
		return productos;
		
	}
	
	public void agregarProducto(Producto nombre) {
		
		productos.add(nombre);
		
	}
	
	
	public void calcularTotal() throws VendaBuidaException  {
		
		if(productos.size()==0 ) {
		throw new VendaBuidaException("Para hacer una venta, primero tienes que agregar productos." );
		}
		
		
		for(int index=0;index<productos.size();index++) {
			
		
				precioTotal+= productos.get(index).getPrecio();
			
			}
		System.out.println("Cálculo completado.");
			
		}
	
	
	
	public void visualizacion_venta() {
		System.out.println("Detalles de la venta:"+
							"\n------------");
		 for(Producto p:productos) {
			System.out.println("Producto: clase "+p.getNombre()+", precio: "+p.getPrecio()+" euros.");
			
		}
		 
		System.out.println("Precio Total:"+precioTotal);
		
	}

	


	
	
}


