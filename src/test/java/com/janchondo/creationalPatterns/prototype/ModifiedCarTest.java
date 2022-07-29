package com.janchondo.creationalPatterns.prototype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModifiedCarTest {
    @Test
    public void showCarTest() throws CloneNotSupportedException {
        Car car = new ModifiedCar();
        car.setBrand("Chevrolet");
        car.setColor("Green");

        Car car2 = car.clone();
        car2.setBrand("Audi");
        car2.setColor("Red");

        assertEquals(true, car != car2);
    }
}
