package pt.paterns.behavioral.mediator.light;

public class TurnOffAllLightsCommand implements Command {


    private final Mediator mediator;

    public TurnOffAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOffAllLights();
    }

}