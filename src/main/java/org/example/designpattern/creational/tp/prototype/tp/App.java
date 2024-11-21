package org.example.designpattern.creational.tp.prototype.tp;

public class App {
    public static void main(String[] args) {
        CarModel carModel1 = new CarModel(5, "Noir", "Carbone");
        CarModel carModel2 = (CarModel) carModel1.clone();

        System.out.println(carModel1);
        System.out.println(carModel2);
        System.out.println(carModel1 == carModel2);

        HouseModel house1 = new HouseModel(10, "Rouge", "Brique");
        HouseModel house2 = (HouseModel) house1.clone();
        System.out.println(house1);
        System.out.println(house2);
        System.out.println(house1 == house2);

        PlaneModel plane1 = new PlaneModel(150, "Blanc", "Métal");  
        PlaneModel plane2 = (PlaneModel) plane1.clone();
        System.out.println(plane1);
        System.out.println(plane2);
        System.out.println(plane1 == plane2);
    }
    
}
