package com.example.design.patterns.behavioral.chainofresponsibility;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EveryDayExampleDemo {
    private static final Logger LOGGER = Logger.getLogger(EveryDayExampleDemo.class.getClassLoader().getName());

    public static void main(String[] args) {
        LOGGER.setLevel(Level.FINER);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.FINER);
        LOGGER.addHandler(handler);
        LOGGER.fine("Fine level");
        LOGGER.finer("Finer level");
        LOGGER.finest("Finest level"); // this will not be logged

    }
}
