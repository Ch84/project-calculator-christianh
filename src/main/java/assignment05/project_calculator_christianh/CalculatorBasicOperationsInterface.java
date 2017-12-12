package assignment05.project_calculator_christianh;

/**
 * This is my interface to my basic calculator. The following operations below is needed to be able
 * to use in my super class file for my interface.
 * 
 * @author Christian Hall
 * @version 1.0
 * @since 2017-12-12
 *
 */

public interface CalculatorBasicOperationsInterface {
	
	/**
	 * This is my constructor for the four calculation methods addition,
	 * subtraction, multiplication and division.
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 */
	public double addition(double firstNumber, double secondNumber);
	public double subtraction(double firstNumber, double secondNumber);
	public double multiplication(double firstNumber, double secondNumber);
	public double division(double firstNumber, double secondNumber);
		
	}

