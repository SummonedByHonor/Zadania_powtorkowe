package Strumienie.Zadanie2;

import java.util.ArrayList;
import java.util.List;

public class WyszukiwanieMainApp {

    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Tomek");
        listOfNames.add("Rafał");
        listOfNames.add("Tadeusz");
        listOfNames.add("Robert");
        listOfNames.add("Jan");
        listOfNames.add("Klaudiusz");
        listOfNames.add("Bogdan");
        listOfNames.add("Henryk Jan");

        listOfNames.stream().filter(s -> s.contains("Jan")).forEach(s -> System.out.println(s));
    }
}
