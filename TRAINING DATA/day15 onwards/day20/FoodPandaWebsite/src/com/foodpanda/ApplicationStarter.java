package com.foodpanda;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.xml.ws.Endpoint;


public class ApplicationStarter implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		DiscountCalculator c=new DiscountCalculator();
		String uri = "http://192.168.0.240:1005/FoodPanda/DiscountCalculator";
		Endpoint.publish(uri, c);
		System.out.println("Server Started");
		
	}

}
