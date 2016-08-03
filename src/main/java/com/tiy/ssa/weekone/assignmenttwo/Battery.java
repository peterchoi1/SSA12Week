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

		if (this.leftOver - minus >= 0) {
			this.leftOver = this.leftOver - minus;

		} else {
			this.leftOver = 0;
		}
		return this.leftOver;

	}

	public float charge(float add) {

		if (this.leftOver + add <= this.capacity) {
			this.leftOver = this.leftOver + add;

		} else {
			this.leftOver = capacity;

		}

		return this.leftOver;
	}

	
	public int howLong(float power) {
		
		
		float timeHour = this.leftOver / power;
		int timeMinute = Math.round(timeHour * 60);
		
		return timeMinute;
		
		
	}
	
	
	public float getCapacity()
	{
		return this.capacity;
	}
	
	
	
	public float getRemaining()
	{
		return this.leftOver;
	}
	

	
	
	@Override
	public String toString() {
		return String.format("Battery(%, f kWh, arg1 ) down to (%,f kWh)", this.capacity, this.leftOver);
	}

}
