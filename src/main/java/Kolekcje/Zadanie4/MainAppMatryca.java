package Kolekcje.Zadanie4;


import java.util.HashSet;

public class MainAppMatryca {

    private HashSet<String> matrycaString = new HashSet<>();

    public void dodajImieDoMatrycy (String imie){
        matrycaString.add(imie);
    }

    public final HashSet<String> stworzMatryce(HashSet<String> wzorMatrycy){
        return wzorMatrycy;
    }

    public HashSet<String> getMatrycaString() {
        return matrycaString;
    }

    public static void main(String[] args) {
        MainAppMatryca mainAppMatryca = new MainAppMatryca();

        mainAppMatryca.dodajImieDoMatrycy("Adam");
        mainAppMatryca.dodajImieDoMatrycy("Iwona");
        mainAppMatryca.dodajImieDoMatrycy("Ola");
        mainAppMatryca.dodajImieDoMatrycy("Zbigniew");
        mainAppMatryca.dodajImieDoMatrycy("Anna");
        mainAppMatryca.dodajImieDoMatrycy("Marta");
        mainAppMatryca.dodajImieDoMatrycy("Ela");
        mainAppMatryca.dodajImieDoMatrycy("Tomek");
        mainAppMatryca.dodajImieDoMatrycy("Piotr");
        mainAppMatryca.dodajImieDoMatrycy("Ksawery");
        mainAppMatryca.dodajImieDoMatrycy("Mateusz");
        mainAppMatryca.dodajImieDoMatrycy("Ola");
        mainAppMatryca.dodajImieDoMatrycy("Zbigniew");
        mainAppMatryca.dodajImieDoMatrycy("Rafał");

        final HashSet<String> gotowaMatryca = mainAppMatryca.getMatrycaString();

        for (String elementMatrycy : gotowaMatryca){
            System.out.println(elementMatrycy);
        }
    }
}
