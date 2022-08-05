package pt.paterns.behavioral.visitor.with_visitor.client;

import pt.paterns.behavioral.visitor.with_visitor.visitor.AtvPartVisitor;

public interface AtvPart {

    void accept(AtvPartVisitor visitor);

}
