package com.qa.garage.vehicle;

public class Bike extends Vehicle {
	public final int id;

	public Bike(int numWheels, String colour) {
		super(numWheels, colour);
		this.id = count;
	}

	@Override
	public int calcBill() {
		return 31;
	}

	@Override
	public String toString() {
		return "Bike [numWheels=" + this.getNumWheels() + ", colour=" + this.getColour() + "]";
	}

}