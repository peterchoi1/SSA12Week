package com.tiy.ssa.weekone.assignmenttwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class BatteryTest {

	@Test
	public void test() {
		//assertEquals(0, new Battery(0).discharge(100), 0);
		//assertEquals(100, new Battery(0).charge(10, 100), 0);
	}

	@Test
	/* public void sanity() {
		assertEquals("", 0F, new Battery(150F).discharge(150F, 100F), 0);
		
		assertEquals("", 150F, new Battery(150F).charge(100000F, 100F), 0);
		
		System.err.println(new Battery(125.5F));
		
		assertEquals("", 1200, new Battery(150F).howLong(5F, 100F), 0);
		assertEquals("", 80F, new Battery(150F).howLong(75F, 100F), 0);
		
		assertEquals("", 100, new Battery(100F).getCapacity(), 0);
		
		assertEquals("", 50, new Battery(50F).getRemaining(), 0);
	}
*/
	public void newTests() {
		
		Battery b = new Battery(150F);
		assertEquals(0F, b.discharge(10000F), 0);
		assertEquals(150F, b.charge(100000F), 0);
		assertEquals(18, b.howLong(500F), 0);
		assertEquals(150F, b.getCapacity(), 0);
		assertEquals(50F, b.discharge(100F), 0);
		assertEquals(50F, b.getRemaining(), 0);
		
		
	}
	
	
	
}
