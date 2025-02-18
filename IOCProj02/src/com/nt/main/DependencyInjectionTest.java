package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.CurrentSeasonFinder;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		
		//crate IOC container
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/ApplicationContext.xml");
		
		CurrentSeasonFinder find = ctx.getBean("csf",CurrentSeasonFinder.class);
		
		String result = find.seasonFinder();
		System.out.println(result);
		
		//container close
		ctx.close();
	}

}
