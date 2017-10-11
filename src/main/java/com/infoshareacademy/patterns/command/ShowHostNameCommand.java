package com.infoshareacademy.patterns.command;

public class ShowHostNameCommand implements Command {

    @Override
    public void execute() {
        System.out.println("localhost");
    }
}
