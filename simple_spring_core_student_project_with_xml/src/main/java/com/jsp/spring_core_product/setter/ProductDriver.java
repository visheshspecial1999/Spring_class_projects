package com.jsp.spring_core_product.setter;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductDriver {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("NewFile.xml");
		Object product=applicationContext.getBean("productDetails");
		Product product2=(Product)product;
		System.out.println(product2.getId());
		System.out.println(product2.getName());
		System.out.println(product2.getPrice());
		System.out.println(product2.getClass().getName());
		applicationContext.close();

	}

}
