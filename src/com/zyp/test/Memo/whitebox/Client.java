package com.zyp.test.Memo.whitebox;

public class Client {
    public static void main(String[] args) {
        String state1 = "状态1";
        Originator originator = new Originator(state1);
        Caretaker caretaker = new Caretaker();
        //创建备忘录对象 缓存起来
        caretaker.saveMemento(originator.createMemento());
        //改变当前状态
        originator.setState("状态2");
        System.out.println("state = [" + originator.getState() + "]");
        //进行设置重新还原
        originator.restoreMemento(caretaker.retrieveMemento());
        System.out.println("state = [" + originator.getState() + "]");
    }
}
