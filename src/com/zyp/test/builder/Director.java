package com.zyp.test.builder;

public class Director {
    public Hamburg buildHamburg(HamburgBuilder hamburgBuilder){
        hamburgBuilder.bakedbread();
        hamburgBuilder.bakeMeat();
        hamburgBuilder.addVegetables();
        return hamburgBuilder.getResult();
    }
}
