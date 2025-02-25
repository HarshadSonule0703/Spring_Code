//WeekDayFinder  	(Target spring bean class)
package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDayFinder {
	@Autowired 				//Field Injection
	private LocalDate date;	//HAS-A property
	//constructor
	public WeekDayFinder(LocalDate date) {
		System.out.println("WeekDayFinder::1-param constructor");
		this.date  = date;
	}
	
	//b. method
	public String showMessage(String user) {
		//getting current week day number
		int dayNumber = date.getDayOfWeek().getValue();
		//generate the message
		if(dayNumber >=1 && dayNumber<=5)
			return "Work hard to build strong IT career: "+user;
		else
			return "Take a break, Enjoy your Week end: "+user;	
	}
	
	
}
