package com.infoshareacademy.patterns.facade;

public class Main {

    public static void main(String[] args) {

        BuildingsInitializer buildingsInitializer = new BuildingsInitializer();
        PlayersInitializer playersInitializer = new PlayersInitializer();
        TransportInitializer transportInitializer = new TransportInitializer();

        buildingsInitializer.initializeCommercialBuldings();
        buildingsInitializer.initializeHousingBuldings();
        buildingsInitializer.initializeIndustrialBuldings();

        playersInitializer.initializeComputerPlayer();

        transportInitializer.initializeRoads();
        transportInitializer.initializeCars();
        transportInitializer.initializeRailways();
        transportInitializer.initializeTrains();
    }
}
