package tasca1_Patterns1.nivell2_AbstractFactory;

import tasca1_Patterns1.nivell2_AbstractFactory.factories.AbstractFactoryPhoneManager;
import tasca1_Patterns1.nivell2_AbstractFactory.interfaces.PhoneManager;


public class App_PhoneManager {
	
	
	public static void main(String[]args) {
		
	
		try {
	
			AbstractFactoryPhoneManager ukFactory = FactoryProducerPhoneManager.getFactory("UK");
			PhoneManager contact1 =   ukFactory.getPhoneManager();
			contact1.createAddress("221B Baker Street, London NW1 6XE, United Kingdom");
			contact1.createPhoneNumber("7554400");  
			printInfo(contact1);
			
	
			AbstractFactoryPhoneManager SpainFactory = FactoryProducerPhoneManager.getFactory("Spain");
			PhoneManager contact2 =   SpainFactory.getPhoneManager();
			contact2.createAddress("Avenida Diagonal, 123, 08018 Barcelona, España");
			 contact2.createPhoneNumber("644323498");  
			printInfo(contact2);
			
			AbstractFactoryPhoneManager ukFactory2 = FactoryProducerPhoneManager.getFactory("UK");
			PhoneManager contact3 =   ukFactory.getPhoneManager();
			contact3.createAddress("34 Oxford Street, Manchester M2 3WQ, United Kingdom");
			contact3.createPhoneNumber("6654454");  
			printInfo(contact3);
			
			
			AbstractFactoryPhoneManager errorFactory = FactoryProducerPhoneManager.getFactory("Spa");
			
		}catch( IllegalArgumentException e) {
			System.out.println("IllegalArgumentException: "+e.getMessage());
		}
	
		
		
			
	
		
	}	
	public static void printInfo(PhoneManager contact) {
		System.out.println("--- Contact ---");
		System.out.println(	contact.getAddress());
		System.out.println(contact.getPhoneNumber()+"\n");
		
		
		
		
	}
	
}
