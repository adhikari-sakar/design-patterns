package com.example.design.patterns.behavioral.command;

// command invoker
public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }
}
