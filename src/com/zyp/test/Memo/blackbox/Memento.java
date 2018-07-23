package com.zyp.test.Memo.blackbox;

/**
 * 备忘录角色存储“备忘发起角色”的内部状态。
 */
public class Memento implements MementoIF {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
