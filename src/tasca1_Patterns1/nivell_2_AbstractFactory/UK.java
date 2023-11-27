package tasca1_Patterns1.nivell_2_AbstractFactory;

public class UK implements Gestor {

	@Override
	public String getAddress(String street, String city, String postcode) {
		// TODO Auto-generated method stub
		return street+", "+city+", "+postcode;
	}


	@Override
	public String getPhoneNumberint(String number) {
		// TODO Auto-generated method stub
		return "+44 "+ number;
	}

	
	

}
