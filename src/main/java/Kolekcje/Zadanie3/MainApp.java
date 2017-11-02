package Kolekcje.Zadanie3;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {
        System.out.println("Wyswietlanie pierwszej i ostatniej osoby w różnych kolekcjach");
        System.out.println("HashSet:");
        HashSet<Person> personHashSet = new HashSet<>();
        personHashSet.add(new Person("Mateusz", "Deptuła"));
        personHashSet.add(new Person("Rafał", "Fryd"));
        personHashSet.add(new Person("Anna", "Kollumb"));
        personHashSet.add(new Person("Irena", "Wass"));
        personHashSet.add(new Person("Leon", "Kajarowski"));
        int iterator = 0;
        for(Person osoba : personHashSet){
            if(iterator == 0 || iterator == (personHashSet.size() -1)){
                System.out.println(iterator + " miejsce w kolecji: " + osoba);
            }
            iterator++;
        }

        System.out.println("");

        System.out.println("Priority Queue:");
        PriorityQueue<Person> personPriorityQueue = new PriorityQueue<>();
        personPriorityQueue.offer(new Person("Mateusz", "Deptuła"));
        personPriorityQueue.offer(new Person("Rafał", "Fryd"));
        personPriorityQueue.offer(new Person("Anna", "Kollumb"));
        personPriorityQueue.offer(new Person("Irena", "Wass"));
        personPriorityQueue.offer(new Person("Leon", "Kajarowski"));
        System.out.println(personPriorityQueue.peek());
        System.out.println("Nie można dostać się do ostatniego elementu");

        System.out.println("");

        System.out.println("Linked List:");
        LinkedList<Person> personLinkedList = new LinkedList<>();
        personLinkedList.add(new Person("Mateusz", "Deptuła"));
        personLinkedList.add(new Person("Rafał", "Fryd"));
        personLinkedList.add(new Person("Anna", "Kollumb"));
        personLinkedList.add(new Person("Irena", "Wass"));
        personLinkedList.add(new Person("Leon", "Kajarowski"));
        System.out.println(personLinkedList.getFirst());
        System.out.println(personLinkedList.getLast());

        System.out.println("Vector:");
        Vector<Person> personVector = new Vector<>();
        personVector.addElement(new Person("Mateusz", "Deptuła"));
        personVector.addElement(new Person("Rafał", "Fryd"));
        personVector.addElement(new Person("Anna", "Kollumb"));
        personVector.addElement(new Person("Irena", "Wass"));
        personVector.addElement(new Person("Leon", "Kajarowski"));
        System.out.println(personVector.get(0));
        System.out.println(personVector.get(personVector.size() - 1));

        System.out.println("");

    }

}
