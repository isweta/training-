

import javax.xml.ws.Endpoint;

import com.foodpanda.DiscountCalculator;

public class StartServer {
	
		public static void main(String[] args) {
			DiscountCalculator c=new DiscountCalculator();
			String uri = "http://192.168.0.240:1000/FoodPanda/DiscountCalculator";
			Endpoint.publish(uri, c);
			System.out.println("Server Started");
		}

	}



