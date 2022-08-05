package pt.paterns.behavioral.visitor.with_visitor.client;

import pt.paterns.behavioral.visitor.with_visitor.client.AtvPart;
import pt.paterns.behavioral.visitor.with_visitor.visitor.AtvPartVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AtvPart {

    private final List<AtvPart> parts = new ArrayList<>();

    public PartsOrder() {
        // Empty Constructor
    }

    public void addPart(AtvPart atvPart) {
        parts.add(atvPart);
    }

    public List<AtvPart> getParts() {
        return Collections.unmodifiableList(parts);
    }

    @Override
    public void accept(AtvPartVisitor visitor) {
        for (AtvPart atvPart : parts) {
            atvPart.accept(visitor);
        }
        visitor.visit(this);
    }

}
