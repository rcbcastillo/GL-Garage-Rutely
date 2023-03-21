package com.qa.garage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.qa.garage.vehicle.Bike;
import com.qa.garage.vehicle.Boat;
import com.qa.garage.vehicle.Car;
import com.qa.garage.vehicle.Vehicle;

import interfacegarage.Billable;
import vehicles.VehicleNotFoundException;

public class Runner {
	static Scanner scan = new Scanner(System.in);
	
	static List<Billable> billableObjects = new ArrayList<>();
	
	public static void main(String[] args) throws VehicleNotFoundException {
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
		
		// calling findById method
		// I was prompted to add throws VehicleNotFoundException in main
		System.out.println("-------------------");
		System.out.println(" Calling findById method 1) id (must be integer) 2) \"q\" to quit");
		try {
			while (true) {
				try {
					System.out.println(" Enter an id: ");
					String userInputStr = scan.nextLine();
					
					// to end the game enter "q"
		        	if (userInputStr.equals("q")) {
		        		System.out.println("Make sure you saved your information!");
		        		break;
		        	}
			        
				    int userInput = Integer.valueOf(userInputStr);
					System.out.println(g.findById(userInput) + "<-- Find by Id");
					
				} catch (Exception e) {
					System.out.println("Error found" + e);;
				}
			}
		} finally {
			scan.close();
		}

		
	
	}

}
