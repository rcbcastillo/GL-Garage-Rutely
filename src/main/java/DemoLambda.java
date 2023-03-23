
public class DemoLambda {

	public static void main(String[] args) {
		
		/* add */		
		FunctionalCalculator.Operation add = (int x, int y) -> x + y;
		System.out.println("Sum: ");
        System.out.println(add.calculation(50,10));
        
        /*  subtract */        
        FunctionalCalculator.Operation subtract = (int x, int y) -> x - y;
        System.out.println("Subtract: ");
        System.out.println(subtract.calculation(50,10));
        
        /*  multiply */        
        FunctionalCalculator.Operation multiply = (int x, int y) -> x * y;
        System.out.println("Multiply: ");
        System.out.println(multiply.calculation(50,10));
        
        /*  divide*/        
        FunctionalCalculator.Operation divide = (int x, int y) -> x / y;
        System.out.println("Divide: ");
        System.out.println(divide.calculation(50,10));
        
        

	}

}
