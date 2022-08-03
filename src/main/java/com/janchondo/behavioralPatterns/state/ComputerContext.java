package com.janchondo.behavioralPatterns.state;

public class ComputerContext implements ComputerState{
    private ComputerState computerState;

    public ComputerContext(ComputerState computerState) {
        this.computerState = computerState;
    }

    public void setComputerState(ComputerState state){
        computerState = state;
    }

    @Override
    public String getState() {
        return computerState.getState();
    }
}
