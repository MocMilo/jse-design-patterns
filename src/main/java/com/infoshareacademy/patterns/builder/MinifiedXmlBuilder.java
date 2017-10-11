package com.infoshareacademy.patterns.builder;

public class MinifiedXmlBuilder implements SimpleXmlBuilder {

    StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void startTag(String name) {
        stringBuilder.append("<" + name + ">");
    }

    @Override
    public void endTag(String name) {
        stringBuilder.append("</" + name + ">");
    }

    @Override
    public void addContent(String content) {
        stringBuilder.append(content);
    }

    @Override
    public String buildXml() {
        return stringBuilder.toString();
    }
}
