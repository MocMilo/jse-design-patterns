package com.infoshareacademy.patterns.strategy;

public class LogToSystemLog implements LoggingStrategy {

    @Override
    public void log(String message) {
        System.out.println("Logging to system log: " + message);
    }
}
