package pt.paterns.behavioral.observer.phone;

public class ObserverDemo {

    public static void main(String[] args) {

        Subject subject = new MessageStream();

        PhoneClient phoneClient = new PhoneClient(subject);

        phoneClient.addMessage("Here is a new message!");

    }

}
