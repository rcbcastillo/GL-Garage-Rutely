package com.qa.garage.vehicle;

public class Boat extends Vehicle {
	public final int id;

	public Boat(int numWheels, String colour) {
		super(numWheels, colour);
		this.id = count;
	}

	@Override
	public int calcBill() {
		return 15;
	}

	@Override
	public String toString() {
		return "Boat [numWheels=" + this.getNumWheels() + ", colour=" + this.getColour() + "]";
	}
}
