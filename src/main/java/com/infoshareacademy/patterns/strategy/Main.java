package com.infoshareacademy.patterns.strategy;

public class Main {

    public static void main(String[] args) {
        LoggingStrategy loggingStrategy = new LogToConsole();
        SimpleLogger logger = new SimpleLogger(loggingStrategy);
        logger.log("my log msg");
    }
}
