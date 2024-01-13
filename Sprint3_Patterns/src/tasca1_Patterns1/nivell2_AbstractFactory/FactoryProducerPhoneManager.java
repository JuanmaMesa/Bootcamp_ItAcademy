package tasca1_Patterns1.nivell2_AbstractFactory;

import tasca1_Patterns1.nivell2_AbstractFactory.factories.AbstractFactoryPhoneManager;
import tasca1_Patterns1.nivell2_AbstractFactory.factories.SpainFactoryPhoneManager;
import tasca1_Patterns1.nivell2_AbstractFactory.factories.UKFactoryPhoneManager;

public class FactoryProducerPhoneManager {

	public static AbstractFactoryPhoneManager getFactory(String country) {
		
		if(country.equalsIgnoreCase("UK")) {
			AbstractFactoryPhoneManager ukAddress = new UKFactoryPhoneManager();
			return ukAddress;
			
		}else if (country.equalsIgnoreCase("Spain")) {
			AbstractFactoryPhoneManager spainAddress = new SpainFactoryPhoneManager();
			return spainAddress;
		}
		
		throw new IllegalArgumentException("La agenda no puede soportar este formato internacional");
		
		
		
		
		
		
		
	}
	
}
