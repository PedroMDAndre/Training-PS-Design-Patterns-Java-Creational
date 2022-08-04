package pt.paterns.behavioral.state.fan_state_solution.state;

import pt.paterns.behavioral.state.fan_state_solution.Fan;

public class FanMediumState extends State {

    private final Fan fan;

    public FanMediumState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to high.");
        fan.setState(fan.getFanHighState());
    }

    @Override
    public String toString() {
        return "Fan is on medium.";
    }

}
