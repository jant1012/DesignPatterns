package com.janchondo.structuralPatterns.facade;

public class Car {

    public String searchAvailableCar(String date, String hour, String from){
        return "Car found ! -- Date: " + date + " hour: " + hour + " from: " + from;
    }
}
