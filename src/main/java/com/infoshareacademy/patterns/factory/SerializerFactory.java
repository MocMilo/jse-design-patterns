package com.infoshareacademy.patterns.factory;

public class SerializerFactory {

    public Serializer create(String type) {
        switch (type) {
            case "json": return new JsonSerializer();
            case "xml": return new XmlSerializer();
            default: throw new RuntimeException("Unknown serializer type");
        }
    }
}
