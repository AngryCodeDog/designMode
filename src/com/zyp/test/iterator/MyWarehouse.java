package com.zyp.test.iterator;

public class MyWarehouse extends AbsWarehouse {
    private Object[] myFood = new Object[]{"大米","小麦","玉米"};

    public Iterator createIterator() {
        return new MyIterator(this);
    }

    public Object getItem(int index){
        return myFood[index];
    }

    public int size(){
        return myFood.length;
    }
}
