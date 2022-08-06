package pt.patterns_with_lambdas.factory;

import pt.patterns_with_lambdas.factory.factory.Factory;
import pt.patterns_with_lambdas.factory.model.Circle;

import java.awt.*;
import java.util.List;
import java.util.function.Supplier;

public class PlayWithFactory {

    public static void main(String[] args) {

        Factory<Circle> factory1 = Factory.createFactory(Circle::new,Color.GREEN);

        Factory<Circle> factory2 = Factory.createFactory(Circle::new);
        Factory<Circle> factory3 = Factory.createFactory(Circle::new);


        Circle circle = factory1.newInstance();
        System.out.println("Circle = " + circle);

        List<Circle> listOfCircles = factory1.create5Objects();

        System.out.println("List = " + listOfCircles);


    }

}
