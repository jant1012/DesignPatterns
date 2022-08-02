package com.janchondo.structuralPatterns.decorator;

public class BasicCar implements CarInterface {
    @Override
    public String assemble() {
        return "Basic Car ";
    }
}
