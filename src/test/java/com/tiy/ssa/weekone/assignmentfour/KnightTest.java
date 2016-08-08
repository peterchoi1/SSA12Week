package com.tiy.ssa.weekone.assignmentfour;

import static org.junit.Assert.*;

import org.junit.Test;

public class KnightTest {

	@Test
	public void test() {

		Knight k = new Knight(new Location(0, 0));
		assertEquals(new Location(1, 2), k.move());
		assertEquals(new Location(0, 0), k.goHome());

	}

	public boolean checkArrayListForLegalMoves() {

		Knight j = new Knight(new Location(0, 0));
		j.move();
		j.goHome();

		for (int i = 0; i < j.log.size() - 1; i++) {

			int differenceX = Math.abs(j.log.get(i + 1).x) - Math.abs(j.log.get(i).x);
			int differenceY = Math.abs(j.log.get(i + 1).y) - Math.abs(j.log.get(i).y);

			System.out.println(differenceX + ", " + differenceY);

			if ((differenceX == 1 && differenceY == 2) || (differenceX == 2 && differenceY == 2)) {
				return true;
			}

		}

		return false;

	}

}
