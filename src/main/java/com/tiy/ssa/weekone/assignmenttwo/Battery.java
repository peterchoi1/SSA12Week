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

	public float discharge(float minus, float leftOver) {

		if (leftOver - minus >= 0) {
			leftOver = leftOver - minus;

		} else {
			leftOver = 0;
		}
		return leftOver;

	}

	public float charge(float add, float leftOver) {

		if (leftOver + add <= this.capacity) {
			leftOver = leftOver + add;

		} else {
			leftOver = capacity;

		}

		return leftOver;
	}

	
	public float howLong(float power, float leftOver) {
		
		
		float timeHour = leftOver / power;
		float timeMinute = timeHour * 60;
		
		return timeMinute;
		
		
	}
	
	
	

	
	
	@Override
	public String toString() {
		return String.format("Battery(%, f kWh, arg1 ) down to (%,f kWh)", this.capacity, this.leftOver);
	}

}