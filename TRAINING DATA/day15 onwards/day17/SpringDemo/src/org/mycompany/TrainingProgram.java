package org.mycompany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TrainingProgram {
	public static void main(String[] args) {
		
		ApplicationContext beans=new ClassPathXmlApplicationContext("mybean4.xml");
		Training t=(Training)beans.getBean("t1");
		t.getDetails();
	}

}
