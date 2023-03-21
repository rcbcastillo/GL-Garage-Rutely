package com.qa.garage.vehicle;

import interfacegarage.Billable;

public abstract class Vehicle implements Billable {

	private int numWheels;

	private String colour;

	private final int id;
	
	public static int count =0;

	public Vehicle(int numWheels, String colour) {		
		super();
		this.id = count++;
		this.numWheels = numWheels;
		this.colour = colour;
	
	}

	//public abstract int calcBill();

	public int getId() {
		return this.id;
	}

//	public static int counter() {
//		return count++;
//	}

	public int getNumWheels() {
		return this.numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + this.id + ", numWheels=" + this.numWheels + ", colour=" + this.colour + "]";
	}

}
