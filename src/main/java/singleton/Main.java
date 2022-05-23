package main.java.singleton;

public class Main {
    public static void main(String[] args) {
        singletonTest();
        singletonLazyLoadTest();

    }

    public static void singletonTest(){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Singleton 1:" + singleton1);
        System.out.println("Singleton 2:" + singleton2 + "\n");
    }

    public static void singletonLazyLoadTest(){
        SingletonLazyLoad singletonLazyLoad1 = SingletonLazyLoad.getInstance();
        SingletonLazyLoad singletonLazyLoad2 = SingletonLazyLoad.getInstance();

        System.out.println("Singleton 1:" + singletonLazyLoad1);
        System.out.println("Singleton 2:" + singletonLazyLoad2+ "\n");
    }
}
