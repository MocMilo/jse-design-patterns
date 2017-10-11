package com.infoshareacademy.patterns.builder;

public class PrettyXmlBuilder implements SimpleXmlBuilder {

    private int indentationLevel = 0;
    StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void startTag(String name) {
        for (int i = 0; i < indentationLevel; i++) {
            stringBuilder.append("  ");
        }
        stringBuilder.append("<" + name + ">\n");
        indentationLevel++;
    }

    @Override
    public void endTag(String name) {
        indentationLevel--;
        for (int i = 0; i < indentationLevel; i++) {
            stringBuilder.append("  ");
        }
        stringBuilder.append("</" + name + ">\n");
    }

    @Override
    public void addContent(String content) {
        for (int i = 0; i < indentationLevel; i++) {
            stringBuilder.append("  ");
        }
        stringBuilder.append(content + "\n");
    }

    @Override
    public String buildXml() {
        return stringBuilder.toString();
    }
}
