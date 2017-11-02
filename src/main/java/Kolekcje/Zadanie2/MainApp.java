package Kolekcje.Zadanie2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainApp {

    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> listOfRandomNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listOfRandomNumbers.add(random.nextInt(50));
        }

        for (Integer number : listOfRandomNumbers) {
            System.out.println(number);
        }
    }
}
