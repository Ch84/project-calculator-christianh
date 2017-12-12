package assignment05.project_calculator_christianh;

import static org.junit.Assert.*;

import org.junit.Test;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

/**
 * This is my test class for my basic calculator. Here I have performed my test cases for each
 * of the operations performed in the basic calculator part of the calculator program.
 * 
 * @author Christian Hall
 * @version 1.0
 * @since 2017-12-12
 * 
 */


public class CalculatorBasicOperationsTest {
	/**
	 * This is my constructor on which I call on my super class CalculatorBasicOperations to be
	 * able to perform the basic operations. I also have the classes random and decimal format to
	 * be able to test random values and format the decimals.
	 * 
	 * {@code CalculatorBasicOperations calculator = new CalculatorBasicOperations();}
	 * {@code Random random = new Random();}
	 * {@code DecimalFormat df = new DecimalFormat();}
	 */
	CalculatorBasicOperations calculator = new CalculatorBasicOperations();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();
	/**
	 * This is the class log which I use to be able to log my tests.
	 * 
	 * {@code public static final Logger LOG = Logger.getLogger(CalculatorBasicOperationsTest.class.getName());}
	 */
	public static final Logger LOG = Logger.getLogger(CalculatorBasicOperationsTest.class.getName());
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method addition with positive random numbers.
	 *
	 */ 
	@Test
	public void testAdditionWithPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for (int k=0; k<50; k++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*100));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*100));
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method addition with: " + firstNumber + secondNumber);
			assertEquals(Math.round(calculator.addition(firstNumber, secondNumber)), Math.round(result), 1);
		} 
		
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method addition with negative random numbers.
	 * 
	 */ 
	@Test
	public void testAdditionWithNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for (int k=0; k<50; k++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*-100));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*-100));
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method addition with: " + firstNumber + secondNumber);
			assertEquals(Math.round(calculator.addition(firstNumber, secondNumber)), Math.round(result), 1);
			
			}
		}
		/**
		 * This is my constructor without any in parameters. In the body I use the variables
		 * value and result within a for loop that is repeating 50 times of the performed test.
		 * Testing the method addition with zero random numbers.
		 * 
		 */ 
		@Test
		public void testAdditionWithZero() {
			double firstNumber = 0;
			double secondNumber = 0;
			double result = 0;
			
			LOG.info("Testing the method addition with: " + firstNumber + secondNumber);
			assertEquals(Math.round(calculator.addition(firstNumber, secondNumber)), Math.round(result), 1);
			
			for (int k=0; k<50; k++) {
				firstNumber = 0;
				secondNumber = Double.valueOf(df.format(random.nextDouble()*100));
				result = firstNumber + secondNumber;
				
				LOG.info("Testing the method addition with: " + firstNumber + secondNumber);
				assertEquals(Math.round(calculator.addition(firstNumber, secondNumber)), Math.round(result), 1);
				
			}
			firstNumber = Double.valueOf(df.format(random.nextDouble()*100));
			secondNumber = 0;
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method addition with: " + firstNumber + secondNumber);
			assertEquals(Math.round(calculator.addition(firstNumber, secondNumber)), Math.round(result), 1);
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method subtraction with positive random numbers.
	 * 
	 */ 
	@Test
	public void testSubtractionWithPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for (int k=0; k<50; k++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*10));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method subtraction with: " + firstNumber + secondNumber);
			assertEquals(Math.round(calculator.subtraction(firstNumber, secondNumber)), Math.round(result), 1);
			
		}
		
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method subtraction with negative random numbers.
	 * 
	 */ 
	@Test
	public void testSubtractionWithNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for (int k=0; k<50; k++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*-10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*-10));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method subtraction with: " + firstNumber + secondNumber);
			assertEquals(Math.round(calculator.subtraction(firstNumber, secondNumber)), Math.round(result), 1);
			
		}
		
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method subtraction with zero random numbers.
	 * 
	 */ 
	@Test 
	public void testSubtractionWithZero() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = firstNumber - secondNumber;
		
		LOG.info("Testing the method subtraction with: " + firstNumber + secondNumber);
		assertEquals(Math.round(calculator.subtraction(firstNumber, secondNumber)), Math.round(result), 1);
		
		for (int k=0; k<50; k++) {
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble()*10));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method subtraction with: " + firstNumber + secondNumber);
			assertEquals(Math.round(calculator.subtraction(firstNumber, secondNumber)), Math.round(result), 1);
			
		}
		firstNumber = Double.valueOf(df.format(random.nextDouble()*10));
		secondNumber = 0;
		result = firstNumber - secondNumber;
		
		LOG.info("Testing the method subtraction with: " + firstNumber + secondNumber);
		assertEquals(Math.round(calculator.subtraction(firstNumber, secondNumber)), Math.round(result), 1);
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method multiplication with positive random numbers.
	 * 
	 */ 
	@Test
	public void testMultiplicationWithPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for (int k=0; k<50; k++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			result = firstNumber * secondNumber;
			
			LOG.info("Testing the method multiplication with: " + firstNumber + secondNumber);
			assertEquals(Math.round(calculator.multiplication(firstNumber, secondNumber)), Math.round(result), 1);
		
		}
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method multiplication with negative random numbers.
	 * 
	 */ 
	@Test
	public void testMultiplicationWithNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for (int k=0; k<50; k++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*-1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*-1000));
			result = firstNumber * secondNumber;
			
			LOG.info("Testing the method multiplication with: " + firstNumber + secondNumber);
			assertEquals(Math.round(calculator.multiplication(firstNumber, secondNumber)), Math.round(result), 1);
			
		}
		
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method multiplication with zero random numbers.
	 * 
	 */ 
	@Test
	public void testMultiplicationWithZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		LOG.info("Testing the method multiplication with: " + firstNumber + secondNumber);
		assertEquals(Math.round(calculator.multiplication(firstNumber, secondNumber)), Math.round(result), 1);
		
		for (int k=0; k<50; k++) {
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			result = firstNumber * secondNumber;
			
			LOG.info("Testing the method multiplication with: " + firstNumber + secondNumber);
			assertEquals(Math.round(calculator.multiplication(firstNumber, secondNumber)), Math.round(result), 1);
		}
		firstNumber = Double.valueOf(df.format(random.nextDouble()*1000));
		secondNumber = 0;
		result = firstNumber * secondNumber;
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method division with positive random numbers.
	 * 
	 */ 
	@Test
	public void testDivisionWithPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for (int k=0; k<50; k++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method division with: " + firstNumber + secondNumber);
			assertEquals(Math.round(calculator.division(firstNumber, secondNumber)), Math.round(result), 1);
			
		}
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method division with negative random numbers.
	 * 
	 */ 
	@Test
	public void testDivisionWithNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for (int k=0; k<50; k++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*-1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*-1000));
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method division with: " + firstNumber + secondNumber);
			assertEquals(Math.round(calculator.division(firstNumber, secondNumber)), Math.round(result), 1);
			
			
		}
		
	}
	/**
	 * This is my constructor without any in parameters. In the body I use the variables
	 * value and result within a for loop that is repeating 50 times of the performed test.
	 * Testing the method division with zero random numbers.
	 * 
	 */ 
	@Test
	public void testDivisionWithZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		LOG.info("Testing the method division with: " + firstNumber + secondNumber);
		assertEquals(Math.round(calculator.division(firstNumber, secondNumber)), Math.round(result), 1);
		
		for (int k=0; k<50; k++) {
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method division with: " + firstNumber + secondNumber);
			assertEquals(Math.round(calculator.division(firstNumber, secondNumber)), Math.round(result), 1);
		}
		firstNumber = Double.valueOf(df.format(random.nextDouble()*1000));
		secondNumber = 0;
		result = firstNumber / secondNumber;
		
		LOG.info("Testing the method division with: " + firstNumber + " and "+ secondNumber);
		assertEquals(Math.round(calculator.division(firstNumber, secondNumber)), -0.123456789, 1);
	}   
}


