package com.cora;

public class Main {
    public static void main(String[] args) {

    Vehicle vehicle = new Vehicle("VW", "Passat", 2004);
    Car car = new Car("BMW", "Cabrio", 2020, 4);
    Motorcycle motorcycle = new Motorcycle("Ducati", "V4", 2022, "Sportbike");

        System.out.println("get Motorcycle type: " + motorcycle.getType());
        System.out.println(vehicle);
        System.out.println(car);
        System.out.println(motorcycle);

    }
}