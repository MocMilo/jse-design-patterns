package com.infoshareacademy.patterns.factory;

public class Main {

    public static void main(String[] args) {

        // FACTORY-PATTERN

        // solves issue:
        // Application needs to support several 'object creation algorithms' to create current Type

        // example:
        // application needs to create Configuration object from file, but needs different
        // serializers to support different config file formats: json, xml... etc.

        // Factory of several serializers is needed

        ConfigurationReader configurationReader = new ConfigurationReader();

        Configuration config1 = configurationReader.load("file.xml");
        Configuration config2 = configurationReader.load("file.json");
    }
}
