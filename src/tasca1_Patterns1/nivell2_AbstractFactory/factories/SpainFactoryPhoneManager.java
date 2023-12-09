package tasca1_Patterns1.nivell2_AbstractFactory.factories;

import tasca1_Patterns1.nivell2_AbstractFactory.ImplementacionesConcretas.SpainAddress;
import tasca1_Patterns1.nivell2_AbstractFactory.interfaces.PhoneManager;

public class SpainFactoryPhoneManager extends AbstractFactoryPhoneManager {

	@Override
	public PhoneManager getPhoneManager() {
		return new SpainAddress();
	}

	
}
