package pt.paterns.creational.singleton;

public class SingletonThreadSafe {

    private static volatile SingletonThreadSafe singleton;

    private SingletonThreadSafe() {
        // Constructor made private, so it can't be instantiated outside the class.

        // To avoid reflection. Avoid creation of objects by reflection.
        if (singleton != null) {
            throw new RuntimeException("Use the getInstance method to create.");
        }
    }

    public static SingletonThreadSafe getInstance() {
        if (singleton == null) {
            synchronized (SingletonThreadSafe.class) {
                if (singleton == null) {
                    singleton = new SingletonThreadSafe();
                }
            }
        }
        return singleton;
    }
}
