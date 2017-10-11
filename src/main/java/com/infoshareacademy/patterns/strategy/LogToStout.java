package com.infoshareacademy.patterns.strategy;

public class LogToStout implements LoggingStrategy {

    @Override
    public void log(String message) {
        System.out.println("Logging to stout: " + message);
    }
}
