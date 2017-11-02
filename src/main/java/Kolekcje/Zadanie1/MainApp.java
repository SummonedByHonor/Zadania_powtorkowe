package Kolekcje.Zadanie1;

import java.util.TreeSet;

public class MainApp {


    public static void main(String[] args) {
        TreeSet<String> personTreeSet = new TreeSet<>();
        String name;

        personTreeSet.add("Mateusz");
        personTreeSet.add("Aleksandra");
        personTreeSet.add("Andrzej");
        personTreeSet.add("Eustachy");
        personTreeSet.add("Olga");
        personTreeSet.add("Zenon");
        personTreeSet.add("Zbigniew");

        for (String element : personTreeSet){
            System.out.println(element);
        }
    }
}
