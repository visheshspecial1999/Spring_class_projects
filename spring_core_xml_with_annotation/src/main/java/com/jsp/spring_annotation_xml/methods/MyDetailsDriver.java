package com.jsp.spring_annotation_xml.methods;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDetailsDriver {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("NewFile.xml");
	MyDetails details	=(MyDetails) applicationContext.getBean("details");
	details.displayMyDetails();

	}

}