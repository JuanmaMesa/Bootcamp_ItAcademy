package tasca1_Patterns1.nivell2_AbstractFactory.interfaces;



public interface AgendaFactory {

	Address createAddress(String street, String city, String postCode);
	
	PhoneNumber createPhoneNumber(String number);
	
	
}