package pt.paterns.behavioral.observer.observerClass;

import pt.paterns.behavioral.observer.observerClass.Client;
import pt.paterns.behavioral.observer.observerClass.TwitterStream;

public class EverydayExampleObserver {

    public static void main(String[] args) {

        TwitterStream messageStream = new TwitterStream();

        Client client1 = new Client("James");

        Client client2 = new Client("Sarah");

        messageStream.addObserver(client1);
        messageStream.addObserver(client2);

        messageStream.someoneTweeted();
    }

}
