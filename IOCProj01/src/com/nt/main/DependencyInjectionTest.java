package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		
		//create IOC container
		FileSystemXmlApplicationContext ctx =  new FileSystemXmlApplicationContext("src/com/nt/cfgs/ApplicationContext.xml");
		//get target spring  bean object class ref
		
		WishMessageGenerator generate = ctx.getBean("wmg", WishMessageGenerator.class);
		
		String result = generate.showWishMessage("Harsh");
		System.out.println(result);
		
		ctx.close();
		
		
	}

}
