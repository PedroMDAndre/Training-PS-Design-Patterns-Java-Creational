package pt.paterns.behavioral.state.fan_state_solution.state;

public abstract class State {

    public void handleRequest() {
        System.out.println("Shouldn't be able to get here.");
    }

}
