package com.tiy.ssa.weekone.assignmentfour;

public class Location {

	public final int x, y;
	
	public Location(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Location other = (Location) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	public Location offset(int x, int y)
	{
		return new Location(this.x + x, this.y + y);
	}

}
