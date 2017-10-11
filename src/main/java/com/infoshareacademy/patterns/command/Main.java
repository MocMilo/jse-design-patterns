package com.infoshareacademy.patterns.command;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Command> commands = Arrays.asList(
            new ShowHelpCommand(),
            new ListDirectoryCommand(),
            new ShowHostNameCommand(),
            new ShowHostIpCommand()
        );

        for (Command command : commands) {
            command.execute();
        }
    }
}
