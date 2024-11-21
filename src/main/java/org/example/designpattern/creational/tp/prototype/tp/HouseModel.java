package org.example.designpattern.creational.tp.prototype.tp;

public class HouseModel extends Model3D{
    
    HouseModel(int lenght, String color, String texture){
        super(lenght, color, texture);
    }

    public Model3D clone(){
        return new HouseModel(lenght, color, texture);
    }
}
