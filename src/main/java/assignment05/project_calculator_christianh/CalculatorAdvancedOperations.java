package assignment05.project_calculator_christianh;

import java.util.Random;

/**
 * This is my super class file for my interface. Here I have implemented
 * the functions for my advanced calculator that is used down below.
 * 
 * 
 * @author Christian Hall
 * @version 1.0
 * @since 2017-12-12
 *
 */

public class CalculatorAdvancedOperations implements CalculatorAdvancedOperationsInterface {
	/**
	 * This is my constructor that takes the in parameter value
	 * and returns the result of the value that is entered. The result
	 * is that it raises the value entered to the power of 2.
	 * 
	 * 
	 * @param value
	 * @return Math.pow(value, 2)
	 */
	public double square(double value) {
		
		return Math.pow(value, 2);
	}
	/**
	 * This is my constructor that takes the in parameter value
	 * and returns the result of the value that is entered. The result
	 * is returning a double between the specified values.
	 * 
	 * @param value
	 * @return (Math.random() * (value - value) + value)
	 */
	public double random(double value) {
		Random random = new Random();
		
		return random.nextDouble() * value;
	}
	/**
	 * This is my constructor that takes the in parameter value
	 * and returns the result of the value that is entered. The
	 * returned result of the calculation of the absolute value.
	 * 
	 * @param value
	 * @return Math.abs(value)
	 */
	public double absoluteValue(double value) {
		
		return Math.abs(value);
	}
	/**
	 * This is my constructor that takes the in parameter value
	 * and returns the result of the value that is entered. The
	 * returned result of the calculated logarithm of the value.
	 * 
	 * @param value
	 * @return Math.log(value)
	 */
	public double log(double value) {
			
			return Math.log(value);
	}
	/**
	 * This is my constructor that takes the in parameter value
	 * and returns the result of the value that is entered. The
	 * returned result of the calculated conversion between radians
	 * and degrees.
	 * 
	 * @param value
	 * @return Math.toDegrees(value)
	 */
	public double toDegrees(double value) {
		
		return Math.toDegrees(value);
	}
	/**
	 * This is my constructor that takes the in parameter value
	 * and returns the result of the value that is entered. The
	 * returned result of the calculated conversion between degrees
	 * and radians.
	 * 
	 * @param value
	 * @return Math.toRadians(value)
	 */
	public double toRadians(double value) {
		
		return Math.toRadians(value);
	}
	
}

