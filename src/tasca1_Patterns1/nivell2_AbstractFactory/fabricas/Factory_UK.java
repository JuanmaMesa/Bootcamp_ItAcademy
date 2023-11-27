package tasca1_Patterns1.nivell2_AbstractFactory.fabricas;

import tasca1_Patterns1.nivell2_AbstractFactory.Address_UnitedKingdom;
import tasca1_Patterns1.nivell2_AbstractFactory.PhoneNumber_UnitedKingdom;
import tasca1_Patterns1.nivell2_AbstractFactory.interfaces.Address;
import tasca1_Patterns1.nivell2_AbstractFactory.interfaces.AgendaFactory;
import tasca1_Patterns1.nivell2_AbstractFactory.interfaces.PhoneNumber;

public class Factory_UK implements AgendaFactory {

	@Override
	public Address createAddress(String street, String city, String postCode) {
		
		Address uk = new Address_UnitedKingdom(street, city, postCode);
		return uk;
	
	}

	
	@Override
	public PhoneNumber createPhoneNumber(String number) {
		PhoneNumber Pnumber = new PhoneNumber_UnitedKingdom(number);
		
		return Pnumber;
	}

}
