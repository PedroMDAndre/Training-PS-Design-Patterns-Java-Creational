package pt.paterns.structural.bridge.color_shape.shape_solution.shape;

import pt.paterns.structural.bridge.color_shape.shape_solution.color.Color;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    public void applyColor() {
        color.applyColor();
    }

}
