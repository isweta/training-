package primeCheck;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrimeNumberCheckerTest {
	
		int inputNumber=19;
		Boolean expectedResult=true;
	
	   @Test
	   public void testPrimeNumberChecker() {
	      
	      assertEquals(expectedResult, 
	      PrimeNumberChecker.validate(inputNumber));
	   }


}
