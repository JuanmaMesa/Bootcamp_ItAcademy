package tasca1_Patterns1.nivell2_AbstractFactory.factories;

import tasca1_Patterns1.nivell2_AbstractFactory.ImplementacionesConcretas.UkAddress;
import tasca1_Patterns1.nivell2_AbstractFactory.interfaces.PhoneManager;

public class UKFactoryPhoneManager extends AbstractFactoryPhoneManager {

	@Override
	public PhoneManager getPhoneManager() {
		return new UkAddress();
	}


}
