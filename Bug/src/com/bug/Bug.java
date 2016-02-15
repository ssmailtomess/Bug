package com.bug;

public class Bug {
	
	int x;
	int y;
	int direction;
	
	public Bug() {
		this(0,0);
	}
	
	// places the bug at initial position
	public Bug(int initX, int initY) {
		x = initX;
		y = initY;
		direction = 0;
	}

	// turn right by 90 degrees
	public void turnRight() {
		direction = (direction + 1) %4;
	}
	
	// turn left by 90 degrees
	public void turnLeft() {
		direction = (direction - 1);
		direction = direction < 0 ? 3 : direction;
	}
	
	// move in current direction by 1 unit
	public void move() {
	 switch(direction) {
	 case 0:
		 y++;
		 break;
	 case 2:
		 y--;
		 break;
	 case 1:
		 x++;
		 break;
	 case 3:
		 x--;
		 break;
	 }
	}
	
	// get X position
	public int getPositionX() {
		return x;
	}
	
	// get Y position
	public int getPositionY() {
		return y;
	}
	
	// returns the direction (e.g. east)
	public String getDirection() {
		return Direction.getDirection(direction).name();
	}

	@Override
	public String toString() {
		return String.format("x=%d,y=%d,Direction=%s",x,y,getDirection());
	}	
}
