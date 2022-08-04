package pt.paterns.behavioral.state.fan_state_solution.state;

import pt.paterns.behavioral.state.fan_state_solution.Fan;

public class FanOffState extends State {

    private final Fan fan;

    public FanOffState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to low.");
        fan.setState(fan.getFanLowState());
    }

    @Override
    public String toString() {
        return "Fan is off.";
    }

}
