package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	private LocalDate date; 	//HAS-A property
	
	//constructor
	public SeasonFinder() {
		System.out.println("SeasonFinder::o-param constructor");
	}
	
	//setter Method
	@Autowired
	public void setDate(LocalDate date) {
		System.out.println("SeasonFinder.setDate()");
		this.date = date;
	}
	
	//B. method
	public String findSeason() {
		//getting current date
		int month = date.getMonthValue();
		//Finding season name
		if(month >=3 && month <=6)
			return "Summer Season";
		else if(month >=7 && month <=11)
			return "Rainy Season";
		else
			return "winter Season"+"  "+ date.getMonth();
		
	}
	
	

}
