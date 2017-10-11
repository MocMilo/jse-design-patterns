package com.infoshareacademy.patterns.command;

public class HostCommands {

    public void listDirectory() {

        System.out.println("file1.txt");
        System.out.println("file2.txt");
    }

    public void shopHostIp() {
        System.out.println("127.0.0.1");
    }

    public void showHostName() {
        System.out.println("localhost");
    }

    public void shopHelp() {
        System.out.println("ShowHostIP - display computer ip");
        System.out.println("ShowHostName - display name of the computer");
        System.out.println("ListDirectory - lists files in the current directory");
    }
}
