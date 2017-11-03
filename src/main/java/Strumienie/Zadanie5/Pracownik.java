package Strumienie.Zadanie5;

import lombok.Data;

import java.util.OptionalDouble;

@Data
public class Pracownik {

    private String imie;
    private String nazwisko;
    private Double wynagrodzenie;

    public Pracownik(String imie, String nazwisko, Double wynagrodzenie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wynagrodzenie=" +wynagrodzenie.intValue()+
                '}';
    }
}
