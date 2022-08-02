package com.janchondo.structuralPatterns.facade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckFacadeTest {

    @Test
    public void searchAvailableBusTicketTest(){
        Bus bus = new Bus();
        boolean busFound = bus.searchAvailableBusTicket("10/05/2022","10:00","Chihuahua","Cuauhtemoc");
        assertEquals(true, busFound == true);
    }
}
