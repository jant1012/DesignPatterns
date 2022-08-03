package com.janchondo.behavioralPatterns.state;

public class Running implements ComputerState{
    @Override
    public String getState() {
        return "Running";
    }
}
