package pt.paterns.behavioral.visitor.with_visitor.visitor;

import pt.paterns.behavioral.visitor.with_visitor.client.Fender;
import pt.paterns.behavioral.visitor.with_visitor.client.Oil;
import pt.paterns.behavioral.visitor.with_visitor.client.PartsOrder;
import pt.paterns.behavioral.visitor.with_visitor.client.Wheel;

public class AtvPartsDisplayVisitor implements AtvPartVisitor {

    @Override
    public void visit(Wheel wheel) {
        System.out.println("We have a wheel.");
    }

    @Override
    public void visit(Fender fender) {
        System.out.println("We have a fender.");

    }

    @Override
    public void visit(Oil oil) {
        System.out.println("We have oil.");

    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("We have an order.");

    }

}
