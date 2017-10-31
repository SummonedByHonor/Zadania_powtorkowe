package Interfejsy.Zadanie1;

public class LoggerWithLogInConsole implements logerInterface {


    @Override
    public void createLog(String name, String lastname) {
        System.out.println("Log: zalogowano!<" + name + ", " + lastname + ">!");
    }
}
