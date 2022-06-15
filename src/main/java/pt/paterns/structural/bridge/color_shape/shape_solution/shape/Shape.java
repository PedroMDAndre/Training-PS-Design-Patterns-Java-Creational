package pt.paterns.structural.bridge.color_shape.shape_solution.shape;

import pt.paterns.structural.bridge.color_shape.shape_solution.color.Color;

public abstract class Shape {

    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColor();

}
