
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

    //add am init method
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff()");
    }

    //add a destroy method
    public void doMyCleanupStuff() {
        System.out.println("TrackCoach: inside method doMyCleanupStuff()()");
    }
}