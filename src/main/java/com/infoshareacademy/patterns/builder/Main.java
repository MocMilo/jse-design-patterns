package com.infoshareacademy.patterns.builder;

public class Main {

    public static void main(String[] args) {

        SimpleXmlBuilder simpleXmlBuilder = new MinifiedXmlBuilder();
        simpleXmlBuilder.startTag("start");
        simpleXmlBuilder.addContent("content");
        simpleXmlBuilder.startTag("foo");
        simpleXmlBuilder.addContent("foo_content");
        simpleXmlBuilder.endTag("foo");
        simpleXmlBuilder.endTag("start");
        String xml = simpleXmlBuilder.buildXml();
        System.out.println(xml);

    }
}
