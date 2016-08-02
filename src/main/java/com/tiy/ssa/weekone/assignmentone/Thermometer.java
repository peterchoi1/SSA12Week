package com.tiy.ssa.weekone.assignmentone;

public class Thermometer {
	
	int temperature;
	boolean isFahrenheit;
	
	
	public Thermometer(int temperature, boolean isFahrenheit){
		
		this.temperature = temperature;
		this.isFahrenheit = isFahrenheit;
		
	}
	
	public int display(boolean userWantsFahrenheit) {
	
		if (this.isFahrenheit == userWantsFahrenheit) { 
			return this.temperature;
			
		} else if (this.isFahrenheit == true && userWantsFahrenheit == false) { 
			return (((Math.round(this.temperature - 32) * 5) / 9));	
			
		} else if (this.isFahrenheit == false && userWantsFahrenheit == true) {
			return (((Math.round(this.temperature * 9) / 5) + 32));
		
		} else {
			return this.temperature;
		}
		
		
	}
		
	
	public int fahrenheitToCelsius() {
		return (((Math.round(this.temperature - 32) * 5) / 9));	 
		
	}
	
	public int celsiustoFahrenheit() {
		return (((Math.round(this.temperature * 9) / 5) + 32));
	}
	

	
}
