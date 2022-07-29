package com.janchondo.creationalPatterns.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonDatabaseTest {
    @Test
    public void getSingletonInstanceTest(){
        SingletonDatabase conn = SingletonDatabase.getSingletonInstance("Oracle");
        SingletonDatabase conn2 = SingletonDatabase.getSingletonInstance("MySQL");

        assertEquals(true, conn == conn2);
    }
}
