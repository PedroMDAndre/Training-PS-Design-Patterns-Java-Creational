package pt.paterns.behavioral.visitor.without_visitor;

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

    public double calculateShipping() {
        double shippingCost = 0;

        for (AtvPart part : parts) {
            shippingCost += part.calculateShipping();
        }

        return shippingCost;
    }

}
