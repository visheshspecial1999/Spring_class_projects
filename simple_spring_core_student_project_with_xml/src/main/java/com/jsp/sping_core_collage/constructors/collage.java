package com.jsp.sping_core_collage.constructors;

public class collage {
	
	private int collageId;
	private String collageName;
	private long collagePhone;
	private String collageAddress;
	
	private collage(int  collageId,String collageName,long collagePhone,String collageAddress) {
		super();
		this.collageId=collageId;
		this.collageName=collageName;
		this.collagePhone=collagePhone;
		this.collageAddress=collageAddress;
	}
	
	public void collageDisplay() {
		System.out.println("collageId: "+collageId);
		System.out.println("collageName: "+collageName);
		System.out.println("collagePhone: "+collagePhone);
		System.out.println("collageAddress: "+collageAddress);
	}
}
