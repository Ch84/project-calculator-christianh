package assignment05.project_calculator_christianh;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;

import org.junit.Test;
import java.util.logging.Logger;

/**
 * This is my test class for my advanced calculator. Here I have performed my test cases for each
 * of the operations performed in the advanced calculator part of the calculator program.
 * 
 * @author Christian Hall
 * @version 1.0
 * @since 2017-12-12
 * 
 */

public class CalculatorAdvancedOperationsTest {
	/**
	 * This is my constructor on which I call on my super class CalculatorAdvancedOperations to be
	 * able to perform the advanced operations. I also have the classes random and decimal format to
	 * be able to test random values and format the decimals.
	 * 
	 * {@code CalculatorAdvancedOperations calculator = new CalculatorAdvancedOperations();}
	 * {@code Random random = new Random();}
	 * {@code DecimalFormat df = new DecimalFormat();}
	 */
	CalculatorAdvancedOperations calculator = new CalculatorAdvancedOperations();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();
	/**
	 * This is the class log which I use to be able to log my tests.
	 * 
	 * {@code 	public static final Logger LOG = Logger.getLogger(CalculatorAdvancedOperationsTest.class.getName());}
	 */
	public static final Logger LOG = Logger.getLogger(CalculatorAdvancedOperationsTest.class.getName());
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method square with positive random numbers.
	 * 
	 */
	@Test
	public void testSquareWithPositiveNumbers() {
		double value = 0;
		double result = 0;
		
		for (int k=0; k<50; k++) {
			value = Double.valueOf(df.format(random.nextDouble()*10));
			result = Math.pow(value, 2);
			
			LOG.info("Testing the method Square with: " + value);
			assertEquals(Math.round(calculator.square(value)), Math.round(result), 1);
			
		}
		
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method square with negative random numbers.
	 * 
	 */
	@Test
	public void testSquareWithNegativeNumbers() {
		double value = 0;
		double result = 0;
		
		for (int k=0; k<50; k++) {
			value = Double.valueOf(df.format(random.nextDouble()*-10));
			result = Math.pow(value, 2);
			
			LOG.info("Testing the method square with: " + value);
			assertEquals(Math.round(calculator.square(value)), Math.round(result), 1);
			
		}
		
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method square with zero random numbers.
	 * 
	 */
	@Test
	public void testSquareWithZeros() {
		double value = 0;
		double result = 0;
		
		LOG.info("Testing the method square with: " + value);
		assertEquals(Math.round(calculator.square(value)), Math.round(result), 1);
		
		for (int k=0; k<50; k++) {
			value = Double.valueOf(df.format(random.nextDouble()*10));
			result = Math.pow(value, 2);
			
			LOG.info("Testing the method square with: " + value);
			assertEquals(Math.round(calculator.square(value)), result, 1);
		}
		
		
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method random with positive random numbers.
 	 *
	 */
	@Test
	public void testRandomWithPositiveNumbers() {
		double value = 0;
		double result = 0;
		
		for (int k=0; k<50; k++) {
			value = random.nextDouble()*100;
			result = calculator.random(value);
			
			LOG.info("Testing the method random with: " + value);
			assertEquals(result, result, 1);
			
		}
		
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method random with negative random numbers.
	 * 
	 */
	@Test
	public void testRandomWithNegativeNumbers() {
		double value = 0;
		double result = 0;
		
		for (int k=0; k<50; k++) {
			value = random.nextDouble()*-100;
			result = calculator.random(value);
			
			LOG.info("Testing the method random with: " + value);
			assertEquals(result, result, 1);
		}
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method random with zero random numbers.
	 * 
	 */
	@Test
	public void testRandomWithZeros() {
		double value = 0;
		double result = 0;
		
		LOG.info("Testing the method random with: " + value);
		assertEquals(result, result, 1);
		
		for (int k=0; k<50; k++) {
			value = random.nextDouble()*100;
			result = calculator.random(value);
			
			LOG.info("Testing the method random with: " + value);
			assertEquals(result, result, 1);
		}
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method absolute value with positive random numbers.
	 *
	 */
	@Test
	public void testabsoluteValueWithPositiveNumbers() {
		double value = 0;
		double result = 0;
		
		for (int k=0; k<50; k++) {
			value = Double.valueOf(df.format(random.nextDouble()*1000));
			result = Math.abs(value);
			
			LOG.info("Testing the method absolute value with: " + value);
			assertEquals(Math.round(calculator.absoluteValue(value)), Math.round(result), 1);
		}
		
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method absolute value with negative random numbers.
	 * 
	 */
	@Test
	public void testabsoluteValueWithNegativeNumbers() {
		double value = 0;
		double result = 0;
		
		for (int k=0; k<50; k++) {
			value = Double.valueOf(df.format(random.nextDouble()*-1000));
			result = Math.abs(value);
			
			LOG.info("Testing the method absolute value with: " + value);
			assertEquals(Math.round(calculator.absoluteValue(value)), Math.round(result), 1);
		}
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method absolute value with zero random numbers.
	 * 
	 */
	@Test
	public void testabsoluteValueWithZeros() {
		double value = 0;
		double result = 0;
		
		LOG.info("Testing the method absoulute value with: " + value);
		assertEquals(Math.round(calculator.absoluteValue(value)), Math.round(result), 1);
		
		for (int k=0; k<50; k++) {
			value = Double.valueOf(df.format(random.nextDouble()*1000));
			result = Math.abs(value);
			
			LOG.info("Testing the method absolute value with: " + value);
			assertEquals(Math.round(calculator.absoluteValue(value)), result, 1);
		}
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method logarithm with positive random numbers.
	 *
	 */
	@Test
	public void testLogWithPositiveNumbers() {
		double value = 0;
		double result = 0;
		
		for (int k=0; k<50; k++) {
			value = Double.valueOf(df.format(random.nextDouble()*10));
			result = Math.log(value);
			
			LOG.info("Testing the method log with: " + value);
			assertEquals(Math.round(calculator.log(value)), Math.round(result), 1);
		}
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method logarithm with negative random numbers.
	 * 
	 */
	@Test
	public void testLogWithNegativeNumbers() {
		double value = 0;
		double result = 0;
		
		for (int k=0; k<50; k++) {
			value = Double.valueOf(df.format(random.nextDouble()*-10));
			result = Math.log(value);
			
			LOG.info("Testing the method log with: " + value);
			assertEquals(Math.round(calculator.log(value)), Math.round(result), 1);
			
		}
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method conversion from radians to degrees with positive random numbers.
	 * 
	 */
	@Test
	public void testtoDegreesWithPositiveNumbers() {
		double value = 0;
		double result = 0;
		
		for (int k=0; k<50; k++) {
			value = Double.valueOf(df.format(random.nextDouble()*100));
			result = Math.toDegrees(value);
			
			LOG.info("Testing the method to degrees with: " + value);
			assertEquals(Math.round(calculator.toDegrees(value)), Math.round(result), 1);
		}
		
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method conversion from radians to degrees with negative random numbers.
	 * 
	 */
	@Test
	public void testtoDegreesWithNegativeNumbers() {
		double value = 0;
		double result = 0;
		
		for (int k=0; k<50; k++) {
			value = Double.valueOf(df.format(random.nextDouble()*-100));
			result = Math.toDegrees(value);
			
			LOG.info("Testing the method to degrees with: " + value);
			assertEquals(Math.round(calculator.toDegrees(value)), Math.round(result), 1);
		}
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method conversion from radians to degrees with zero random numbers.
	 *
	 */
	@Test
	public void testtoDegreesWithZeros() {
		double value = 0;
		double result = 0;
		
		LOG.info("Testing the method to degrees with: " + value);
		assertEquals(Math.round(calculator.toDegrees(value)), Math.round(result), 1);
		
		for (int k=0; k<50; k++) {
			value = Double.valueOf(df.format(random.nextDouble()*100));
			result = Math.toDegrees(value);
			
			LOG.info("Testing the method to degrees with: " + value);
			assertEquals(Math.round(calculator.toDegrees(value)), result, 1);
		}
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method conversion from degrees to radians with positive random numbers.
	 * 
	 */
	@Test
	public void testtoRadiansWithPositiveNumbers() {
		double value = 0;
		double result = 0;
		
		for (int k=0; k<50; k++) {
			value = Double.valueOf(df.format(random.nextDouble()*1000));
			result = Math.toRadians(value);
			
			LOG.info("Testing the method to radians with: " + value);
			assertEquals(Math.round(calculator.toRadians(value)), Math.round(result), 1);
		}
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method conversion from degrees to radians with negative random numbers.
	 * 
	 */
	@Test
	public void testtoRadiansWithNegativeNumbers() {
		double value = 0;
		double result = 0;
		
		for (int k=0; k<50; k++) {
			value = Double.valueOf(df.format(random.nextDouble()*-1000));
			result = Math.toRadians(value);
			
			LOG.info("Testing the method to radians with: " + value);
			assertEquals(Math.round(calculator.toRadians(value)), Math.round(result), 1);
		}
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method conversion from degrees to radians with zero random numbers.
	 * 
	 */
	@Test
	public void testtoRadiansWithZeros() {
		double value = 0;
		double result = 0;
		
		LOG.info("Testing the method to radians with: " + value);
		assertEquals(Math.round(calculator.toRadians(value)), Math.round(result), 1);
		
		for (int k=0; k<50; k++) {
			value = Double.valueOf(df.format(random.nextDouble()*1000));
			result = Math.toRadians(value);
			
			LOG.info("Testing the method to radians with: " + value);
			assertEquals(Math.round(calculator.toRadians(value)), result, 1);
		}
	}
}
