package spring_demo_one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// load the spring configuration file
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrive the bean from container
		CricketCoach cc = con.getBean("cricketcoach", CricketCoach.class);
		
		// call the method from class of the bean
		System.out.println(""+cc.getDailyWorkout());
		System.out.println(""+cc.getDailyFortune());
		System.out.println("email : "+cc.getEmail());
		System.out.println("team name : "+cc.getTeamname());
		
		// close the context
		con.close();
	}

}
