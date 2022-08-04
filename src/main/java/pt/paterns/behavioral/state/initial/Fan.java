package pt.paterns.behavioral.state.initial;

public class Fan {

    private static final int OFF = 0;
    private static final int LOW = 1;
    private static final int MEDIUM = 2;

    private int state = OFF;

    public Fan() {
        // Empty constructor
    }

    public void pullChain() {
        if (state == OFF) {
            System.out.println("Turning fan on to low.");
            state = LOW;
        } else if (state == LOW) {
            System.out.println("Turning fan to medium.");
            state = MEDIUM;
        } else if (state == MEDIUM) {
            System.out.println("Turning fan off.");
            state = OFF;
        }
    }

    @Override
    public String toString() {
        if (state == OFF) {
            return "Fan is off.";
        } else if (state == LOW) {
            return "Fan on low.";
        } else if (state == MEDIUM) {
            return "Fan on medium.";
        }
        return "Invalid state.";
    }

}
