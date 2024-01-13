package n1exercici1;

public class App_Tienda {
	
	public static void main(String[]args) {
		
		Venta venta1 = new Venta();
		
		try {
			venta1.calcularTotal();
		
		}catch(VendaBuidaException e) {
			System.out.println("Se ha producido una Exception: "+ e.getMessage());
		}
		
		
		Producto producto1 = new Producto("Zanahorias", 12.5);
		Producto producto2 = new Producto("pan", 1.5);
		Producto producto3 = new Producto("Guisantes", 0.79);
	
		
		venta1.agregarProducto(producto1);
		venta1.agregarProducto(producto2);
		venta1.agregarProducto(producto3);
		
	
		try {
			venta1.calcularTotal();
			
		}catch(VendaBuidaException e) {
			System.out.println("Se ha producido una Exception: "+ e.getMessage());
		}
			
		
		venta1.visualizacion_venta();
		
		// forzamos error de indice
		try {
		
			Producto productoFueraRango = venta1.getProductos().get(4);
		
		}catch (IndexOutOfBoundsException e) {
			
			System.out.println("ArrayIndexOutOfBoundsException: (fuera de rango) No hay tantos productos en la cesta.");
			
		}
		
		
		
		
		}
	
		
		
}
	
	


