package pt.paterns.behavioral.command.switch_example;

// Invoker
public class Switch {

    private Command command;

    public void storeAndExecute(Command command) {
        this.command = command;
        command.execute();
    }

    public void execute() {
        if (command != null) {
            command.execute();
        }
    }

}
