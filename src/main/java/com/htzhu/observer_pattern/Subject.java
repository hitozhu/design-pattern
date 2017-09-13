package com.htzhu.observer_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by htzhu on 2017/9/13.
 */
public class Subject {

    private static List<Observer> observers = new ArrayList<Observer>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
