package pt.patterns_with_lambdas.factory.registry;

import pt.patterns_with_lambdas.factory.factory.Factory;
import pt.patterns_with_lambdas.factory.model.Rectangle;
import pt.patterns_with_lambdas.factory.model.Shape;
import pt.patterns_with_lambdas.factory.model.Square;
import pt.patterns_with_lambdas.factory.model.Triangle;

public class SwitchRegistry {

    public Factory<Shape> buildShapeFactory(String shape) {
        return switch (shape) {
            case "square" -> Square::new;
            case "triangle" -> Triangle::new;
            case "rectangle" -> Rectangle::new;
            default -> throw new IllegalArgumentException("Unknown shape: " + shape);
        };
    }

}
