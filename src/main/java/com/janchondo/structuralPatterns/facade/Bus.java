package com.janchondo.structuralPatterns.facade;

public class Bus {

    public String searchAvailableBusTicket(String date, String hour, String from, String to){
        return "Bus found ! -- Date: " + date + " hour: " + hour + " from: " + from + " to: " + to;
    }
}
