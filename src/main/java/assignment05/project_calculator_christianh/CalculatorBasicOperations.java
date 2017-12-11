package assignment05.project_calculator_christianh;

public class CalculatorBasicOperations implements CalculatorBasicOperationsInterface {

	public double addition(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
		
	}

	public double subtraction(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
		
	}

	public double multiplication(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
		
	}

	public double division(double firstNumber, double secondNumber) {
		
		if (secondNumber == 0) {
			System.out.println("Division by zero?");
			return -0.123456789;
		}
		return firstNumber / secondNumber;		
	}

}
