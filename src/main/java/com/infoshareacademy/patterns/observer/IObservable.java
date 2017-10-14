package com.infoshareacademy.patterns.observer;

/**
 * Created by milo on 10.07.17.
 */
public interface IObservable {

    // this interface is just to enforce methods implementation in 'Observed object'

    void notifyObservers();
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);

}
