package Interfejsy.Zadanie1;

import org.apache.log4j.Logger;

public class LoggerWinthLogToFile implements logerInterface{

    static Logger logger = Logger.getLogger(LoggerWinthLogToFile.class.getName());

    public void showNameAndLastnameOnConsole(String name, String lastname){
        System.out.println("\nImię: " + name + "\n" + "nazwisko: " + lastname);
        logger.debug("Podano imię i nazwisko <" + name + ", " + lastname + ">!");
    }


    @Override
    public void createLog(String name, String lastname){
        logger.debug("Podano imię i nazwisko <" + name + ", " + lastname + ">!");
    }
}
