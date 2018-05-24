package annotationdemo;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@NoArgsConstructor

@Component
public class TennisCoach implements Coach {

    @Autowired
    private FortuneService fortuneService;

//      *Constructor injection*
//    @Autowired
//    public TennisCoach(FortuneService theFortuneService) {
//        this.fortuneService = theFortuneService;
//}

    //    //define a setter method
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }
//    @Autowired
//    public void doSomeCrazyStuff(FortuneService fortuneService) {
//        System.out.println(">>Inside doSomeCrazyStuff method");
//        this.fortuneService = fortuneService;
//    }


    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
