package com.janchondo.structuralPatterns.decorator;

public class Nitro extends CarDecorator{
    public Nitro(CarInterface c) {
        super(c);
    }
    @Override
    public String assemble(){
        return super.assemble() + assembleWithNitro();
    }
    private String assembleWithNitro(){
        return "adding nitro ";
    }
}
