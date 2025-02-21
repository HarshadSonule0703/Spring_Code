package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("sf")
public class SeasonFinder {
	
	private LocalDate date;   //HAS-A property
	
	//Constructor
	public SeasonFinder(LocalDate date) {
		System.out.println("SeasonFinder.SeasonFinder()");
		this.date= date;
	}
	//Setter Injection 
	@Autowired
	public void setDate(LocalDate date) {
		System.out.println("SeasonFinder.setDate()");
		this.date= date;
	}
	
	//Business method
	public String findSeason() {
		//getting current month
		int month = date.getMonthValue();  //we get 1-12 value
		if(month >=3 && month <=6)
			return "Summer Season";
		else if(month >=7 && month<=11)
			return "Rainy Season";
		else
			return "winter Season";
	}
	
	

}
