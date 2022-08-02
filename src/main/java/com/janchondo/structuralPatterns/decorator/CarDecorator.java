package com.janchondo.structuralPatterns.decorator;

public class CarDecorator implements CarInterface{
    protected CarInterface car;
    public CarDecorator(CarInterface c){
        this.car = c;
    }
    @Override
    public String assemble() {
        return this.car.assemble();
    }
}
