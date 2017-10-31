package Interfejsy.Zadanie1;


import org.apache.log4j.Logger;

public interface logerInterface {

    Logger logger = Logger.getLogger(logerInterface.class);

    public void createLog(String name, String lastname);
}
