package com.infoshareacademy.patterns.observer;

public class WallSwitch {

    private LightBulb lightBulb;

    private DoorBell doorBell;

    public void setLightBulb(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void setDoorBell(DoorBell doorBell) {
        this.doorBell = doorBell;
    }

    public void push() {
        if (lightBulb != null) {
            lightBulb.light();
        }

        if (doorBell != null) {
            doorBell.ring();
        }
    }
}
