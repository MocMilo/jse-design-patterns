package com.infoshareacademy.patterns.command;

public class ShowHostIpCommand implements Command {

    @Override
    public void execute() {
        System.out.println("127.0.0.1");
    }
}
