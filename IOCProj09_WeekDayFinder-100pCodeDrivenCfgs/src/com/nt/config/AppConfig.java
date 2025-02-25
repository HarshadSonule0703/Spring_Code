package com.nt.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  	//Component++
@ComponentScan(basePackages ="com.nt.sbeans")
public class AppConfig {
	
	//constructor
	public AppConfig() {
		System.out.println("AppConfig::0-param Constructor");
	}
	
	//pre-define class as spring bean
	@Bean(name = "ldate")
	public LocalDate createLDate() {
		System.out.println("AppConfig.createLDate()");
		return LocalDate.now();
	}

}
