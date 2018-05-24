package annotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations-applicationContext.xml");

        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        Coach tennisCoachNew = context.getBean("tennisCoach", Coach.class);

        boolean result = (tennisCoach == tennisCoachNew);

        System.out.println("\n Pointing to the same object: " + result);
        System.out.println("\n Memory location for tennisCoach" + tennisCoach);
        System.out.println("\n Memory location for tennisCoach" + tennisCoachNew);

        context.close();
    }
}
