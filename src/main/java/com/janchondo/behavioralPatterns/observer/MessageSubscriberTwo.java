package com.janchondo.behavioralPatterns.observer;

public class MessageSubscriberTwo implements Observer{
    @Override
    public String update(Message message) {
        return "Suscriber two: " + message.getMessageContent();
    }
}
