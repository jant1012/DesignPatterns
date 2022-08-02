package com.janchondo.structuralPatterns.facade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckFacadeTest {

    @Test
    public void searchAvailableBusTicketTest(){
        Bus bus = new Bus();
        assertTrue(bus.searchAvailableBusTicket("10/05/2022","10:00","Chihuahua","Cuauhtemoc")
                .equals("Bus found ! -- Date: 10/05/2022 hour: 10:00 from: Chihuahua to: Cuauhtemoc"));
    }

    @Test
    public void searchAvailableCarTest(){
        Car car = new Car();
        assertTrue(car.searchAvailableCar("11/10/2022","9:00","Chihuahua")
                .equals("Car found ! -- Date: 11/10/2022 hour: 9:00 from: Chihuahua"));
    }
}
