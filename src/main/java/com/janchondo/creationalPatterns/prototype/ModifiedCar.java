package com.janchondo.creationalPatterns.prototype;

public class ModifiedCar extends Car {
    @Override
    public String showCar() {
        return "Brand: " + this.getBrand() + " Color: " + this.getColor();
    }
}
