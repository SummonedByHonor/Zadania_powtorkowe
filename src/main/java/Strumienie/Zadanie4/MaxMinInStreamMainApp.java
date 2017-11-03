package Strumienie.Zadanie4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMinInStreamMainApp {

    public static void main(String[] args) {
        List<Integer> listOfNumber = new ArrayList<>();

        listOfNumber.add(5);
        listOfNumber.add(3);
        listOfNumber.add(19);
        listOfNumber.add(10);
        listOfNumber.add(12);
        listOfNumber.add(6);
        listOfNumber.add(20);
        listOfNumber.add(11);

        System.out.println("Elementy listy:");
        for (int e : listOfNumber) {
            System.out.println(e);
        }
        System.out.println("");
        System.out.println("Największy element z listy: " + listOfNumber.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).get());
        System.out.println("Najmniejszy element z listy: " + listOfNumber.stream().collect(Collectors.minBy(Comparator.naturalOrder())).get());
    }
}
