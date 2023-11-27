package tasca1_Patterns1.nivell2_AbstractFactory;

import tasca1_Patterns1.nivell2_AbstractFactory.interfaces.Address;

public class Address_UnitedKingdom implements Address  {
	
		private String street;
		private String city;
		private String postCode;
		
		
		
		public Address_UnitedKingdom(String street, String city, String postCode) {
			this.street = street;
			this.city = city;
			this.postCode = postCode;
		}



		@Override
		public String getAddress() {
		
			return street+", " +city+", "+ postCode;
		}

	
}
