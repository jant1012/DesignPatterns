package com.janchondo.structuralPatterns.facade;

public class Car {

    public void searchAvailableCar(String date, String hour, String from, String to){
        System.out.println("Car found !");
        System.out.println("Date: " + date + " hour: " + hour + " from: " + from + " to: " + to);
        System.out.println("Brand:");
        System.out.println("Uber");
        System.out.println("DiDi");
    }
}
