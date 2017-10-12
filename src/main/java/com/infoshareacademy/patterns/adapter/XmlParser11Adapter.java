package com.infoshareacademy.patterns.adapter;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class XmlParser11Adapter implements XmlParser2 {

    private XmlParser11 xmlParser11;

    public XmlParser11Adapter(XmlParser11 xmlParser11) {
        this.xmlParser11 = xmlParser11;
    }

    @Override
    public Xml parse(Stream<String> xml) {

        // changing stream to string
        String xmlString = xml.collect(Collectors.joining());

        // using string parser to return xml
        return xmlParser11.parse(xmlString);
    }
}
