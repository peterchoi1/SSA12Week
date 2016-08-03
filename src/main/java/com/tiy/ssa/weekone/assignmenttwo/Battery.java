package com.tiy.ssa.weekone.assignmenttwo;

public class Battery {

	// in kWh
	final float capacity;
	// in kWh
	float leftOver;

	public Battery(float capacity) {
		this.capacity = capacity;
		this.leftOver = capacity;
	}

	public float discharge(float minus) {

		if (leftOver - minus >= 0) {
			leftOver = leftOver - minus;

		} else {
			leftOver = 0;
		}
		return leftOver;

	}

	public float charge(float add) {

		if (leftOver + add <= capacity) {
			leftOver = leftOver + add;

		} else {
			leftOver = capacity;

		}

		return leftOver;
	}

	
	public int howLong(float power) {
		
		
		float timeHour = leftOver / power;
		int timeMinute = Math.round(timeHour * 60);
		
		return timeMinute;
		
		
	}
	
	
	public float getCapacity()
	{
		return capacity;
	}
	
	
	
	public float getRemaining()
	{
		return leftOver;
	}
	

	
	
	@Override
	public String toString() {
		return String.format("Battery(%, f kWh, arg1 ) down to (%,f kWh)", this.capacity, this.leftOver);
	}

}
