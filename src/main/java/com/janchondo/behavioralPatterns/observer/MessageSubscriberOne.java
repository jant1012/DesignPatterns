package com.janchondo.behavioralPatterns.observer;

public class MessageSubscriberOne implements Observer{
    @Override
    public String update(Message message) {
        return "Suscriber one: " + message.getMessageContent();
    }
}
