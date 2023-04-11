package com.jsp.spring_core_teacher.constructors;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherDriver {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("NewFile.xml");
		Teacher teacher=(Teacher) applicationContext.getBean("teacherDetails");
		teacher.displayTeacher();
		applicationContext.close();

	}
}