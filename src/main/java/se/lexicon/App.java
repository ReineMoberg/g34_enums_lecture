package se.lexicon;

import se.lexicon.model.Car;
import se.lexicon.model.Color;
import se.lexicon.model.Gender;
import se.lexicon.model.Person;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
    /*
        Car volvo= new Car(1,"Volvo XC40",2020,"");
        System.out.println("VOLVO : "+ volvo);
     */

        Color grayColor = Color.GRAY;
        Color whiteColor = Color.valueOf("BLACK");

        Car bmw = new Car(1, "BMW X6", 2020, grayColor);
        System.out.println(bmw);

        Car volvoV = new Car(3, "VOlvo V90", 2021, Color.WHITE);
        System.out.println(volvoV);

        Color color= volvoV.getColor();
        System.out.println(color.getColorNumber());
        System.out.println(volvoV.getColor().getColorNumber());


        System.out.println("---------------------------------");
        Color[] colors = Color.values();
        System.out.println(Arrays.toString(colors));

        Person test= new Person("Test",22,"TEST.TEST@test.se", Gender.NON_BINARY);
        Person simon= new Person("Simon",33,"SIMON.TEST@test.se", Gender.MALE);

        System.out.println(test);
        System.out.println(simon);

    }
}
