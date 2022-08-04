package com.janchondo.behavioralPatterns.observer;

import java.util.List;

public interface Subject {
    public void register(Observer observer);
    public List<String> notifyUpdate(Message message);
    public void unregistrer(Observer observer);

}
