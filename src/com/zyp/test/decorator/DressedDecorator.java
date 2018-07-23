package com.zyp.test.decorator;

public abstract class DressedDecorator extends Human {
    protected Human human;

    public DressedDecorator(Human human) {
        this.human = human;
    }
}
