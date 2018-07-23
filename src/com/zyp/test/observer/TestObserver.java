package com.zyp.test.observer;

public class TestObserver {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.addObserver(observer);
        subject.notifyobs("开饭了");
    }
}
