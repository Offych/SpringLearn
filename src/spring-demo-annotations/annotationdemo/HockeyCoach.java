package annotationdemo;

import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Take the hockey stick!!!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
