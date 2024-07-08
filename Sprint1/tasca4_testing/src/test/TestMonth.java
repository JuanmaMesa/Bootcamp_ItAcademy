package tasca4_testing.test;

//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tasca4_testing.n1exercici1.Months;

import java.util.Arrays;


class TestMonth {

	private static String[] monthList;

	@BeforeAll
	static void creacion() {
	Months months = new Months();
	monthList = months.createMonths();
	}
	
	@Test
	@DisplayName("Test if 'Agosto' is at index 7")
	 void testMonth() {
		String expected = "Agosto";
		assertEquals(expected,monthList[7]);
	}
		
	@Test
	@DisplayName("Test if the array is not null")
	void isNotNull() {
		assertNotNull("--Not null--", Arrays.toString(monthList));
	}
	

		
	@Test
	@DisplayName("Test if the array length is 12")
	void testArrayLength() {
		
		int expected = 12;
		assertEquals(expected, monthList.length);
		
		
		
	}
		
		
	

}
