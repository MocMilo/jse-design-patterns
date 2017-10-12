package com.infoshareacademy.patterns.adapter;

import java.util.stream.Stream;

public interface StreamParsable {
    Xml parse(Stream<String> xml);
}
