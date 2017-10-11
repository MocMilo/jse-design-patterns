package com.infoshareacademy.patterns.strategy;

public class SimpleLogger {

    private LoggingStrategy loggingStrategy;

    public SimpleLogger(LoggingStrategy loggingStrategy) {
        this.loggingStrategy = loggingStrategy;
    }

    public void log(String message) {
        loggingStrategy.log(message);
    }
}
