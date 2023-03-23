import com.qa.garage.vehicle.Boat;
import com.qa.garage.vehicle.Car;
import com.qa.garage.vehicle.Plane;

import vehicles.VehicleNotFoundException;

public class DemoGenerics {

	public static void main(String[] args) throws VehicleNotFoundException {
		// instance of Generic		
		GenericVehicleContainer<Car> formula1 = new GenericVehicleContainer<>();
		GenericVehicleContainer<Boat> reliance1 = new GenericVehicleContainer<>();
		GenericVehicleContainer<Plane> flying1 = new GenericVehicleContainer<>();
		
		formula1.setVehicle(new Car(4, "green"));
		Car carFormula1 = formula1.getVehicle();
		System.out.println(carFormula1);
		
		
		reliance1.setVehicle(new Boat(1, "white"));
		Boat boat1 = reliance1.getVehicle();
		System.out.println(boat1);
		
		flying1.setVehicle(new Plane(6, "red-white"));
		Plane plane1 = flying1.getVehicle();
		System.out.println(plane1);
		
		
		// adding vehicles
		formula1.addVehicle(carFormula1);
		reliance1.addVehicle(boat1);
		flying1.addVehicle(plane1);
		
		// deleting vehicles
		formula1.remove(8);

	}

}
