package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		//creating a IOC container
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/com/nt/cfgs/ApplicationContext.xml");
		
		SeasonFinder find = ctx.getBean("sf",SeasonFinder.class);
		//invoke business method
		String result = find.findSeason();
		//Show result
		System.out.println("Season is::"+result);
		
		//close the container
		ctx.close();
	}

}
