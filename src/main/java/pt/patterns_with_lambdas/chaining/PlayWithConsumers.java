package pt.patterns_with_lambdas.chaining;

import pt.patterns_with_lambdas.chaining.function.Consumer;

public class PlayWithConsumers {

    public static void main(String[] args) {
        chainingConsumers();
        Consumer<String> consumer1 = str -> System.out.println("Consumer1 = " + str);
        Consumer<String> consumer2 = str -> System.out.println("Consumer2 = " + str);

        Consumer<String> consumer3 = consumer1.andThen(consumer2);
        consumer3.accept("Hello");

        System.out.println("Exiting main");
    }

    private static void chainingConsumers() {

        Consumer<String> consumer1 = str -> System.out.println("Consumer1 = " + str);
        Consumer<String> consumer2 = str -> System.out.println("Consumer2 = " + str);

        Consumer<String> consumer3 = consumer1.andThen(consumer2);
        consumer3.accept("Hello");

        System.out.println("Exiting main");

    }

}
