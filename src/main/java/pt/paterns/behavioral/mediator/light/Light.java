package pt.paterns.behavioral.mediator.light;

// Receiver
public class Light {

    private String location = "";
    private boolean isOn = false;

    public Light() {

    }

    public Light(String location) {
        this.location = location;
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
        System.out.println(location + " switched on.");
    }

    public void off() {
        System.out.println(location + " switched off.");
    }

}
