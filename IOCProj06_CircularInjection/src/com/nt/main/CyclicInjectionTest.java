package com.nt.main;
import com.nt.sbeans.A;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CyclicInjectionTest {
	public static void main(String []args) {
		//creating IOC container
		FileSystemXmlApplicationContext ctx =
				new FileSystemXmlApplicationContext("src/com/nt/cfgs/ApplicationContext.xml");
		
		//get Spring bean class obj
		A a1 =(A)ctx.getBean("a1");
		System.out.println(a1);
		
		//close the container
		ctx.close();
		
		
	}
	

}
