package com.zyp.test.facade;

public class SubSystem {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.oneMethod();
        facade.twoMethod();

    }

}


class Facade {
    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;

    public Facade() {
        this.subSystemOne = new SubSystemOne();
        this.subSystemTwo = new SubSystemTwo();
    }

    public void oneMethod(){
        subSystemOne.oneMethod();
    }
    public void twoMethod(){
        subSystemTwo.twoMethod();
    }
}


class SubSystemOne {
    public void oneMethod(){
        System.out.println("子系统一方法一");
    }

}

class SubSystemTwo {
    public void twoMethod(){
        System.out.println("子系统二方法二");
    }

}