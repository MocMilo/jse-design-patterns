package com.infoshareacademy.patterns.observer;

public class DoorBell implements IObserver {

    public void execute(){
        this.ring();
    }

    private void ring() {
        System.out.println(" * Doorbell rings!");
    }
}

