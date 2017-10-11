package com.infoshareacademy.patterns.adapter;

public class Xml {

    private String xml;

    public Xml(String xml) {
        this.xml = xml;
    }

    public String getXml() {
        return xml;
    }

    @Override public String toString() {
        return xml;
    }
}
