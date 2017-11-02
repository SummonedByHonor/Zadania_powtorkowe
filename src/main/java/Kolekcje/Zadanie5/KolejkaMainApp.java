package Kolekcje.Zadanie5;

import java.util.PriorityQueue;

public class KolejkaMainApp {

    public static void main(String[] args) {
        PriorityQueue<String> kolejkaZadan = new PriorityQueue<>();

        kolejkaZadan.offer("Zadanie1: Posprzątaj pokój");
        kolejkaZadan.offer("Zadanie2: Zróbzakupy");
        kolejkaZadan.offer("Zadanie3: Odrób zadanie domowe");
        kolejkaZadan.offer("Zadanie4: Nakarm psa");
        kolejkaZadan.offer("Zadanie5: Zamów obiad");
        kolejkaZadan.offer("Zadanie6: Posprzątaj kuchnię");
        kolejkaZadan.offer("Zadanie7: Prysznic");
        kolejkaZadan.offer("Zadanie8: Pościel łóżko");
        kolejkaZadan.offer("Zadanie9: Idź spać");


        for (String element : kolejkaZadan){
            System.out.println(element);
        }
    }
}
