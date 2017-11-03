package Strumienie.Zadanie1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApp_Zadanie1 {

    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Ada");
        listOfNames.add("Bartek");
        listOfNames.add("Cecylia");
        listOfNames.add("Darek");
        listOfNames.add("Zuzanna");
        listOfNames.add("Tomasz");

        listOfNames.stream().map(s -> s.toUpperCase()).forEach(n -> System.out.println(n));
    }
}
