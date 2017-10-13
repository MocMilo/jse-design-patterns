package com.infoshareacademy.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Switch implements IObservable {

    List<IObserver> observers = new ArrayList<>();

    @Override
    public void notifyObservers() {
        for (IObserver item : observers) {
                 item.execute();
        }
    }
    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void push() {
    notifyObservers();
    }
}
