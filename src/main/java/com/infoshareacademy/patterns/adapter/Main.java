package com.infoshareacademy.patterns.adapter;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        XmlParser11 xmlParser11 = new XmlParser11();
        Stream<String> xmlStream = Stream.of("<start>", "content", "</start>");

        String xmlString = xmlStream.collect(Collectors.joining());

        Xml xml = xmlParser11.parse(xmlString);
        System.out.println(xml);

    }
}
