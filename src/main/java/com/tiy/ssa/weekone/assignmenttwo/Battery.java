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

	public float discharge(float dischargeAmount) {

		if (leftOver - dischargeAmount >= 0) {
			leftOver = leftOver - dischargeAmount;

		} else {
			leftOver = 0;
		}
		return leftOver;

	}

	public float charge(float chargeAmount) {

		if (leftOver + chargeAmount <= capacity) {
			leftOver = leftOver + chargeAmount;

		} else {
			leftOver = capacity;

		}

		return leftOver;
	}

	
	public int howLong(float power) {
		
		
		 return (int) ((leftOver / power) * 60);
		
		
		
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
