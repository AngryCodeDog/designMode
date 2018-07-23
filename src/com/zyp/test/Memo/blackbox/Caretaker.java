package com.zyp.test.Memo.blackbox;

/**
 * 负责保存好备忘录。不能对备忘录的内容进行操作或检查。
 * 备忘录管理者持有的是备忘录的窄接口
 */
public class Caretaker {
    private MementoIF mementoIF;
    public MementoIF retrieveMemento(){
        return this.mementoIF;
    }
    public void saveMemento(MementoIF mementoIF){
        this.mementoIF = mementoIF;
    }
}
