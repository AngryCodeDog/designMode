package com.zyp.test;

import com.zyp.test.decorator.*;

public class Test {
    public static void main(String[] args) {
//        Coffee coffee = new SimpleCoffee();
//        System.out.println(coffee.getName());
//        coffee = new MilkCoffee(coffee);
//        System.out.println(coffee.getName());
        Human human = new Adult();
        human = new Trousers(new Tshirt(human));
        System.out.println(human.dressed());
    }
}
