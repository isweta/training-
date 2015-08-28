import org.tempuri.Service1;
import org.tempuri.Service1Soap;





public class AccessServiceClient {

	public static void main(String[] args) {
		Service1 cs=new Service1();
		Service1Soap c=cs.getService1Soap();
		System.out.println(c.addition(5,6));
		
//		CalculatorService cs=new CalculatorService();
//		Calculator c=cs.getCalculatorPort();
//		System.out.println(c.add(5,6));

	}

}
