package com.infoshareacademy.patterns.strategy;

public class LogToFile implements LoggingStrategy {

    @Override
    public void log(String message) {
        System.out.println("Logging to file: " + message);
    }
}
