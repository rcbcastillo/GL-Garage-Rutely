package com.qa.garage;

import com.qa.garage.vehicle.Bike;
import com.qa.garage.vehicle.Boat;
import com.qa.garage.vehicle.Car;
import com.qa.garage.vehicle.Vehicle;

public class Runner {
		

	public static void main(String[] args) {
		Garage g = new Garage();
		
		Vehicle car1 = new Car(4, "Black");
		g.addVehicle(car1);
		Vehicle.counter();
		Vehicle boat1 = new Boat(0, "Blue");
		g.addVehicle(boat1);
		Vehicle.counter();
		Vehicle bike1= new Bike(2, "Red");
		g.addVehicle(bike1);
		Vehicle.counter();
		Vehicle bike2 = new Car(3, "red");
		g.addVehicle(bike2);
		Vehicle.counter();
		
//		g.addVehicle(new Boat(0, "Blue"));
//		g.addVehicle(new Bike(2, "Red"));
//		g.addVehicle(new Car(3, "red"));
		
		

		System.out.println(Vehicle.count);
		System.out.println();
		System.out.println();

//		g.removeByType("car");
		g.remove(Car.class);
		System.out.println(g);
	}

}
