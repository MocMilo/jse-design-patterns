package com.infoshareacademy.patterns.factory;

public class Main {

    public static void main(String[] args) {

        ConfigurationReader configurationReader = new ConfigurationReader();
        configurationReader.load("file.xml");
        configurationReader.load("file.json");

    }
}
