package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String []args) {
		//Creating IOC container
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/ApplicationContext.xml");
		
		WishMessageGenerator generate = ctx.getBean("wmg",WishMessageGenerator.class);
		
		//invoking the business method
		String result = generate.WishMessageGenerator("Harsh");
		
		//display the result
		System.out.println("The message is :: "+result);
		
		//close IOC container
		ctx.close();
				
	}

}
