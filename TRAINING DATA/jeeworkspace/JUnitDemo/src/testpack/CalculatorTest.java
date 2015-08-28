package testpack;

import mypack.Calculator;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase{
	Calculator c;
	@Override
	public void setUp(){
		
		System.out.println("Creating Test Environment");
		c=new Calculator();
	}
	
	@Override
	public void tearDown(){
		System.out.println("Cleaning Test Environment");
	}
	
	public void testUTC_01(){
		int input1=2;
		int input2=3;
		int expected=5;
		
		int actual=c.add(input1, input2);
		assertEquals(expected, actual);
	}
	
	public void testUTC_02(){
		int input1=-2;
		int input2=-2;
		int expected=-4;
		
		int actual=c.add(input1, input2);
		assertEquals(expected, actual);
	}
}
