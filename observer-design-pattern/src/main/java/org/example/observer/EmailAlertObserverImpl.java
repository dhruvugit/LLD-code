package org.example.observer;

import org.example.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObservable observable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update(){
        sendEmail(emailId, "product is in stock, hurry up!");
    }

    public void sendEmail(String emailId, String msg){
        System.out.println("Email send to user: " + emailId);
    }

}
