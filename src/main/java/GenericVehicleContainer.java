import java.util.ArrayList;
import java.util.List;

import com.qa.garage.vehicle.Vehicle;

import vehicles.VehicleNotFoundException;

public class GenericVehicleContainer <T extends Vehicle> {
	
	private List<T> vehicles = new ArrayList<>();
	
	private T vehicle;
	
	public T getVehicle() {
		return this.vehicle;
	}
	
	public void setVehicle(T vehicle) {
		this.vehicle = vehicle;
	}
	
	public boolean addVehicle(T vehicle) {
		return this.vehicles.add(vehicle);
	}
	
	public boolean remove(int id) throws VehicleNotFoundException {
		
		for (Vehicle vehicle : this.vehicles) {
			if (vehicle.getId() == id) {
				this.vehicles.remove(vehicle);
				return true;
			}
			throw new VehicleNotFoundException("Id not found");
		}
		return false;
	}

}
