package pt.patterns_with_lambdas.factory.registry;

import pt.patterns_with_lambdas.factory.factory.Factory;
import pt.patterns_with_lambdas.factory.model.Shape;

import java.util.EnumMap;
import java.util.Objects;
import java.util.function.Consumer;

public interface Registry<T extends Shape> {

    Factory<T> buildShapeFactory(ShapeType shape);

    static <T extends Shape> Registry<T> createRegistry(Consumer<Builder<T>> consumer) {
        Objects.requireNonNull(consumer);
        EnumMap<ShapeType, Factory<T>> map = new EnumMap<>(ShapeType.class);
        Builder<T> builder = map::put;
        consumer.accept(builder);
        return shape -> map.getOrDefault(shape, () -> {
            throw new IllegalArgumentException("Unknown shape: " + shape);
        });
    }

}
