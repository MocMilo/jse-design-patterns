package com.infoshareacademy.patterns.factory;

public class ConfigurationReader {

    public Configuration load(String filename) {

        String type = determineFileType(filename);

        SerializerFactory serializerFactory = new SerializerFactory();
        Serializer serializer = serializerFactory.create(type);

        Configuration configuration = (Configuration) serializer.deserialize(filename);
        System.out.println("Deserialized config: " + configuration);
        return configuration;
    }

    private String determineFileType(String filename) {
        String[] splitPath = filename.split("\\.");
        if (splitPath.length < 2) {
            throw new RuntimeException("Couldn't determine file type");
        }
        return splitPath[splitPath.length - 1];
    }

}
