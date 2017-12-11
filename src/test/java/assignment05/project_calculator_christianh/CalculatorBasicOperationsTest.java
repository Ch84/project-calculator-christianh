package assignment05.project_calculator_christianh;

import static org.junit.Assert.*;

import org.junit.Test;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;


public class CalculatorBasicOperationsTest {
	CalculatorBasicOperations calculator = new CalculatorBasicOperations();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();
	
	public static final Logger LOG = Logger.getLogger(CalculatorBasicOperationsTest.class.getName());
	 
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


