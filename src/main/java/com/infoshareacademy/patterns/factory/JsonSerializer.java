package com.infoshareacademy.patterns.factory;

public class JsonSerializer implements Serializer {

    @Override
    public void serialize(Object o, String filename) {
        System.out.println("Serializing " + o +" to Json file");
    }

    @Override
    public Object deserialize(String filename) {
        System.out.println("Deserializing Json file");

        Configuration configuration = new Configuration();
        configuration.setPort(8080);

        configuration.setRemoteServiceUrl("http://service.com");
        configuration.setRemoteServicePort(1234);

        return configuration;
    }
}
