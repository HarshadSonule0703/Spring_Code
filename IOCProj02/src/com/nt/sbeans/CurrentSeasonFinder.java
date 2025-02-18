package com.nt.sbeans;

import java.time.LocalDate;

public class CurrentSeasonFinder {
	private LocalDate date;
	
	//setter method for setter injection
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	//business method
	public String seasonFinder() {
		int month = date.getMonthValue();
		if(month >= 3 && month <=6)
			return "Summer"+month;
		else if(month >=7 && month<=10)
			return "Rainy"+month;
		else
			return "Winter"+month;
	}


}
