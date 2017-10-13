package com.infoshareacademy.patterns.observer;


public class Main {

    public static void main(String[] args) {

        LightBulb lightBulb = new LightBulb();
        DoorBell doorBell = new DoorBell();

        ToggleSwitch toggleSwitch = new ToggleSwitch();
        WallSwitch wallSwitch = new WallSwitch();

        System.out.println("all observers added to observables...");
        toggleSwitch.addObserver(lightBulb);
        toggleSwitch.addObserver(doorBell);
        wallSwitch.addObserver(lightBulb);
        wallSwitch.addObserver(doorBell);

        System.out.println("push toggle and wall switch...");
        toggleSwitch.push();
        wallSwitch.push();

        System.out.println("now remove doorBell from observers of wall switch...");
        wallSwitch.removeObserver(doorBell);

        System.out.println("now once again: push toggle and wall switch...");
        toggleSwitch.push();
        wallSwitch.push();
    }
}
