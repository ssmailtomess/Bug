package com.bug;

import org.junit.Test;


public class DirectionTest {

	@Test
	public void testDirection() {
		System.out.println(Direction.getDirection(0));
		System.out.println(Direction.getDirection(1));
		System.out.println(Direction.getDirection(2));
		System.out.println(Direction.getDirection(3));
		System.out.println(Direction.values());
	}
}
