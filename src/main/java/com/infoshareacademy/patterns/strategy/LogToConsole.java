package com.infoshareacademy.patterns.strategy;

public class LogToConsole implements LoggingStrategy {

    @Override
    public void log(String message) {
        System.out.println("Logging to console: " + message);
    }
}
