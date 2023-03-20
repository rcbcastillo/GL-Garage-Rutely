package com.qa.garage.vehicle;

public class Car extends Vehicle {
	public final int id;

	public Car(int numWheels, String colour) {
		super(numWheels, colour);
		this.id = count;
	}

	@Override
	public int calcBill() {
		return 10;
	}

	@Override
	public String toString() {
		return "Car [numWheels=" + this.getNumWheels() + ", colour=" + this.getColour() + "]";
	}
}
