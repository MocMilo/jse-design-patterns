package com.infoshareacademy.patterns.observer;

public class LightBulb implements IObserver {

    public void execute(){
        this.light();
    }

    private void light() {
        System.out.println("Light bulb switched on!");
    }
}
