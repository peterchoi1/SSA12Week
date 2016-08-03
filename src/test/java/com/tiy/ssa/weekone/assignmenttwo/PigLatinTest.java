package com.tiy.ssa.weekone.assignmenttwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PigLatinTest {

	@Test
	public void test() {
		assertEquals("appyhay", new PigLatin("happy").translateToPigLatin());
		assertEquals("appyhay ildchay awesomeway", new PigLatin("happy child awesome").translateToPigLatin());
		assertEquals("igpay atinlay isway ardhay otay eakspay", new PigLatin("pig latin is hard to speak").translateToPigLatin());
		assertEquals("iway away ildchay", new PigLatin("i a child").translateToPigLatin());
	}

}
