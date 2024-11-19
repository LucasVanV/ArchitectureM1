package org.example.tp.l.enonce;

public class Square extends Shape{

    Square(double width){
        super(width);
    }

    @Override
    public double calculateArea() {
        return this.width * this.width;
    }
    
}
