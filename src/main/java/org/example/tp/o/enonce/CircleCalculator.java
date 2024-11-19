package org.example.tp.o.enonce;

public class CircleCalculator implements ShapeCalculator{

    @Override
    public double calculateArea(Shape shape) {
        Circle circle = (Circle) shape;
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }
}
