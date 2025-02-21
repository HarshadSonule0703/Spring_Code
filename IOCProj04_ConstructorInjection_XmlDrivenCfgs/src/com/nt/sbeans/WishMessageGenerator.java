package com.nt.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator {
	private LocalTime time;
	
//	//setter injection 
//	public void setTime(LocalTime time) {
//		this.time =time;
//	}
	
	//Constructor 
	public WishMessageGenerator(LocalTime time) {
		this.time = time;
	}
	
	//Business method
	public String generateWishMessage(String user) {
		//getting current hour
		int hour = time.getHour();
		if(hour < 12)
			return "Hello :"+user;
		else if(hour < 16)
			return "Good Afternoon::"+user;
		else if(hour < 20)
			return "Good Evening::"+user;
		else
			return "Good Night::"+user;
	}

}
