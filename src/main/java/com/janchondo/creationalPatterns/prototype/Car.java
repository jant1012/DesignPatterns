package com.janchondo.creationalPatterns.prototype;

public abstract class Car implements Cloneable{
    private String color;
    private String brand;

    public abstract String showCar();

    public Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
