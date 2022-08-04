package pt.paterns.behavioral.state.fan_state_solution.state;

import pt.paterns.behavioral.state.fan_state_solution.Fan;

public class FanLowState extends State {

    private final Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to medium.");
        fan.setState(fan.getFanMediumState());
    }

    @Override
    public String toString() {
        return "Fan is on low.";
    }

}
