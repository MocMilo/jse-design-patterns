package com.infoshareacademy.patterns.observer;

/**
 * Created by milo on 10.07.17.
 */
public interface IObservable {

    void notifyObservers();
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);

}
