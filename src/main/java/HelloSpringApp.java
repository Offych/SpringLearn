import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

        //load the spring configuration file
        //retrieve bean from spring container

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach myCoach = context.getBean("myCoach", Coach.class);

        //call methods on the bean

        System.out.println(myCoach.getDailyWorkout());


        System.out.println(myCoach.getDailyFortune());

        //close the context
        context.close();


    }
}
