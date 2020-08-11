package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

    public static void main(String[] args) {

        //Without generics
        List superheroes = new ArrayList();
        superheroes.add("Spider Man");
        superheroes.add("Batman");
        String first = (String) superheroes.get(0); //Have to typecast
        System.out.println("1st Superhero: " + first);
        superheroes.add(20); //Accepts any data type
        System.out.println(superheroes);


        //With generics
        List<String> cars = new ArrayList<>();
        cars.add("BMW M5");
        cars.add("Mercedes S Class");
        String first1 = cars.get(0); //No need to typecast
        System.out.println("1st Car: " + first1);
        //cars.add(5); //Will not accept any other data types
        System.out.println(cars);

    }

}
