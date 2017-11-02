package Kolekcje.Zadanie3;

public class Person {

    private String name;
    private String lasname;

    public Person(String name, String lasname) {
        this.name = name;
        this.lasname = lasname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lasname='" + lasname + '\'' +
                '}';
    }
}
