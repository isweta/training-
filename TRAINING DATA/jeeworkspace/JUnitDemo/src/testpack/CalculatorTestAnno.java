package testpack;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import mypack.Calculator;

public class CalculatorTestAnno {
	Calculator c;

	@Before
	public void initEnv() {

		System.out.println("Creating Test Environment");
		c = new Calculator();
	}

	@After
	public void closeEnv() {
		System.out.println("Cleaning Test Environment");
	}

	@Test
	public void UTC_01() {
		int input1 = 2;
		int input2 = 3;
		int expected = 5;

		int actual = c.add(input1, input2);
		assertEquals(expected, actual);
	}

	@Test(expected = ArithmeticException.class)
	public void testDiv() {
		int input1 = 2;
		int input2 = 0;
		

		int actual = c.div(input1, input2);
		//assertEquals(expected, actual);
	}
}