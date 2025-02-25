package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WeekDayFinder;

public class DependencyInjectionTest {
	public static void main(String []args) {
		//create an IOC container
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		//get target spring bean class obj ref
		Object obj = ctx.getBean("wdf");
		//type casting 
		WeekDayFinder finder = (WeekDayFinder)obj;
		//invoke Business method
		String msg = finder.showMessage("Niki");
		//show Result
		System.out.println("Result is::"+msg);
		//close the container
		ctx.close();
		
	}

}
