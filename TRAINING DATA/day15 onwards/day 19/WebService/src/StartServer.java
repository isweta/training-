import javax.xml.ws.Endpoint;

import com.Calculator;



public class StartServer {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		String uri="http://192.168.0.240:1000/WebService/calculator";
		Endpoint.publish(uri, c);
		System.out.println("Server Started");
	}

}
