package pt.paterns.singleton;

public class Main {
    public static void main(String[] args) {
        singletonTest();
        singletonLazyLoadTest();
        singletonThreadSafeTest();
    }

    public static void singletonTest(){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Plain");
        System.out.println("Singleton 1:" + singleton1);
        System.out.println("Singleton 2:" + singleton2 + "\n");
    }

    public static void singletonLazyLoadTest(){
        SingletonLazyLoad singletonLazyLoad1 = SingletonLazyLoad.getInstance();
        SingletonLazyLoad singletonLazyLoad2 = SingletonLazyLoad.getInstance();

        System.out.println("Lazy Load");
        System.out.println("Singleton 1:" + singletonLazyLoad1);
        System.out.println("Singleton 2:" + singletonLazyLoad2+ "\n");
    }

    public static void singletonThreadSafeTest(){
        SingletonThreadSafe singletonThreadSafe1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe singletonThreadSafe2 = SingletonThreadSafe.getInstance();

        System.out.println("Thread Safe");
        System.out.println("Singleton 1:" + singletonThreadSafe1);
        System.out.println("Singleton 2:" + singletonThreadSafe2+ "\n");
    }
}
