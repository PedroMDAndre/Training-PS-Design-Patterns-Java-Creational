package pt.paterns.structural.bridge.color_shape.shape_solution;

import pt.paterns.structural.bridge.color_shape.shape_solution.color.Blue;
import pt.paterns.structural.bridge.color_shape.shape_solution.color.Color;
import pt.paterns.structural.bridge.color_shape.shape_solution.color.Green;
import pt.paterns.structural.bridge.color_shape.shape_solution.color.Red;
import pt.paterns.structural.bridge.color_shape.shape_solution.shape.Circle;
import pt.paterns.structural.bridge.color_shape.shape_solution.shape.Shape;
import pt.paterns.structural.bridge.color_shape.shape_solution.shape.Square;

public class Shape2BridgeDemo {

    public static void main(String[] args) {

        Color blue = new Blue();
        Color red = new Red();
        Color green = new Green();

        Shape blueSquare = new Square(blue);
        Shape redCircle = new Circle(red);
        Shape greenCircle = new Circle(green);
        Shape greenSquare = new Square(green);

        blueSquare.applyColor();
        redCircle.applyColor();
        greenCircle.applyColor();
        greenSquare.applyColor();

    }

}
