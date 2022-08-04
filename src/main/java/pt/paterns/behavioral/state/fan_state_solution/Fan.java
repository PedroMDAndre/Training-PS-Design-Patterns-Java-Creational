package pt.paterns.behavioral.state.fan_state_solution;

import pt.paterns.behavioral.state.fan_state_solution.state.*;

public class Fan {

    private final State fanOffState;
    private final State fanLowState;
    private final State fanMediumState;
    private final State fanHighState;

    private State state;

    public Fan() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMediumState = new FanMediumState(this);
        fanHighState = new FanHighState(this);
        state = fanOffState;
    }

    public void pullChain() {
        state.handleRequest();
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public State getFanLowState() {
        return fanLowState;
    }

    public State getFanMediumState() {
        return fanMediumState;
    }

    public State getFanHighState() {
        return fanHighState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return state.toString();
    }

}
