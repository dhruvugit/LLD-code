package org.example.observable;

import org.example.observer.NotificationAlertObserver;

//This is the main interface for observables, multiple observables can implement this interface to make a new observable.
public interface StockObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
