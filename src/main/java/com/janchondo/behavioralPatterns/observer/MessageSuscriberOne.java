package com.janchondo.behavioralPatterns.observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MessageSuscriberOne implements Observer{
    @Override
    public String update(Message message) {
        return "Suscriber one: " + message.getMessageContent();
    }
}
