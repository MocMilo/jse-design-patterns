package com.infoshareacademy.patterns.factory;

public class JsonSerializer implements Serializer {

    @Override
    public void serialize(Object o, String filename) {
        System.out.println("Serializing " + o +" to Json file");
    }

    @Override
    public Object deserialize(String filename) {

        // some deserialization algorithm using serialization library... etc.

        System.out.println("Deserializing Json file...");

        // New Configuration with values from json file:

        Configuration configuration = new Configuration();
        configuration.setPort(8080);
        configuration.setRemoteServiceUrl("http://service.com");
        configuration.setRemoteServicePort(1234);

        return configuration;
    }
}
