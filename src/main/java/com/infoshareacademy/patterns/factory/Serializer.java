package com.infoshareacademy.patterns.factory;

public interface Serializer {
    void serialize(Object o, String filename);
    Object deserialize(String filename);
}
