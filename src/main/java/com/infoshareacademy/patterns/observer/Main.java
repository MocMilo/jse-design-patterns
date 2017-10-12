package com.infoshareacademy.patterns.observer;


public class Main {

    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();
        DoorBell doorBell = new DoorBell();

        ToggleSwitch toggleSwitch = new ToggleSwitch();
        toggleSwitch.addObserver(lightBulb);
        toggleSwitch.addObserver(doorBell);

        WallSwitch wallSwitch = new WallSwitch();
        wallSwitch.addObserver(lightBulb);
        wallSwitch.addObserver(doorBell);

        // no electric current
        toggleSwitch.setCurrentPresent(false);
        wallSwitch.setCurrentPresent(false);
        toggleSwitch.push();
        wallSwitch.push();

        // electric current present
        toggleSwitch.setCurrentPresent(true);
        wallSwitch.setCurrentPresent(true);
        toggleSwitch.push();
        wallSwitch.push();

        // remove one observer from wallSwitch
        wallSwitch.removeObserver(doorBell);
        wallSwitch.push();


    }
}
