package org.example.tp.o.enonce;

public class RectangleCalculator implements ShapeCalculatorI{

    @Override
    public double calculateArea(Shape shape) {
        Rectangle rectangle = (Rectangle) shape;
        return rectangle.getWidth() * rectangle.getHeight();
    }
}
