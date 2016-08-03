package com.tiy.ssa.weekone.assignmenttwo;

public class Palindrome {

	final String word;
	String check = "";
	
	public Palindrome(String word) {
		this.word = word;
	}
	
	
		
	public boolean isPalindrome(){
		char[] chars = word.toCharArray();
		for (int i = word.length() - 1; i >= 0; i--) {
			
			check = check + chars[i];
			
		}
			
		if (word.equals(check)) {
			
			return true;
			//System.out.println(check);
		} else {
			return false;
			//System.out.println(word + " is not a Palindrome.");
		}
		
		
	}
	
	public boolean isPalindromeSubString() {
		
		for(int x = word.length() - 1; x >= 0; x--) {
			
			check = check + word.substring(x, x + 1);
			
		}
		
		if (word.equals(check)) {
			return true;
		} else {
			return false;
		}
		
	}
	

}
