package Strumienie.Zadanie3;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class SortingStreamMainApp {

    public static void main(String[] args) {
        HashSet<String> unsortedStringSet = new HashSet<>();
        unsortedStringSet.add("Mariusz");
        unsortedStringSet.add("Tadeusz");
        unsortedStringSet.add("Weronika");
        unsortedStringSet.add("Fryderyk");
        unsortedStringSet.add("Ania");
        unsortedStringSet.add("Robert");
        unsortedStringSet.add("Gabriela");
        unsortedStringSet.add("Nancy");

        System.out.println("Set nieposortowany:");
        for (String name : unsortedStringSet){
            System.out.println(name);
        }

        System.out.println("\nSet posortowany:");
        unsortedStringSet.stream().sorted((Comparator.naturalOrder())).forEach(s -> System.out.println(s));
    }
}
