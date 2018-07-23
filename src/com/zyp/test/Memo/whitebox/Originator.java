package com.zyp.test.Memo.whitebox;

public class Originator {

    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        Memento memento = new Memento(state);
        return memento;

    }


    public void restoreMemento(Memento memento){
        this.state = memento.getState();


    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
