package com.tiy.ssa.weekone.assignmenttwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void test() {
		assertEquals(true, new Palindrome("racecar").isPalindrome());
		assertEquals(false, new Palindrome("testing").isPalindrome());
		assertEquals(true, new Palindrome("bab").isPalindrome());
		assertEquals(false, new Palindrome("ab").isPalindrome());
		
		assertEquals(true, new Palindrome("racecar").isPalindromeSubString());
		assertEquals(true, new Palindrome("bab").isPalindromeSubString());
		assertEquals(false, new Palindrome("ab").isPalindromeSubString());
		assertEquals(false, new Palindrome("testing").isPalindromeSubString());
	}
}