package assignment05.project_calculator_christianh;

public class CalculatorAdvancedOperations implements CalculatorAdvancedOperationsInterface {

	public double square(double value) {
		
		return Math.pow(value, 2);
	}

	public double random(double value) {
		
		return (Math.random() * (value - value) + value);
	}

	public double absoluteValue(double value) {
		
		return Math.abs(value);
	}

	public double log(double value) {
		
		return Math.log(value);
	}

	public double toDegrees(double value) {
		
		return Math.toDegrees(value);
	}

	public double toRadians(double value) {
		
		return Math.toRadians(value);
	}
	
}

