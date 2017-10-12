package com.infoshareacademy.patterns.adapter;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


        // application needs XML object and has stream to parse
        Stream<String> xmlStream = Stream.of("<start>", "content", "</start>");

        // this parser can parse only strings (not streams)
        XmlParser11 xmlParser11 = new XmlParser11();

        // creating another parser object by creating adapter (implements stream parsing)
        XmlParser2 xmlParser2 = new XmlParser11Adapter(xmlParser11);

        // creating xml object parsing stream
        Xml xml = xmlParser2.parse(xmlStream);
        System.out.println(xml);

    }
}
