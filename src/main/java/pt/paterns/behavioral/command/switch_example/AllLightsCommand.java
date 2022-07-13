package pt.paterns.behavioral.command.switch_example;

import java.util.List;

public class AllLightsCommand implements Command {

    private final List<Light> lights;

    public AllLightsCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.stream()
                .filter(Light::isOn)
                .forEach(Light::toggle);
    }
}
