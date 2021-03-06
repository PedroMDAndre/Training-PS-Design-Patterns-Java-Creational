package pt.paterns.behavioral.command.switch_example;

// Concrete command
public class ToggleCommand implements Command {

    private final Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }

}
