package pt.paterns.behavioral.observer.phone;

public class TabletClient implements Observer {

    private final Subject subject;

    public TabletClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message + " - sent from tablet");
    }

    @Override
    public void update() {
        System.out.println("Tablet Stream: " + subject.getState());
    }


}
