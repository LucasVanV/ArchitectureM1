package org.example.designpattern.creational.tp.prototype.avecproto;

public class Demo {

    public static void main(String[] args) {

        Circle circle = new Circle("vert",80);

        System.out.println("circle : " + circle);

        Circle cloneCircle = (Circle) circle.clone();

        System.out.println("circle : " + cloneCircle);

        System.out.println("circle : " + (cloneCircle == circle));

        //System.out.println("circle : " + (cloneCircle.equals(circle)));

        Square square = new Square(5, "red");
        System.out.println("square : " + square);

        Square clonesquare = (Square) square.clone();

        System.out.println("square : " + clonesquare);

        System.out.println("square : " + (clonesquare == square));
    }
}
