package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import n1exercici2.CalculoDni;

class Testdni {

	@ParameterizedTest
    @ValueSource(ints = {48742586, 98765432, 46464982, 22458578, 45448452, 46464981, 55555556, 44181931 })
	void TestIsValidDniNumber(int numDni) {
		assertTrue(CalculoDni.isDniTrue(numDni));
		
	}
	
	@ParameterizedTest
    @CsvSource({
    	"48742586, C", 
    	"98765432, M",
    	"46464982, Z",
    	"22222222, J",
    	"45448452, S",
    	"46464981, J",
    	"55555556, E",
    	"44181931, N" 
    	})
	void TestCalculateLetter(int numDni, char expected) {
		
		char letter = CalculoDni.calculateLetter(numDni);
		assertEquals(expected,letter);
	}

}
