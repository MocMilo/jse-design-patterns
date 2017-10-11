package com.infoshareacademy.patterns.strategy;

public class SimpleLogger {

    public void logToConsole(String message) {
        System.out.println("Logging to console: " + message);
    }

    public void logToFile(String message) {
        System.out.println("Logging to file: " + message);
    }

    public void logToStout(String message) {
        System.out.println("Logging to stout: " + message);
    }

    public void logToSystemLog(String message) {
        System.out.println("Logging to system log: " + message);
    }
}
