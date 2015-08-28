package com.vzapp;


import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessengerTest {

	public static void main(String[] args) {
		ApplicationContext bean=new ClassPathXmlApplicationContext("mybean.xml");
		MyMessageSender m=(MyMessageSender)bean.getBean("mymsgsender1");
		m.ms.sendMessage("sweta", "Hello");
	}

}
