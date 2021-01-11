package se.lexicon;

import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {

        // solution 1:
        // create instance of Random class
        Random random = new Random();

        // Generate random integers in range of 0 to 999
        System.out.println("intRandom1: " + random.nextInt(1000));

        // Generate random number between 0 to 350
        System.out.println("intRandom2: " + random.nextInt(350 + 1));

        int min = 10;
        int max = 350; // 351
        int resultRandomNumber = random.nextInt(((max - min) + 1) + min);
        //350 - 10   + 1 + 10
        //  341 + 10 = 351
        System.out.println("resultRandomNumber = " + resultRandomNumber);

        System.out.println("---------------------------");
        // solution 2:
        System.out.println(Math.random());
        // Generate random integers in raine 0 to 350
        int randomNumber = (int) (Math.random() * (max + 1));
        System.out.println("randomNumber = " + randomNumber);

        System.out.println(Math.random() * ((max - min) + 1) + min);
        // type casting: you should cast double to int
        int randomNumber2 = (int) (Math.random() * ((max - min) + 1) + min);
        System.out.println(randomNumber2);

    }
}
