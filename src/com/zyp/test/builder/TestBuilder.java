package com.zyp.test.builder;

public class TestBuilder {
    public static void main(String[] args) {

        Director director = new Director();
        Hamburg hamburg = director.buildHamburg(new BeefHamburgBuilder());

    }
}
