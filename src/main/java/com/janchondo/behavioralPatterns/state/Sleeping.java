package com.janchondo.behavioralPatterns.state;

public class Sleeping implements ComputerState{
    @Override
    public String getState() {
        return "Sleeping";
    }
}
