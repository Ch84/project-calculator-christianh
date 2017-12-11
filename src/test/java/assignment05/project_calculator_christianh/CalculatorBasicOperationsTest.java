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
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;
		
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
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;
		
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
			double firstNumber = 0.0;
			double secondNumber = 0.0;
			double result = 0.0;
			
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
	}

