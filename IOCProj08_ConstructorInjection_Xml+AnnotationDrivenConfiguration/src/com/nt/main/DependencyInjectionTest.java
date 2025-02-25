package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.WeekDayFinder;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		
		//Create IOC container
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml");
		
		WeekDayFinder finder = ctx.getBean("wdf",WeekDayFinder.class);
		//invoke the business method
		String msg = finder.showMessage("Niki");
		//printing the msg
		System.out.println("The msg is::"+msg);
		
		//close the container
		ctx.close();
		
	}

}
