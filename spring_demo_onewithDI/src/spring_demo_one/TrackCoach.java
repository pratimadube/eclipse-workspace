package spring_demo_one;

public class TrackCoach implements Coach {

	private FortunService fortuneService;

	public TrackCoach(FortunService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do it : "+fortuneService.getFortune();
	}

}
