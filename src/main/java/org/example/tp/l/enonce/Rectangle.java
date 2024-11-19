package org.example.tp.l.enonce;

public class Rectangle extends Shape{
    private double height;

    Rectangle(double width, double height){
        super(width);
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.width * height;
    }
}
