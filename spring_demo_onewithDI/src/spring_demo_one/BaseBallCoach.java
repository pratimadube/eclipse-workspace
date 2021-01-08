package spring_demo_one;

class BaseBallCoach implements Coach{

	private FortunService fortunService;
	
	public BaseBallCoach(FortunService theFortunService) {
		super();
		this.fortunService = theFortunService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "You have to do 30 min Daily Workout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortunService.getFortune();
	}
	
	

	
}
