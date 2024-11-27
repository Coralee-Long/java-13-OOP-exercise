package com.cora;

import java.util.Objects;

public class Animal {
    private String name;
    private String type;
    private static int totalCount = 0;
    private int instanceCount = 0;

    // constructor
    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
        totalCount++;
        instanceCount++;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return instanceCount == animal.instanceCount;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(instanceCount);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                "instanceCount=" + getInstanceCount() + '\n' +
                "totalCount=" + getTotalCount() + '\n' +
                '}';
    }

}
