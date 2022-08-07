package pt.patterns_with_lambdas.visitor;

import pt.patterns_with_lambdas.visitor.model.Body;
import pt.patterns_with_lambdas.visitor.model.Car;
import pt.patterns_with_lambdas.visitor.model.Engine;

import java.util.function.Consumer;

public class PlayWithVisitor {

    public static void main(String[] args) {

        Car car = new Car();
        Engine engine = new Engine();
        Body body = new Body();

        Consumer<VisitorBuilder<String>> consumer =
                Visitor.<Car, String>forType(Car.class)
                        .execute(c -> "Visiting car: " + c)
                        .forType(Engine.class)
                        .execute(e -> "Visiting engine: " + e)
                        .forType(Body.class)
                        .execute(b -> "Visiting body: " + b);

        Visitor<String> visitor = Visitor.of(consumer);

        String visitedCar = visitor.visit(car);
        System.out.println(visitedCar);

        String visitedEngine = visitor.visit(engine);
        System.out.println(visitedEngine);

        String visitedBody = visitor.visit(body);
        System.out.println(visitedBody);

    }

}
