import com.qa.garage.vehicle.Vehicle;

public class GenericVehicleContainer <T extends Vehicle> {
	
	private T vehicle;
	
	public T getVehicle() {
		return this.vehicle;
	}
	
	public void setVehicle(T vehicle) {
		this.vehicle = vehicle;
	}

}
