package annotationdemo;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@NoArgsConstructor

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    //define init method
    @PostConstruct
    public void startMethod() {
        System.out.println("Inside startMethod()");
    }

    //define destroy method
    @PreDestroy
    public void destroyMethod() {
        System.out.println("Inside destroyMethod()");
    }



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
