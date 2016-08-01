package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThermometerTest {

	@Test
	public void test() {
		//assertEquals("", 25 ,new Thermometer(78, true).display(true));
		//assertEquals("", 212 ,new Thermometer(78, false).display(false));
		//assertEquals("212F -> 100C", 100 ,new Thermometer(75, true).display(false));
		assertEquals(172, new Thermometer(78, true).fahrenheitToCelsius(true));
		assertEquals(25, new Thermometer(78,false).CelsiustoFahrenheit(false));
		
	}
	@Test
	public void FtoC() {
		//assertEquals("", 100, new Thermometer(212).fahrenheitToCelsius(isFahrenheit));
		
	}
	
	public void integerDivision() {
		assertEquals("", 1.0, 9F/5, .01);
	}
	
	
	
	
}
