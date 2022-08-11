package com.janchondo.structuralPatterns.facade;

public class CheckFacade {
    private Car car;
    private Bus bus;
    public CheckFacade(){
        car = new Car();
        bus = new Bus();
    }
    public void search(String date, String busHour, String carHour, String from, String to){
        System.out.println(bus.searchAvailableBusTicket(date, busHour, from, to));
        System.out.println(car.searchAvailableCar(date,carHour,from));
    }
}
