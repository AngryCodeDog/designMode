package com.zyp.test.iterator;

public class MyIterator implements Iterator {
    private MyWarehouse myWarehouse;
    private int index = 0;
    private int size = 0;

    public MyIterator(MyWarehouse warehouse) {
        this.myWarehouse = warehouse;
        this.size = warehouse.size();

    }

    public void first() {
        this.index = 0;
    }

    public void next() {
        if (index < size){
            this.index ++;
        }
    }

    public boolean isDone() {
        return index == size;
    }

    public Object currentItem() {
        return this.myWarehouse.getItem(index);
    }
}
