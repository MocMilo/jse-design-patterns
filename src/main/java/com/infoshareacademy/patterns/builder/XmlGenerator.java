package com.infoshareacademy.patterns.builder;

public class XmlGenerator {

    public enum Type {
        PRETTY, MINIFIED
    }

    private Type type;
    private int indentationLevel;
    private StringBuilder stringBuilder;

    public XmlGenerator(Type type) {
        this.type = type;
        stringBuilder = new StringBuilder();
    }

    public void startTag(String name) {
        if (type == Type.PRETTY) {
            for (int i = 0; i < indentationLevel; i++) {
                stringBuilder.append("  ");
            }
        }

        stringBuilder.append("<" + name + ">\n");

        if (type == Type.PRETTY) {
            indentationLevel++;
        }
    }

    public void endTag(String name) {
        if (type == Type.PRETTY) {
            indentationLevel--;
            for (int i = 0; i < indentationLevel; i++) {
                stringBuilder.append("  ");
            }
        }
        stringBuilder.append("</" + name + ">\n");
    }

    public void addContent(String content) {
        if (type == Type.PRETTY) {
            for (int i = 0; i < indentationLevel; i++) {
                stringBuilder.append("  ");
            }
        }
        stringBuilder.append(content + "\n");
    }

    public String buildXml() {
        return stringBuilder.toString();
    }


}
