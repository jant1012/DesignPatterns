package com.janchondo.behavioralPatterns.observer;

public class MessageSuscriberThree implements Observer{
    @Override
    public String update(Message message) {
        return "Suscriber three: " + message.getMessageContent();
    }
}
