package com.tiy.ssa.weekone.assignmentone;

public class Thermometer {
	
	int temperature;
	boolean isFahrenheit;
	
	
	public Thermometer(int temperature, boolean isFahrenheit){
		
		this.temperature = temperature;
		this.isFahrenheit = isFahrenheit;
		
	}
	
	public int display(boolean userWantsFahrenheit) {
		
		if (userWantsFahrenheit == this.isFahrenheit) 
			return this.temperature;
		return Math.round(((this.temperature - 32) * 5) / 9.0F);
	}

	int fahrenheitToCelsius(boolean isFahrenheit) {
		if(isFahrenheit){
			 return (((this.temperature * 9) / 5) + 32);
			
		}else {
			return 0;
		}
	}
	
	int CelsiustoFahrenheit(boolean isFahrenheit) {
		if(isFahrenheit == false) {
			return (((this.temperature - 32) * 5) / 9);
		}else{
			return 0;
		}
		
	}
	
	
	
}
