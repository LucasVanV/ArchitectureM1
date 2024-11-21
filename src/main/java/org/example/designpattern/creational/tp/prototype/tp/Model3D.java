package org.example.designpattern.creational.tp.prototype.tp;

public abstract class Model3D {
    protected int lenght;
    protected String color;
    protected String texture;

    Model3D(int lenght, String color, String texture){
        this.lenght = lenght;
        this.color = color;
        this.texture = texture;
    }

    public abstract Model3D clone();

    @Override
    public String toString(){
        return "Model 3D : { "
        + "\n   lenght : " + lenght
        + "\n   color : " + color
        + "\n   texture : " + texture
        + "\n}";
    }
}
