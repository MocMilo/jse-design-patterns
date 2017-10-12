package com.infoshareacademy.patterns.adapter;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringParserAdapter implements StreamParsable {

    private XmlStringParser xmlStringParser;

    public StringParserAdapter(XmlStringParser xmlStringParser) {
        this.xmlStringParser = xmlStringParser;
    }

    @Override
    public Xml parse(Stream<String> xml) {

        // changing stream object to string
        String xmlString = xml.collect(Collectors.joining());

        // using string parser to return xml
        return xmlStringParser.parse(xmlString);
    }
}
