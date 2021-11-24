package Day16.RandomClass;

import java.util.Random;

public class _01_RandomClass {

    public static void main(String[] args) {

        Random random = new Random();

        int randomMath = (int) (Math.random() * 100);
        int randomNumber = random.nextInt(100); // between 0 - 100

        int randomNumberBetween50And150 = random.nextInt(100) + 50; // 50 - 150

        // Generate a random number between -100 and 100
        int randomNumberBetweenMinus100And100 = random.nextInt(200) - 100; // (-100) - 100

    }

}
