package pt.paterns.behavioral.visitor.with_visitor.visitor;

import pt.paterns.behavioral.visitor.with_visitor.client.Fender;
import pt.paterns.behavioral.visitor.with_visitor.client.Oil;
import pt.paterns.behavioral.visitor.with_visitor.client.PartsOrder;
import pt.paterns.behavioral.visitor.with_visitor.client.Wheel;

public interface AtvPartVisitor {

    void visit(Wheel wheel);
    void visit(Fender fender);
    void visit(Oil oil);
    void visit(PartsOrder partsOrder);

}
