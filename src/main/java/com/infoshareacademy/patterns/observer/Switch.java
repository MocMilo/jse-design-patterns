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
    public void notyfyObservers() {
        for (IObserver item : observers) {
            if (this.isCurrentPresent) {
                item.execute();
            } else {
                System.out.println("no power supply!");
            }
        }
    }
    @Override
    public void addObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    public void push() {
    notyfyObservers();
    }
}
