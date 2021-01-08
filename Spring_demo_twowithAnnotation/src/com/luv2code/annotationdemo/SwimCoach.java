package com.luv2code.annotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{

	@Value("${foo.email}")
	private String email;
	@Value("${foo.teamname}")
	private String Team;
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService FortuneService;
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Play As you wish";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return FortuneService.getFortune();
	}
	
	
}
