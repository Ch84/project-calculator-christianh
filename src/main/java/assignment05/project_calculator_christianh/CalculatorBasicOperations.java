package assignment05.project_calculator_christianh;

/**
 * This is my super class file for my interface. Here I have implemented my methods from my interface and
 * the functions for my basic calculator that is used down below.
 * 
 * @author Christian Hall
 * @version 1.0
 * @since 2017-12-12
 *
 */

public class CalculatorBasicOperations implements CalculatorBasicOperationsInterface {
	/**
	 * This is my constructor which takes the in parameters firstNumber and
	 * secondNumber and then returns the result of the entered values that is
	 * going to be summed.
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return firstNumber + secondNumber
	 */
	public double addition(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
		
	}
	/**
	 * This is my constructor which takes the in parameters firstNumber
	 * and secondNumber and then returns the result of the entered values
	 * that is going to be subtracted.
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return firstNumber - secondNumber
	 */
	public double subtraction(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
		
	}
	/**
	 * This is my constructor which takes the in parameters firstNumber
	 * and secondNumber and then returns the result of the entered values
	 * that is going to be multiplied.
	 *
	 * @param firstNumber
	 * @param secondNumber
	 * @return firstNumber * secondNumber
	 */
	public double multiplication(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
		
	}
	/**
	 * This is my constructor which takes the in parameters firstNumber
	 * and secondNumber and then returns the result of the entered values
	 * that is going to be divided. Here I also have used a special case.
	 * I have written an if state that takes the condition if secondNumber is
	 * equal to 0, then it must return the value -0.123456789. This method is 
	 * needed in order to be able to handle division by zero, since you cannot
	 * divide anything by zero and the program will crash if not handled.
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return firstNumber / secondNumber
	 */
	public double division(double firstNumber, double secondNumber) {
		
		if (secondNumber == 0) {
			System.out.println("Division by zero?");
			return -0.123456789;
		}
		return firstNumber / secondNumber;		
	}

}
