package com.infoshareacademy.patterns.builder;

public interface SimpleXmlBuilder {
    void startTag(String name);
    void endTag(String name);
    void addContent(String content);
    String buildXml();
}
