package com.zyp.test.decorator;

public class Trousers extends DressedDecorator {
    public Trousers(Human human) {
        super(human);
    }

    @Override
    public String dressed() {
        return human.dressed()+"穿裤子";
    }
}
