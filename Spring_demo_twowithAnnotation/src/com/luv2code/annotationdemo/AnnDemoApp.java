package com.luv2code.annotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Coach cc = context.getBean("swimCoach", Coach.class);
		System.out.println(cc.getDailyWorkout());
		System.out.println(cc.getDailyFortune());

		TennisCoach tc = context.getBean("tennisCoach", TennisCoach.class);
		TennisCoach tc1 = context.getBean("tennisCoach", TennisCoach.class);
		Boolean result = (tc == tc1);
		System.out.println("out: " + result);//true if singleton scope
											 //False when Scope is prototype

	}

}
