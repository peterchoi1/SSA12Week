package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThermometerTest {

	@Test
	public void display() {
		assertEquals("", 32, new Thermometer(32, true).display(true));
		assertEquals("", 0, new Thermometer(32, true).display(false));
		assertEquals("", 32, new Thermometer(0, false).display(true));
		assertEquals("", 0, new Thermometer(0,false).display(false));
		assertEquals("", -13, new Thermometer(7,true).display(false));
	}
	@Test
	public void FtoC() {
		assertEquals("", 0, new Thermometer(32, true).fahrenheitToCelsius());
		assertEquals("", -9, new Thermometer(15, true).fahrenheitToCelsius());		
	}
	
	@Test
	public void CtoF(){
		assertEquals("", 32, new Thermometer(0, false).celsiustoFahrenheit());
		assertEquals("", 16, new Thermometer(-9, false).celsiustoFahrenheit());
	}
	
	
	
	
	
}
