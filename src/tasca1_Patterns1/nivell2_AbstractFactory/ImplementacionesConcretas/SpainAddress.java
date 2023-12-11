package tasca1_Patterns1.nivell2_AbstractFactory.ImplementacionesConcretas;

import tasca1_Patterns1.nivell2_AbstractFactory.interfaces.PhoneManager;

public class SpainAddress implements PhoneManager {

	private  final static String spain = "Spain adress: "; 
	String address ;
	private String phoneNumber;
	
	
	@Override
	public void createAddress(String address) {
		this.address = spain + address;
	
		
	}

	@Override
	public void createPhoneNumber(String phone) {
		this.phoneNumber = "Spain phoneNumber: +34 "+ phone;
		
	}

	@Override
	public String getAddress() {
		return address;
	}


	@Override
	public String getPhoneNumber() {
		return phoneNumber;
	}

	
}
