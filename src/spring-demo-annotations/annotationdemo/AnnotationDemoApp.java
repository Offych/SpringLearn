package annotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations-applicationContext.xml");

        //get the bean from container
        TennisCoach tennisCoach = context.getBean(TennisCoach.class);

        //call a method on the bean
        System.out.println(tennisCoach.getDailyWorkout());

        //call method to get daily fortune
        System.out.println(tennisCoach.getDailyFortune());

        //close the context

        context.close();

    }
}
