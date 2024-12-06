package org.example.observer;

import org.example.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String username;
    StockObservable observable;

    public MobileAlertObserverImpl(String username, StockObservable observable){
        this.username = username;
        this.observable = observable;
    }

    @Override
    public void update(){
        sendMessageOnMobile(username, "product is in stock hurrup");
    }
    private void sendMessageOnMobile(String username, String msg){
        System.out.println("msg sent to: " + username);
    }

}
