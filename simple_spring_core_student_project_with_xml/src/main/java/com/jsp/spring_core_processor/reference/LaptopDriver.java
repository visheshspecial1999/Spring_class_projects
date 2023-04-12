package com.jsp.spring_core_processor.reference;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopDriver {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("NewFile.xml");
		Laptop laptop=(Laptop) applicationContext.getBean("myLaptop");
		laptop.laptopName();
		applicationContext.close();
	}
}