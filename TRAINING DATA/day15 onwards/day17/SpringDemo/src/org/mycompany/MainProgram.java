package org.mycompany;

	import org.springframework.beans.factory.BeanFactory;
	import org.springframework.beans.factory.xml.XmlBeanFactory;
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	import org.springframework.core.io.FileSystemResource;


	

	public class MainProgram {

		
		public static void main(String[] args) {
			//BeanFactory bean=new XmlBeanFactory(new FileSystemResource("mybean.xml"));
			ApplicationContext bean=new ClassPathXmlApplicationContext("mybean5.xml");
			Employee e=(Employee)bean.getBean("employee1");
			e.details();
		}

	}

