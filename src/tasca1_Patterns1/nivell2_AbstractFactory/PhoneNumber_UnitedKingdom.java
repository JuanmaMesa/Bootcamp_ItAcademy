package tasca1_Patterns1.nivell2_AbstractFactory;

import tasca1_Patterns1.nivell2_AbstractFactory.interfaces.PhoneNumber;

public class PhoneNumber_UnitedKingdom implements PhoneNumber {
			
		private String number;

		public PhoneNumber_UnitedKingdom(String number) {
			
			this.number = number;
		}

		@Override
		public String getInternationalPhoneNumber() {
			return "+44 "+number;
		}
		
		

	
}
