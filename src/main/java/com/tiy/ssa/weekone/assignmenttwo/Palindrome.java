package com.tiy.ssa.weekone.assignmenttwo;

public class Palindrome {

	final String word;
	String wordBackwards = "";

	public Palindrome(String word) {
		this.word = word;
	}

	public boolean isPalindrome() {
		char[] chars = word.toCharArray();
		
		for (int i = word.length() - 1; i >= 0; i--) {
			wordBackwards = wordBackwards + chars[i];
		}

		if (word.equals(wordBackwards)) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isPalindromeSubString() {

		for (int x = word.length() - 1; x >= 0; x--) {
			wordBackwards = wordBackwards + word.substring(x, x + 1);
		}

		if (word.equals(wordBackwards)) {
			return true;
		} else {
			return false;
		}

	}

}
