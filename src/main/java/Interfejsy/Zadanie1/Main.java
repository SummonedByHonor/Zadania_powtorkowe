package Interfejsy.Zadanie1;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        LoggerWinthLogToFile logToFile = new LoggerWinthLogToFile();

        LoggerWithLogInConsole logInConsole = new LoggerWithLogInConsole();
        Scanner scanner = new Scanner(System.in);
        System.out.print("podaj imię: ");
        String imie = scanner.nextLine();
        System.out.print("podaj nazwisko: ");
        String nazwisko = scanner.nextLine();

        logToFile.showNameAndLastnameOnConsole(imie, nazwisko);

        logInConsole.createLog(imie,nazwisko);
    }
}
