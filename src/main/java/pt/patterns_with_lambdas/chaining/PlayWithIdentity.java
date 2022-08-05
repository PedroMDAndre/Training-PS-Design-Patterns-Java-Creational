package pt.patterns_with_lambdas.chaining;

import pt.patterns_with_lambdas.chaining.function.Function;

public class PlayWithIdentity {

    public static void main(String[] args) {
        Function<String, String> identity = Function.identity();
    }

}
