package com.infoshareacademy.patterns.observer;


public class Main {

    public static void main(String[] args) {

        // OBSERVER-PATTERN

        // When current 'observed object' changes it's state, other objects
        // (observers) do execute their actions (algorithms).

        // Example: Switch is observed by door bell and light bulb.
        // When switch is turned on: bell rings and bulb lights.

        // observed:
        ToggleSwitch toggleSwitch = new ToggleSwitch();
        WallSwitch wallSwitch = new WallSwitch();

        // observers:
        LightBulb lightBulb = new LightBulb();
        DoorBell doorBell = new DoorBell();

        System.out.println("all observers added to list of observers stored inside Switch");
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
