package com.bug;

import static org.junit.Assert.*;

import org.junit.Test;

public class BugTest {

	@Test
	public void testMoveNorth() {
		Bug bug = new Bug();
		assertEquals(0, bug.getPositionX());
		assertEquals(0, bug.getPositionY());
		bug.move();
		assertEquals(0,bug.getPositionX());
		assertEquals(1,bug.getPositionY());
		assertEquals("NORTH", bug.getDirection());
		System.out.println(bug);
	}

	@Test
	public void testMoveNorthEast() {
		Bug bug = new Bug();
		assertEquals(0, bug.getPositionX());
		assertEquals(0, bug.getPositionY());
		bug.move();
		bug.turnRight();
		bug.move();
		assertEquals(1,bug.getPositionX());
		assertEquals(1,bug.getPositionY());
		assertEquals("EAST", bug.getDirection());
		System.out.println(bug);
	}

	@Test
	public void testMoveNorthWest() {
		Bug bug = new Bug();
		assertEquals(0, bug.getPositionX());
		assertEquals(0, bug.getPositionY());
		bug.move();
		bug.turnLeft();
		bug.move();
		assertEquals(-1,bug.getPositionX());
		assertEquals(1,bug.getPositionY());
		assertEquals("WEST", bug.getDirection());
		System.out.println(bug);
	}

	@Test
	public void testMoveNorthWestSouthEast() {
		Bug bug = new Bug();
		assertEquals(0, bug.getPositionX());
		assertEquals(0, bug.getPositionY());
		bug.move();
		bug.turnLeft();
		bug.turnLeft();
		bug.turnLeft();
		bug.turnLeft();
		bug.move();
		assertEquals(0,bug.getPositionX());
		assertEquals(2,bug.getPositionY());
		assertEquals("NORTH", bug.getDirection());
		System.out.println(bug);
	}
	
}
