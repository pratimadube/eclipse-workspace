package spring_demo_one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach cc = context.getBean("myCoach", Coach.class);
		System.out.println("" + cc.getDailyWorkout());
		System.out.println("" + cc.getDailyFortune());
		//System.out.println("")+ cc.get;
		context.close();

	}

}
