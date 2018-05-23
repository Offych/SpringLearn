import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketCoach myCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

        System.out.println(myCricketCoach.getDailyWorkout());
        System.out.println(myCricketCoach.getDailyFortune());


        //call new methods to get literal values
        System.out.println(myCricketCoach.getTeam());
        System.out.println(myCricketCoach.getEmailAddress());


        context.close();
    }
}
