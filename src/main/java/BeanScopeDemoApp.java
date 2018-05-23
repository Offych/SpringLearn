import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        //load the spring conf file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve bean from spring container

        Coach coachOne = context.getBean("myCoach", Coach.class);
        Coach coachTwo = context.getBean("myCoach", Coach.class);

        //check if they are the same

        boolean result = (coachOne == coachTwo);

        //print out the result

        System.out.println("\nPointing to the same object:  " + result);

        System.out.println("\nMemoryLocation for the coachOne" + coachOne);
        System.out.println("\nMemoryLocation for the coachTwo" + coachTwo);

        context.close();


    }
}
