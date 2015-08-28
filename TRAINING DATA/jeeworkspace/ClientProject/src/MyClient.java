import com.Calculator;
import com.CalculatorService;


public class MyClient {
	public static void main(String[] args) {
		CalculatorService cs=new CalculatorService();
		Calculator c=cs.getCalculatorPort();
		System.out.println(c.add(5,6));
	}

}
//http://192.168.0.145:1000/MyWebService/calculator?wsdl