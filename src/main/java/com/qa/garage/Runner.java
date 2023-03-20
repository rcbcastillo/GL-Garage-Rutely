package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.garage.vehicle.Bike;
import com.qa.garage.vehicle.Boat;
import com.qa.garage.vehicle.Car;
import com.qa.garage.vehicle.Vehicle;

import interfacegarage.Billable;

public class Runner {
		
	static List<Billable> billableObjects = new ArrayList<>();
	
	public static void main(String[] args) {
		Garage g = new Garage();
		
		// Create vehicle instances
		
		Vehicle car1 = new Car(4, "Black");
		g.addVehicle(car1);
		billableObjects.add(car1);
	
		Vehicle boat1 = new Boat(0, "Blue");
		g.addVehicle(boat1);
		billableObjects.add(car1);
		
		Vehicle bike1= new Bike(2, "Red");
		g.addVehicle(bike1);
		billableObjects.add(car1);
		
		Vehicle bike2 = new Car(3, "red");
		g.addVehicle(bike2);
		billableObjects.add(car1);
	
		
		// Create employee instances
		
		Employee person1 = new Employee("Anne", 28, "Customer service");
		billableObjects.add(person1);
		
		Employee person2 = new Employee("Jane", 38, "Customer service");
		billableObjects.add(person2);
		

		// Loop through billableObjects
		
		for (Billable item : billableObjects) {
			System.out.println(item.calcBill());
			System.out.println(item);
		}

		
	}

}
