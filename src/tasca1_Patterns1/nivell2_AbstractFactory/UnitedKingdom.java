package tasca1_Patterns1.nivell2_AbstractFactory;

import tasca1_Patterns1.nivell2_AbstractFactory.interfaces.Address;
import tasca1_Patterns1.nivell2_AbstractFactory.interfaces.AgendaFactory;
import tasca1_Patterns1.nivell2_AbstractFactory.interfaces.PhoneNumber;

public class UnitedKingdom implements AgendaFactory{

	@Override
	public Address createAddress(String street, String city, String postCode) {
		
		return null;
	}

	@Override
	public PhoneNumber createPhoneNumber(String number) {
	
		return null;
	}

	
	
	

	
	

}
