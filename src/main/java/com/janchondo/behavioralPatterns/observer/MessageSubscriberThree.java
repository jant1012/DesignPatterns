package com.janchondo.behavioralPatterns.observer;

public class MessageSubscriberThree implements Observer{
    @Override
    public String update(Message message) {
        return "Subscriber three: " + message.getMessageContent();
    }
}
