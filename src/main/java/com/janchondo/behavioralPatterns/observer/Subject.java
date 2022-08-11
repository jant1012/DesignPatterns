package com.janchondo.behavioralPatterns.observer;

import java.util.List;

public interface Subject {
    void register(Observer observer);
    List<String> notifyUpdate(Message message);
    void unregister(Observer observer);
}
