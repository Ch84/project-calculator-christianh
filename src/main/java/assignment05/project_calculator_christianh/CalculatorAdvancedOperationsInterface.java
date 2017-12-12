package assignment05.project_calculator_christianh;

/**
 * This is my interface for my advanced calculator. The operations below is used later
 * in my super class file.
 * 
 * 
 * @author Christian Hall
 * @version 1.0
 * @since 2017-12-12
 *
 */

public interface CalculatorAdvancedOperationsInterface {
	/**
	 * This is my constructor for the six calculation methods
	 * square, random, absolute value, logarithms, from radians to degrees
	 * and from degrees to radians.
	 *
	 * @param value
	 */
	public double square(double value);
	public double random(double value);
	public double absoluteValue(double value);
	public double log(double value);
	public double toDegrees(double value);
	public double toRadians(double value);

}
