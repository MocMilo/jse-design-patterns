package com.infoshareacademy.patterns.adapter;

public class XmlStringParser implements StringParsable {

    @Override
    public Xml parse(String xml) {
        return new Xml(xml);
    }
}
