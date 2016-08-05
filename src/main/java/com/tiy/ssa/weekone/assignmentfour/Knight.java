package com.tiy.ssa.weekone.assignmentfour;

import java.util.ArrayList;

public class Knight {
	
	final Location home;
	Location current;
	ArrayList<Location> log = new ArrayList<Location>();
	
	
	public Knight(Location start) {
		this.current = this.home = start;
	}
	
	
	public boolean isHome(){
		return this.current.equals(this.home);
	}
	
	public Location move(){
		this.current = this.current.offset(1, 2);
		log.add(this.current);
		return this.current;
	}
	
	public Location goHome() {
		this.current = this.current.offset(1, -2);
		log.add(this.current);
		this.current = this.current.offset(-1, -2);
		log.add(this.current);
		this.current = this.current.offset(-1, 2);
		log.add(this.current);
		
		return this.current;
	}

}	
	
	
	/*
	
	
	public void move() {
		
		starting();
		moveOptions(randomNumber());
		position();
		
			if(currentY == 2 && currentX == -1) {
				moveOptions(7);
				position();
				moveOptions(8);
				position();
				moveOptions(2);
				position();
				
				if( currentY == startingY && currentX == startingX) {
					System.out.println("if condition #1");
					
				}
			}
		
			
			if(currentY == 2 && currentX == 1) {
				moveOptions(8);
				position();
				moveOptions(7);
				position();
				moveOptions(1);
				position();
				
				if( currentY == startingY && currentX == startingX) {
					System.out.println("if condition #2");
					
				}
				
			}
			
			if (currentY == 1 && currentX == -2) {
				moveOptions(7);
				position();
				moveOptions(6);
				position();
				moveOptions(2);
				position();
				
				if( currentY == startingY && currentX == startingX) {
					System.out.println("if condition #3");
					
				}
			}
		
			if (currentY == 1 && currentX == 2) {
				moveOptions(8);
				position();
				moveOptions(5);
				position();
				moveOptions(1);
				position();
				
				if( currentY == startingY && currentX == startingX) {
					System.out.println("if condition #4");
					
				}
			}
			
			
			if (currentY == -1 && currentX == -2) {
				moveOptions(7);
				position();
				moveOptions(4);
				position();
				moveOptions(2);
				position();
				
				if( currentY == startingY && currentX == startingX) {
					System.out.println("if condition #5");
					
				}
			}
			
			
			if (currentY == -2 && currentX == -1) {
				moveOptions(6);
				position();
				moveOptions(2);
				position();
				moveOptions(3);
				position();
				
				if( currentY == startingY && currentX == startingX) {
					System.out.println("if condition #6");
					
				}
			}
			
			
			if (currentY == -2 && currentX == 1) {
				moveOptions(2);
				position();
				moveOptions(1);
				position();
				moveOptions(7);
				position();
				
				if( currentY == startingY && currentX == startingX) {
					System.out.println("if condition #7");
					
				}
			}
			
			
			if (currentY == -1 && currentX == 2) {
				moveOptions(2);
				position();
				moveOptions(3);
				position();
				moveOptions(7);
				position();
				
				if( currentY == startingY && currentX == startingX) {
					System.out.println("if condition #8");
					
				}
			}
			
			
		
	}
	
	
	private int randomNumber(){
		
		int rNG = (int) (Math.random() * 8 + 1);
		return rNG;
		
	}
	
	
	private void starting() {
		System.out.println("Starting Position: " + startingX + ", " + startingY);
	}
	
	private void position() {
		System.out.println("Current Position: " + currentX + ", " + currentY);
	}
	
	
	
	
	
	private void moveOptions(int option) {
		
		switch(option) {
			case 1:
				currentX -= 1;
				currentY += 2;
			break;
			
			case 2:
				currentX += 1;
				currentY += 2;
			break;
			
			case 3:
				currentX -= 2;
				currentY += 1;
			break;
			
			case 4:
				currentX += 2;
				currentY += 1;
			break;
			
			case 5:
				currentX -= 2;
				currentY -= 1;
			break;
			
			case 6:
				currentX += 2;
				currentY -= 1;
			break;
			
			case 7:
				currentX -= 1;
				currentY -= 2;
			break;
			
			case 8:
				currentX += 1;
				currentY -= 2;
			break;
		}
			
	}
		
}
	
	*/
	
	
	

