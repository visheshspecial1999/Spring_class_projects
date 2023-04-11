package com.jsp.sping_core_collage.constructors;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollageDriver {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("NewFile.xml");
		collage collage=(collage)applicationContext.getBean("collageDetails");
		collage.collageDisplay();
		applicationContext.close();

	}
}