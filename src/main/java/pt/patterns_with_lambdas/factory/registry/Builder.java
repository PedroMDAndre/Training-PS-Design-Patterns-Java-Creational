package pt.patterns_with_lambdas.factory.registry;

import pt.patterns_with_lambdas.factory.factory.Factory;
import pt.patterns_with_lambdas.factory.model.Shape;

public interface Builder<T extends Shape> {

    void register(ShapeType label, Factory<T> factory);

}
