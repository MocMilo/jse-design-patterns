package com.infoshareacademy.patterns.observer;


public class Main {

    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();
        DoorBell doorBell = new DoorBell();

        ToggleSwitch toogleSwitch = new ToggleSwitch();
        toogleSwitch.setLightBulb(lightBulb);
        toogleSwitch.setDoorBell(doorBell);

        WallSwitch wallSwitch = new WallSwitch();
        wallSwitch.setLightBulb(lightBulb);
        wallSwitch.setDoorBell(doorBell);

        toogleSwitch.push();
        wallSwitch.push();
    }
}
