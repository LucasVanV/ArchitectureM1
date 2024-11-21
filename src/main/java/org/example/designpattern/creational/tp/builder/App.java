package org.example.designpattern.creational.tp.builder;

public class App {
    public static void main(String[] args) {
        ModularCar c1 = new ModularCar.ModularCarBuilder(Modele.BERLINE, MotorType.DIESEL, 5).setIsGPS(true).build();
        ModularCar c2 = new ModularCar.ModularCarBuilder(Modele.SUV, MotorType.DIESEL, 3).setIsGPS(true).build();
        ModularCar c3 = new ModularCar.ModularCarBuilder(Modele.SPORTIVE, MotorType.ELECTRIQUE, 3).setIsGPS(true).build();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
