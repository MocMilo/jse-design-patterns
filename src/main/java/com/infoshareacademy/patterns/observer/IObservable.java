package com.infoshareacademy.patterns.observer;

/**
 * Created by milo on 10.07.17.
 */
public interface IObservable {

    void notyfyObservers();
    void addObserver(IObserver o);
    void removeObserver(IObserver o);


}
