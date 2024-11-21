package org.example.designpattern.creational.tp.prototype.tp;

public class PlaneModel extends Model3D{
    PlaneModel(int lenght, String color, String texture){
        super(lenght, color, texture);
    }

    public Model3D clone(){
        return new PlaneModel(lenght, color, texture);
    }
}
