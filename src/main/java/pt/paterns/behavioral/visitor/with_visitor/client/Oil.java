package pt.paterns.behavioral.visitor.with_visitor.client;

import pt.paterns.behavioral.visitor.with_visitor.visitor.AtvPartVisitor;

public class Oil implements AtvPart {

    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }

}
