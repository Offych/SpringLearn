package annotationdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    //create an array of strings
    private String[] data = {
            "Drink beer! it's useful",
            "The journey is the reward",
            "Diligence is the mother of goof luck",
            "Surprised? It's just a luck"
    };
    //create a random number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        //pick a random string of array
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }
}
