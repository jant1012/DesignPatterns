package com.janchondo.behavioralPatterns.state;

public class TurnedOff implements ComputerState{
    @Override
    public String getState() {
        return "Turned off";
    }
}
