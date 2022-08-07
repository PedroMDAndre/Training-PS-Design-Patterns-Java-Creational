package pt.patterns_with_lambdas.visitor.model;

import pt.patterns_with_lambdas.visitor.Visitor;

public class Car {

    private Engine engine;
    private Body body;
    private Wheel wheel;

    public void accept(Visitor visitor) {
        engine.accept(visitor);
        body.accept(visitor);
        wheel.accept(visitor);

        visitor.visit(this);
    }
}
