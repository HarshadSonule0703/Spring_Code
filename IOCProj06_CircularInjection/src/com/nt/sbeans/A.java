package com.nt.sbeans;

public class A {
	private B b;
	
	public void setB(B b) {
		System.out.println("A.setB()");
		this.b = b;
	}
	
//	public A(B b) {
//		System.out.println("A::1 param constructor.");
//		
//		this.b = b;
//	}
	
	//to-String
	public String toString() {
		return "From A spring bean";
		
	}

}
