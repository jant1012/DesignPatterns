package com.janchondo.structuralPatterns.decorator;

public class Wheels extends CarDecorator{

    public Wheels(CarInterface c) {
        super(c);
    }
    @Override
    public String assemble(){
        super.assemble();
        return super.assemble() + assembleWithWheels();
    }
    private String assembleWithWheels(){
        return "adding wheels ";
    }
}
