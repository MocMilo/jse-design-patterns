package com.infoshareacademy.patterns.adapter;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // ADAPTER-PATTERN EXAMPLE

        // application needs XML object and has stream to parse
        Stream<String> xmlStream = Stream.of("<start>", "content", "</start>");

        // this parser returns XML, but can parse only strings (not streams)
        XmlStringParser xmlStringParser = new XmlStringParser();

        // creating another parser object:
        // by using Interface StreamParsable
        // and creating adapter (implements stream parsing method)
        // NOTE! adapter is constructed using XmlStringParser to use its 'xml parsing functionality'
        StreamParsable streamParsable = new StringParserAdapter(xmlStringParser);

        // creating xml object by parsing a stream
        Xml xml = streamParsable.parse(xmlStream);
        System.out.println(xml);

    }
}
