package com.janchondo.structuralPatterns.facade;

public class Bus {

    public boolean searchAvailableBusTicket(String date, String hour, String from, String to){
        System.out.println("Bus found !");
        System.out.println("Date: " + date + " hour: " + hour + " from: " + from + " to: " + to);
        System.out.println("Stations:");
        System.out.println("Rapidos");
        System.out.println("Noroeste");
        return true;
    }
}
