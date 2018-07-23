package com.zyp.test.Memo.blackbox;

/**
 * “备忘发起角色”创建一个备忘录，用以记录当前时刻它的内部状态。在需要时使用备忘录恢复内部状态。
 * 备忘发起者持有的是备忘录的宽接口
 */
public class Originator {


    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public MementoIF createMemento(){
        return new Memento(state);

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
