package com.janchondo.behavioralPatterns.observer;

public class MessageSubscriberTwo implements Observer{
    @Override
    public String update(Message message) {
        return "Subscriber two: " + message.getMessageContent();
    }
}
