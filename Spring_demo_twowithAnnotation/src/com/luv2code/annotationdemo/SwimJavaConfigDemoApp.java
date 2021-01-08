package com.luv2code.annotationdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach cc = context.getBean("swimCoach", Coach.class);
		System.out.println(cc.getDailyWorkout());
		System.out.println(cc.getDailyFortune());

		SwimCoach tc = context.getBean("swimCoach", SwimCoach.class);
		SwimCoach tc1 = context.getBean("swimCoach", SwimCoach.class);
		Boolean result = (tc == tc1);
		System.out.println("out: " + result);//true if singleton scope
											 //False when Scope is prototype

	}

}
