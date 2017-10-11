package com.infoshareacademy.patterns.factory;

public class ConfigurationReader {

    public void load(String filename) {
        String type = determineFileType(filename);

        Configuration configuration;

        if ("json".equals(type)) {
            configuration = deserializeJson();
        } else if ("xml".equals(type)) {
            configuration = deserializeXml();
        } else {
            throw new RuntimeException("Unknown serializer type");
        }

        System.out.println("Deserialized config: " + configuration);
    }

    private Configuration deserializeXml() {
        System.out.println("Deserializing Xml file");

        Configuration configuration = new Configuration();
        configuration.setPort(8080);

        configuration.setRemoteServiceUrl("http://service.com");
        configuration.setRemoteServicePort(1234);

        return configuration;
    }

    private Configuration deserializeJson() {
        System.out.println("Deserializing Json file");

        Configuration configuration = new Configuration();
        configuration.setPort(8080);

        configuration.setRemoteServiceUrl("http://service.com");
        configuration.setRemoteServicePort(1234);

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
