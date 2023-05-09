package com.jsp.spring_annotation_xml.constructors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerDriver {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("NewFile.xml");
		Customer customer = (Customer) applicationContext.getBean("customer");
		customer.display();
	}
}