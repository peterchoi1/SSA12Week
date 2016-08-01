package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.*;

import org.junit.Test;

public class PowerTest {

	@Test
	public void test() {
		assertEquals(2, new Power().powerOne(2));
		assertEquals(4, new Power().powerTwo(2));
		assertEquals(8, new Power().powerThree(2));
		assertEquals(16, new Power().powerFour(2));
		assertEquals(32, new Power().powerFive(2));
	
	}

}
