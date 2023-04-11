package com.jsp.simple_spring_core_student_project_with_xml;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("Newfile.xml");
		applicationContext.getBean("studentDetails");
		applicationContext.close();
	}

}
