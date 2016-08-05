package com.tiy.ssa.weekone.assignmenttwo;

public class Maths {
	
	
	public static int squareRoot(int quantity) {
		
		
		/*
		int newGuess = 2;
		int guessTimesItself = 0;
		
		for(;guessTimesItself != quantity;){
			
			int z = quantity / newGuess;
			int x = (newGuess + z) / 2;
			newGuess = x;
			guessTimesItself = newGuess * newGuess;
			
			if(guessTimesItself == quantity){
				break;
			}
			
			
		}
		return newGuess;
	}
		*/
		
		int value = 2;
		
		for(; value <= quantity; value++) {
			
			//System.out.println(value);
			
			if( (quantity / value) == value) {
				break;
			}
		}
			return value;
	}
		 
	
	public static int cubeRoot(int quantity) {
		
		int value = 1;
		
		while(value <= quantity){
			
			if((quantity / value / value) == value) {
				break;
			}
			value = value + 1;
		}
		
		return value;
	}
	
	
}
