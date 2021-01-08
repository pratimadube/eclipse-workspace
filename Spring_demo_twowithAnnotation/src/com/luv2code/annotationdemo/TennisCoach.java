package com.luv2code.annotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
/* @Scope("prototype") */
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		// TODO Auto-generated constructor stub
		System.out.println("inside default constructor");
	}

	/*
	 * @Autowired public TennisCoach(FortuneService happyFortuneServices) { // TODO
	 * Auto-generated constructor stub this.fortuneService = happyFortuneServices; }
	 */

	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * System.out.println("inside setter"); this.fortuneService = fortuneService; }
	 */

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice ValleyBall for 30 min";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
