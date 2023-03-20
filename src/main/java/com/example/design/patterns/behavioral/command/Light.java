package com.example.design.patterns.behavioral.command;

// command receiver
public class Light {
    private boolean isOn = false;

    public void toggle() {
        if (isOn)
            off();
        else
            on();
    }

    private void on() {
        System.out.println("Light switched ON");
        isOn = true;
    }

    private void off() {
        System.out.println("Light switched OFF");
        isOn = false;
    }
}
