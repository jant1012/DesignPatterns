package com.janchondo.behavioralPatterns.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerContextTest {
    @Test
    public void getSleepingStateTest(){
        ComputerContext computerState = new ComputerContext(new Sleeping());
        assertEquals(computerState.getState(), "Sleeping");
    }

    @Test
    public void getStateWhenChanged(){
        ComputerContext computerState = new ComputerContext(new Sleeping());
        computerState.setComputerState(new Running());
        assertEquals(computerState.getState(), "Running");
    }
}
