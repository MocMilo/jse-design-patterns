package com.infoshareacademy.patterns.singleton;

public class SingletonExample {

    private int cachedValue;

    private static SingletonExample singletonExample;

    public static SingletonExample getInstance() {
        if (singletonExample == null) {
            return new SingletonExample();
        }
        return singletonExample;
    }

    public int getCachedValue() {
        return cachedValue;
    }

    private SingletonExample() {}
}
