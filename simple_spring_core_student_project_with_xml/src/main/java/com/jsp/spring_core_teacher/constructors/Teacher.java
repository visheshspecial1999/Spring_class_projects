package com.jsp.spring_core_teacher.constructors;

public class Teacher {

	private int id;
	private String name;
	private String email;
	
	public Teacher(int id,String name,String email) {
		super();
		this.id=id;
		this.name=name;
		this.email=email;
	}
	
	public void displayTeacher() {
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("email: "+email);
	}
}
