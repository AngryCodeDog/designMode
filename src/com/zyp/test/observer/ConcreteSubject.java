package com.zyp.test.observer;

public class ConcreteSubject extends Subject {
    @Override
    public void addObserver(Observer observer) {
        super.obsList.add(observer);
    }

    @Override
    public void delObserver(Observer observer) {
        super.obsList.remove(observer);
    }

    @Override
    public void notifyobs(String str) {
        for (int i = 0; i < super.obsList.size(); i++) {
            super.obsList.get(i).update(str);
        }
    }
}
