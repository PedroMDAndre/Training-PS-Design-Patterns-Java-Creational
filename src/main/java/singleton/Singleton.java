package main.java.singleton;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
        // Constructor made private, so it can't be instantiated outside the class.
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
