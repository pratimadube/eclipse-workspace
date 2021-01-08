package spring_demo_one;

public class CricketCoach implements Coach {

	private FortunService fortuneService;
	private String email;
	private String teamname;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public CricketCoach() {
		super();
		System.out.println("Cricket coach: in no-arg constructor");
	}

	public void setFortuneService(FortunService myfortuneService) {
		System.out.println("Cricket coach: in setter method");
		this.fortuneService = myfortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 min";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
