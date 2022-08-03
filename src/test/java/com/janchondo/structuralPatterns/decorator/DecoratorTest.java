package com.janchondo.structuralPatterns.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class DecoratorTest {
    @Test
    public void assembleTest(){
        CarInterface nitro = new Nitro(new BasicCar());
        assertEquals(nitro.assemble(), "Basic Car adding nitro ");
    }
}
