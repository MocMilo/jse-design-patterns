package com.infoshareacademy.patterns.command;

public class ShowHelpCommand implements Command {

    @Override
    public void execute() {
        System.out.println("ShowHostIP - display computer ip");
        System.out.println("ShowHostName - display name of the computer");
        System.out.println("ListDirectory - lists files in the current directory");
    }
}
