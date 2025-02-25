package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDayFinder {
	private  LocalDate date;
	
	//constructor
	@Autowired
	public WeekDayFinder(LocalDate date) {
		System.out.println("WeekDayFinder::1-param constructor)");
		this.date =date;
	}
	
	//Business Method
	public String showMessage(String user) {
		//getting int value of the days
		int day = date.getDayOfWeek().getValue();
		
		if(day == 7 || day==6)
			return "It's your break enjoy it! Happy Week end "+user;
		else
			return "It is your working day! go back to work "+user;
	}
	

}
