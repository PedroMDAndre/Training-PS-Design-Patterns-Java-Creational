package pt.paterns.behavioral.command.switch_example;

// Concrete command
public class OnCommand implements Command {

    private final Light light;

    public OnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

}
