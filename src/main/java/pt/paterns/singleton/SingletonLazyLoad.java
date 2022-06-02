package pt.paterns.singleton;

public class SingletonLazyLoad {

    private static SingletonLazyLoad singleton;

    private SingletonLazyLoad() {
        // Constructor made private, so it can't be instantiated outside the class.
    }

    public static SingletonLazyLoad getInstance() {
        if (singleton == null) {
            singleton = new SingletonLazyLoad();
        }
        return singleton;
    }
}
