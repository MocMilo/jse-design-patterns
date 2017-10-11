package com.infoshareacademy.patterns.singleton;

public class Main {

    public static void main(String[] args) {
        SingletonExample singletonExample = SingletonExample.getInstance();
        int cachedVal = singletonExample.getCachedValue();
        System.out.println(cachedVal);
    }
}
