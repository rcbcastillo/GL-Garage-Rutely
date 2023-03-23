import com.qa.garage.vehicle.Car;

public class DemoGenerics {

	public static void main(String[] args) {
		// instance of Generic		
		GenericVehicleContainer<Car> formula1 = new GenericVehicleContainer<>();
		
		formula1.setVehicle(new Car(4, "green"));
		Car carFormula1 = formula1.getVehicle();
		System.out.println(carFormula1);
		
		// adding vehicles
		formula1.addVehicle(carFormula1);

	}

}
