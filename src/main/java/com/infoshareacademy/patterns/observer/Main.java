package com.infoshareacademy.patterns.observer;


public class Main {

    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();
        DoorBell doorBell = new DoorBell();

        ToggleSwitch toogleSwitch = new ToggleSwitch();
        toogleSwitch.addObserver(lightBulb);
        toogleSwitch.addObserver(doorBell);

        WallSwitch wallSwitch = new WallSwitch();
        wallSwitch.addObserver(lightBulb);
        wallSwitch.addObserver(doorBell);

        // no current
        toogleSwitch.setCurrentPresent(false);
        wallSwitch.setCurrentPresent(false);
        toogleSwitch.push();
        wallSwitch.push();

        // current present
        toogleSwitch.setCurrentPresent(true);
        wallSwitch.setCurrentPresent(true);
        toogleSwitch.push();
        wallSwitch.push();

        // remove one observer from wallSwitch
        wallSwitch.removeObserver(doorBell);
        wallSwitch.push();


    }
}
