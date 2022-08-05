package pt.paterns.behavioral.visitor.with_visitor;

import pt.paterns.behavioral.visitor.with_visitor.client.Fender;
import pt.paterns.behavioral.visitor.with_visitor.client.Oil;
import pt.paterns.behavioral.visitor.with_visitor.client.PartsOrder;
import pt.paterns.behavioral.visitor.with_visitor.client.Wheel;
import pt.paterns.behavioral.visitor.with_visitor.visitor.AtvPartsDisplayVisitor;
import pt.paterns.behavioral.visitor.with_visitor.visitor.AtvPartsShippingVisitor;

public class VisitorDemo {

    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());

        order.accept(new AtvPartsShippingVisitor());
        order.accept(new AtvPartsDisplayVisitor());

    }

}
