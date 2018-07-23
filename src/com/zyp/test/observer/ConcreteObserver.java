package com.zyp.test.observer;

public class ConcreteObserver implements Observer {
    public void update(String str) {
        System.out.println("ConcreteObserver接收到通知："+str);
    }
}
