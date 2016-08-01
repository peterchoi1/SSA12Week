package com.tiy.ssa.weekone.assignmentone;

public class practice {

	
	public static void temperature(int degrees, boolean type){
		
		double celcius;
		
	 if (type == true) {
		 
		 System.out.println("Fahrenheit = " + degrees);
		 
	 }
	 else {
		 
		 celcius = ((degrees - 32) * 5/9);
		 System.out.println(celcius);
	 }
	 
		
	}
	
	
	
	public static void main(String[] args){
		
		temperature(32, false);
		
	}
	
}
