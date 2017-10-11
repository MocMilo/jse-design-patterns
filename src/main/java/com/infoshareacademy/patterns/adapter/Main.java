package com.infoshareacademy.patterns.adapter;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        XmlParser11 xmlParser11 = new XmlParser11();
        Stream<String> xmlStream = Stream.of("<start>", "content", "</start>");

        XmlParser2 xmlParser2 = new XmlParser11Adapter(xmlParser11);
        Xml xml = xmlParser2.parse(xmlStream);
        System.out.println(xml);

    }
}
