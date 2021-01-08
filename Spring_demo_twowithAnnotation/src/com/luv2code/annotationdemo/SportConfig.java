package com.luv2code.annotationdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.luv2code.annotationdemo")
public class SportConfig {

	
	//creating bean for sadFortuneService
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	//Define a bean for swinCoach and inject dependacy;
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
