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

        Animal animal1 = new Animal("giraffe", "mammal");
        Animal animal2 = new Animal("eagle", "bird");
        Animal animal3 = new Animal("tortoise", "reptile");

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);

        System.out.println(Calculator.add(1,2));
    }
}