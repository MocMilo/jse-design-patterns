package com.infoshareacademy.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Switch implements IObservable {

    List<IObserver> observers = new ArrayList<>();

    public void setCurrentPresent(boolean currentPresent) {
        isCurrentPresent = currentPresent;
    }

    private boolean isCurrentPresent;

    @Override
    public void notifyObservers() {
        for (IObserver item : observers) {
            if (this.isCurrentPresent) {
                item.execute();
            } else {
                System.out.println("no power supply!");
            }
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
