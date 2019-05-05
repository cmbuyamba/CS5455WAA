package lab03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomModel {
    private int randomNumber;
    private List<Integer> generatedNumbers = new ArrayList<>();

    public RandomModel(){
        randomNumber = new Random().nextInt(10);
        for (int i=0;i<3;i++){
            generatedNumbers.add(new Random().nextInt(10));
        }
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public List<Integer> getGeneratedNumbers() {
        return generatedNumbers;
    }
}
