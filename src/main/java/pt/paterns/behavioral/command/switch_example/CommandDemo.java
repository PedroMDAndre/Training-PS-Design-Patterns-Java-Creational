package pt.paterns.behavioral.command.switch_example;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {

    public static void main(String[] args) {
        onDemo();

        toggleDemo();

        macroDemo();
    }

    private static void macroDemo() {
        System.out.println("Macro demo");

        Light bedroomLight = new Light("Bedroom Light");
        Light kitchenLight = new Light("Kitchen Light");
        Switch lightSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(bedroomLight);

        lightSwitch.storeAndExecute(toggleCommand);

        List<Light> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);

        Command allLightsCommand = new AllLightsCommand(lights);

        lightSwitch.storeAndExecute(allLightsCommand);

        System.out.println();
    }

    private static void toggleDemo() {
        System.out.println("Toggle command");

        Light light = new Light("Light");
        Switch lightSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(light);

        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);

        System.out.println();
    }

    private static void onDemo() {
        System.out.println("On command");

        Light light = new Light("Light");
        Switch lightSwitch = new Switch();

        Command onCommand = new OnCommand(light);

        lightSwitch.storeAndExecute(onCommand);

        System.out.println();
    }

}
