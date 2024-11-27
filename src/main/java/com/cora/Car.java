package com.cora;

public class Car extends Vehicle {

    private int numDoors;

    //constructor
    public Car(String manufacturer, String model, int year, int numDoors) {
        super(manufacturer, model, year);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }
    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numDoors=" + numDoors + '\'' +
                "manufacturer='" + getManufacturer() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                '}';
    }
}
