package com.example.design.patterns.behavioral.command;

import java.util.List;

//concrete command
public class AllLightCommand implements Command {

    private List<Light> lights;


    public AllLightCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.forEach(Light::toggle);
    }
}
