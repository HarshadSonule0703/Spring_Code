package com.nt.sbeans;

public class B {
	private A a;
	
	//setter method
	public void setA(A a) {
		System.out.println("B.setA()");
		this.a = a;
	}
	
	//constructor
//	public B(A a) {
//		System.out.println("B::1 param Constructor.");
//		this.a =a;
//	}
	
	//to-String
	public String toString() {
		return "From B spring bean";
	}

}
