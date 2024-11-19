package org.example.tp.i.enonce;

public class Employee implements WorkerI, EaterI, SleeperI{

    @Override
    public void eat() {
        System.out.println("Employee is eating");
    }

    @Override
    public void work() {
        System.out.println("Employee is working");
    }

    @Override
    public void sleep() {
        System.out.println("Employee is sleeping");
    }
    
}
