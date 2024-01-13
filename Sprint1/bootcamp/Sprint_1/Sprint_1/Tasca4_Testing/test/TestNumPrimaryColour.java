package test;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;

import org.junit.jupiter.api.Test;

import n1exercici3.NumPrimaryColours;

public class TestNumPrimaryColour {

	
	@Test
	void testNumPrimaryColor() {
		NumPrimaryColours colours = new NumPrimaryColours();
		
		assertThrows(ArrayIndexOutOfBoundsException.class,() -> colours.primaryColours(2));
		
		}
	
	@Test
	void testNumPrimaryColorsize() {
		NumPrimaryColours colours = new NumPrimaryColours();
		String [] ArrayColors = colours.primaryColours(3);
		assertEquals("Red", ArrayColors [0]); 
		assertEquals("Blue", ArrayColors [1]); 
		assertEquals("Yellow", ArrayColors [2]); 
		
		
		
		
	}
	
	
	
	
	

}
