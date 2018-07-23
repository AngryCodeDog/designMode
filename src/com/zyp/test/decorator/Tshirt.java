package com.zyp.test.decorator;

public class Tshirt extends DressedDecorator {
    public Tshirt(Human human) {
        super(human);
    }

    @Override
    public String dressed() {
        return human.dressed() + "穿T恤";
    }
}
