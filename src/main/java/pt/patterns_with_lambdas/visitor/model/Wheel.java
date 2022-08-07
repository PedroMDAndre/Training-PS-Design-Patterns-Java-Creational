package pt.patterns_with_lambdas.visitor.model;

import pt.patterns_with_lambdas.visitor.Visitor;

public class Wheel {

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
