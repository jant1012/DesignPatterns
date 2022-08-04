package com.janchondo.behavioralPatterns.observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MessageSuscriberTwo implements Observer{
    @Override
    public String update(Message message) {
        return "Suscriber two: " + message.getMessageContent();
    }
}
