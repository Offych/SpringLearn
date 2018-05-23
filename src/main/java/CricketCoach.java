import lombok.Getter;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    private String team;
    private String emailAddress;


    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setTeam method - setTeam");
        this.team = team;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setEmailAddress method - setEmail");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-args constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
