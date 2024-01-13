package n1exercici1;

public class Months {
	
	public String[] createMonths() {
		
		String month [] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio",
		"Julio","Agosto","Septiembre","Octubre","Nobiembre","Dicuembre" };
		return month;
	
	
	}
	
	

public static void main(String []args) {
	
	Months mes = new Months();
	
	mes.createMonths();
	for( String m : mes.createMonths()) {
		System.out.println(m);
		
	}
	
	
}
	
}


