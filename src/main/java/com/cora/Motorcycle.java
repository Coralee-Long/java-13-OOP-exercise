package com.cora;

public class Motorcycle extends Vehicle {

    private String type;

    public Motorcycle(String manufacturer, String model, int year, String type) {
        super(manufacturer, model, year);
        this.type = type;
    }
    public String getType() {
        return type;
    }

    // getManufacturer() and the other getter/setter methods allow the Child to access the Parent's private fields
    @Override
    public String toString() {
        return "Motorcycle{" +
                "type=" + type + '\'' +
                "manufacturer='" + getManufacturer() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                '}';
    }
}
