package org.example.tp.l.enonce;

public abstract class Shape {
    protected double width;

    Shape(double width){
        this.width = width;
    }

    public abstract double calculateArea();
}
