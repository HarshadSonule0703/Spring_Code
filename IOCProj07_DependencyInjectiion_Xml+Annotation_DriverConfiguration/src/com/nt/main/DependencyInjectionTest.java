package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		//crate IOC container
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/com/nt/cfgs/ApplicationContext.xml");
		//get target spring bean class obj ref
		SeasonFinder find = ctx.getBean("sf",SeasonFinder.class);
		
		//Invoke B method
		String result = find.findSeason();
		//printing result
		System.out.println("Season is::"+result);
		
		//close IOC container
		ctx.close();

	}

}
