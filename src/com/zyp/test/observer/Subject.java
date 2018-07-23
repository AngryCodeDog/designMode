package com.zyp.test.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<Observer> obsList = new ArrayList<Observer>();
    public abstract void addObserver(Observer observer);
    public abstract void delObserver(Observer observer);
    public abstract void notifyobs(String str);
}
