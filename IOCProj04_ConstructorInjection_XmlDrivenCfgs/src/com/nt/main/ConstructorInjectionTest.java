package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class ConstructorInjectionTest {
	public static void main(String []args) {
		//Create IOC container
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/com/nt/cfgs/ApplicationContext.xml");
		
		WishMessageGenerator generate = ctx.getBean("wmg",WishMessageGenerator.class);
		
		//invoke business method
		String result =generate.generateWishMessage("Niki");
		
		//show result
		System.out.println(result);
		
		//close IOC container
		ctx.close();
	}

}
