package com.jsp.spring_core_processor.reference;

public class Laptop {

	Processor processor;
	/*
	 * public void setProcessor(Processor processor) {
	 *  this.processor = processor; }
	 */

	
	  public void laptopName() { System.out.println("my laptop has");
	  processor.processorName();
	  
	  }
	 
	public Laptop(Processor processor) {
		super();
		this.processor = processor;
	}
}