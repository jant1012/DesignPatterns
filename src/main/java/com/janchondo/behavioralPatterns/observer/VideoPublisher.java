package com.janchondo.behavioralPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class VideoPublisher implements Subject{
    String msg;
    private List<Observer> observersList = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observersList.add(observer);
    }

    public int getListSize(){
        return observersList.size();
    }

    @Override
    public List<String> notifyUpdate(Message message) {
        List<String> msgList = new ArrayList<>();
        for(Observer o : observersList) {
            msgList.add(o.update(message));
        }
        return msgList;
    }

    @Override
    public void unregistrer(Observer observer) {
        observersList.remove(observer);
        System.out.println("Suscriber removed");
    }
}
