
public class FunctionalCalculator  {
	
 	@FunctionalInterface
 	interface Operation {
 		int calculation(int a, int b);
 	}

 	public int operate(int a, int b, Operation operation) {
		return operation.calculation(a, b);
	}
}
