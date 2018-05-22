
public class trackCoach implements Coach {

    private FortuneService fortuneService;

    public trackCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    public String getDailyWorkout() {
        return "Run a hard 5K";
    }

    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();

    }
}
