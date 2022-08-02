package com.janchondo.structuralPatterns.facade;

public class CheckFacade {
    private Car car;
    private Bus bus;

    public CheckFacade(){
        car = new Car();
        bus = new Bus();
    }

    public void search(String date, String hour, String from, String to){
        boolean busBoolean = bus.searchAvailableBusTicket(date, hour, from, to);
        car.searchAvailableCar(date, hour, from, to);
    }
}
