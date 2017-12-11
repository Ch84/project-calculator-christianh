package assignment05.project_calculator_christianh;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;

import org.junit.Test;
import java.util.logging.Logger;

public class CalculatorAdvancedOperationsTest {
	CalculatorAdvancedOperations calculator = new CalculatorAdvancedOperations();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();
	
	public static final Logger LOG = Logger.getLogger(CalculatorAdvancedOperationsTest.class.getName());

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
	@Test
	public void testRandomWithPositiveNumbers() {
		double value = 0;
		double result = 0;
		
		for (int k=0; k<50; k++) {
			value = Double.valueOf(df.format(random.nextDouble()*100));
			result = (Math.random() * (value - value) + value);
			
			LOG.info("Testing the method random with: " + value);
			assertEquals(Math.round(calculator.random(value)), Math.round(result), 1);
			
		}
		
	}
	@Test
	public void testRandomWithNegativeNumbers() {
		double value = 0;
		double result = 0;
		
		for (int k=0; k<50; k++) {
			value = Double.valueOf(df.format(random.nextDouble()*-100));
			result = (Math.random() * (value - value) + value);
			
			LOG.info("Testing the method random with: " + value);
			assertEquals(Math.round(calculator.random(value)), Math.round(result), 1);
		}
	}
	@Test
	public void testRandomWithZeros() {
		double value = 0;
		double result = 0;
		
		LOG.info("Testing the method random with: " + value);
		assertEquals(Math.round(calculator.random(value)), Math.round(result), 1);
		
		for (int k=0; k<50; k++) {
			value = Double.valueOf(df.format(random.nextDouble()*100));
			result = (Math.random() * (value - value) + value);
			
			LOG.info("Testing the method random with: " + value);
			assertEquals(Math.round(calculator.random(value)), result, 1);
		}
	}
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
