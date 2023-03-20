package com.example.design.patterns.behavioral.command;

import java.util.List;

public class CommandDemo {
    public static void main(String[] args) {
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(bedroomLight);

        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);

        Command allLightCommand = new AllLightCommand(List.of(bedroomLight, kitchenLight));
        lightSwitch.storeAndExecute(allLightCommand);
        lightSwitch.storeAndExecute(allLightCommand);
    }
}
