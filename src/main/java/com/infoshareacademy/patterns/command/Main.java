package com.infoshareacademy.patterns.command;

public class Main {

    public static void main(String[] args) {
        HostCommands hostCommands = new HostCommands();

        hostCommands.shopHelp();
        hostCommands.showHostName();
        hostCommands.shopHostIp();
        hostCommands.listDirectory();
    }
}
