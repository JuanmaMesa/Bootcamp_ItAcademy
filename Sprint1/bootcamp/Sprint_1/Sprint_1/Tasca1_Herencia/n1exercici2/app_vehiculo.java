package n1exercici2;

public class app_vehiculo {

	public static void main(String[] args) {
		
		System.out.println(Coche.frenar());
		
		
		Coche micocheSeat = new Coche();
		Coche micocheSeat1 = new Coche();
		
		

		System.out.println("----");
		System.out.println(micocheSeat.acelerar());
		System.out.println(Coche.frenar());
		
		System.out.println("----");
		System.out.println("Marca: "+Coche.getMarca());
		System.out.println("Modelo: "+Coche.getModelo());
		System.out.println("Potencia. "+micocheSeat.getPotencia());
		
		
	
		
		System.out.println("----");
		micocheSeat.setModelo("Ibiza FR");
		
		System.out.println(micocheSeat);
		System.out.println(micocheSeat1);// afectado por el cambio de modelo de micocheSeat
		
	
		
		
		
		
		
		
	
	}

}
