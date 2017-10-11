package com.infoshareacademy.patterns.command;

public class ListDirectoryCommand implements Command {

    @Override
    public void execute() {

        System.out.println("file1.txt");
        System.out.println("file2.txt");
    }
}
