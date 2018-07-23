package com.zyp.test.builder;

public class BeefHamburgBuilder implements HamburgBuilder{
    private BeefHamburg beefHamburg;

    public BeefHamburgBuilder() {
        beefHamburg = new BeefHamburg();
    }


    @Override
    public void bakedbread() {
        beefHamburg.setBread("荞麦面包");

    }

    @Override
    public void bakeMeat() {
        beefHamburg.setMeat("牛肉");

    }

    @Override
    public void addVegetables() {
        beefHamburg.setVegetables("蔬菜");

    }

    @Override
    public Hamburg getResult() {
        System.out.println(beefHamburg.getBread());
        System.out.println(beefHamburg.getMeat());
        System.out.println(beefHamburg.getVegetables());
        return beefHamburg;

    }
}
