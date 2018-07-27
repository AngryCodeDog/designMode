package com.zyp.test.singleton;

public class SingleTonTest {
}

/**
 * 第一种
 *
 * 懒汉，线程不安全(只能单线程使用）
 */
class SingletonDemo1 {
    private static SingletonDemo1 instance;
    private SingletonDemo1(){}
    public static SingletonDemo1 getInstance(){
        if (instance == null) {
            instance = new SingletonDemo1();
        }
        return instance;
    }
}

/**
 * 第二种
 *
 * 懒汉，线程安全
 * 解决上面实现方式的线程不安全问题，做个线程同步就可以了，于是就对getInstance()方法进行了线程同步。
 *
 * 缺点：效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。
 *      而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就行了。方法进行同步效率太低。
 */
class SingletonDemo2 {
    private static SingletonDemo2 instance;
    private SingletonDemo2(){}
    public static synchronized SingletonDemo2 getInstance(){
        if (instance == null){
            instance = new SingletonDemo2();
        }
        return instance;
    }

}

/**
 * 第三种
 *
 * 饿汉  静态常量
 *
 * 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 * 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 */
class SingletonHangry {
    private static SingletonHangry singletomHangry = new SingletonHangry();
    private SingletonHangry(){}
    public static SingletonHangry getSingletomHangry(){
        return singletomHangry;
    }
}

/**
 * 第四种
 *
 * 饿汉，静态代码块
 * 这种方式和上面的方式其实类似，只不过将类实例化的过程放在了静态代码块中，也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。优缺点和上面是一样的。
 */
class SingletonHangry2 {
    private static SingletonHangry2 singletonHangry2 = null;
    static {
        singletonHangry2 = new SingletonHangry2();
    }
    private SingletonHangry2(){}
    public static SingletonHangry2 getSingletonHangry2(){
        return singletonHangry2;
    }

}

/**
 * 第五种  线程安全，同步代码块
 *
 * 由于第三种实现方式同步效率太低，所以摒弃同步方法，改为同步产生实例化的的代码块。但是这种同步并不能起到线程同步的作用。
 * 跟第1种实现方式遇到的情形一致，假如一个线程进入了if (singleton == null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。
 */
class Singleton5 {

    private static Singleton5 singleton;

    private Singleton5() {}

    public static Singleton5 getInstance() {
        if (singleton == null) {
            synchronized (Singleton5.class) {
                singleton = new Singleton5();
            }
        }
        return singleton;
    }
}

/**
 * 第六种：双重检查
 *
 * 优点：线程安全；延迟加载；效率较高。
 */
class Singleton6 {

    private static volatile Singleton6 singleton;

    private Singleton6() {}

    public static Singleton6 getInstance() {
        if (singleton == null) {
            synchronized (Singleton6.class) {
                if (singleton == null) {
                    singleton = new Singleton6();
                }
            }
        }
        return singleton;
    }
}


/**
 * 第七种：静态内部类
 *
 * 这种方式跟饿汉式方式采用的机制类似，但又有不同。两者都是采用了类装载的机制来保证初始化实例时只有一个线程。不同的地方在饿汉式方式是只要Singleton类被装载就会实例化，
 * 没有Lazy-Loading的作用，而静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，才会装载SingletonInstance类，
 * 从而完成Singleton的实例化。
 *
 * 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
 *
 * 优点：避免了线程不安全，延迟加载，效率高。
 */
class SingletonInnerClass {

    private SingletonInnerClass(){

    }

    private static class SingleInstance{
        private static final SingletonInnerClass INSTANCE = new SingletonInnerClass();
    }

    public static SingletonInnerClass getInstance(){
        return SingleInstance.INSTANCE;
    }


}

/**
 * 第八种：枚举
 *
 * 借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
 */
enum SingletonEnum {
    INSTANCE;
    public void whateverMethod() {

    }
}