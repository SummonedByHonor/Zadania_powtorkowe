package Strumienie.Zadanie5;

import java.util.ArrayList;
import java.util.List;
public class MainApp {

    public static void main(String[] args) {

        List<Pracownik> listaPracownikow = new ArrayList<>();
        listaPracownikow.add(new Pracownik("Marek", "Rok", 2000D));
        listaPracownikow.add(new Pracownik("Fryderyk", "Czaja", 1800D));
        listaPracownikow.add(new Pracownik("Patryk", "Nowakowski", 3000D));
        listaPracownikow.add(new Pracownik("Maja", "Wojtasik", 2700D));
        listaPracownikow.add(new Pracownik("Zuzanna", "Deszcz", 1750D));
        listaPracownikow.add(new Pracownik("Mateusz", "Dedej", 2300D));
        listaPracownikow.add(new Pracownik("Anna", "Teresowicz", 2450D));
        listaPracownikow.add(new Pracownik("Paula", "Rekos", 1900D));

        System.out.println("Lista pracowników:");
        for (Pracownik pracownik : listaPracownikow){
            System.out.println(pracownik.toString());
        }

        Double srednieWynagrodznie = listaPracownikow.stream().map(pracownik -> pracownik.getWynagrodzenie()).mapToDouble(value -> value).average().getAsDouble();

        System.out.println("\nSrednie zarobki w firmie:" + srednieWynagrodznie);

        System.out.println("\nLista osób zarabiających powyżej średniego wynagrodzenia:");
        listaPracownikow.stream().filter(pracownik -> pracownik.getWynagrodzenie() > srednieWynagrodznie).forEach(pracownik -> System.out.println(pracownik));
    }
}
