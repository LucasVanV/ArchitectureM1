package org.example.designpattern.creational.tp.prototype.avecproto;

public class Square implements ShapePrototype{
    private int lenght;
    private String color;

    Square(int lenght, String color){
        this.lenght = lenght;
        this.color = color;
    }

    @Override
    public ShapePrototype clone() {
        return new Square(lenght, color);
    }
}
