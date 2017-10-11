package com.infoshareacademy.patterns.adapter;

import java.util.stream.Stream;

public interface XmlParser2 {
    Xml parse(Stream<String> xml);
}
