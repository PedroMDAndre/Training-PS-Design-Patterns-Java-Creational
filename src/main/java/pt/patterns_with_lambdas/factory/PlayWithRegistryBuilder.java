package pt.patterns_with_lambdas.factory;

import pt.patterns_with_lambdas.factory.factory.Factory;
import pt.patterns_with_lambdas.factory.model.Rectangle;
import pt.patterns_with_lambdas.factory.model.Shape;
import pt.patterns_with_lambdas.factory.model.Square;
import pt.patterns_with_lambdas.factory.model.Triangle;
import pt.patterns_with_lambdas.factory.registry.Builder;
import pt.patterns_with_lambdas.factory.registry.Registry;
import pt.patterns_with_lambdas.factory.registry.SwitchRegistry;

import java.util.function.Consumer;

import static pt.patterns_with_lambdas.factory.registry.ShapeType.*;

public class PlayWithRegistryBuilder {

    public static void main(String[] args) {

        example1();

        Consumer<Builder<Shape>> consumerRectangle = builder -> builder.register(RECTANGLE, Rectangle::new);
        Consumer<Builder<Shape>> consumerTriangle = builder -> builder.register(TRIANGLE, Triangle::new);

        Consumer<Builder<Shape>> consumer = consumerRectangle.andThen(consumerTriangle);

        Registry<Shape> registry = Registry.createRegistry(consumer);

        Factory<Shape> factoryRectangle = registry.buildShapeFactory(RECTANGLE);
        Rectangle rectangle = (Rectangle) factoryRectangle.newInstance();
        System.out.println("Rectangle : " + rectangle);

        Factory<Shape> factoryTriangle = registry.buildShapeFactory(TRIANGLE);
        Triangle triangle = (Triangle) factoryTriangle.newInstance();
        System.out.println("Triangle : " + triangle);


        Factory<Shape> factorySquare = registry.buildShapeFactory(SQUARE);
        Square square = (Square) factorySquare.get();
    }

    private static void example1() {

        SwitchRegistry registry = new SwitchRegistry();

        Factory<Shape> rectangleFactory = registry.buildShapeFactory("rectangle");

        System.out.println("Rectangle : " + rectangleFactory.newInstance());

    }

    private static void example2() {

        Consumer<Builder<Rectangle>> consumerRectangle = builder -> builder.register(RECTANGLE, Rectangle::new);

        Registry<Rectangle> registry = Registry.createRegistry(consumerRectangle);

        Factory<Rectangle> factory = registry.buildShapeFactory(RECTANGLE);

        Rectangle rectangle = factory.newInstance();

        System.out.println("Rectangle : " + rectangle);

    }

}
