package com.jsp.spring_annotation_xml.setters;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductDriver {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("NewFile.xml");
		Product product=(Product) applicationContext.getBean("product");
		System.out.println("id: "+product.getId());
		System.out.println("name: "+product.getName());
		System.out.println("price: "+product.getPrice());
	}
}