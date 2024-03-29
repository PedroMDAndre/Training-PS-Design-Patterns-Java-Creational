package pt.paterns.behavioral.observer.phone;

public class PhoneClient implements Observer {

    private final Subject subject;

    public PhoneClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message + " - sent from phone");
    }

    @Override
    public void update() {
        System.out.println("Phone Stream: " + subject.getState());
    }
}
