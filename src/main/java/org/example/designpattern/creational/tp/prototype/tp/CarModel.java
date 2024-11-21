package org.example.designpattern.creational.tp.prototype.tp;

public class CarModel extends Model3D{
    
    CarModel(int lenght, String color, String texture){
        super(lenght, color, texture);
    }

    public Model3D clone(){
        return new CarModel(lenght, color, texture);
    }
}
