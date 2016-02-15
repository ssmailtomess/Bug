package com.bug;

public enum Direction {

//	NORTH, EAST, SOUTH, WEST;

	
	
	NORTH(0), EAST(1), SOUTH(2), WEST(3);

	private int value;

	private Direction(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	public static Direction getDirection(int value) {
		for(Direction direction : Direction.values()) {
			if(direction.getValue() == value)
				return direction;
		}
		return null;
	}
}
