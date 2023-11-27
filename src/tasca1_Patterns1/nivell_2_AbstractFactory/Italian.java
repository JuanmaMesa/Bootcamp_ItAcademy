package tasca1_Patterns1.nivell_2_AbstractFactory;

public class Italian implements Gestor {

	@Override
	public String getAddress(String street, String city, String postcode) {
	
		return street+", "+city+", "+postcode;
	}

	@Override
	public String getPhoneNumberint(String number) {
		
		return "+39 "+ number;
	}

}
