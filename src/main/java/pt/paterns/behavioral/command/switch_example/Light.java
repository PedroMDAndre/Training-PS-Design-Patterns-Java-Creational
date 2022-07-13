package pt.paterns.behavioral.command.switch_example;

// Receiver
public class Light {

    private final String name;
    private boolean isOn = false;

    public Light(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        if (isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }

    public void on() {
        System.out.println(name + " switched on.");
    }

    public void off() {
        System.out.println(name + " switched off.");
    }

}
