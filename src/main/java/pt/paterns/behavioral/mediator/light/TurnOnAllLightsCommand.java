package pt.paterns.behavioral.mediator.light;

public class TurnOnAllLightsCommand implements Command {

    private final Mediator mediator;

    public TurnOnAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }

}
